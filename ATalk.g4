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

	actor: ACTOR ID LT NATURALNUM GT NEWLINE (actor_block) NEWLINE? END NEWLINE
	{print("actor");}
	;

	actor_block : ((reciever | (initialization NEWLINE) | (assignment NEWLINE) | NEWLINE)* );

	reciever: RECEIVER ID LPAR (defenition_arguments)? RPAR NEWLINE reciever_block END NEWLINE
	{print("reciever");}
	;
  reciever_block: statement*;
	statement: ((function_call | assignment | initialization | operation |  if_statement | foreach_statement | send | begin_end_block | QUIT | BREAK | NEWLINE)* NEWLINE)
	{print("statement");};
  begin_end_block: BEGIN (statement) END;
	defenition_arguments: (type ID (',' type ID)* );
	call_arguments: ((ID | STRING | CHARACTER | ARITHNUM | operation) (',' (ID | STRING | CHARACTER | ARITHNUM | operation))*);

	initialization: ( (type ID (ASSIGN rvalue)?) (',' ID (ASSIGN rvalue)?)* )//TODO
	{print("initialization variable");}
	;

  rvalue: (ID | STRING | CHARACTER | ARITHNUM | NATURALNUM | assignment | operation | array_init);

	assignment: (ID ASSIGN (read_function | operation | array_init | ID | STRING | CHARACTER | ARITHNUM | assignment));

	function_call: (read_function) | (write_function) | (ID LPAR (call_arguments)? RPAR)
	{print("function call");}
	;

	read_function: READ LPAR (ARITHNUM | NATURALNUM) RPAR NEWLINE
	{print("read function");}
	;

	write_function: WRITE LPAR ( (ID(LBRAC (operation | ID | ARITHNUM | NATURALNUM) RBRAC)*) | STRING | CHARACTER | operation ) RPAR
	{print("write function");}
	;

	send: (SENDER | ID | SELF) SENDOP ID LPAR (call_arguments)? RPAR;

	type : (INT | CHAR) (LBRAC NATURALNUM RBRAC)* //TODO
	{print("type");} //inke tedad [] aao baa {} ha moqe tarif e y array hamahang konio nmdunm:|
	;

	////DEBUG KHIZ
	//TODO: 1- dota opersnd poshte ham bedune amalvand
	/////// 2- kolan debug kon :)))
	operation: or_op ;
	or_op: and_op | (and_op OR or_op);
	and_op: (equality_op AND and_op) | equality_op;
	equality_op: (comparison_op (EQUAL | NOTEQUAL) equality_op) | comparison_op;
	comparison_op: ((add_op (GT | LT) comparison_op)) | add_op;
	add_op: (mult_op (ADD | SUB) add_op) | mult_op;
	mult_op: (single_operator_op (MULT | DIV) mult_op) | single_operator_op;
	//single_operator_op: ( help (NOT | SUB) operands ) | operands;
	//help: single_operator_op;
  single_operator_op: (operands (NOT| SUB) single_operator_op) | operands;
	operands: (((LPAR (assignment | operation) RPAR) | (ID (LBRAC (operation | ID | STRING | CHARACTER | ARITHNUM | NATURALNUM) RBRAC)*)
            | ARITHNUM | STRING | CHARACTER | NATURALNUM | read_function) operands?); //ckeck the assignment part
	/*parantheses: LPAR operation RPAR parantheses | (ID | NATURALNUM);*/

	if_statement: (IF (operation | ARITHNUM) NEWLINE condition_block)
	(ELSEIF (operation | ARITHNUM) NEWLINE condition_block)*
	(ELSE NEWLINE condition_block)? END NEWLINE
	{print("if statement");}
	;

	condition_block: (statement);

	foreach_statement: FOREACH ID IN ID NEWLINE (foreach_block) END NEWLINE;

	foreach_block: (statement);

  array_init: '{' (value (',' value)*) '}';

  value: (array_init | operation | ID | STRING | CHARACTER | NATURALNUM | ARITHNUM);
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

	//STRING: ["] ([a-zA-Z] | ~[a-zA-Z]) ["];
  STRING: '"' .*? '"';
  CHARACTER: ['] .? ['];
