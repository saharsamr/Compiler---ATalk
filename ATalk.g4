grammar ATalk;

fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment NATURALDIGIT: [1-9];
fragment ARITHDIGIT: [0-9];
fragment ARITHOPERANDS: [+-/*];

@members{
    void print(String str){
        System.out.println(str);
    }
}

code: (actor)*
        {print("code");}
;

actor: ACTOR ID LT NATURALNUM GT NEWLINE (actor_block) END NEWLINE
        {print("actor");}
;

actor_block : (reciever | initialization)*;

reciever:  RECIEVER ID LPAR (defenition_arguments)? RPAR NEWLINE (statement) END NEWLINE
        {print("reciever");}
;

statement: ( initialization | operation | function_call | if_statement | foreach_statement | send | QUIT )*
        {print("statement");}
;

defenition_arguments: (type ID (',' type ID)* );
call_arguments: ((ID | STRING | ARITHNUM | operation) (',' (ID | STRING | ARITHNUM | operation)*);

initialization: ( (type ID (ASSIGN rvalue)?) (',' ID (ASSIGN rvalue)?)* ) //TODO
        {print("initialization variable");}
;

assignment: (ID ASSIGN (operation | ID | STRING | ARITHNUM | assignment))

function_call: (read_function) | (write_function) | (ID LPAR (call_arguments)? RPAR)
        {print("function call");}
;

read_function: READ LPAR ARITHNUM RPAR NEWLINE
        {print("read function");}
;

write_function: WRITE LPAR ( ID | STRING | operation ) RPAR NEWLINE
        {print("write function");}
;

send: (SENDER | ID | SELF) SENDOP ID LPAR (call_arguments)? RPAR NEWLINE;

type  : (INT | CHAR) (LBRAC NATURALNUM RBRAC)*  //TODO
        {print("type");} //inke tedad [] aao baa {} ha moqe tarif e y array hamahang konio nmdunm:|
;

////DEBUG KHIZ
//TODO: 1- dota opersnd poshte ham bedune amalvand
/////// 2- kolan debug kon :)))
operation: or_op;
or_op: (and_op OR or_op) | and_op;
and_op: (equality_op AND and_op) | equality_op;
equality_op: (comparison_op (EQUAL | NOTEQUAL) equality_op) | comparison_op;
comparison_op: ((add_op (GT | LT) comparison_op)) | add_op;
add_op: (mult_op (ADD | SUB) add_op) | mult_op;
mult_op: (single_operator_op (MULT | DIV) mult_op) | single_operator_op;
single_operator_op: ( help (NOT | SUB) operands ) | operands;
help: single_operator_op;
operands: (parantheses (ID | (LPAR assignment RPAR) | (ID (LBRAC operation RBRAC)*) | ARITHNUM) operands) | parantheses; //ckeck the assignment part
parantheses: LPAR operation RPAR parantheses | ;
//assignment: (ID ASSIGN (operation | ID | STRING | ARITHNUM | assignment))

if_statement: (IF (operation | ARITHNUM) NEWLINE condition_block)
     (ELSEIF (operation | ARITHNUM) NEWLINE condition_block)*
     (ELSE NEWLINE condition_block)? END NEWLINE
     {print("if statement");}
;

condition_block: (statement);

foreach_statement: FOREACH ID IN ID (foreach_statement) END;

foreach_statement: (statement);

/*
Lexer
*/

NATURALNUM: NATURALDIGIT ARITHDIGIT*;
ARITHNUM: ARITHDIGIT+;

ACTOR: 'actor';

RECIEVER: 'reciever';
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
NEWLINE: '\n';
SENDOP: '<<';

ID: ('_' | LOWERCASE | UPPERCASE)('_' | LOWERCASE | UPPERCASE | ARITHDIGIT)*;

STRING: '"' ([a-zA-z] | ~[a-zA-z]) '"';
