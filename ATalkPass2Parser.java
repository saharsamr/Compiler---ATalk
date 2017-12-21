// Generated from ATalkPass2.g4 by ANTLR 4.7

      import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ATalkPass2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, CONST_NUM=38, 
		CONST_CHAR=39, CONST_STR=40, NL=41, ID=42, COMMENT=43, WS=44;
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_state = 2, RULE_receiver = 3, RULE_type = 4, 
		RULE_block = 5, RULE_statements = 6, RULE_statement = 7, RULE_stm_vardef = 8, 
		RULE_stm_tell = 9, RULE_stm_write = 10, RULE_stm_if_elseif_else = 11, 
		RULE_stm_foreach = 12, RULE_stm_quit = 13, RULE_stm_break = 14, RULE_stm_assignment = 15, 
		RULE_expr = 16, RULE_expr_assign = 17, RULE_expr_or = 18, RULE_expr_or_tmp = 19, 
		RULE_expr_and = 20, RULE_expr_and_tmp = 21, RULE_expr_eq = 22, RULE_expr_eq_tmp = 23, 
		RULE_expr_cmp = 24, RULE_expr_cmp_tmp = 25, RULE_expr_add = 26, RULE_expr_add_tmp = 27, 
		RULE_expr_mult = 28, RULE_expr_mult_tmp = 29, RULE_expr_un = 30, RULE_expr_mem = 31, 
		RULE_expr_mem_tmp = 32, RULE_expr_other = 33;
	public static final String[] ruleNames = {
		"program", "actor", "state", "receiver", "type", "block", "statements", 
		"statement", "stm_vardef", "stm_tell", "stm_write", "stm_if_elseif_else", 
		"stm_foreach", "stm_quit", "stm_break", "stm_assignment", "expr", "expr_assign", 
		"expr_or", "expr_or_tmp", "expr_and", "expr_and_tmp", "expr_eq", "expr_eq_tmp", 
		"expr_cmp", "expr_cmp_tmp", "expr_add", "expr_add_tmp", "expr_mult", "expr_mult_tmp", 
		"expr_un", "expr_mem", "expr_mem_tmp", "expr_other"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'actor'", "'<'", "'>'", "'end'", "','", "'receiver'", "'('", "')'", 
		"'int'", "'char'", "'['", "']'", "'begin'", "'='", "'sender'", "'self'", 
		"'<<'", "'write'", "'if'", "'elseif'", "'else'", "'foreach'", "'in'", 
		"'quit'", "'break'", "'or'", "'and'", "'=='", "'<>'", "'+'", "'-'", "'*'", 
		"'/'", "'not'", "'{'", "'}'", "'read'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "CONST_NUM", "CONST_CHAR", "CONST_STR", "NL", "ID", "COMMENT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ATalkPass2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int errorOccured = 0;

	    void beginScope() {
	        SymbolTable.push();
	    }

	    void endScope() {
	        print("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + ", Global offset: " + SymbolTable.top.getOffset(Register.GP));
	        SymbolTable.pop();
	    }


	  Type checkArithOperandValidation(Type tp)throws ArithmaticsOperandsException{
	    if(!tp.equals(new IntType()))
	      throw new ArithmaticsOperandsException();
	    else
	      return tp;
	  }

	  Type assignExprType_tmp (Type tp, String msg, int line) {
	    try {
	      return checkArithOperandValidation(tp);
	    } catch(ArithmaticsOperandsException ex) {
	      printErrors(line, msg);
	      return new NoType();
	    }
	  }

	  Type checkCombinedArithExprTypes(Type tp1,Type tp2)throws ArithmaticsOperandsException{
	    if((!tp1.equals(new IntType())) && (!tp2.equals(new NoType())))
	     throw new ArithmaticsOperandsException();
	   else
	     return tp1;
	 }

	  Type assignExprType(Type tp1, Type tp2, String msg) {
	    try {
	      return checkCombinedArithExprTypes(tp1, tp2);
	    } catch(ArithmaticsOperandsException ex) {
	      return printErrAndAssignNoType(msg);
	    }
	  }

	  Type checkEqualityExprType_tmp(Type tp1, Type tp2) {
	    if(tp1.equals(tp2) || tp2.equals(new NoType()))
	      return tp1;
	    else
	      return printErrAndAssignNoType("Incompatible types for checking equality.");
	  }

	  Type checkEqualityExprType(Type tp1, Type tp2) {
	    if(tp1.equals(tp2))
	      return new IntType();
	    else if(tp2.equals(new NoType()))//NOTE: notype & notype is not handled?
	      return tp1;
	    else
	      return printErrAndAssignNoType("Incompatible types for checking equality.");
	  }

	  Type assignAssignmentExprType(Type tp1, Type tp2) {
	    if(tp1.equals(tp2))
	      return tp1;
	    else
	      return printErrAndAssignNoType("Invalid assignment.");
	  }

	  void checkIterationExpr(String id, int line, Type tp){
	    try{
	    Type t = getIDFromSymTable(id, line);
	    tp = tp.dimensionAccess(1);
	    if(!t.equals(new NoType()))
	      printErrAndAssignNoType("variable <" + id + "> already declared in this scope.");
	    }catch(UndefinedDemensionsException ex){
	      printErrAndAssignNoType("Undefined demensions.");
	    }
	  }


	  Type getIDFromSymTable(String idName, int line) {
	    SymbolTableItem item = SymbolTable.top.get(idName);
	    if(item == null){
	      printErrors(line, "Variable " + idName + " doesnt exist.");
	      return new NoType();
	    }
	    else {
	      SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
	      print(line + ") Variable " + idName +" used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
	      return var.getVariable().getType();
	    }
	  }

	  SymbolTableItemReceiver getRecieverFromSymTable(String name, int line) throws ReceiverDoseNotExistsException{
	    SymbolTableItem item = SymbolTable.top.get(name);
	    if(item == null)
	      throw new ReceiverDoseNotExistsException();
	    SymbolTableItemReceiver var = (SymbolTableItemReceiver) item;
	    /* print(line + ") Reciever " + name + " used.\t\t"); */
	    return var;
	  }

	  SymbolTableItemActor getActorFromSymTable(String name, int line)throws ActorDoesntExistsException{
	    SymbolTableItem item = SymbolTable.top.get(name);
	    if(item == null)
	      throw new ActorDoesntExistsException();
	    SymbolTableItemActor var = (SymbolTableItemActor) item;
	    /* print(line + ") Reciever " + name + " used.\t\t"); */
	    return var;
	  }

	  String makeKey(String actr, String rcvr, ArrayList<Type> argumentTypes){
	    String key = actr + ": " + rcvr + " (";
	    for (int i = 0; i < argumentTypes.size(); i++){
	      key += argumentTypes.get(i).toString();
	      if (i != argumentTypes.size() - 1)
	        key += ", ";
	    }
	    return key + ")";
	  }

	  String makeRecieverkey(String currentActor, String rcvrActor, String rcvrName, ArrayList<Type> argumentTypes){
	    if(rcvrActor.equals("self"))
	      return makeKey(currentActor, rcvrName, argumentTypes);
	    /*else if(rcvrActor.equals("sender"))
	      return makeKey(senderName, rcvrName, argumentTypes);*/
	    else
	      return makeKey(rcvrActor, rcvrName, argumentTypes);
	  }

	  SymbolTableItemReceiver checkRecieverExistance(String currentActor, String rcvrActor, String rcvrName, ArrayList<Type> argumentTypes, int line)
	  throws ReceiverDoseNotExistsException{
	    String key = makeRecieverkey(currentActor, rcvrActor, rcvrName, argumentTypes);
	    return getRecieverFromSymTable(key, line);
	  }


	  int checkAndFindNumOfItemsInExplitArray(Type tp1,Type tp2, int size) {
	    if(!tp2.equals(tp1))
	      size = -1;
	    else if(size != -1)
	      size ++;
	    return size;
	  }

	  Type assignExplitArrayType(int size, Type tp, int line) {
	    if(size != -1)
	      return new ArrayType(size, tp);
	    else{
	      printErrors(line, "Invalid combination for a array type.");
	      return new NoType();
	    }
	  }

	  int checkDimLenValidationInArray(int size, int line){
	    if(size <= 0){
	      printErrors(line,"size of array is negative");
	      size = 0;
	    }
	    return size;
	  }


	  void checkWriteFuncArgument(Type tp, int line){
	    try{
	      if(!(tp.equals(new IntType()) || tp.equals(new CharacterType())))
	        if(!tp.dimensionAccess(1).equals(new CharacterType()))
	          printErrors(line, "Invalid argument for function <write>.");
	    }catch(UndefinedDemensionsException ex){
	      printErrors(line, "Invalid argument for function <write>.");
	    }
	  }

	  void checkInitAndSender(String rcvrActor, String rcvrName, int argCnt) throws SenderInInitException{
	    if(rcvrActor.equals("sender"))
	      if(argCnt == 0 && rcvrName.equals("init"))
	        throw new SenderInInitException();
	  }

	  void checkCallValidation(String currentActor, String currentReceiver, String rcvrActor, String rcvrName, ArrayList<Type> argumentsTypes, int line, int argCnt){
	    try{
	      checkInitAndSender(rcvrActor, currentReceiver, argCnt);
	      if(!rcvrActor.equals("sender") && !rcvrActor.equals("self"))
	        getActorFromSymTable(rcvrActor, line);
	      checkRecieverExistance(currentActor, rcvrActor, rcvrName, argumentsTypes, line);
	    }catch(SenderInInitException ex){
	        printErrors(line, "Invalid use of keyword <sender>.");
	    }catch(ActorDoesntExistsException ex){
	        printErrors(line, "Actor: " + rcvrActor + " does not exist.");
	    }catch(ReceiverDoseNotExistsException ex){
	        printErrors(line, "Reciever: " + rcvrName + " does not exist.");
	    }
	  }


	  int findLine(int ln1, int ln2){
	    if(ln1 == -1 && ln2 == -1)
	       return -1;
	    else if(ln1 == -1)
	       return ln2;
	    else if(ln2 == -1)
	       return ln1;
	    else
	      return ln1;
	  }

	  void printErrors(int lineNum, String err){
	    errorOccured ++;
	    if(lineNum >= 0)
	      print("Error(" + lineNum + "): " + err + "\n");
	    else
	      print("Error: " + err + "\n");
	  }

	  void print(String str){
	      System.out.println(str);
	  }

	  Type printErrAndAssignNoType(String msg){
	    print(msg);
	    return new NoType();
	  }

	public ATalkPass2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ActorContext> actor() {
			return getRuleContexts(ActorContext.class);
		}
		public ActorContext actor(int i) {
			return getRuleContext(ActorContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ATalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass2Parser.NL, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        print("------------------------- Pass2 started -------------------------");
			        beginScope();
			    
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==NL) {
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(69);
					actor();
					}
					break;
				case NL:
					{
					setState(70);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        endScope();
			        print("------------------------- Pass2 finished -------------------------");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActorContext extends ParserRuleContext {
		public Token actrName;
		public TerminalNode CONST_NUM() { return getToken(ATalkPass2Parser.CONST_NUM, 0); }
		public List<TerminalNode> NL() { return getTokens(ATalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass2Parser.NL, i);
		}
		public TerminalNode ID() { return getToken(ATalkPass2Parser.ID, 0); }
		public TerminalNode EOF() { return getToken(ATalkPass2Parser.EOF, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<ReceiverContext> receiver() {
			return getRuleContexts(ReceiverContext.class);
		}
		public ReceiverContext receiver(int i) {
			return getRuleContext(ReceiverContext.class,i);
		}
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterActor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitActor(this);
		}
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			((ActorContext)_localctx).actrName = match(ID);
			setState(80);
			match(T__1);
			setState(81);
			match(CONST_NUM);
			setState(82);
			match(T__2);
			setState(83);
			match(NL);
			beginScope();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << NL))) != 0)) {
				{
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
					{
					setState(85);
					state();
					}
					break;
				case T__5:
					{
					setState(86);
					receiver((((ActorContext)_localctx).actrName!=null?((ActorContext)_localctx).actrName.getText():null));
					}
					break;
				case NL:
					{
					setState(87);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__3);
			endScope();
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ATalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkPass2Parser.ID, i);
		}
		public TerminalNode NL() { return getToken(ATalkPass2Parser.NL, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			type();
			setState(98);
			match(ID);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(99);
				match(T__4);
				setState(100);
				match(ID);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverContext extends ParserRuleContext {
		public String actrName;
		public Token currentReceiver;
		public List<TerminalNode> NL() { return getTokens(ATalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ATalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkPass2Parser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReceiverContext(ParserRuleContext parent, int invokingState, String actrName) {
			super(parent, invokingState);
			this.actrName = actrName;
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver(String actrName) throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState(), actrName);
		enterRule(_localctx, 6, RULE_receiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__5);
			setState(109);
			((ReceiverContext)_localctx).currentReceiver = match(ID);
			int argCnt = 0;
			setState(111);
			match(T__6);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(112);
				type();
				setState(113);
				match(ID);
				 SymbolTable.define(); argCnt++;
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(115);
					match(T__4);
					setState(116);
					type();
					setState(117);
					match(ID);
					 SymbolTable.define(); 
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(127);
			match(T__7);
			setState(128);
			match(NL);
			beginScope();
			setState(130);
			statements((((ReceiverContext)_localctx).currentReceiver!=null?((ReceiverContext)_localctx).currentReceiver.getText():null), actrName, argCnt);
			setState(131);
			match(T__3);
			endScope();
			setState(133);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type t;
		public Token size;
		public List<TerminalNode> CONST_NUM() { return getTokens(ATalkPass2Parser.CONST_NUM); }
		public TerminalNode CONST_NUM(int i) {
			return getToken(ATalkPass2Parser.CONST_NUM, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Integer> dims = new ArrayList<Integer>();
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				{
				setState(136);
				match(T__8);
				}
				((TypeContext)_localctx).t =  new IntType();
				}
				break;
			case T__9:
				{
				{
				setState(138);
				match(T__9);
				}
				((TypeContext)_localctx).t =  new CharacterType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(142);
				match(T__10);
				setState(143);
				((TypeContext)_localctx).size = match(CONST_NUM);
				setState(144);
				match(T__11);

				    dims.add(checkDimLenValidationInArray((((TypeContext)_localctx).size!=null?Integer.valueOf(((TypeContext)_localctx).size.getText()):0), (((TypeContext)_localctx).size!=null?((TypeContext)_localctx).size.getLine():0)));
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			    for(int i=dims.size()-1; i >= 0; i--)
			      ((TypeContext)_localctx).t =  new ArrayType(dims.get(i),_localctx.t);
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public String currentReceiver;
		public String currentActor;
		public int argCnt;
		public List<TerminalNode> NL() { return getTokens(ATalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass2Parser.NL, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BlockContext(ParserRuleContext parent, int invokingState, String currentReceiver, String currentActor, int argCnt) {
			super(parent, invokingState);
			this.currentReceiver = currentReceiver;
			this.currentActor = currentActor;
			this.argCnt = argCnt;
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block(String currentReceiver,String currentActor,int argCnt) throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState(), currentReceiver, currentActor, argCnt);
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__12);
			beginScope();
			setState(155);
			match(NL);
			setState(156);
			statement(currentReceiver, currentActor, argCnt);
			setState(157);
			match(T__3);
			endScope();
			setState(159);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public String currentReceiver;
		public String currentActor;
		public int argCnt;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ATalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass2Parser.NL, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementsContext(ParserRuleContext parent, int invokingState, String currentReceiver, String currentActor, int argCnt) {
			super(parent, invokingState);
			this.currentReceiver = currentReceiver;
			this.currentActor = currentActor;
			this.argCnt = argCnt;
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements(String currentReceiver,String currentActor,int argCnt) throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState(), currentReceiver, currentActor, argCnt);
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << NL) | (1L << ID))) != 0)) {
				{
				setState(163);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case T__8:
				case T__9:
				case T__12:
				case T__14:
				case T__15:
				case T__17:
				case T__18:
				case T__21:
				case T__23:
				case T__24:
				case T__30:
				case T__33:
				case T__34:
				case T__36:
				case CONST_NUM:
				case CONST_CHAR:
				case CONST_STR:
				case ID:
					{
					setState(161);
					statement(currentReceiver, currentActor, argCnt);
					}
					break;
				case NL:
					{
					setState(162);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public String currentReceiver;
		public String currentActor;
		public int argCnt;
		public Stm_vardefContext stm_vardef() {
			return getRuleContext(Stm_vardefContext.class,0);
		}
		public Stm_assignmentContext stm_assignment() {
			return getRuleContext(Stm_assignmentContext.class,0);
		}
		public Stm_foreachContext stm_foreach() {
			return getRuleContext(Stm_foreachContext.class,0);
		}
		public Stm_if_elseif_elseContext stm_if_elseif_else() {
			return getRuleContext(Stm_if_elseif_elseContext.class,0);
		}
		public Stm_quitContext stm_quit() {
			return getRuleContext(Stm_quitContext.class,0);
		}
		public Stm_breakContext stm_break() {
			return getRuleContext(Stm_breakContext.class,0);
		}
		public Stm_tellContext stm_tell() {
			return getRuleContext(Stm_tellContext.class,0);
		}
		public Stm_writeContext stm_write() {
			return getRuleContext(Stm_writeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, String currentReceiver, String currentActor, int argCnt) {
			super(parent, invokingState);
			this.currentReceiver = currentReceiver;
			this.currentActor = currentActor;
			this.argCnt = argCnt;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement(String currentReceiver,String currentActor,int argCnt) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), currentReceiver, currentActor, argCnt);
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				stm_vardef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				stm_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				stm_foreach(currentReceiver, currentActor, argCnt);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				stm_if_elseif_else(currentReceiver, currentActor, argCnt);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				stm_quit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				stm_break();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				stm_tell(currentReceiver, currentActor, argCnt);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				stm_write();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				block(currentReceiver, currentActor, argCnt);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_vardefContext extends ParserRuleContext {
		public TypeContext t;
		public Token ln;
		public ExprContext tp;
		public TerminalNode NL() { return getToken(ATalkPass2Parser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ATalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkPass2Parser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_vardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterStm_vardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitStm_vardef(this);
		}
	}

	public final Stm_vardefContext stm_vardef() throws RecognitionException {
		Stm_vardefContext _localctx = new Stm_vardefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stm_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((Stm_vardefContext)_localctx).t = type();
			setState(180);
			((Stm_vardefContext)_localctx).ln = match(ID);
			 SymbolTable.define(); 
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(182);
				match(T__13);
				setState(183);
				((Stm_vardefContext)_localctx).tp = expr();

				        if(!((Stm_vardefContext)_localctx).t.t.equals(((Stm_vardefContext)_localctx).tp.t))
				          printErrors((((Stm_vardefContext)_localctx).ln!=null?((Stm_vardefContext)_localctx).ln.getLine():0), "Invalid assignment.");
				        
				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(188);
				match(T__4);
				setState(189);
				match(ID);
				 SymbolTable.define(); 
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(191);
					match(T__13);
					setState(192);
					((Stm_vardefContext)_localctx).tp = expr();

					          if(!((Stm_vardefContext)_localctx).t.t.equals(((Stm_vardefContext)_localctx).tp.t))
					            printErrors((((Stm_vardefContext)_localctx).ln!=null?((Stm_vardefContext)_localctx).ln.getLine():0), "Invalid assignment.");
					          
					}
				}

				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_tellContext extends ParserRuleContext {
		public String currentReceiver;
		public String currentActor;
		public int argCnt;
		public Token rcvrActor;
		public Token rcvrName;
		public ExprContext tp;
		public TerminalNode NL() { return getToken(ATalkPass2Parser.NL, 0); }
		public List<TerminalNode> ID() { return getTokens(ATalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkPass2Parser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_tellContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Stm_tellContext(ParserRuleContext parent, int invokingState, String currentReceiver, String currentActor, int argCnt) {
			super(parent, invokingState);
			this.currentReceiver = currentReceiver;
			this.currentActor = currentActor;
			this.argCnt = argCnt;
		}
		@Override public int getRuleIndex() { return RULE_stm_tell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterStm_tell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitStm_tell(this);
		}
	}

	public final Stm_tellContext stm_tell(String currentReceiver,String currentActor,int argCnt) throws RecognitionException {
		Stm_tellContext _localctx = new Stm_tellContext(_ctx, getState(), currentReceiver, currentActor, argCnt);
		enterRule(_localctx, 18, RULE_stm_tell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Type> argumentsTypes = new ArrayList<Type>();
			setState(205);
			((Stm_tellContext)_localctx).rcvrActor = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) ) {
				((Stm_tellContext)_localctx).rcvrActor = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(206);
			match(T__16);
			setState(207);
			((Stm_tellContext)_localctx).rcvrName = match(ID);
			setState(208);
			match(T__6);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				setState(209);
				((Stm_tellContext)_localctx).tp = expr();
				argumentsTypes.add(((Stm_tellContext)_localctx).tp.t);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(211);
					match(T__4);
					setState(212);
					((Stm_tellContext)_localctx).tp = expr();
					argumentsTypes.add(((Stm_tellContext)_localctx).tp.t);
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(222);
			match(T__7);
			setState(223);
			match(NL);
			checkCallValidation(currentActor, currentReceiver, (((Stm_tellContext)_localctx).rcvrActor!=null?((Stm_tellContext)_localctx).rcvrActor.getText():null), (((Stm_tellContext)_localctx).rcvrName!=null?((Stm_tellContext)_localctx).rcvrName.getText():null), argumentsTypes, (((Stm_tellContext)_localctx).rcvrName!=null?((Stm_tellContext)_localctx).rcvrName.getLine():0), argCnt);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_writeContext extends ParserRuleContext {
		public Token ln;
		public ExprContext tp;
		public TerminalNode NL() { return getToken(ATalkPass2Parser.NL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stm_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterStm_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitStm_write(this);
		}
	}

	public final Stm_writeContext stm_write() throws RecognitionException {
		Stm_writeContext _localctx = new Stm_writeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stm_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((Stm_writeContext)_localctx).ln = match(T__17);
			setState(227);
			match(T__6);
			setState(228);
			((Stm_writeContext)_localctx).tp = expr();
			setState(229);
			match(T__7);
			setState(230);
			match(NL);
			checkWriteFuncArgument(((Stm_writeContext)_localctx).tp.t, (((Stm_writeContext)_localctx).ln!=null?((Stm_writeContext)_localctx).ln.getLine():0));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_if_elseif_elseContext extends ParserRuleContext {
		public String currentReceiver;
		public String currentActor;
		public int argCnt;
		public Token ln;
		public ExprContext tp;
		public List<TerminalNode> NL() { return getTokens(ATalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass2Parser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_if_elseif_elseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Stm_if_elseif_elseContext(ParserRuleContext parent, int invokingState, String currentReceiver, String currentActor, int argCnt) {
			super(parent, invokingState);
			this.currentReceiver = currentReceiver;
			this.currentActor = currentActor;
			this.argCnt = argCnt;
		}
		@Override public int getRuleIndex() { return RULE_stm_if_elseif_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterStm_if_elseif_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitStm_if_elseif_else(this);
		}
	}

	public final Stm_if_elseif_elseContext stm_if_elseif_else(String currentReceiver,String currentActor,int argCnt) throws RecognitionException {
		Stm_if_elseif_elseContext _localctx = new Stm_if_elseif_elseContext(_ctx, getState(), currentReceiver, currentActor, argCnt);
		enterRule(_localctx, 22, RULE_stm_if_elseif_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			((Stm_if_elseif_elseContext)_localctx).ln = match(T__18);
			beginScope();
			setState(235);
			((Stm_if_elseif_elseContext)_localctx).tp = expr();
			if(!((Stm_if_elseif_elseContext)_localctx).tp.t.equals(new IntType()))
			          printErrors((((Stm_if_elseif_elseContext)_localctx).ln!=null?((Stm_if_elseif_elseContext)_localctx).ln.getLine():0), "Invalid use of expression as a condition.");
			      
			setState(237);
			match(NL);
			setState(238);
			statement(currentReceiver, currentActor, argCnt);
			endScope();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(240);
				((Stm_if_elseif_elseContext)_localctx).ln = match(T__19);
				beginScope();
				setState(242);
				((Stm_if_elseif_elseContext)_localctx).tp = expr();
				if(!((Stm_if_elseif_elseContext)_localctx).tp.t.equals(new IntType()))
				          printErrors((((Stm_if_elseif_elseContext)_localctx).ln!=null?((Stm_if_elseif_elseContext)_localctx).ln.getLine():0), "Invalid use of expression as a condition.");
				      
				setState(244);
				match(NL);
				setState(245);
				statement(currentReceiver, currentActor, argCnt);
				endScope();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(253);
				match(T__20);
				beginScope();
				setState(255);
				match(NL);
				setState(256);
				statement(currentReceiver, currentActor, argCnt);
				endScope();
				}
			}

			setState(261);
			match(T__3);
			setState(262);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_foreachContext extends ParserRuleContext {
		public String currentReceiver;
		public String currentActor;
		public int argCnt;
		public Token id;
		public ExprContext tp;
		public List<TerminalNode> NL() { return getTokens(ATalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass2Parser.NL, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ID() { return getToken(ATalkPass2Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stm_foreachContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Stm_foreachContext(ParserRuleContext parent, int invokingState, String currentReceiver, String currentActor, int argCnt) {
			super(parent, invokingState);
			this.currentReceiver = currentReceiver;
			this.currentActor = currentActor;
			this.argCnt = argCnt;
		}
		@Override public int getRuleIndex() { return RULE_stm_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterStm_foreach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitStm_foreach(this);
		}
	}

	public final Stm_foreachContext stm_foreach(String currentReceiver,String currentActor,int argCnt) throws RecognitionException {
		Stm_foreachContext _localctx = new Stm_foreachContext(_ctx, getState(), currentReceiver, currentActor, argCnt);
		enterRule(_localctx, 24, RULE_stm_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__21);
			beginScope();
			setState(266);
			((Stm_foreachContext)_localctx).id = match(ID);
			setState(267);
			match(T__22);
			setState(268);
			((Stm_foreachContext)_localctx).tp = expr();
			setState(269);
			match(NL);
			checkIterationExpr((((Stm_foreachContext)_localctx).id!=null?((Stm_foreachContext)_localctx).id.getText():null), (((Stm_foreachContext)_localctx).id!=null?((Stm_foreachContext)_localctx).id.getLine():0), ((Stm_foreachContext)_localctx).tp.t);
			setState(271);
			statement(currentReceiver, currentActor, argCnt);
			setState(272);
			match(T__3);
			endScope();
			setState(274);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_quitContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(ATalkPass2Parser.NL, 0); }
		public Stm_quitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_quit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterStm_quit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitStm_quit(this);
		}
	}

	public final Stm_quitContext stm_quit() throws RecognitionException {
		Stm_quitContext _localctx = new Stm_quitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stm_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__23);
			setState(277);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_breakContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(ATalkPass2Parser.NL, 0); }
		public Stm_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterStm_break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitStm_break(this);
		}
	}

	public final Stm_breakContext stm_break() throws RecognitionException {
		Stm_breakContext _localctx = new Stm_breakContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stm_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__24);
			setState(280);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_assignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(ATalkPass2Parser.NL, 0); }
		public Stm_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterStm_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitStm_assignment(this);
		}
	}

	public final Stm_assignmentContext stm_assignment() throws RecognitionException {
		Stm_assignmentContext _localctx = new Stm_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stm_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expr();
			setState(283);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Expr_assignContext tp;
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			((ExprContext)_localctx).tp = expr_assign();
			((ExprContext)_localctx).t =  ((ExprContext)_localctx).tp.t; ((ExprContext)_localctx).rvalue =  ((ExprContext)_localctx).tp.rvalue;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_assignContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Expr_orContext tp1;
		public Token ln;
		public Expr_assignContext tp2;
		public Expr_orContext tp;
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public Expr_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_assign(this);
		}
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_assign);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				((Expr_assignContext)_localctx).tp1 = expr_or();
				setState(289);
				((Expr_assignContext)_localctx).ln = match(T__13);
				setState(290);
				((Expr_assignContext)_localctx).tp2 = expr_assign();
				if(((Expr_assignContext)_localctx).tp1.rvalue)
				          printErrors((((Expr_assignContext)_localctx).ln!=null?((Expr_assignContext)_localctx).ln.getLine():0), "Assignment to an rvalue.");
				        else
				          ((Expr_assignContext)_localctx).t =  assignAssignmentExprType(((Expr_assignContext)_localctx).tp1.t, ((Expr_assignContext)_localctx).tp2.t);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				((Expr_assignContext)_localctx).tp = expr_or();
				((Expr_assignContext)_localctx).t =  ((Expr_assignContext)_localctx).tp.t; ((Expr_assignContext)_localctx).rvalue =  ((Expr_assignContext)_localctx).tp.rvalue;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_orContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Expr_andContext tp1;
		public Expr_or_tmpContext tp2;
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_or(this);
		}
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((Expr_orContext)_localctx).tp1 = expr_and();
			setState(299);
			((Expr_orContext)_localctx).tp2 = expr_or_tmp();
			((Expr_orContext)_localctx).ln_ =  findLine(((Expr_orContext)_localctx).tp1.ln_, ((Expr_orContext)_localctx).tp2.ln_);
			      ((Expr_orContext)_localctx).t =  assignExprType (((Expr_orContext)_localctx).tp1.t, ((Expr_orContext)_localctx).tp2.t, "Invalid arithmatic operands");
			      ((Expr_orContext)_localctx).rvalue =  ((Expr_orContext)_localctx).tp1.rvalue || ((Expr_orContext)_localctx).tp2.rvalue;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_or_tmpContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Token ln;
		public Expr_andContext tp1;
		public Expr_or_tmpContext tp2;
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_or_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_or_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_or_tmp(this);
		}
	}

	public final Expr_or_tmpContext expr_or_tmp() throws RecognitionException {
		Expr_or_tmpContext _localctx = new Expr_or_tmpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_or_tmp);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				((Expr_or_tmpContext)_localctx).ln = match(T__25);
				setState(303);
				((Expr_or_tmpContext)_localctx).tp1 = expr_and();
				setState(304);
				((Expr_or_tmpContext)_localctx).tp2 = expr_or_tmp();
				((Expr_or_tmpContext)_localctx).t =  assignExprType_tmp(((Expr_or_tmpContext)_localctx).tp1.t, "Invalid operands for <or> operator.", (((Expr_or_tmpContext)_localctx).ln!=null?((Expr_or_tmpContext)_localctx).ln.getLine():0)); ((Expr_or_tmpContext)_localctx).rvalue =  true; ((Expr_or_tmpContext)_localctx).ln_ =  (((Expr_or_tmpContext)_localctx).ln!=null?((Expr_or_tmpContext)_localctx).ln.getLine():0);
				}
				break;
			case T__4:
			case T__7:
			case T__11:
			case T__13:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				((Expr_or_tmpContext)_localctx).t =  new NoType(); ((Expr_or_tmpContext)_localctx).rvalue =  false; ((Expr_or_tmpContext)_localctx).ln_ =  -1;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_andContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Expr_eqContext tp1;
		public Expr_and_tmpContext tp2;
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_and(this);
		}
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			((Expr_andContext)_localctx).tp1 = expr_eq();
			setState(311);
			((Expr_andContext)_localctx).tp2 = expr_and_tmp();
			((Expr_andContext)_localctx).ln_ =  findLine(((Expr_andContext)_localctx).tp1.ln_, ((Expr_andContext)_localctx).tp2.ln_);
			      ((Expr_andContext)_localctx).t =  assignExprType (((Expr_andContext)_localctx).tp1.t, ((Expr_andContext)_localctx).tp2.t, "Invalid arithmatic operands");
			      ((Expr_andContext)_localctx).rvalue =  ((Expr_andContext)_localctx).tp1.rvalue || ((Expr_andContext)_localctx).tp2.rvalue;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_and_tmpContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Token ln;
		public Expr_eqContext tp1;
		public Expr_and_tmpContext tp2;
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_and_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_and_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_and_tmp(this);
		}
	}

	public final Expr_and_tmpContext expr_and_tmp() throws RecognitionException {
		Expr_and_tmpContext _localctx = new Expr_and_tmpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_and_tmp);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				((Expr_and_tmpContext)_localctx).ln = match(T__26);
				setState(315);
				((Expr_and_tmpContext)_localctx).tp1 = expr_eq();
				setState(316);
				((Expr_and_tmpContext)_localctx).tp2 = expr_and_tmp();
				((Expr_and_tmpContext)_localctx).t =  assignExprType_tmp(((Expr_and_tmpContext)_localctx).tp1.t, "Invalid operands for <and> operator.", (((Expr_and_tmpContext)_localctx).ln!=null?((Expr_and_tmpContext)_localctx).ln.getLine():0)); ((Expr_and_tmpContext)_localctx).rvalue =  true; ((Expr_and_tmpContext)_localctx).ln_ =  (((Expr_and_tmpContext)_localctx).ln!=null?((Expr_and_tmpContext)_localctx).ln.getLine():0);
				}
				break;
			case T__4:
			case T__7:
			case T__11:
			case T__13:
			case T__25:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				((Expr_and_tmpContext)_localctx).t =  new NoType(); ((Expr_and_tmpContext)_localctx).rvalue =  false; ((Expr_and_tmpContext)_localctx).ln_ =  -1;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_eqContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Expr_cmpContext tp1;
		public Expr_eq_tmpContext tp2;
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_eq(this);
		}
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			((Expr_eqContext)_localctx).tp1 = expr_cmp();
			setState(323);
			((Expr_eqContext)_localctx).tp2 = expr_eq_tmp();
			((Expr_eqContext)_localctx).ln_ =  findLine(((Expr_eqContext)_localctx).tp1.ln_, ((Expr_eqContext)_localctx).tp2.ln_);
			        ((Expr_eqContext)_localctx).t =  checkEqualityExprType(((Expr_eqContext)_localctx).tp1.t, ((Expr_eqContext)_localctx).tp2.t);
			        ((Expr_eqContext)_localctx).rvalue =  ((Expr_eqContext)_localctx).tp1.rvalue || ((Expr_eqContext)_localctx).tp2.rvalue;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_eq_tmpContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Token ln;
		public Expr_cmpContext tp1;
		public Expr_eq_tmpContext tp2;
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eq_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_eq_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_eq_tmp(this);
		}
	}

	public final Expr_eq_tmpContext expr_eq_tmp() throws RecognitionException {
		Expr_eq_tmpContext _localctx = new Expr_eq_tmpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_eq_tmp);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				((Expr_eq_tmpContext)_localctx).ln = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
					((Expr_eq_tmpContext)_localctx).ln = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(327);
				((Expr_eq_tmpContext)_localctx).tp1 = expr_cmp();
				setState(328);
				((Expr_eq_tmpContext)_localctx).tp2 = expr_eq_tmp();
				((Expr_eq_tmpContext)_localctx).t =  checkEqualityExprType_tmp(((Expr_eq_tmpContext)_localctx).tp1.t, ((Expr_eq_tmpContext)_localctx).tp2.t); ((Expr_eq_tmpContext)_localctx).rvalue =  true; ((Expr_eq_tmpContext)_localctx).ln_ =  (((Expr_eq_tmpContext)_localctx).ln!=null?((Expr_eq_tmpContext)_localctx).ln.getLine():0);
				}
				break;
			case T__4:
			case T__7:
			case T__11:
			case T__13:
			case T__25:
			case T__26:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				((Expr_eq_tmpContext)_localctx).t =  new NoType(); ((Expr_eq_tmpContext)_localctx).rvalue =  false; ((Expr_eq_tmpContext)_localctx).ln_ =  -1;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cmpContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Expr_addContext tp1;
		public Expr_cmp_tmpContext tp2;
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_cmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_cmp(this);
		}
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			((Expr_cmpContext)_localctx).tp1 = expr_add();
			setState(335);
			((Expr_cmpContext)_localctx).tp2 = expr_cmp_tmp();
			((Expr_cmpContext)_localctx).ln_ =  findLine(((Expr_cmpContext)_localctx).tp1.ln_, ((Expr_cmpContext)_localctx).tp2.ln_);
			      ((Expr_cmpContext)_localctx).t =  assignExprType (((Expr_cmpContext)_localctx).tp1.t, ((Expr_cmpContext)_localctx).tp2.t, "Invalid arithmatic operands");
			      ((Expr_cmpContext)_localctx).rvalue =  ((Expr_cmpContext)_localctx).tp1.rvalue || ((Expr_cmpContext)_localctx).tp2.rvalue;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cmp_tmpContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Token cmp;
		public Expr_addContext tp;
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_cmp_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_cmp_tmp(this);
		}
	}

	public final Expr_cmp_tmpContext expr_cmp_tmp() throws RecognitionException {
		Expr_cmp_tmpContext _localctx = new Expr_cmp_tmpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_cmp_tmp);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(338);
					((Expr_cmp_tmpContext)_localctx).cmp = match(T__1);
					}
					break;
				case T__2:
					{
					setState(339);
					((Expr_cmp_tmpContext)_localctx).cmp = match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(342);
				((Expr_cmp_tmpContext)_localctx).tp = expr_add();
				((Expr_cmp_tmpContext)_localctx).t =  assignExprType_tmp(((Expr_cmp_tmpContext)_localctx).tp.t, "Invalid operands for comparision operators.", (((Expr_cmp_tmpContext)_localctx).cmp!=null?((Expr_cmp_tmpContext)_localctx).cmp.getLine():0)); ((Expr_cmp_tmpContext)_localctx).rvalue =  true; ((Expr_cmp_tmpContext)_localctx).ln_ =  (((Expr_cmp_tmpContext)_localctx).cmp!=null?((Expr_cmp_tmpContext)_localctx).cmp.getLine():0);
				setState(344);
				expr_cmp_tmp();
				}
				break;
			case T__4:
			case T__7:
			case T__11:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				((Expr_cmp_tmpContext)_localctx).t =  new NoType(); ((Expr_cmp_tmpContext)_localctx).rvalue =  false; ((Expr_cmp_tmpContext)_localctx).ln_ =  -1;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_addContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Expr_multContext tp1;
		public Expr_add_tmpContext tp2;
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_add(this);
		}
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			((Expr_addContext)_localctx).tp1 = expr_mult();
			setState(350);
			((Expr_addContext)_localctx).tp2 = expr_add_tmp();
			((Expr_addContext)_localctx).ln_ =  findLine(((Expr_addContext)_localctx).tp1.ln_, ((Expr_addContext)_localctx).tp2.ln_);
			      ((Expr_addContext)_localctx).t =  assignExprType (((Expr_addContext)_localctx).tp1.t, ((Expr_addContext)_localctx).tp2.t, "Invalid arithmatic operands");
			      ((Expr_addContext)_localctx).rvalue =  ((Expr_addContext)_localctx).tp1.rvalue || ((Expr_addContext)_localctx).tp2.rvalue;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_add_tmpContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Token add;
		public Expr_multContext tp;
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_add_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_add_tmp(this);
		}
	}

	public final Expr_add_tmpContext expr_add_tmp() throws RecognitionException {
		Expr_add_tmpContext _localctx = new Expr_add_tmpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_add_tmp);
		int _la;
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				((Expr_add_tmpContext)_localctx).add = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
					((Expr_add_tmpContext)_localctx).add = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(354);
				((Expr_add_tmpContext)_localctx).tp = expr_mult();
				((Expr_add_tmpContext)_localctx).t =  assignExprType_tmp(((Expr_add_tmpContext)_localctx).tp.t, "Invalid operands for +/- operators.", (((Expr_add_tmpContext)_localctx).add!=null?((Expr_add_tmpContext)_localctx).add.getLine():0)); ((Expr_add_tmpContext)_localctx).rvalue =  true; ((Expr_add_tmpContext)_localctx).ln_ =  (((Expr_add_tmpContext)_localctx).add!=null?((Expr_add_tmpContext)_localctx).add.getLine():0);
				setState(356);
				expr_add_tmp();
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__11:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				((Expr_add_tmpContext)_localctx).t =  new NoType(); ((Expr_add_tmpContext)_localctx).rvalue =  false; ((Expr_add_tmpContext)_localctx).ln_ =  -1;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_multContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Expr_unContext tp1;
		public Expr_mult_tmpContext tp2;
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_mult(this);
		}
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			((Expr_multContext)_localctx).tp1 = expr_un();
			setState(362);
			((Expr_multContext)_localctx).tp2 = expr_mult_tmp();
			((Expr_multContext)_localctx).ln_ =  findLine(((Expr_multContext)_localctx).tp1.ln_, ((Expr_multContext)_localctx).tp2.ln_);
			     ((Expr_multContext)_localctx).t =  assignExprType (((Expr_multContext)_localctx).tp1.t, ((Expr_multContext)_localctx).tp2.t, "Invalid arithmatic operands");
			     ((Expr_multContext)_localctx).rvalue =  ((Expr_multContext)_localctx).tp1.rvalue || ((Expr_multContext)_localctx).tp2.rvalue;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_mult_tmpContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Token mult;
		public Expr_unContext tp;
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_mult_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_mult_tmp(this);
		}
	}

	public final Expr_mult_tmpContext expr_mult_tmp() throws RecognitionException {
		Expr_mult_tmpContext _localctx = new Expr_mult_tmpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr_mult_tmp);
		int _la;
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				((Expr_mult_tmpContext)_localctx).mult = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
					((Expr_mult_tmpContext)_localctx).mult = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(366);
				((Expr_mult_tmpContext)_localctx).tp = expr_un();
				((Expr_mult_tmpContext)_localctx).t =  assignExprType_tmp(((Expr_mult_tmpContext)_localctx).tp.t, "Invalid operands for multiplication operands.", (((Expr_mult_tmpContext)_localctx).mult!=null?((Expr_mult_tmpContext)_localctx).mult.getLine():0)); ((Expr_mult_tmpContext)_localctx).rvalue =  true;  ((Expr_mult_tmpContext)_localctx).ln_ =  (((Expr_mult_tmpContext)_localctx).mult!=null?((Expr_mult_tmpContext)_localctx).mult.getLine():0);
				setState(368);
				expr_mult_tmp();
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__11:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				((Expr_mult_tmpContext)_localctx).t =  new NoType(); ((Expr_mult_tmpContext)_localctx).rvalue =  false; ((Expr_mult_tmpContext)_localctx).ln_ =  -1;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_unContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Token ln;
		public Expr_unContext tp;
		public Expr_memContext tp1;
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_memContext expr_mem() {
			return getRuleContext(Expr_memContext.class,0);
		}
		public Expr_unContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_un; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_un(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_un(this);
		}
	}

	public final Expr_unContext expr_un() throws RecognitionException {
		Expr_unContext _localctx = new Expr_unContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_un);
		int _la;
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				((Expr_unContext)_localctx).ln = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__33) ) {
					((Expr_unContext)_localctx).ln = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(374);
				((Expr_unContext)_localctx).tp = expr_un();
				((Expr_unContext)_localctx).t =  assignExprType_tmp(((Expr_unContext)_localctx).tp.t,  "Invalid arithmatic operands", (((Expr_unContext)_localctx).ln!=null?((Expr_unContext)_localctx).ln.getLine():0)); ((Expr_unContext)_localctx).rvalue =  true; ((Expr_unContext)_localctx).ln_ =  (((Expr_unContext)_localctx).ln!=null?((Expr_unContext)_localctx).ln.getLine():0);
				}
				break;
			case T__6:
			case T__34:
			case T__36:
			case CONST_NUM:
			case CONST_CHAR:
			case CONST_STR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				((Expr_unContext)_localctx).tp1 = expr_mem();
				((Expr_unContext)_localctx).t =  ((Expr_unContext)_localctx).tp1.t; ((Expr_unContext)_localctx).rvalue =  ((Expr_unContext)_localctx).tp1.rvalue; ((Expr_unContext)_localctx).ln_ =  ((Expr_unContext)_localctx).tp1.ln_;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_memContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Expr_otherContext tp;
		public Expr_mem_tmpContext dim;
		public Expr_otherContext expr_other() {
			return getRuleContext(Expr_otherContext.class,0);
		}
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public Expr_memContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_mem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_mem(this);
		}
	}

	public final Expr_memContext expr_mem() throws RecognitionException {
		Expr_memContext _localctx = new Expr_memContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_mem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((Expr_memContext)_localctx).tp = expr_other();
			setState(383);
			((Expr_memContext)_localctx).dim = expr_mem_tmp();

			      ((Expr_memContext)_localctx).ln_ =  findLine(((Expr_memContext)_localctx).tp.ln_, ((Expr_memContext)_localctx).dim.ln_);
			      try{
			        ((Expr_memContext)_localctx).t =  ((Expr_memContext)_localctx).tp.t.dimensionAccess(((Expr_memContext)_localctx).dim.dimension);
			        if(((Expr_memContext)_localctx).dim.dimension == 0)
			          ((Expr_memContext)_localctx).rvalue =  ((Expr_memContext)_localctx).tp.rvalue;
			        else
			          ((Expr_memContext)_localctx).rvalue =  false;
			      }catch(UndefinedDemensionsException ex){
			        ((Expr_memContext)_localctx).t =  printErrAndAssignNoType("Undefined demensions.");
			        ((Expr_memContext)_localctx).rvalue =  false;
			      }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_mem_tmpContext extends ParserRuleContext {
		public int dimension;
		public int ln_;
		public Token ln;
		public ExprContext tp;
		public Expr_mem_tmpContext d;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public Expr_mem_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mem_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_mem_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_mem_tmp(this);
		}
	}

	public final Expr_mem_tmpContext expr_mem_tmp() throws RecognitionException {
		Expr_mem_tmpContext _localctx = new Expr_mem_tmpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_mem_tmp);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				((Expr_mem_tmpContext)_localctx).ln = match(T__10);
				setState(387);
				((Expr_mem_tmpContext)_localctx).tp = expr();

				       ((Expr_mem_tmpContext)_localctx).ln_ =  (((Expr_mem_tmpContext)_localctx).ln!=null?((Expr_mem_tmpContext)_localctx).ln.getLine():0);
				      if(!((Expr_mem_tmpContext)_localctx).tp.t.equals(new IntType()))
				        printErrors((((Expr_mem_tmpContext)_localctx).ln!=null?((Expr_mem_tmpContext)_localctx).ln.getLine():0), "invalid index.");
				      
				setState(389);
				match(T__11);
				setState(390);
				((Expr_mem_tmpContext)_localctx).d = expr_mem_tmp();
				((Expr_mem_tmpContext)_localctx).dimension =  ((Expr_mem_tmpContext)_localctx).d.dimension + 1;
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__11:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				((Expr_mem_tmpContext)_localctx).dimension =  0;  ((Expr_mem_tmpContext)_localctx).ln_ =  -1;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_otherContext extends ParserRuleContext {
		public Type t;
		public boolean rvalue;
		public int ln_;
		public Token ln;
		public Token str;
		public Token id;
		public ExprContext tp1;
		public ExprContext tp2;
		public Token size;
		public ExprContext tp;
		public TerminalNode CONST_NUM() { return getToken(ATalkPass2Parser.CONST_NUM, 0); }
		public TerminalNode CONST_CHAR() { return getToken(ATalkPass2Parser.CONST_CHAR, 0); }
		public TerminalNode CONST_STR() { return getToken(ATalkPass2Parser.CONST_STR, 0); }
		public TerminalNode ID() { return getToken(ATalkPass2Parser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).enterExpr_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass2Listener ) ((ATalkPass2Listener)listener).exitExpr_other(this);
		}
	}

	public final Expr_otherContext expr_other() throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_other);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				((Expr_otherContext)_localctx).ln = match(CONST_NUM);
				((Expr_otherContext)_localctx).t =  new IntType(); ((Expr_otherContext)_localctx).rvalue =  true; ((Expr_otherContext)_localctx).ln_ =  (((Expr_otherContext)_localctx).ln!=null?((Expr_otherContext)_localctx).ln.getLine():0);
				}
				break;
			case CONST_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				((Expr_otherContext)_localctx).ln = match(CONST_CHAR);
				((Expr_otherContext)_localctx).t =  new CharacterType(); ((Expr_otherContext)_localctx).rvalue =  true; ((Expr_otherContext)_localctx).ln_ =  (((Expr_otherContext)_localctx).ln!=null?((Expr_otherContext)_localctx).ln.getLine():0);
				}
				break;
			case CONST_STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				((Expr_otherContext)_localctx).str = match(CONST_STR);
				((Expr_otherContext)_localctx).t =  new ArrayType((((Expr_otherContext)_localctx).str!=null?((Expr_otherContext)_localctx).str.getText():null).length()-2, new CharacterType()); ((Expr_otherContext)_localctx).rvalue =  true; ((Expr_otherContext)_localctx).ln_ =  (((Expr_otherContext)_localctx).str!=null?((Expr_otherContext)_localctx).str.getLine():0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				((Expr_otherContext)_localctx).id = match(ID);
				((Expr_otherContext)_localctx).t =  getIDFromSymTable((((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getText():null), (((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getLine():0)); ((Expr_otherContext)_localctx).ln_ =  (((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getLine():0);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(404);
				((Expr_otherContext)_localctx).ln = match(T__34);
				setState(405);
				((Expr_otherContext)_localctx).tp1 = expr();
				int size = 1;
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(407);
					match(T__4);
					setState(408);
					((Expr_otherContext)_localctx).tp2 = expr();
					size = checkAndFindNumOfItemsInExplitArray(((Expr_otherContext)_localctx).tp1.t, ((Expr_otherContext)_localctx).tp2.t, size);
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((Expr_otherContext)_localctx).t =  assignExplitArrayType(size, ((Expr_otherContext)_localctx).tp1.t, (((Expr_otherContext)_localctx).ln!=null?((Expr_otherContext)_localctx).ln.getLine():0)); ((Expr_otherContext)_localctx).rvalue =  false; ((Expr_otherContext)_localctx).ln_ =  (((Expr_otherContext)_localctx).ln!=null?((Expr_otherContext)_localctx).ln.getLine():0);
				setState(417);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(419);
				match(T__36);
				setState(420);
				match(T__6);
				setState(421);
				((Expr_otherContext)_localctx).size = match(CONST_NUM);
				setState(422);
				match(T__7);
				((Expr_otherContext)_localctx).t =  new ArrayType((((Expr_otherContext)_localctx).size!=null?Integer.valueOf(((Expr_otherContext)_localctx).size.getText()):0), new CharacterType()); ((Expr_otherContext)_localctx).rvalue =  true; ((Expr_otherContext)_localctx).ln_ =  (((Expr_otherContext)_localctx).size!=null?((Expr_otherContext)_localctx).size.getLine():0);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(424);
				((Expr_otherContext)_localctx).ln = match(T__6);
				setState(425);
				((Expr_otherContext)_localctx).tp = expr();
				setState(426);
				match(T__7);
				((Expr_otherContext)_localctx).t =  ((Expr_otherContext)_localctx).tp.t; ((Expr_otherContext)_localctx).rvalue =  ((Expr_otherContext)_localctx).tp.rvalue; ((Expr_otherContext)_localctx).ln_ =  (((Expr_otherContext)_localctx).ln!=null?((Expr_otherContext)_localctx).ln.getLine():0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5{\n\5\f\5\16\5~\13\5\5\5\u0080\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u008f\n\6\3\6\3\6"+
		"\3\6\3\6\7\6\u0095\n\6\f\6\16\6\u0098\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\7\b\u00a6\n\b\f\b\16\b\u00a9\13\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00b4\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bd"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c6\n\n\7\n\u00c8\n\n\f\n\16\n"+
		"\u00cb\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00da\n\13\f\13\16\13\u00dd\13\13\5\13\u00df\n\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fb\n\r\f\r\16\r\u00fe\13\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0106\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u012b"+
		"\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0137\n\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0143\n\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u014f\n\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\5\33\u0157\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u015e"+
		"\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u016a\n\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0176\n\37\3 "+
		"\3 \3 \3 \3 \3 \3 \5 \u017f\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\5\"\u018d\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u019e"+
		"\n#\f#\16#\u01a1\13#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01b0\n"+
		"#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BD\2\b\3\3++\4\2\21\22,,\3\2\36\37\3\2 !\3\2\"#\4\2!!$$\2\u01bb\2"+
		"F\3\2\2\2\4P\3\2\2\2\6c\3\2\2\2\bn\3\2\2\2\n\u0089\3\2\2\2\f\u009b\3\2"+
		"\2\2\16\u00a7\3\2\2\2\20\u00b3\3\2\2\2\22\u00b5\3\2\2\2\24\u00ce\3\2\2"+
		"\2\26\u00e4\3\2\2\2\30\u00eb\3\2\2\2\32\u010a\3\2\2\2\34\u0116\3\2\2\2"+
		"\36\u0119\3\2\2\2 \u011c\3\2\2\2\"\u011f\3\2\2\2$\u012a\3\2\2\2&\u012c"+
		"\3\2\2\2(\u0136\3\2\2\2*\u0138\3\2\2\2,\u0142\3\2\2\2.\u0144\3\2\2\2\60"+
		"\u014e\3\2\2\2\62\u0150\3\2\2\2\64\u015d\3\2\2\2\66\u015f\3\2\2\28\u0169"+
		"\3\2\2\2:\u016b\3\2\2\2<\u0175\3\2\2\2>\u017e\3\2\2\2@\u0180\3\2\2\2B"+
		"\u018c\3\2\2\2D\u01af\3\2\2\2FK\b\2\1\2GJ\5\4\3\2HJ\7+\2\2IG\3\2\2\2I"+
		"H\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\b\2\1\2"+
		"O\3\3\2\2\2PQ\7\3\2\2QR\7,\2\2RS\7\4\2\2ST\7(\2\2TU\7\5\2\2UV\7+\2\2V"+
		"\\\b\3\1\2W[\5\6\4\2X[\5\b\5\2Y[\7+\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2"+
		"[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\6\2\2`a\b\3"+
		"\1\2ab\t\2\2\2b\5\3\2\2\2cd\5\n\6\2di\7,\2\2ef\7\7\2\2fh\7,\2\2ge\3\2"+
		"\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7+\2\2m\7\3\2"+
		"\2\2no\7\b\2\2op\7,\2\2pq\b\5\1\2q\177\7\t\2\2rs\5\n\6\2st\7,\2\2t|\b"+
		"\5\1\2uv\7\7\2\2vw\5\n\6\2wx\7,\2\2xy\b\5\1\2y{\3\2\2\2zu\3\2\2\2{~\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177r\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\n\2\2\u0082\u0083\7+\2\2\u0083"+
		"\u0084\b\5\1\2\u0084\u0085\5\16\b\2\u0085\u0086\7\6\2\2\u0086\u0087\b"+
		"\5\1\2\u0087\u0088\7+\2\2\u0088\t\3\2\2\2\u0089\u008e\b\6\1\2\u008a\u008b"+
		"\7\13\2\2\u008b\u008f\b\6\1\2\u008c\u008d\7\f\2\2\u008d\u008f\b\6\1\2"+
		"\u008e\u008a\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0096\3\2\2\2\u0090\u0091"+
		"\7\r\2\2\u0091\u0092\7(\2\2\u0092\u0093\7\16\2\2\u0093\u0095\b\6\1\2\u0094"+
		"\u0090\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\b\6\1\2\u009a"+
		"\13\3\2\2\2\u009b\u009c\7\17\2\2\u009c\u009d\b\7\1\2\u009d\u009e\7+\2"+
		"\2\u009e\u009f\5\20\t\2\u009f\u00a0\7\6\2\2\u00a0\u00a1\b\7\1\2\u00a1"+
		"\u00a2\7+\2\2\u00a2\r\3\2\2\2\u00a3\u00a6\5\20\t\2\u00a4\u00a6\7+\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\17\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00b4\5\22\n\2\u00ab\u00b4\5 \21\2\u00ac\u00b4\5\32\16\2\u00ad\u00b4"+
		"\5\30\r\2\u00ae\u00b4\5\34\17\2\u00af\u00b4\5\36\20\2\u00b0\u00b4\5\24"+
		"\13\2\u00b1\u00b4\5\26\f\2\u00b2\u00b4\5\f\7\2\u00b3\u00aa\3\2\2\2\u00b3"+
		"\u00ab\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00ae\3\2"+
		"\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\21\3\2\2\2\u00b5\u00b6\5\n\6\2\u00b6\u00b7\7,\2\2"+
		"\u00b7\u00bc\b\n\1\2\u00b8\u00b9\7\20\2\2\u00b9\u00ba\5\"\22\2\u00ba\u00bb"+
		"\b\n\1\2\u00bb\u00bd\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c9\3\2\2\2\u00be\u00bf\7\7\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c5\b\n"+
		"\1\2\u00c1\u00c2\7\20\2\2\u00c2\u00c3\5\"\22\2\u00c3\u00c4\b\n\1\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00be\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7+"+
		"\2\2\u00cd\23\3\2\2\2\u00ce\u00cf\b\13\1\2\u00cf\u00d0\t\3\2\2\u00d0\u00d1"+
		"\7\23\2\2\u00d1\u00d2\7,\2\2\u00d2\u00de\7\t\2\2\u00d3\u00d4\5\"\22\2"+
		"\u00d4\u00db\b\13\1\2\u00d5\u00d6\7\7\2\2\u00d6\u00d7\5\"\22\2\u00d7\u00d8"+
		"\b\13\1\2\u00d8\u00da\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da\u00dd\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00d3\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7\n\2\2\u00e1\u00e2\7+\2\2\u00e2\u00e3\b\13\1\2\u00e3\25\3\2\2"+
		"\2\u00e4\u00e5\7\24\2\2\u00e5\u00e6\7\t\2\2\u00e6\u00e7\5\"\22\2\u00e7"+
		"\u00e8\7\n\2\2\u00e8\u00e9\7+\2\2\u00e9\u00ea\b\f\1\2\u00ea\27\3\2\2\2"+
		"\u00eb\u00ec\7\25\2\2\u00ec\u00ed\b\r\1\2\u00ed\u00ee\5\"\22\2\u00ee\u00ef"+
		"\b\r\1\2\u00ef\u00f0\7+\2\2\u00f0\u00f1\5\20\t\2\u00f1\u00fc\b\r\1\2\u00f2"+
		"\u00f3\7\26\2\2\u00f3\u00f4\b\r\1\2\u00f4\u00f5\5\"\22\2\u00f5\u00f6\b"+
		"\r\1\2\u00f6\u00f7\7+\2\2\u00f7\u00f8\5\20\t\2\u00f8\u00f9\b\r\1\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0105\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0100\7\27\2\2\u0100\u0101\b\r\1\2\u0101\u0102\7+\2\2\u0102\u0103\5\20"+
		"\t\2\u0103\u0104\b\r\1\2\u0104\u0106\3\2\2\2\u0105\u00ff\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7\6\2\2\u0108\u0109\7+"+
		"\2\2\u0109\31\3\2\2\2\u010a\u010b\7\30\2\2\u010b\u010c\b\16\1\2\u010c"+
		"\u010d\7,\2\2\u010d\u010e\7\31\2\2\u010e\u010f\5\"\22\2\u010f\u0110\7"+
		"+\2\2\u0110\u0111\b\16\1\2\u0111\u0112\5\20\t\2\u0112\u0113\7\6\2\2\u0113"+
		"\u0114\b\16\1\2\u0114\u0115\7+\2\2\u0115\33\3\2\2\2\u0116\u0117\7\32\2"+
		"\2\u0117\u0118\7+\2\2\u0118\35\3\2\2\2\u0119\u011a\7\33\2\2\u011a\u011b"+
		"\7+\2\2\u011b\37\3\2\2\2\u011c\u011d\5\"\22\2\u011d\u011e\7+\2\2\u011e"+
		"!\3\2\2\2\u011f\u0120\5$\23\2\u0120\u0121\b\22\1\2\u0121#\3\2\2\2\u0122"+
		"\u0123\5&\24\2\u0123\u0124\7\20\2\2\u0124\u0125\5$\23\2\u0125\u0126\b"+
		"\23\1\2\u0126\u012b\3\2\2\2\u0127\u0128\5&\24\2\u0128\u0129\b\23\1\2\u0129"+
		"\u012b\3\2\2\2\u012a\u0122\3\2\2\2\u012a\u0127\3\2\2\2\u012b%\3\2\2\2"+
		"\u012c\u012d\5*\26\2\u012d\u012e\5(\25\2\u012e\u012f\b\24\1\2\u012f\'"+
		"\3\2\2\2\u0130\u0131\7\34\2\2\u0131\u0132\5*\26\2\u0132\u0133\5(\25\2"+
		"\u0133\u0134\b\25\1\2\u0134\u0137\3\2\2\2\u0135\u0137\b\25\1\2\u0136\u0130"+
		"\3\2\2\2\u0136\u0135\3\2\2\2\u0137)\3\2\2\2\u0138\u0139\5.\30\2\u0139"+
		"\u013a\5,\27\2\u013a\u013b\b\26\1\2\u013b+\3\2\2\2\u013c\u013d\7\35\2"+
		"\2\u013d\u013e\5.\30\2\u013e\u013f\5,\27\2\u013f\u0140\b\27\1\2\u0140"+
		"\u0143\3\2\2\2\u0141\u0143\b\27\1\2\u0142\u013c\3\2\2\2\u0142\u0141\3"+
		"\2\2\2\u0143-\3\2\2\2\u0144\u0145\5\62\32\2\u0145\u0146\5\60\31\2\u0146"+
		"\u0147\b\30\1\2\u0147/\3\2\2\2\u0148\u0149\t\4\2\2\u0149\u014a\5\62\32"+
		"\2\u014a\u014b\5\60\31\2\u014b\u014c\b\31\1\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014f\b\31\1\2\u014e\u0148\3\2\2\2\u014e\u014d\3\2\2\2\u014f\61\3\2\2"+
		"\2\u0150\u0151\5\66\34\2\u0151\u0152\5\64\33\2\u0152\u0153\b\32\1\2\u0153"+
		"\63\3\2\2\2\u0154\u0157\7\4\2\2\u0155\u0157\7\5\2\2\u0156\u0154\3\2\2"+
		"\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\5\66\34\2\u0159"+
		"\u015a\b\33\1\2\u015a\u015b\5\64\33\2\u015b\u015e\3\2\2\2\u015c\u015e"+
		"\b\33\1\2\u015d\u0156\3\2\2\2\u015d\u015c\3\2\2\2\u015e\65\3\2\2\2\u015f"+
		"\u0160\5:\36\2\u0160\u0161\58\35\2\u0161\u0162\b\34\1\2\u0162\67\3\2\2"+
		"\2\u0163\u0164\t\5\2\2\u0164\u0165\5:\36\2\u0165\u0166\b\35\1\2\u0166"+
		"\u0167\58\35\2\u0167\u016a\3\2\2\2\u0168\u016a\b\35\1\2\u0169\u0163\3"+
		"\2\2\2\u0169\u0168\3\2\2\2\u016a9\3\2\2\2\u016b\u016c\5> \2\u016c\u016d"+
		"\5<\37\2\u016d\u016e\b\36\1\2\u016e;\3\2\2\2\u016f\u0170\t\6\2\2\u0170"+
		"\u0171\5> \2\u0171\u0172\b\37\1\2\u0172\u0173\5<\37\2\u0173\u0176\3\2"+
		"\2\2\u0174\u0176\b\37\1\2\u0175\u016f\3\2\2\2\u0175\u0174\3\2\2\2\u0176"+
		"=\3\2\2\2\u0177\u0178\t\7\2\2\u0178\u0179\5> \2\u0179\u017a\b \1\2\u017a"+
		"\u017f\3\2\2\2\u017b\u017c\5@!\2\u017c\u017d\b \1\2\u017d\u017f\3\2\2"+
		"\2\u017e\u0177\3\2\2\2\u017e\u017b\3\2\2\2\u017f?\3\2\2\2\u0180\u0181"+
		"\5D#\2\u0181\u0182\5B\"\2\u0182\u0183\b!\1\2\u0183A\3\2\2\2\u0184\u0185"+
		"\7\r\2\2\u0185\u0186\5\"\22\2\u0186\u0187\b\"\1\2\u0187\u0188\7\16\2\2"+
		"\u0188\u0189\5B\"\2\u0189\u018a\b\"\1\2\u018a\u018d\3\2\2\2\u018b\u018d"+
		"\b\"\1\2\u018c\u0184\3\2\2\2\u018c\u018b\3\2\2\2\u018dC\3\2\2\2\u018e"+
		"\u018f\7(\2\2\u018f\u01b0\b#\1\2\u0190\u0191\7)\2\2\u0191\u01b0\b#\1\2"+
		"\u0192\u0193\7*\2\2\u0193\u01b0\b#\1\2\u0194\u0195\7,\2\2\u0195\u01b0"+
		"\b#\1\2\u0196\u0197\7%\2\2\u0197\u0198\5\"\22\2\u0198\u019f\b#\1\2\u0199"+
		"\u019a\7\7\2\2\u019a\u019b\5\"\22\2\u019b\u019c\b#\1\2\u019c\u019e\3\2"+
		"\2\2\u019d\u0199\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\b#"+
		"\1\2\u01a3\u01a4\7&\2\2\u01a4\u01b0\3\2\2\2\u01a5\u01a6\7\'\2\2\u01a6"+
		"\u01a7\7\t\2\2\u01a7\u01a8\7(\2\2\u01a8\u01a9\7\n\2\2\u01a9\u01b0\b#\1"+
		"\2\u01aa\u01ab\7\t\2\2\u01ab\u01ac\5\"\22\2\u01ac\u01ad\7\n\2\2\u01ad"+
		"\u01ae\b#\1\2\u01ae\u01b0\3\2\2\2\u01af\u018e\3\2\2\2\u01af\u0190\3\2"+
		"\2\2\u01af\u0192\3\2\2\2\u01af\u0194\3\2\2\2\u01af\u0196\3\2\2\2\u01af"+
		"\u01a5\3\2\2\2\u01af\u01aa\3\2\2\2\u01b0E\3\2\2\2!IKZ\\i|\177\u008e\u0096"+
		"\u00a5\u00a7\u00b3\u00bc\u00c5\u00c9\u00db\u00de\u00fc\u0105\u012a\u0136"+
		"\u0142\u014e\u0156\u015d\u0169\u0175\u017e\u018c\u019f\u01af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}