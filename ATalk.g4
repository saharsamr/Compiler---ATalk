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

code : (actor)*
        {print("code");}
;

actor : ACTOR ID '<' NATURALNUM '>' '\n' (actor_block) END '\n'
        {print("actor");}
;

actor_block : (reciever | initialization)*;

reciever :  RECIEVER ID '(' (arguments)? ')' '\n' (statement) END '\n'
        {print("reciever");}
;

statement : ( initialization | operation | function | if_statement | foreach_statement | QUIT )*
        {print("statement");}
;

arguments : (type ID (',' type ID)* );

initialization : ( (type ID ('=' rvalue)?) (',' ID ('=' rvalue)?)* ) //TODO
        {print("initialization variable");}
;

function : (read_function) | (write_function) | (ID '(' (arguments)? ')') //aslan mitunim function benevisim? ya un recieveraro seda mizanim?
        {print("function call");}
;

read_function : READ '(' ARITHNUM ')' '\n'
        {print("read function");}
;

write_function : WRITE '(' ( ID | STRING | operation )')' '\n'
        {print("write function");} //operation: write (x+y)
;

type  : (INT | CHAR) ('[' NATURALNUM ']')*  //TODO
        {print("type");} //inke tedad [] aao baa {} ha moqe tarif e y array hamahang konio nmdunm:|
;

////DEBUG KHIZ
operation: or_op;
or_op: and_op OR or_op;
and_op: equality_op AND and_op;
equality_op: (comparison_op (EQUAL | NOTEQUAL) equality_op);
comparison_op: (add_op (GT | LT) comparison_op);
add_op: (mult_op (ADD | SUB) add_op);
mult_op: (single_operator_op (MULT | DIV) mult_op);
single_operator_op: help (NOT | SUB) operands;
help: single_operator_op;
operands: parantheses (ID | (ID LBRAC operation RBRAC) | ARITHNUM) operands;
parantheses: LPAR operation RPAR parantheses;

if_statement : (IF (operation | ARITHNUM) '\n' condition_block)
     (ELSEIF (operation | ARITHNUM) '\n' condition_block)*
     (ELSE '\n' condition_block)? END '\n'
     {print("if statement");}
;

condition_block: (statement);

foreach_statement : FOREACH ID IN ID (foreach_statement) END;

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
LBRAC: '[';
RBRAC: ']';
NEWLINE: '\n';

ID: ('_' | LOWERCASE | UPPERCASE)('_' | LOWERCASE | UPPERCASE | ARITHDIGIT)*;

STRING: '"' ([a-zA-z] | ~[a-zA-z]) '"';
