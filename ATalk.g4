grammar ATalk;
@header{
      import java.util.ArrayList;
}
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

    void putGlobalVar(String name, Type type) throws ItemAlreadyExistsException {
        SymbolTable.top.put(
            new SymbolTableGlobalVariableItem(
                new Variable(name, type),
                SymbolTable.top.getOffset(Register.GP)
            )
        );
    }

    void addVarItem(String name, Type type, int lineNum, Register reg){
      try{
        if (reg == Register.SP)
          putLocalVar(name, type);
        else if (reg == Register.GP)
          putGlobalVar(name, type);
        printVarData(name, type, reg);
      }catch(ItemAlreadyExistsException e){
        incRepeadtedItemCount();
        printErrors(lineNum , "Variable <" + name + "> already exist!");
        try{
          if (reg == Register.SP)
            putLocalVar(name + "_temporary_" + itemCount, type);
          else if (reg == Register.GP)
            putGlobalVar(name + "_temporary_" + itemCount, type);

          printVarData(name + "_temporary_" + itemCount, type, reg);
        }catch(ItemAlreadyExistsException ex){}
      }
    }

    void printVarData(String name, Type type, Register reg){
      print("Variable \n\tname: "+ name + "\n\tType: " + type + "\n\tOffset:" + SymbolTable.top.getOffset(reg)
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

    int actorCount=0;
    void addActor(int size, String name, int lineNum){
        if( size <= 0 ){
          size=0;
          printErrors(lineNum, "size of Actor queue is negative.");
        }
        print("Actor\n\tname: "+ name
            + "\n\tActor queue size: " + size + "\n");
        try{
          putActor(name, SymbolTable.top.getOffset(Register.GP));
        }catch(ActorAlreadyExistsException e){
          actorCount++;
          printErrors(lineNum,"Actor " + name + " already exist!");
          String new_name = name + "_temporary_" + actorCount;
          try{
            putActor(new_name, SymbolTable.top.getOffset(Register.GP));
          }catch(ActorAlreadyExistsException ex){}
        }
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
      if(lineNum >= 0)
        print("Error(" + lineNum + "): " + err + "\n");
      else
        print("Error: " + err + "\n");
    }

    int itemCount = 0;
    void incRepeadtedItemCount(){
      itemCount++;
    }

    void printRecieverData(String recName, ArrayList<String> argumentTypes){
      String arguments = "(";
      for (int i = 0; i < argumentTypes.size(); i++){
        arguments += argumentTypes.get(i);
        if (i!=argumentTypes.size()-1)
          arguments+=", ";
      }
      arguments += ")";
      print("Reciever: " + recName + arguments + "\n");
    }

    int foreachCount = 0;

}

program:{
    beginScope();
  }
		(actor{actorCount++;} | NL)*
  {
    endScope();
    if(actorCount == 0)
      printErrors(-1,"actor doesnt found!");
  };

actor:
		'actor' name = ID '<' size = CONST_NUM '>' NL {addActor($size.int, $name.text, $name.line);}
			(state | receiver | NL)*
		'end' (NL | EOF)
	;

state:
		tp = type name = ID {
      addVarItem($name.text, $tp.t, $name.line, Register.GP);}
    (',' name = ID {
      addVarItem($name.text, $tp.t, $name.line, Register.GP);})* NL
  ;

receiver:
  {beginScope(); ArrayList<String> arguments = new ArrayList<String>() ;}
		'receiver' name = ID '(' (tp = type {arguments.add($tp.t.toString());} ID
          (',' tp = type {arguments.add($tp.t.toString());} ID)*)? ')' NL
			statements
		'end' NL
  {endScope(); printRecieverData($name.text, arguments);}
	;

type returns [Type t]:
		'char'  {$t = new CharacterType();} ('[' size = CONST_NUM ']' {//TODO:
      if($size.int <= 0)
        printErrors($size.line, "Array size is negative.");
      $t = new ArrayType($size.int, $t );})*
	|	'int' {$t = new IntType();} ('[' size = CONST_NUM ']' {
    if($size.int <= 0)
      printErrors($size.line, "Array size is negative.");
    $t = new ArrayType($size.int, $t );})*
	;

block:
		'begin' {beginScope();} NL
			statements
		'end' {endScope();} NL
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
      addVarItem($name.text, $tp.t, $name.line, Register.SP);}
    ('=' expr)? (',' ID {
      addVarItem($name.text, $tp.t, $name.line, Register.SP);}
    ('=' expr)?)* NL
	;

stm_tell:
		(ID | 'sender' | 'self') '<<' ID '(' (expr (',' expr)*)? ')' NL
	;

stm_write:
		'write' '(' expr ')' NL
	;

stm_if_elseif_else:
		'if' {beginScope();} expr NL statements {endScope();}
		('elseif' {beginScope();} expr NL statements {endScope();})*
		('else' {beginScope();} NL statements {endScope();})?
		'end' NL
	;

stm_foreach:
		'foreach' {beginScope(); foreachCount++;} ID 'in' expr NL
			statements
		'end'{endScope(); foreachCount--;} NL
	;

stm_quit:
		'quit' NL
	;

stm_break:
		ln = 'break' NL {
      if(foreachCount == 0)
        printErrors($ln.line, "break statement is used out of foreach block.");
    }
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
