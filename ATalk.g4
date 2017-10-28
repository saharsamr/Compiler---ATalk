grammar ATalk;

@members{
  void print(String str){
    System.out.println(str);
  }
}

fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment NATURALDIGIT: [1-9];
fragment ARITHDIGIT: [0-9];
fragment ARITHOPERANDS: [+-/*];

program: ((NEWLINE)|(actor))+
  {print("code");}
;

actor: ACTOR ID LT NATURALNUM GT NEWLINE (actor_block) NEWLINE? END (NEWLINE | EOF)
  {print("actor");}
;

actor_block : ((reciever | (global_var_dec NEWLINE) | (assignment NEWLINE) | NEWLINE)* );

reciever: RECEIVER ID LPAR (defenition_arguments)? RPAR NEWLINE reciever_block END NEWLINE
  {print("reciever");}
;

reciever_block: (statement | NEWLINE);

statement: ((function_call | assignment | assignment_multi | initialization | operation |  if_statement | foreach_statement | send | begin_end_block | QUIT | BREAK) NEWLINE)*
  {print("statement");}
;

begin_end_block: BEGIN NEWLINE (statement | NEWLINE?) END;

defenition_arguments: (type ID (',' type ID)* );

global_var_dec: (type ID (',' ID)* );

call_arguments: ((ID | STRING | CHARACTER | ARITHNUM | operation) (',' (ID | STRING | CHARACTER | ARITHNUM | operation))*);

initialization: ( (type ID (ASSIGN rvalue)?) (',' ID (ASSIGN rvalue)?)* )//TODO
  {print("initialization variable");}
;

rvalue: (ID | STRING | CHARACTER | ARITHNUM | NATURALNUM | assignment | operation | array_init);

assignment: (ID ASSIGN (read_function | operation | array_init | ID | STRING | CHARACTER | ARITHNUM | assignment));

assignment_multi: assignment (',' assignment)*;

function_call: (read_function NEWLINE) | (write_function) | (ID LPAR (call_arguments)? RPAR)
  {print("function call");}
;

read_function: READ LPAR (ARITHNUM | NATURALNUM) RPAR
  {print("read function");}
;

write_function: WRITE LPAR ( (ID(LBRAC (operation | ID | ARITHNUM | NATURALNUM) RBRAC)*) | STRING | CHARACTER | operation ) RPAR
  {print("write function");}
;

send: (SENDER | ID | SELF) SENDOP ID LPAR (call_arguments)? RPAR;

type : (INT | CHAR) (LBRAC NATURALNUM RBRAC)*
  {print("type");}
;

operation: or_op ;
or_op: and_op | (and_op OR or_op);
and_op: (equality_op AND and_op) | equality_op;
equality_op: (comparison_op (EQUAL | NOTEQUAL) equality_op) | comparison_op;
comparison_op: ((add_op (GT | LT) comparison_op)) | add_op;
add_op: (mult_op (ADD | SUB) add_op) | mult_op;
mult_op: (single_operator_op (MULT | DIV) mult_op) | single_operator_op;
single_operator_op: (operands (NOT| SUB) single_operator_op) | operands;
operands: (((LPAR (assignment | operation) RPAR) | (ID (LBRAC (operation | ID | STRING | CHARACTER | ARITHNUM | NATURALNUM) RBRAC)*)
  | ARITHNUM | STRING | CHARACTER | NATURALNUM | read_function) operands?);

if_statement: (IF (operation | ARITHNUM) NEWLINE condition_block)
  (ELSEIF (operation | ARITHNUM) NEWLINE condition_block)*
  (ELSE NEWLINE condition_block)? END
  {print("if statement");}
;

condition_block: (statement);

foreach_statement: FOREACH ID IN (ID(LBRAC operation RBRAC)* | array_init) NEWLINE (foreach_block) END;

foreach_block: (statement);

array_init: '{' (value (',' value)*) '}';

value: (array_init | operation | read_function | ID | STRING | CHARACTER | NATURALNUM | ARITHNUM);

/*
Lexer
*/

CM: ('#' (~[\n])*) -> skip;

NATURALNUM: NATURALDIGIT ARITHDIGIT*;
ARITHNUM: ('0' | (NATURALDIGIT ARITHDIGIT*));

ACTOR: 'actor';

RECEIVER: 'receiver';
SENDER: 'sender';

SELF: 'self';

READ: 'read';
WRITE: 'write';

IF: 'if';
ELSEIF: 'elseif';
ELSE: 'else';

FOREACH: 'foreach';
IN: 'in';

BEGIN: 'begin';
END: 'end';

BREAK: 'break';
QUIT: 'quit';

INT: 'int';
CHAR: 'char';

EQUAL: '==';
NOTEQUAL: '<>';
LT: '<';
GT: '>';
OR: 'or';
AND: 'and';
NOT: 'not';
LPAR: '(';
RPAR: ')';
ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';
ASSIGN:'=';
LBRAC: '[';
RBRAC: ']';
NEWLINE: ('\n')+;
SENDOP: '<<';

WS: [ \t\r] -> skip;

ID: ('_' | LOWERCASE | UPPERCASE)('_' | LOWERCASE | UPPERCASE | ARITHDIGIT)*;

STRING: '"' .*? '"';
CHARACTER: ['] .? ['];
