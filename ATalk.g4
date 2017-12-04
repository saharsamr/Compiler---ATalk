grammar ATalk;

@members{

    void print(String str){
        System.out.println(str);
    }

    void putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
        SymbolTable.top.put(
            new SymbolTableLocalVariableItem(
                new Variable(name, type),
                SymbolTable.top.getOffset(Register.SP)
            )
        );
    }
    void printLocalVarData(String name, Type type){
      print("Local variable \n\tName: "+ name + "\n\tType: " + type
            + "\n\tGlobal offset:" + SymbolTable.top.getOffset(Register.SP)
            + "\n\tVarible size: " + type.size() + "\n");
    }

    void putGlobalVar(String name, Type type) throws ItemAlreadyExistsException {
        SymbolTable.top.put(
            new SymbolTableGlobalVariableItem(
                new Variable(name, type),
                SymbolTable.top.getOffset(Register.GP)
            )
        );
    }

    void printGlobalVarData(String name, Type type){
      print("Global variable \n\tname: "+ name + "\n\tType: " + type + "\n\tGlobal offset:" + SymbolTable.top.getOffset(Register.GP)
            + "\n\tVarible size: " + type.size() + "\n");
    }

    void beginScope() {
    	int offset = 0;
    	if(SymbolTable.top != null)
        	offset = SymbolTable.top.getOffset(Register.SP);
        SymbolTable.push(new SymbolTable());
        SymbolTable.top.setOffset(Register.SP, offset);
    }

    void endScope() {
        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + "\n");
        SymbolTable.pop();
    }

    void putActor(String name, int offset)throws ActorAlreadyExistsException{
      try{
        SymbolTable.top.put(
            new SymbolTableItemActor(name,
                SymbolTable.top.getOffset(Register.GP)
            )
        );
      }catch(ItemAlreadyExistsException e){
        throw new ActorAlreadyExistsException();
      }
    }

    void printErrors(int lineNum, String err){
      print("Error(" + lineNum + "): " + err + "\n");
    }

    int itemCount = 0;
    void incRepeadtedItemCount(){
      itemCount++;
    }
}

program:
  {int actorCount=0;  beginScope();}
		(actor[actorCount] {actorCount++;} | NL)*
  {
    endScope();
    if(actorCount == 0){
      print("Error: actor doesnt found!\n");
      //throw new ActorDoesntExistsException();
    }
  }
	;

actor[int actorCount] returns [int s]:
		'actor' name = ID '<' size = CONST_NUM '>' NL {
        if( $size.int <= 0 ){
          $s = 0;
          printErrors($size.line, "size of Actor queue is negative.");
          //throw
        }
        $s = $size.int;
        print("Actor\n\tname: "+ $name.text
            + "\n\tActor queue size: " + $size.int + "\n");
        try{
          putActor($name.text, SymbolTable.top.getOffset(Register.GP));
        }catch(ActorAlreadyExistsException e){
          print("Error: Actor already exist!");
          String new_name = $name.text + "_temporary_" + actorCount;
          try{
            putActor(new_name, SymbolTable.top.getOffset(Register.GP));
          }catch(ActorAlreadyExistsException ex){
            print("");
          }
        }
      }
			(state | receiver | NL)*
		'end' (NL | EOF)
	;

state:
		tp = type name = ID {
      try{
        putGlobalVar($name.text, $tp.t);
        printGlobalVarData($name.text, $tp.t);
      }catch(ItemAlreadyExistsException e){
        incRepeadtedItemCount();
        printErrors($name.line , "Global variable <" + $name.text + "> already exist!");
        try{
          putGlobalVar($name.text + "_temporary_" + itemCount , $tp.t);
        }catch(ItemAlreadyExistsException ex){
          print("");
        }
      }

    }
    (',' name = ID {
      try{
        putGlobalVar($name.text, $tp.t);
        printGlobalVarData($name.text, $tp.t);
      }catch(ItemAlreadyExistsException e){
        incRepeadtedItemCount();
        printErrors($name.line , "Global variable <" + $name.text + "> already exist!");
        try{
          putGlobalVar($name.text + "_temporary_" + itemCount , $tp.t);
        }catch(ItemAlreadyExistsException ex){
          print("");
        }
      }
    })* NL
	;

