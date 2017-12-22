grammar ATalkPass1;

import FillSymbolTalbesFuncs, PrintLogsPass1, ArrayFuncs, ScopesPass1;

@members{
  String codeData = "";
  int foreachCount = 0;
  int errorOccured = 0;
  int actorCount=0;
  int receiverCount=0;
  int repeatedVarCount = 0;
}

program:{beginScope();}
		(actor{actorCount++;} | NL)*{
      endScope();
      if(actorCount == 0)
        printErrors(-1,"actor doesnt found!");
      if(errorOccured == 0)
        print(codeData);
  };

actor:
		'actor' name = ID '<' size = CONST_NUM '>' NL {
    beginScope();}
			(state | receiver[$name.text] | NL)*
		{SymbolTable actorSym = SymbolTable.top; endScope(); addActor($size.int, $name.text, $name.line, actorSym);  }'end' (NL | EOF)
	;

state:
		tp = type name = ID {
      addVarItem($name.text, $tp.t, $name.line, Register.GP);}
    (',' name = ID {
      addVarItem($name.text, $tp.t, $name.line, Register.GP);})* NL
  ;

receiver[String actorName]:
  {ArrayList<Type> argumentsTypes = new ArrayList<Type>();
   ArrayList<String> argumentsNames = new ArrayList<String>(); }
		'receiver' name = ID '(' (tp = type {argumentsTypes.add($tp.t);} argName = ID
                {argumentsNames.add($argName.text);}
          (',' tp = type {argumentsTypes.add($tp.t);} argName = ID
                {argumentsNames.add($argName.text);})*)? ')' NL
          {addReceiver($name.text, $actorName, $name.line, argumentsTypes);
           beginScope();
           addRecieverArguments(argumentsTypes, argumentsNames, $name.line);
         }
			statements
		'end' NL
  {endScope();}
	;

  type returns [Type t]:
    {ArrayList<Integer> dims = new ArrayList<Integer>();}
    (('int') {$t = new IntType();} | ('char') {$t = new CharacterType();})
    ('[' size = CONST_NUM ']'{
      dims.add(checkDimLenValidationInArray($size.int,$size.line));})*
    {
      for(int i=dims.size()-1; i >= 0; i--)
        $t = new ArrayType(dims.get(i),$t);
    }
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
    ('=' expr)? (',' name = ID {
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
        printErrors($ln.line, "<break> statement is used out of foreach block.");
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
