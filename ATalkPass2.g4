grammar ATalkPass2;

@members{

    void print(String str){
        System.out.println(str);
    }

    void beginScope() {
        SymbolTable.push();
    }

    void endScope() {
        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
        SymbolTable.pop();
    }
}


program:
    {
        print("Pass2 started -------------------------");
        beginScope();
    }
		(actor | NL)*
    {
        endScope();
        print("Pass2 finished -------------------------");
    }
	;

actor:
		'actor' ID '<' CONST_NUM '>' NL
    {beginScope();}
			(state | receiver | NL)*
		'end' {endScope();} (NL | EOF)
	;

state:
		type ID { SymbolTable.define(); } (',' ID { SymbolTable.define(); })* NL
	;

receiver:
		'receiver' ID { SymbolTable.define(); } '(' (type ID { SymbolTable.define(); } (',' type ID { SymbolTable.define(); })*)? ')' NL
    {beginScope();}
			statements
		'end' {endScope();} NL
	;

type: //TODO:{ $return_type = IntType.getInstance(); }
		'char' ('[' CONST_NUM ']')*
	|	'int' ('[' CONST_NUM ']')*
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
		type ID { SymbolTable.define(); }('=' expr)? (',' ID { SymbolTable.define(); } ('=' expr)?)* NL
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
		'foreach' {beginScope();} ID 'in' expr NL
			statements
		'end' {endScope();} NL
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

expr returns [Type t]:
		tp = expr_assign {$t = $tp.t;}
	;

expr_assign returns [Type t]:
		tp1 = expr_or '=' tp2 = expr_assign{
      if($tp1.t.equals($tp2.t))
        $t = $tp1.t;
      else
        $t = new NoType();
    }
	|	tp = expr_or {$t = $tp.t;}
	;

expr_or returns [Type t]:
		tp1 = expr_and tp2 = expr_or_tmp {
      if((!$tp1.t.equals(new IntType()) && !$tp2.t.equals(new NoType()))){
        $t = new NoType();
        //
        print("or");
      }
      else
        $t = $tp1.t;
    }
	;

expr_or_tmp returns [Type t]:
		'or' tp1 = expr_and tp2 = expr_or_tmp {
      if(!$tp1.t.equals(new IntType())){
        $t = new NoType();
        print("invalid use of or operations.");
        //throw
      }
      else
        $t = $tp1.t;
    }
	|
	;

expr_and returns [Type t]:
		tp1 = expr_eq tp2 = expr_and_tmp {
      if((!$tp1.t.equals(new IntType()) && !$tp2.t.equals(new NoType()))){
        $t = new NoType();
        //
        print("exp and");
      }
      else
        $t = $tp1.t;
    }
	;

expr_and_tmp returns [Type t]:
		'and' tp1 = expr_eq tp2 = expr_and_tmp{
      if(!$tp1.t.equals(new IntType())){
        $t = new NoType();
        print("invalid use of and operations.");
        //throw
      }
      else
        $t = $tp1.t;
    }
	| {$t = new NoType();}
	;

expr_eq returns [Type t]:
		tp1 = expr_cmp tp2 = expr_eq_tmp{
      if($tp1.t.equals($tp2.t) || $tp2.t.equals(new NoType()))
        $t = new IntType();//TODO: moshakhas konim 1 ya 0
      else {
        $t = new NoType();
        print("************");
      }
    }
	;

expr_eq_tmp returns [Type t]:
		('==' | '<>') tp1 = expr_cmp tp2 = expr_eq_tmp {
      if($tp1.t.equals($tp2.t) || $tp2.t.equals(new NoType()))
        $t = $tp1.t;
      else {
        $t = new NoType();
        print("----------");
      }
    }
	| {$t = new NoType();}
	;

