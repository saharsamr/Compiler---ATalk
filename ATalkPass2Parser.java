// Generated from ATalkPass2.g4 by ANTLR 4.7
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
		"'char'", "'['", "']'", "'int'", "'begin'", "'='", "'sender'", "'self'", 
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

	    Type printErrAndAssignNoType(String msg){
	      print(msg);
	      return new NoType();
	    }

	    Type checkArithOperandValidation(Type tp)throws ArithmaticsOperandsException{
	      if(!tp.equals(new IntType()))
	        throw new ArithmaticsOperandsException();
	      else
	        return tp;
	    }

	    Type assignExprType_tmp (Type tp, String msg) {
	      try {
	        return checkArithOperandValidation(tp);
	      } catch(ArithmaticsOperandsException ex) {
	        return printErrAndAssignNoType(msg);
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

	    Type getIDFromSymTable(String idName, int line) {
	      SymbolTableItem item = SymbolTable.top.get(idName);
	      if(item == null)
	        return printErrAndAssignNoType(line + ") Item " + idName + " doesnt exist.");
	      else {
	        SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
	        print(line + ") Variable " + idName + " used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
	        return var.getVariable().getType();
	      }
	    }

	    int checkAndFindNumOfItemsInExplitArray(Type tp1,Type tp2, int size) {
	      if(!tp2.equals(tp1))
	        size = -1;
	      else if(size != -1)
	        size ++;
	      return size;
	    }

	    Type assignExplitArrayType(int size, Type tp) {
	      if(size != -1)
	        return new ArrayType(size, tp);
	      else
	        return printErrAndAssignNoType("Invalid combination for a array type.");
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

	    void checkWriteFuncArgument(Type tp){
	      try{
	        if(!(tp.equals(new IntType()) || tp.equals(new CharacterType())))
	          if(tp.dimensionAccess(1).equals(new CharacterType()))
	            printErrAndAssignNoType("Invalid argument for function <write>.");
	      }catch(UndefinedDemensionsException ex){
	        printErrAndAssignNoType("Invalid argument for function <write>.");
	      }
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

			        print("Pass2 started -------------------------");
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
			        print("Pass2 finished -------------------------");
			    
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
		public TerminalNode ID() { return getToken(ATalkPass2Parser.ID, 0); }
		public TerminalNode CONST_NUM() { return getToken(ATalkPass2Parser.CONST_NUM, 0); }
		public List<TerminalNode> NL() { return getTokens(ATalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass2Parser.NL, i);
		}
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
			match(ID);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__11) | (1L << NL))) != 0)) {
				{
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__11:
					{
					setState(85);
					state();
					}
					break;
				case T__5:
					{
					setState(86);
					receiver();
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
		public List<TerminalNode> ID() { return getTokens(ATalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkPass2Parser.ID, i);
		}
		public List<TerminalNode> NL() { return getTokens(ATalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_receiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__5);
			setState(109);
			match(ID);
			 SymbolTable.define(); 
			setState(111);
			match(T__6);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__11) {
				{
				setState(112);
				type();
				setState(113);
				match(ID);
				 SymbolTable.define(); 
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
			statements();
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__8);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(136);
					match(T__9);
					setState(137);
					match(CONST_NUM);
					setState(138);
					match(T__10);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__11);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(145);
					match(T__9);
					setState(146);
					match(CONST_NUM);
					setState(147);
					match(T__10);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(ATalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__12);
			beginScope();
			setState(157);
			match(NL);
			setState(158);
			statements();
			setState(159);
			match(T__3);
			endScope();
			setState(161);
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
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << NL) | (1L << ID))) != 0)) {
				{
				setState(165);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case T__8:
				case T__11:
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
					setState(163);
					statement();
					}
					break;
				case NL:
					{
					setState(164);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(169);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				stm_vardef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				stm_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				stm_foreach();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				stm_if_elseif_else();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				stm_quit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				stm_break();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				stm_tell();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(177);
				stm_write();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(178);
				block();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ATalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkPass2Parser.ID, i);
		}
		public TerminalNode NL() { return getToken(ATalkPass2Parser.NL, 0); }
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
			setState(181);
			type();
			setState(182);
			match(ID);
			 SymbolTable.define(); 
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(184);
				match(T__13);
				setState(185);
				expr();
				}
			}

			setState(197);
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
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(191);
					match(T__13);
					setState(192);
					expr();
					}
				}

				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
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
		public List<TerminalNode> ID() { return getTokens(ATalkPass2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkPass2Parser.ID, i);
		}
		public TerminalNode NL() { return getToken(ATalkPass2Parser.NL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_tellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Stm_tellContext stm_tell() throws RecognitionException {
		Stm_tellContext _localctx = new Stm_tellContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stm_tell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(203);
			match(T__16);
			setState(204);
			match(ID);
			setState(205);
			match(T__6);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				setState(206);
				expr();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(207);
					match(T__4);
					setState(208);
					expr();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(216);
			match(T__7);
			setState(217);
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

	public static class Stm_writeContext extends ParserRuleContext {
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
			setState(219);
			match(T__17);
			setState(220);
			match(T__6);
			setState(221);
			((Stm_writeContext)_localctx).tp = expr();
			setState(222);
			match(T__7);
			setState(223);
			match(NL);
			checkWriteFuncArgument(((Stm_writeContext)_localctx).tp.t);
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
		public ExprContext tp;
		public List<TerminalNode> NL() { return getTokens(ATalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass2Parser.NL, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_if_elseif_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Stm_if_elseif_elseContext stm_if_elseif_else() throws RecognitionException {
		Stm_if_elseif_elseContext _localctx = new Stm_if_elseif_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stm_if_elseif_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__18);
			beginScope();
			setState(228);
			((Stm_if_elseif_elseContext)_localctx).tp = expr();
			if(!((Stm_if_elseif_elseContext)_localctx).tp.t.equals(new IntType()))
			          printErrAndAssignNoType("Invalid use of expression as a condition.");
			      
			setState(230);
			match(NL);
			setState(231);
			statements();
			endScope();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(233);
				match(T__19);
				beginScope();
				setState(235);
				((Stm_if_elseif_elseContext)_localctx).tp = expr();
				if(!((Stm_if_elseif_elseContext)_localctx).tp.t.equals(new IntType()))
				          printErrAndAssignNoType("Invalid use of expression as a condition.");
				      
				setState(237);
				match(NL);
				setState(238);
				statements();
				endScope();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(246);
				match(T__20);
				beginScope();
				setState(248);
				match(NL);
				setState(249);
				statements();
				endScope();
				}
			}

			setState(254);
			match(T__3);
			setState(255);
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
		public Token id;
		public ExprContext tp;
		public List<TerminalNode> NL() { return getTokens(ATalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ID() { return getToken(ATalkPass2Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stm_foreachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Stm_foreachContext stm_foreach() throws RecognitionException {
		Stm_foreachContext _localctx = new Stm_foreachContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stm_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__21);
			beginScope();
			setState(259);
			((Stm_foreachContext)_localctx).id = match(ID);
			setState(260);
			match(T__22);
			setState(261);
			((Stm_foreachContext)_localctx).tp = expr();
			setState(262);
			match(NL);
			checkIterationExpr((((Stm_foreachContext)_localctx).id!=null?((Stm_foreachContext)_localctx).id.getText():null), (((Stm_foreachContext)_localctx).id!=null?((Stm_foreachContext)_localctx).id.getLine():0), ((Stm_foreachContext)_localctx).tp.t);
			setState(264);
			statements();
			setState(265);
			match(T__3);
			endScope();
			setState(267);
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
			setState(269);
			match(T__23);
			setState(270);
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
			setState(272);
			match(T__24);
			setState(273);
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
			setState(275);
			expr();
			setState(276);
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
			setState(278);
			((ExprContext)_localctx).tp = expr_assign();
			((ExprContext)_localctx).t =  ((ExprContext)_localctx).tp.t;
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
		public Expr_orContext tp1;
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				((Expr_assignContext)_localctx).tp1 = expr_or();
				setState(282);
				match(T__13);
				setState(283);
				((Expr_assignContext)_localctx).tp2 = expr_assign();
				((Expr_assignContext)_localctx).t =  assignAssignmentExprType(((Expr_assignContext)_localctx).tp1.t, ((Expr_assignContext)_localctx).tp2.t);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				((Expr_assignContext)_localctx).tp = expr_or();
				((Expr_assignContext)_localctx).t =  ((Expr_assignContext)_localctx).tp.t;
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
			setState(291);
			((Expr_orContext)_localctx).tp1 = expr_and();
			setState(292);
			((Expr_orContext)_localctx).tp2 = expr_or_tmp();
			((Expr_orContext)_localctx).t =  assignExprType (((Expr_orContext)_localctx).tp1.t, ((Expr_orContext)_localctx).tp2.t, "Invalid arithmatic operands");
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
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(T__25);
				setState(296);
				((Expr_or_tmpContext)_localctx).tp1 = expr_and();
				setState(297);
				((Expr_or_tmpContext)_localctx).tp2 = expr_or_tmp();
				((Expr_or_tmpContext)_localctx).t =  assignExprType_tmp(((Expr_or_tmpContext)_localctx).tp1.t, "Invalid operands for <or> operator.");
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				((Expr_or_tmpContext)_localctx).t =  new NoType();
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
			setState(303);
			((Expr_andContext)_localctx).tp1 = expr_eq();
			setState(304);
			((Expr_andContext)_localctx).tp2 = expr_and_tmp();
			((Expr_andContext)_localctx).t =  assignExprType (((Expr_andContext)_localctx).tp1.t, ((Expr_andContext)_localctx).tp2.t, "Invalid arithmatic operands");
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
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(T__26);
				setState(308);
				((Expr_and_tmpContext)_localctx).tp1 = expr_eq();
				setState(309);
				((Expr_and_tmpContext)_localctx).tp2 = expr_and_tmp();
				((Expr_and_tmpContext)_localctx).t =  assignExprType_tmp(((Expr_and_tmpContext)_localctx).tp1.t, "Invalid operands for <and> operator.");
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				((Expr_and_tmpContext)_localctx).t =  new NoType();
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
			setState(315);
			((Expr_eqContext)_localctx).tp1 = expr_cmp();
			setState(316);
			((Expr_eqContext)_localctx).tp2 = expr_eq_tmp();
			((Expr_eqContext)_localctx).t =  checkEqualityExprType(((Expr_eqContext)_localctx).tp1.t, ((Expr_eqContext)_localctx).tp2.t);
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
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				((Expr_eq_tmpContext)_localctx).tp1 = expr_cmp();
				setState(321);
				((Expr_eq_tmpContext)_localctx).tp2 = expr_eq_tmp();
				((Expr_eq_tmpContext)_localctx).t =  checkEqualityExprType_tmp(((Expr_eq_tmpContext)_localctx).tp1.t, ((Expr_eq_tmpContext)_localctx).tp2.t);
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				((Expr_eq_tmpContext)_localctx).t =  new NoType();
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
			setState(327);
			((Expr_cmpContext)_localctx).tp1 = expr_add();
			setState(328);
			((Expr_cmpContext)_localctx).tp2 = expr_cmp_tmp();
			((Expr_cmpContext)_localctx).t =  assignExprType (((Expr_cmpContext)_localctx).tp1.t, ((Expr_cmpContext)_localctx).tp2.t, "Invalid arithmatic operands");
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
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(331);
					((Expr_cmp_tmpContext)_localctx).cmp = match(T__1);
					}
					break;
				case T__2:
					{
					setState(332);
					((Expr_cmp_tmpContext)_localctx).cmp = match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(335);
				((Expr_cmp_tmpContext)_localctx).tp = expr_add();
				((Expr_cmp_tmpContext)_localctx).t =  assignExprType_tmp(((Expr_cmp_tmpContext)_localctx).tp.t, (((Expr_cmp_tmpContext)_localctx).cmp!=null?((Expr_cmp_tmpContext)_localctx).cmp.getText():null));
				setState(337);
				expr_cmp_tmp();
				}
				break;
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				((Expr_cmp_tmpContext)_localctx).t =  new NoType();
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
			setState(342);
			((Expr_addContext)_localctx).tp1 = expr_mult();
			setState(343);
			((Expr_addContext)_localctx).tp2 = expr_add_tmp();
			((Expr_addContext)_localctx).t =  assignExprType (((Expr_addContext)_localctx).tp1.t, ((Expr_addContext)_localctx).tp2.t, "Invalid arithmatic operands");
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
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
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
				setState(347);
				((Expr_add_tmpContext)_localctx).tp = expr_mult();
				((Expr_add_tmpContext)_localctx).t =  assignExprType_tmp(((Expr_add_tmpContext)_localctx).tp.t, (((Expr_add_tmpContext)_localctx).add!=null?((Expr_add_tmpContext)_localctx).add.getText():null));
				setState(349);
				expr_add_tmp();
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__10:
			case T__13:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				((Expr_add_tmpContext)_localctx).t =  new NoType();
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
			setState(354);
			((Expr_multContext)_localctx).tp1 = expr_un();
			setState(355);
			((Expr_multContext)_localctx).tp2 = expr_mult_tmp();
			((Expr_multContext)_localctx).t =  assignExprType (((Expr_multContext)_localctx).tp1.t, ((Expr_multContext)_localctx).tp2.t, "Invalid arithmatic operands");
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
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
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
				setState(359);
				((Expr_mult_tmpContext)_localctx).tp = expr_un();
				((Expr_mult_tmpContext)_localctx).t =  assignExprType_tmp(((Expr_mult_tmpContext)_localctx).tp.t, (((Expr_mult_tmpContext)_localctx).mult!=null?((Expr_mult_tmpContext)_localctx).mult.getText():null));
				setState(361);
				expr_mult_tmp();
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__10:
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
				((Expr_mult_tmpContext)_localctx).t =  new NoType();
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
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(367);
				((Expr_unContext)_localctx).tp = expr_un();
				((Expr_unContext)_localctx).t =  assignExprType_tmp(((Expr_unContext)_localctx).tp.t,  "Invalid arithmatic operands");
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
				setState(370);
				((Expr_unContext)_localctx).tp1 = expr_mem();
				((Expr_unContext)_localctx).t =  ((Expr_unContext)_localctx).tp1.t;
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
			setState(375);
			((Expr_memContext)_localctx).tp = expr_other();
			setState(376);
			((Expr_memContext)_localctx).dim = expr_mem_tmp();

			      try{
			        ((Expr_memContext)_localctx).t =  ((Expr_memContext)_localctx).tp.t.dimensionAccess(((Expr_memContext)_localctx).dim.dimension);
			      }catch(UndefinedDemensionsException ex){
			        ((Expr_memContext)_localctx).t =  printErrAndAssignNoType("Undefined demensions.");
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
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(T__9);
				setState(380);
				((Expr_mem_tmpContext)_localctx).tp = expr();

				      if(!((Expr_mem_tmpContext)_localctx).tp.t.equals(new IntType()))
				        print("invalid index.");
				      
				setState(382);
				match(T__10);
				setState(383);
				((Expr_mem_tmpContext)_localctx).d = expr_mem_tmp();
				((Expr_mem_tmpContext)_localctx).dimension =  ((Expr_mem_tmpContext)_localctx).d.dimension + 1;
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__10:
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
				((Expr_mem_tmpContext)_localctx).dimension =  0;
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
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(CONST_NUM);
				((Expr_otherContext)_localctx).t =  new IntType();
				}
				break;
			case CONST_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(CONST_CHAR);
				((Expr_otherContext)_localctx).t =  new CharacterType();
				}
				break;
			case CONST_STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				((Expr_otherContext)_localctx).str = match(CONST_STR);
				((Expr_otherContext)_localctx).t =  new ArrayType((((Expr_otherContext)_localctx).str!=null?((Expr_otherContext)_localctx).str.getText():null).length()-2, new CharacterType());
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				((Expr_otherContext)_localctx).id = match(ID);
				((Expr_otherContext)_localctx).t =  getIDFromSymTable((((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getText():null), (((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getLine():0));
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				match(T__34);
				setState(398);
				((Expr_otherContext)_localctx).tp1 = expr();
				int size = 1;
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(400);
					match(T__4);
					setState(401);
					((Expr_otherContext)_localctx).tp2 = expr();
					size = checkAndFindNumOfItemsInExplitArray(((Expr_otherContext)_localctx).tp1.t, ((Expr_otherContext)_localctx).tp2.t, size);
					}
					}
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((Expr_otherContext)_localctx).t =  assignExplitArrayType(size, ((Expr_otherContext)_localctx).tp1.t);
				setState(410);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				match(T__36);
				setState(413);
				match(T__6);
				setState(414);
				((Expr_otherContext)_localctx).size = match(CONST_NUM);
				setState(415);
				match(T__7);
				((Expr_otherContext)_localctx).t =  new ArrayType((((Expr_otherContext)_localctx).size!=null?Integer.valueOf(((Expr_otherContext)_localctx).size.getText()):0), new CharacterType());
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(417);
				match(T__6);
				setState(418);
				((Expr_otherContext)_localctx).tp = expr();
				setState(419);
				match(T__7);
				((Expr_otherContext)_localctx).t =  ((Expr_otherContext)_localctx).tp.t;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5{\n\5\f\5\16\5~\13\5\5\5\u0080\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u008e\n\6\f\6\16\6\u0091"+
		"\13\6\3\6\3\6\3\6\3\6\7\6\u0097\n\6\f\6\16\6\u009a\13\6\5\6\u009c\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u00a8\n\b\f\b\16\b\u00ab"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b6\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00bd\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c4\n\n\7\n\u00c6\n\n\f"+
		"\n\16\n\u00c9\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d4"+
		"\n\13\f\13\16\13\u00d7\13\13\5\13\u00d9\n\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u00f4\n\r\f\r\16\r\u00f7\13\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00ff\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0124\n\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0130\n\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u013c\n\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0148\n\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\5\33\u0150\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u0157\n\33\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0163\n\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u016f\n\37\3 \3 \3 \3 \3"+
		" \3 \3 \5 \u0178\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0186"+
		"\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0197\n#\f#\16#\u019a"+
		"\13#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01a9\n#\3#\2\2$\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\b\3\3"+
		"++\4\2\21\22,,\3\2\36\37\3\2 !\3\2\"#\4\2!!$$\2\u01b5\2F\3\2\2\2\4P\3"+
		"\2\2\2\6c\3\2\2\2\bn\3\2\2\2\n\u009b\3\2\2\2\f\u009d\3\2\2\2\16\u00a9"+
		"\3\2\2\2\20\u00b5\3\2\2\2\22\u00b7\3\2\2\2\24\u00cc\3\2\2\2\26\u00dd\3"+
		"\2\2\2\30\u00e4\3\2\2\2\32\u0103\3\2\2\2\34\u010f\3\2\2\2\36\u0112\3\2"+
		"\2\2 \u0115\3\2\2\2\"\u0118\3\2\2\2$\u0123\3\2\2\2&\u0125\3\2\2\2(\u012f"+
		"\3\2\2\2*\u0131\3\2\2\2,\u013b\3\2\2\2.\u013d\3\2\2\2\60\u0147\3\2\2\2"+
		"\62\u0149\3\2\2\2\64\u0156\3\2\2\2\66\u0158\3\2\2\28\u0162\3\2\2\2:\u0164"+
		"\3\2\2\2<\u016e\3\2\2\2>\u0177\3\2\2\2@\u0179\3\2\2\2B\u0185\3\2\2\2D"+
		"\u01a8\3\2\2\2FK\b\2\1\2GJ\5\4\3\2HJ\7+\2\2IG\3\2\2\2IH\3\2\2\2JM\3\2"+
		"\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\b\2\1\2O\3\3\2\2\2PQ\7"+
		"\3\2\2QR\7,\2\2RS\7\4\2\2ST\7(\2\2TU\7\5\2\2UV\7+\2\2V\\\b\3\1\2W[\5\6"+
		"\4\2X[\5\b\5\2Y[\7+\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\6\2\2`a\b\3\1\2ab\t\2\2\2b\5"+
		"\3\2\2\2cd\5\n\6\2di\7,\2\2ef\7\7\2\2fh\7,\2\2ge\3\2\2\2hk\3\2\2\2ig\3"+
		"\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7+\2\2m\7\3\2\2\2no\7\b\2\2op\7"+
		",\2\2pq\b\5\1\2q\177\7\t\2\2rs\5\n\6\2st\7,\2\2t|\b\5\1\2uv\7\7\2\2vw"+
		"\5\n\6\2wx\7,\2\2xy\b\5\1\2y{\3\2\2\2zu\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}"+
		"\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177r\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\7\n\2\2\u0082\u0083\7+\2\2\u0083\u0084\b\5"+
		"\1\2\u0084\u0085\5\16\b\2\u0085\u0086\7\6\2\2\u0086\u0087\b\5\1\2\u0087"+
		"\u0088\7+\2\2\u0088\t\3\2\2\2\u0089\u008f\7\13\2\2\u008a\u008b\7\f\2\2"+
		"\u008b\u008c\7(\2\2\u008c\u008e\7\r\2\2\u008d\u008a\3\2\2\2\u008e\u0091"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u009c\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0098\7\16\2\2\u0093\u0094\7\f\2\2\u0094\u0095\7"+
		"(\2\2\u0095\u0097\7\r\2\2\u0096\u0093\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u0089\3\2\2\2\u009b\u0092\3\2\2\2\u009c\13\3\2\2\2\u009d\u009e"+
		"\7\17\2\2\u009e\u009f\b\7\1\2\u009f\u00a0\7+\2\2\u00a0\u00a1\5\16\b\2"+
		"\u00a1\u00a2\7\6\2\2\u00a2\u00a3\b\7\1\2\u00a3\u00a4\7+\2\2\u00a4\r\3"+
		"\2\2\2\u00a5\u00a8\5\20\t\2\u00a6\u00a8\7+\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\17\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b6\5\22\n\2\u00ad\u00b6"+
		"\5 \21\2\u00ae\u00b6\5\32\16\2\u00af\u00b6\5\30\r\2\u00b0\u00b6\5\34\17"+
		"\2\u00b1\u00b6\5\36\20\2\u00b2\u00b6\5\24\13\2\u00b3\u00b6\5\26\f\2\u00b4"+
		"\u00b6\5\f\7\2\u00b5\u00ac\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00ae\3\2"+
		"\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5"+
		"\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\21\3\2\2"+
		"\2\u00b7\u00b8\5\n\6\2\u00b8\u00b9\7,\2\2\u00b9\u00bc\b\n\1\2\u00ba\u00bb"+
		"\7\20\2\2\u00bb\u00bd\5\"\22\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00c7\3\2\2\2\u00be\u00bf\7\7\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c3"+
		"\b\n\1\2\u00c1\u00c2\7\20\2\2\u00c2\u00c4\5\"\22\2\u00c3\u00c1\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00be\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\7+\2\2\u00cb\23\3\2\2\2\u00cc\u00cd\t\3\2\2"+
		"\u00cd\u00ce\7\23\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d8\7\t\2\2\u00d0\u00d5"+
		"\5\"\22\2\u00d1\u00d2\7\7\2\2\u00d2\u00d4\5\"\22\2\u00d3\u00d1\3\2\2\2"+
		"\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\7\n\2\2\u00db\u00dc\7+\2\2\u00dc\25\3\2\2\2"+
		"\u00dd\u00de\7\24\2\2\u00de\u00df\7\t\2\2\u00df\u00e0\5\"\22\2\u00e0\u00e1"+
		"\7\n\2\2\u00e1\u00e2\7+\2\2\u00e2\u00e3\b\f\1\2\u00e3\27\3\2\2\2\u00e4"+
		"\u00e5\7\25\2\2\u00e5\u00e6\b\r\1\2\u00e6\u00e7\5\"\22\2\u00e7\u00e8\b"+
		"\r\1\2\u00e8\u00e9\7+\2\2\u00e9\u00ea\5\16\b\2\u00ea\u00f5\b\r\1\2\u00eb"+
		"\u00ec\7\26\2\2\u00ec\u00ed\b\r\1\2\u00ed\u00ee\5\"\22\2\u00ee\u00ef\b"+
		"\r\1\2\u00ef\u00f0\7+\2\2\u00f0\u00f1\5\16\b\2\u00f1\u00f2\b\r\1\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fe\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f9\7\27\2\2\u00f9\u00fa\b\r\1\2\u00fa\u00fb\7+\2\2\u00fb\u00fc\5\16"+
		"\b\2\u00fc\u00fd\b\r\1\2\u00fd\u00ff\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\6\2\2\u0101\u0102\7+"+
		"\2\2\u0102\31\3\2\2\2\u0103\u0104\7\30\2\2\u0104\u0105\b\16\1\2\u0105"+
		"\u0106\7,\2\2\u0106\u0107\7\31\2\2\u0107\u0108\5\"\22\2\u0108\u0109\7"+
		"+\2\2\u0109\u010a\b\16\1\2\u010a\u010b\5\16\b\2\u010b\u010c\7\6\2\2\u010c"+
		"\u010d\b\16\1\2\u010d\u010e\7+\2\2\u010e\33\3\2\2\2\u010f\u0110\7\32\2"+
		"\2\u0110\u0111\7+\2\2\u0111\35\3\2\2\2\u0112\u0113\7\33\2\2\u0113\u0114"+
		"\7+\2\2\u0114\37\3\2\2\2\u0115\u0116\5\"\22\2\u0116\u0117\7+\2\2\u0117"+
		"!\3\2\2\2\u0118\u0119\5$\23\2\u0119\u011a\b\22\1\2\u011a#\3\2\2\2\u011b"+
		"\u011c\5&\24\2\u011c\u011d\7\20\2\2\u011d\u011e\5$\23\2\u011e\u011f\b"+
		"\23\1\2\u011f\u0124\3\2\2\2\u0120\u0121\5&\24\2\u0121\u0122\b\23\1\2\u0122"+
		"\u0124\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u0120\3\2\2\2\u0124%\3\2\2\2"+
		"\u0125\u0126\5*\26\2\u0126\u0127\5(\25\2\u0127\u0128\b\24\1\2\u0128\'"+
		"\3\2\2\2\u0129\u012a\7\34\2\2\u012a\u012b\5*\26\2\u012b\u012c\5(\25\2"+
		"\u012c\u012d\b\25\1\2\u012d\u0130\3\2\2\2\u012e\u0130\b\25\1\2\u012f\u0129"+
		"\3\2\2\2\u012f\u012e\3\2\2\2\u0130)\3\2\2\2\u0131\u0132\5.\30\2\u0132"+
		"\u0133\5,\27\2\u0133\u0134\b\26\1\2\u0134+\3\2\2\2\u0135\u0136\7\35\2"+
		"\2\u0136\u0137\5.\30\2\u0137\u0138\5,\27\2\u0138\u0139\b\27\1\2\u0139"+
		"\u013c\3\2\2\2\u013a\u013c\b\27\1\2\u013b\u0135\3\2\2\2\u013b\u013a\3"+
		"\2\2\2\u013c-\3\2\2\2\u013d\u013e\5\62\32\2\u013e\u013f\5\60\31\2\u013f"+
		"\u0140\b\30\1\2\u0140/\3\2\2\2\u0141\u0142\t\4\2\2\u0142\u0143\5\62\32"+
		"\2\u0143\u0144\5\60\31\2\u0144\u0145\b\31\1\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0148\b\31\1\2\u0147\u0141\3\2\2\2\u0147\u0146\3\2\2\2\u0148\61\3\2\2"+
		"\2\u0149\u014a\5\66\34\2\u014a\u014b\5\64\33\2\u014b\u014c\b\32\1\2\u014c"+
		"\63\3\2\2\2\u014d\u0150\7\4\2\2\u014e\u0150\7\5\2\2\u014f\u014d\3\2\2"+
		"\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\5\66\34\2\u0152"+
		"\u0153\b\33\1\2\u0153\u0154\5\64\33\2\u0154\u0157\3\2\2\2\u0155\u0157"+
		"\b\33\1\2\u0156\u014f\3\2\2\2\u0156\u0155\3\2\2\2\u0157\65\3\2\2\2\u0158"+
		"\u0159\5:\36\2\u0159\u015a\58\35\2\u015a\u015b\b\34\1\2\u015b\67\3\2\2"+
		"\2\u015c\u015d\t\5\2\2\u015d\u015e\5:\36\2\u015e\u015f\b\35\1\2\u015f"+
		"\u0160\58\35\2\u0160\u0163\3\2\2\2\u0161\u0163\b\35\1\2\u0162\u015c\3"+
		"\2\2\2\u0162\u0161\3\2\2\2\u01639\3\2\2\2\u0164\u0165\5> \2\u0165\u0166"+
		"\5<\37\2\u0166\u0167\b\36\1\2\u0167;\3\2\2\2\u0168\u0169\t\6\2\2\u0169"+
		"\u016a\5> \2\u016a\u016b\b\37\1\2\u016b\u016c\5<\37\2\u016c\u016f\3\2"+
		"\2\2\u016d\u016f\b\37\1\2\u016e\u0168\3\2\2\2\u016e\u016d\3\2\2\2\u016f"+
		"=\3\2\2\2\u0170\u0171\t\7\2\2\u0171\u0172\5> \2\u0172\u0173\b \1\2\u0173"+
		"\u0178\3\2\2\2\u0174\u0175\5@!\2\u0175\u0176\b \1\2\u0176\u0178\3\2\2"+
		"\2\u0177\u0170\3\2\2\2\u0177\u0174\3\2\2\2\u0178?\3\2\2\2\u0179\u017a"+
		"\5D#\2\u017a\u017b\5B\"\2\u017b\u017c\b!\1\2\u017cA\3\2\2\2\u017d\u017e"+
		"\7\f\2\2\u017e\u017f\5\"\22\2\u017f\u0180\b\"\1\2\u0180\u0181\7\r\2\2"+
		"\u0181\u0182\5B\"\2\u0182\u0183\b\"\1\2\u0183\u0186\3\2\2\2\u0184\u0186"+
		"\b\"\1\2\u0185\u017d\3\2\2\2\u0185\u0184\3\2\2\2\u0186C\3\2\2\2\u0187"+
		"\u0188\7(\2\2\u0188\u01a9\b#\1\2\u0189\u018a\7)\2\2\u018a\u01a9\b#\1\2"+
		"\u018b\u018c\7*\2\2\u018c\u01a9\b#\1\2\u018d\u018e\7,\2\2\u018e\u01a9"+
		"\b#\1\2\u018f\u0190\7%\2\2\u0190\u0191\5\"\22\2\u0191\u0198\b#\1\2\u0192"+
		"\u0193\7\7\2\2\u0193\u0194\5\"\22\2\u0194\u0195\b#\1\2\u0195\u0197\3\2"+
		"\2\2\u0196\u0192\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\b#"+
		"\1\2\u019c\u019d\7&\2\2\u019d\u01a9\3\2\2\2\u019e\u019f\7\'\2\2\u019f"+
		"\u01a0\7\t\2\2\u01a0\u01a1\7(\2\2\u01a1\u01a2\7\n\2\2\u01a2\u01a9\b#\1"+
		"\2\u01a3\u01a4\7\t\2\2\u01a4\u01a5\5\"\22\2\u01a5\u01a6\7\n\2\2\u01a6"+
		"\u01a7\b#\1\2\u01a7\u01a9\3\2\2\2\u01a8\u0187\3\2\2\2\u01a8\u0189\3\2"+
		"\2\2\u01a8\u018b\3\2\2\2\u01a8\u018d\3\2\2\2\u01a8\u018f\3\2\2\2\u01a8"+
		"\u019e\3\2\2\2\u01a8\u01a3\3\2\2\2\u01a9E\3\2\2\2\"IKZ\\i|\177\u008f\u0098"+
		"\u009b\u00a7\u00a9\u00b5\u00bc\u00c3\u00c7\u00d5\u00d8\u00f5\u00fe\u0123"+
		"\u012f\u013b\u0147\u014f\u0156\u0162\u016e\u0177\u0185\u0198\u01a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}