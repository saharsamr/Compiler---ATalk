grammar ATalk;
@header{
      import java.util.ArrayList;
}
@members{

    void print(String str){
        System.out.println(str);
    }

    void putVar(String name, Type type, Register reg) throws ItemAlreadyExistsException {
        SymbolTable.top.put(
            new SymbolTableLocalVariableItem(
                new Variable(name, type),
                SymbolTable.top.getOffset(reg)
            )
        );
    }

    void addVarItem(String name, Type type, int lineNum, Register reg){
      try{
        putVar(name, type, reg);
        printVarData(name, type, reg);
      }catch(ItemAlreadyExistsException e){
        incRepeadtedItemCount();
        printErrors(lineNum , "Variable <" + name + "> already exist!");
        try{
          putVar(name + "_temporary_" + itemCount , type, reg);
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
}

program:{
    int actorCount=0;
    beginScope();
  }
		(actor[actorCount] {actorCount++;} | NL)*
  {
    endScope();
    if(actorCount == 0)
      printErrors(-1,"actor doesnt found!");
  };

actor[int actorCount] returns [int s]:
		'actor' name = ID '<' size = CONST_NUM '>' NL {
        if( $size.int <= 0 ){
          $s = 0;//TODO
          printErrors($size.line, "size of Actor queue is negative.");
        }
        print("Actor\n\tname: "+ $name.text
            + "\n\tActor queue size: " + $size.int + "\n");
        try{
          putActor($name.text, SymbolTable.top.getOffset(Register.GP));
        }catch(ActorAlreadyExistsException e){
          printErrors($name.line,"Actor " + $name.text + " already exist!");
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
      addVarItem($name.text, $tp.t, $name.line, Register.SP);}
    ('=' expr)? (',' ID {
      addVarItem($name.text, $tp.t, $name.line, Register.GP);}
    ('=' expr)?)* NL
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