expr_cmp returns [Type t]:
		tp1 = expr_add tp2 = expr_cmp_tmp {
      if((!$tp1.t.equals(new IntType()) && !$tp2.t.equals(new NoType()))){
        $t = new NoType();
        //
        print("exp add");
      }
      else
        $t = $tp1.t;
    }
	;

expr_cmp_tmp returns [Type t]:
		('<' | '>') tp = expr_add {
      if(!$tp.t.equals(new IntType())){
        $t = new NoType();
        print("invalid use of cmp operations.");
        //throw
      }
      else
        $t = $tp.t;
    } expr_cmp_tmp
	| {$t = new NoType();}
	;

expr_add returns [Type t]:
		tp1 = expr_mult tp2 = expr_add_tmp {
      if((!$tp1.t.equals(new IntType()) && !$tp2.t.equals(new NoType()))){
        $t = new NoType();
        //
        print("exp add");
      }
      else
        $t = $tp1.t;
    }
	;

expr_add_tmp returns [Type t]:
		('+' | '-') tp = expr_mult {
      if(!$tp.t.equals(new IntType())){
        $t = new NoType();
        print("invalid use of + operations.");
        //throw
      }
      else
        $t = $tp.t;
    }
    expr_add_tmp
	| {$t = new NoType();}
	;

expr_mult returns [Type t]:
		tp1 = expr_un tp2 = expr_mult_tmp{
      if((!$tp1.t.equals(new IntType()) && !$tp2.t.equals(new NoType()))){
        $t = new NoType();
        //
        print("......");
      }
      else
        $t = $tp1.t;
    }
	;

expr_mult_tmp returns [Type t]:
		('*' | '/') tp = expr_un {
      if(!$tp.t.equals(new IntType())){
        $t = new NoType();
        print("invalid use of mult operations.");
        //throw
      }
      else
        $t = $tp.t;
    }
   expr_mult_tmp
	| {$t = new NoType();}
	;

expr_un returns [Type t]:
		('not' | '-') tp = expr_un {
      if(!$tp.t.equals(new IntType())){
        $t = new NoType();
        print("invalid use of unary operations.");
        //throw
      }
      else
        $t = $tp.t;
  }
	|	tp1 = expr_mem {$t = $tp1.t;}
	;

expr_mem returns [Type t]:
		tp = expr_other dim = expr_mem_tmp {
      try{
        $t = $tp.t.dimensionAccess($dim.dimension);
      }catch(UndefinedDemensionsException ex){$t = new NoType();
      print("salam.");}
    }
	;

expr_mem_tmp returns [int dimension]:
		'[' tp = expr {
      if(!$tp.t.equals(new IntType())){
        print("invalid index.");
        //throw
      }
      } ']' d = expr_mem_tmp {$dimension = $d.dimension + 1;}
	| {$dimension = 0;}
	;

expr_other returns [Type t]:
		CONST_NUM {$t = new IntType();}
	|	CONST_CHAR {$t = new CharacterType();}
	|	str = CONST_STR {$t = new ArrayType($str.text.length(), new CharacterType());}
	|	id = ID
    { SymbolTableItem item = SymbolTable.top.get($id.text);
      if(item == null) {
        print($id.line + ") Item " + $id.text + " doesnt exist.");
        $t = new NoType();
      }
      else {
        SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
        print($id.line + ") Variable " + $id.text + " used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
        $t = var.getVariable().getType();
      }
    }
	|	'{' tp = expr {int size = 1;} (',' tp2 = expr {
    if(!$tp2.t.equals($tp.t)) {
      $t = new NoType();
      print("incompatible types");
      //TODO: throw exception
    }
    else if(size != -1)
      size ++;
  })* {
    if(size != -1)
      $t = new ArrayType(size, $tp.t);
    }'}'
	|	'read' '(' size = CONST_NUM ')' {$t = new ArrayType($size.int, new CharacterType());}
	|	'(' tp = expr ')' {$t = $tp.t;}
	;

CONST_NUM:
		('-')?[0-9]+
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