receiver:
  {beginScope();}
		'receiver' {print("Reciever:");}
          name = ID {print("\tName: " + $name.text);} '('
          (tp = type {print("\tArguments types:\n\t\t" + $tp.t.toString());} ID
          (',' tp = type {print("\t\t" + $tp.t.toString());} ID)*)? ')' NL
          {print("\n");}
			statements
		'end' NL
  {endScope();}
	;

type returns [Type t]:
		'char'  {$t = new CharacterType();} ('[' size = CONST_NUM ']' {$t = new ArrayType($size.int, $t );})*
	|	'int' {$t = new IntType();} ('[' size = CONST_NUM ']' {$t = new ArrayType($size.int, $t );})*
	;

block:
		'begin' NL
			statements
		'end' NL
	;

statements:
		(statement | NL)*
	;

statement:
		stm_vardef
	|	stm_assignment
	|	stm_foreach
	|	stm_if_elseif_else
	|	stm_quit
	|	stm_break
	|	stm_tell
	|	stm_write
	|	block
	;

stm_vardef:
		tp = type name = ID{
      try{
        putLocalVar($name.text, $tp.t);
        printLocalVarData($name.text, $tp.t);
      }catch(ItemAlreadyExistsException e){
        incRepeadtedItemCount();
        printErrors($name.line , "Local variable <" + $name.text + "> already exist!");
        try{
          putLocalVar($name.text + "_temporary_" + itemCount , $tp.t);
        }catch(ItemAlreadyExistsException ex){
          print("");
        }
      }

    } ('=' expr)? (',' ID {
        try{
          putLocalVar($name.text, $tp.t);
          printLocalVarData($name.text, $tp.t);
        }catch(ItemAlreadyExistsException e){
          printErrors($name.line , "Local variable <" + $name.text + "> already exist!");
          try{
            putLocalVar($name.text + "_temporary_" + itemCount , $tp.t);
          }catch(ItemAlreadyExistsException ex){
            print("");
          }
        }
    }('=' expr)?)* NL
	;

stm_tell:
		(ID | 'sender' | 'self') '<<' ID '(' (expr (',' expr)*)? ')' NL
	;

stm_write:
		'write' '(' expr ')' NL
	;

stm_if_elseif_else:
		'if' expr NL statements
		('elseif' expr NL statements)*
		('else' NL statements)?
		'end' NL
	;

stm_foreach:
		'foreach' ID 'in' expr NL
			statements
		'end' NL
	;

stm_quit:
		'quit' NL
	;

stm_break:
		'break' NL
	;

stm_assignment:
		expr NL
	;

expr:
		expr_assign
	;

expr_assign:
		expr_or '=' expr_assign
	|	expr_or
	;

expr_or:
		expr_and expr_or_tmp
	;

expr_or_tmp:
		'or' expr_and expr_or_tmp
	|
	;

expr_and:
		expr_eq expr_and_tmp
	;

expr_and_tmp:
		'and' expr_eq expr_and_tmp
	|
	;

expr_eq:
		expr_cmp expr_eq_tmp
	;

expr_eq_tmp:
		('==' | '<>') expr_cmp expr_eq_tmp
	|
	;

expr_cmp:
		expr_add expr_cmp_tmp
	;

expr_cmp_tmp:
		('<' | '>') expr_add expr_cmp_tmp
	|
	;

expr_add:
		expr_mult expr_add_tmp
	;

expr_add_tmp:
		('+' | '-') expr_mult expr_add_tmp
	|
	;

expr_mult:
		expr_un expr_mult_tmp
	;

expr_mult_tmp:
		('*' | '/') expr_un expr_mult_tmp
	|
	;

expr_un:
		('not' | '-') expr_un
	|	expr_mem
	;

expr_mem:
		expr_other expr_mem_tmp
	;

expr_mem_tmp:
		'[' expr ']' expr_mem_tmp
	|
	;

expr_other:
		CONST_NUM
	|	CONST_CHAR
	|	CONST_STR
	|	ID
	|	'{' expr (',' expr)* '}'
	|	'read' '(' CONST_NUM ')'
	|	'(' expr ')'
	;

CONST_NUM:
		('-')? [0-9]+
	;

CONST_CHAR:
		'\'' . '\''
	;

CONST_STR:
		'"' ~('\r' | '\n' | '"')* '"'
	;

NL:
		'\r'? '\n' { setText("new_line"); }
	;

ID:
		[a-zA-Z_][a-zA-Z0-9_]*
	;

COMMENT:
		'#'(~[\r\n])* -> skip
	;

WS:
    	[ \t] -> skip
    ;
