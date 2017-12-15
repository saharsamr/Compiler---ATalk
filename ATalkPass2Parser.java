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
			 SymbolTable.define(); 
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(100);
				match(T__4);
				setState(101);
				match(ID);
				 SymbolTable.define(); 
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
			setState(110);
			match(T__5);
			setState(111);
			match(ID);
			 SymbolTable.define(); 
			setState(113);
			match(T__6);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__11) {
				{
				setState(114);
				type();
				setState(115);
				match(ID);
				 SymbolTable.define(); 
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(117);
					match(T__4);
					setState(118);
					type();
					setState(119);
					match(ID);
					 SymbolTable.define(); 
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(129);
			match(T__7);
			setState(130);
			match(NL);
			beginScope();
			setState(132);
			statements();
			setState(133);
			match(T__3);
			endScope();
			setState(135);
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__8);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(138);
					match(T__9);
					setState(139);
					match(CONST_NUM);
					setState(140);
					match(T__10);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__11);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(147);
					match(T__9);
					setState(148);
					match(CONST_NUM);
					setState(149);
					match(T__10);
					}
					}
					setState(154);
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
			setState(157);
			match(T__12);
			beginScope();
			setState(159);
			match(NL);
			setState(160);
			statements();
			setState(161);
			match(T__3);
			endScope();
			setState(163);
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
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << NL) | (1L << ID))) != 0)) {
				{
				setState(167);
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
					setState(165);
					statement();
					}
					break;
				case NL:
					{
					setState(166);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(171);
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				stm_vardef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				stm_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				stm_foreach();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				stm_if_elseif_else();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				stm_quit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				stm_break();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				stm_tell();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				stm_write();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(180);
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
			setState(183);
			type();
			setState(184);
			match(ID);
			 SymbolTable.define(); 
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(186);
				match(T__13);
				setState(187);
				expr();
				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(190);
				match(T__4);
				setState(191);
				match(ID);
				 SymbolTable.define(); 
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(193);
					match(T__13);
					setState(194);
					expr();
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
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(205);
			match(T__16);
			setState(206);
			match(ID);
			setState(207);
			match(T__6);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				setState(208);
				expr();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(209);
					match(T__4);
					setState(210);
					expr();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(218);
			match(T__7);
			setState(219);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(ATalkPass2Parser.NL, 0); }
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
			setState(221);
			match(T__17);
			setState(222);
			match(T__6);
			setState(223);
			expr();
			setState(224);
			match(T__7);
			setState(225);
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

	public static class Stm_if_elseif_elseContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
			setState(227);
			match(T__18);
			beginScope();
			setState(229);
			expr();
			setState(230);
			match(NL);
			setState(231);
			statements();
			endScope();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(233);
				match(T__19);
				beginScope();
				setState(235);
				expr();
				setState(236);
				match(NL);
				setState(237);
				statements();
				endScope();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(245);
				match(T__20);
				beginScope();
				setState(247);
				match(NL);
				setState(248);
				statements();
				endScope();
				}
			}

			setState(253);
			match(T__3);
			setState(254);
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
		public TerminalNode ID() { return getToken(ATalkPass2Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ATalkPass2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
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
			setState(256);
			match(T__21);
			beginScope();
			setState(258);
			match(ID);
			setState(259);
			match(T__22);
			setState(260);
			expr();
			setState(261);
			match(NL);
			setState(262);
			statements();
			setState(263);
			match(T__3);
			endScope();
			setState(265);
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
			setState(267);
			match(T__23);
			setState(268);
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
			setState(270);
			match(T__24);
			setState(271);
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
			setState(273);
			expr();
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
			setState(276);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				((Expr_assignContext)_localctx).tp1 = expr_or();
				setState(280);
				match(T__13);
				setState(281);
				((Expr_assignContext)_localctx).tp2 = expr_assign();

				      if(((Expr_assignContext)_localctx).tp1.t.equals(((Expr_assignContext)_localctx).tp2.t))
				        ((Expr_assignContext)_localctx).t =  ((Expr_assignContext)_localctx).tp1.t;
				      else
				        ((Expr_assignContext)_localctx).t =  new NoType();
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
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
			setState(289);
			((Expr_orContext)_localctx).tp1 = expr_and();
			setState(290);
			((Expr_orContext)_localctx).tp2 = expr_or_tmp();

			      if((!((Expr_orContext)_localctx).tp1.t.equals(new IntType()) && !((Expr_orContext)_localctx).tp2.t.equals(new NoType()))){
			        ((Expr_orContext)_localctx).t =  new NoType();
			        //
			        print("or");
			      }
			      else
			        ((Expr_orContext)_localctx).t =  ((Expr_orContext)_localctx).tp1.t;
			    
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
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(T__25);
				setState(294);
				((Expr_or_tmpContext)_localctx).tp1 = expr_and();
				setState(295);
				((Expr_or_tmpContext)_localctx).tp2 = expr_or_tmp();

				      if(!((Expr_or_tmpContext)_localctx).tp1.t.equals(new IntType())){
				        ((Expr_or_tmpContext)_localctx).t =  new NoType();
				        print("invalid use of or operations.");
				        //throw
				      }
				      else
				        ((Expr_or_tmpContext)_localctx).t =  ((Expr_or_tmpContext)_localctx).tp1.t;
				    
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
			setState(301);
			((Expr_andContext)_localctx).tp1 = expr_eq();
			setState(302);
			((Expr_andContext)_localctx).tp2 = expr_and_tmp();

			      if((!((Expr_andContext)_localctx).tp1.t.equals(new IntType()) && !((Expr_andContext)_localctx).tp2.t.equals(new NoType()))){
			        ((Expr_andContext)_localctx).t =  new NoType();
			        //
			        print("exp and");
			      }
			      else
			        ((Expr_andContext)_localctx).t =  ((Expr_andContext)_localctx).tp1.t;
			    
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
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(T__26);
				setState(306);
				((Expr_and_tmpContext)_localctx).tp1 = expr_eq();
				setState(307);
				((Expr_and_tmpContext)_localctx).tp2 = expr_and_tmp();

				      if(!((Expr_and_tmpContext)_localctx).tp1.t.equals(new IntType())){
				        ((Expr_and_tmpContext)_localctx).t =  new NoType();
				        print("invalid use of and operations.");
				        //throw
				      }
				      else
				        ((Expr_and_tmpContext)_localctx).t =  ((Expr_and_tmpContext)_localctx).tp1.t;
				    
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
			setState(313);
			((Expr_eqContext)_localctx).tp1 = expr_cmp();
			setState(314);
			((Expr_eqContext)_localctx).tp2 = expr_eq_tmp();

			      if(((Expr_eqContext)_localctx).tp1.t.equals(((Expr_eqContext)_localctx).tp2.t))
			        ((Expr_eqContext)_localctx).t =  new IntType();//TODO: moshakhas konim 1 ya 0
			    else if(((Expr_eqContext)_localctx).tp2.t.equals(new NoType()))
			        ((Expr_eqContext)_localctx).t =  ((Expr_eqContext)_localctx).tp1.t;
			      else {
			        ((Expr_eqContext)_localctx).t =  new NoType();
			        print("************");
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
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(318);
				((Expr_eq_tmpContext)_localctx).tp1 = expr_cmp();
				setState(319);
				((Expr_eq_tmpContext)_localctx).tp2 = expr_eq_tmp();

				      if(((Expr_eq_tmpContext)_localctx).tp1.t.equals(((Expr_eq_tmpContext)_localctx).tp2.t) || ((Expr_eq_tmpContext)_localctx).tp2.t.equals(new NoType()))
				        ((Expr_eq_tmpContext)_localctx).t =  ((Expr_eq_tmpContext)_localctx).tp1.t;
				      else {
				        ((Expr_eq_tmpContext)_localctx).t =  new NoType();
				        print("----------");
				      }
				    
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
			setState(325);
			((Expr_cmpContext)_localctx).tp1 = expr_add();
			setState(326);
			((Expr_cmpContext)_localctx).tp2 = expr_cmp_tmp();

			      if((!((Expr_cmpContext)_localctx).tp1.t.equals(new IntType()) && !((Expr_cmpContext)_localctx).tp2.t.equals(new NoType()))){
			        ((Expr_cmpContext)_localctx).t =  new NoType();
			        //
			        print("exp add");
			      }
			      else
			        ((Expr_cmpContext)_localctx).t =  ((Expr_cmpContext)_localctx).tp1.t;
			    
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
		int _la;
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(330);
				((Expr_cmp_tmpContext)_localctx).tp = expr_add();

				      if(!((Expr_cmp_tmpContext)_localctx).tp.t.equals(new IntType())){
				        ((Expr_cmp_tmpContext)_localctx).t =  new NoType();
				        print("invalid use of cmp operations.");
				        //throw
				      }
				      else
				        ((Expr_cmp_tmpContext)_localctx).t =  ((Expr_cmp_tmpContext)_localctx).tp.t;
				    
				setState(332);
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
			setState(337);
			((Expr_addContext)_localctx).tp1 = expr_mult();
			setState(338);
			((Expr_addContext)_localctx).tp2 = expr_add_tmp();

			      if((!((Expr_addContext)_localctx).tp1.t.equals(new IntType()) && !((Expr_addContext)_localctx).tp2.t.equals(new NoType()))){
			        ((Expr_addContext)_localctx).t =  new NoType();
			        //
			        print("exp add");
			      }
			      else
			        ((Expr_addContext)_localctx).t =  ((Expr_addContext)_localctx).tp1.t;
			    
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
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(342);
				((Expr_add_tmpContext)_localctx).tp = expr_mult();

				      if(!((Expr_add_tmpContext)_localctx).tp.t.equals(new IntType())){
				        ((Expr_add_tmpContext)_localctx).t =  new NoType();
				        print("invalid use of + operations.");
				        //throw
				      }
				      else
				        ((Expr_add_tmpContext)_localctx).t =  ((Expr_add_tmpContext)_localctx).tp.t;
				    
				setState(344);
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
			setState(349);
			((Expr_multContext)_localctx).tp1 = expr_un();
			setState(350);
			((Expr_multContext)_localctx).tp2 = expr_mult_tmp();

			      if((!((Expr_multContext)_localctx).tp1.t.equals(new IntType()) && !((Expr_multContext)_localctx).tp2.t.equals(new NoType()))){
			        ((Expr_multContext)_localctx).t =  new NoType();
			        //
			        print("......");
			      }
			      else
			        ((Expr_multContext)_localctx).t =  ((Expr_multContext)_localctx).tp1.t;
			    
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
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(354);
				((Expr_mult_tmpContext)_localctx).tp = expr_un();

				      if(!((Expr_mult_tmpContext)_localctx).tp.t.equals(new IntType())){
				        ((Expr_mult_tmpContext)_localctx).t =  new NoType();
				        print("invalid use of mult operations.");
				        //throw
				      }
				      else
				        ((Expr_mult_tmpContext)_localctx).t =  ((Expr_mult_tmpContext)_localctx).tp.t;
				    
				setState(356);
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
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(362);
				((Expr_unContext)_localctx).tp = expr_un();

				      if(!((Expr_unContext)_localctx).tp.t.equals(new IntType())){
				        ((Expr_unContext)_localctx).t =  new NoType();
				        print("invalid use of unary operations.");
				        //throw
				      }
				      else
				        ((Expr_unContext)_localctx).t =  ((Expr_unContext)_localctx).tp.t;
				  
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
				setState(365);
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
			setState(370);
			((Expr_memContext)_localctx).tp = expr_other();
			setState(371);
			((Expr_memContext)_localctx).dim = expr_mem_tmp();

			      try{
			        ((Expr_memContext)_localctx).t =  ((Expr_memContext)_localctx).tp.t.dimensionAccess(((Expr_memContext)_localctx).dim.dimension);
			      }catch(UndefinedDemensionsException ex){((Expr_memContext)_localctx).t =  new NoType();
			      print("salam.");}
			    
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
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(T__9);
				setState(375);
				((Expr_mem_tmpContext)_localctx).tp = expr();

				      if(!((Expr_mem_tmpContext)_localctx).tp.t.equals(new IntType())){
				        print("invalid index.");
				        //throw
				      }
				      
				setState(377);
				match(T__10);
				setState(378);
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
		public ExprContext tp;
		public ExprContext tp2;
		public Token size;
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
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(CONST_NUM);
				((Expr_otherContext)_localctx).t =  new IntType();
				}
				break;
			case CONST_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(CONST_CHAR);
				((Expr_otherContext)_localctx).t =  new CharacterType();
				}
				break;
			case CONST_STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				((Expr_otherContext)_localctx).str = match(CONST_STR);
				((Expr_otherContext)_localctx).t =  new ArrayType((((Expr_otherContext)_localctx).str!=null?((Expr_otherContext)_localctx).str.getText():null).length(), new CharacterType());
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				((Expr_otherContext)_localctx).id = match(ID);
				 SymbolTableItem item = SymbolTable.top.get((((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getText():null));
				      if(item == null) {
				        print((((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getLine():0) + ") Item " + (((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getText():null) + " doesnt exist.");
				        ((Expr_otherContext)_localctx).t =  new NoType();
				      }
				      else {
				        SymbolTableVariableItemBase var = (SymbolTableVariableItemBase) item;
				        print((((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getLine():0) + ") Variable " + (((Expr_otherContext)_localctx).id!=null?((Expr_otherContext)_localctx).id.getText():null) + " used.\t\t" +   "Base Reg: " + var.getBaseRegister() + ", Offset: " + var.getOffset());
				        ((Expr_otherContext)_localctx).t =  var.getVariable().getType();
				      }
				    
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				match(T__34);
				setState(393);
				((Expr_otherContext)_localctx).tp = expr();
				int size = 1;
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(395);
					match(T__4);
					setState(396);
					((Expr_otherContext)_localctx).tp2 = expr();

					    if(!((Expr_otherContext)_localctx).tp2.t.equals(((Expr_otherContext)_localctx).tp.t)) {
					      ((Expr_otherContext)_localctx).t =  new NoType();
					      print("incompatible types");
					      //TODO: throw exception
					    }
					    else if(size != -1)
					      size ++;
					  
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				    if(size != -1)
				      ((Expr_otherContext)_localctx).t =  new ArrayType(size, ((Expr_otherContext)_localctx).tp.t);
				    
				setState(405);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(407);
				match(T__36);
				setState(408);
				match(T__6);
				setState(409);
				((Expr_otherContext)_localctx).size = match(CONST_NUM);
				setState(410);
				match(T__7);
				((Expr_otherContext)_localctx).t =  new ArrayType((((Expr_otherContext)_localctx).size!=null?Integer.valueOf(((Expr_otherContext)_localctx).size.getText()):0), new CharacterType());
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(412);
				match(T__6);
				setState(413);
				((Expr_otherContext)_localctx).tp = expr();
				setState(414);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4j\n\4\f\4\16\4m\13\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\5\5"+
		"\u0082\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u0090\n"+
		"\6\f\6\16\6\u0093\13\6\3\6\3\6\3\6\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13"+
		"\6\5\6\u009e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u00aa\n\b"+
		"\f\b\16\b\u00ad\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b8\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00bf\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c6\n\n\7"+
		"\n\u00c8\n\n\f\n\16\n\u00cb\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00d6\n\13\f\13\16\13\u00d9\13\13\5\13\u00db\n\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u00f3\n\r\f\r\16\r\u00f6\13\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00fe\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0122\n\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u012e\n\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u013a\n\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0146\n\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0152\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u015e\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u016a\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u0173\n \3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0181\n\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\7#\u0192\n#\f#\16#\u0195\13#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\5#\u01a4\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\t\3\3++\4\2\21\22,,\3\2\36\37"+
		"\3\2\4\5\3\2 !\3\2\"#\4\2!!$$\2\u01af\2F\3\2\2\2\4P\3\2\2\2\6c\3\2\2\2"+
		"\bp\3\2\2\2\n\u009d\3\2\2\2\f\u009f\3\2\2\2\16\u00ab\3\2\2\2\20\u00b7"+
		"\3\2\2\2\22\u00b9\3\2\2\2\24\u00ce\3\2\2\2\26\u00df\3\2\2\2\30\u00e5\3"+
		"\2\2\2\32\u0102\3\2\2\2\34\u010d\3\2\2\2\36\u0110\3\2\2\2 \u0113\3\2\2"+
		"\2\"\u0116\3\2\2\2$\u0121\3\2\2\2&\u0123\3\2\2\2(\u012d\3\2\2\2*\u012f"+
		"\3\2\2\2,\u0139\3\2\2\2.\u013b\3\2\2\2\60\u0145\3\2\2\2\62\u0147\3\2\2"+
		"\2\64\u0151\3\2\2\2\66\u0153\3\2\2\28\u015d\3\2\2\2:\u015f\3\2\2\2<\u0169"+
		"\3\2\2\2>\u0172\3\2\2\2@\u0174\3\2\2\2B\u0180\3\2\2\2D\u01a3\3\2\2\2F"+
		"K\b\2\1\2GJ\5\4\3\2HJ\7+\2\2IG\3\2\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2K"+
		"L\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\b\2\1\2O\3\3\2\2\2PQ\7\3\2\2QR\7,\2\2"+
		"RS\7\4\2\2ST\7(\2\2TU\7\5\2\2UV\7+\2\2V\\\b\3\1\2W[\5\6\4\2X[\5\b\5\2"+
		"Y[\7+\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2"+
		"\2]_\3\2\2\2^\\\3\2\2\2_`\7\6\2\2`a\b\3\1\2ab\t\2\2\2b\5\3\2\2\2cd\5\n"+
		"\6\2de\7,\2\2ek\b\4\1\2fg\7\7\2\2gh\7,\2\2hj\b\4\1\2if\3\2\2\2jm\3\2\2"+
		"\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7+\2\2o\7\3\2\2\2pq\7\b\2"+
		"\2qr\7,\2\2rs\b\5\1\2s\u0081\7\t\2\2tu\5\n\6\2uv\7,\2\2v~\b\5\1\2wx\7"+
		"\7\2\2xy\5\n\6\2yz\7,\2\2z{\b\5\1\2{}\3\2\2\2|w\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081t\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\n\2\2\u0084\u0085"+
		"\7+\2\2\u0085\u0086\b\5\1\2\u0086\u0087\5\16\b\2\u0087\u0088\7\6\2\2\u0088"+
		"\u0089\b\5\1\2\u0089\u008a\7+\2\2\u008a\t\3\2\2\2\u008b\u0091\7\13\2\2"+
		"\u008c\u008d\7\f\2\2\u008d\u008e\7(\2\2\u008e\u0090\7\r\2\2\u008f\u008c"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u009e\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u009a\7\16\2\2\u0095\u0096\7"+
		"\f\2\2\u0096\u0097\7(\2\2\u0097\u0099\7\r\2\2\u0098\u0095\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u008b\3\2\2\2\u009d\u0094\3\2\2\2\u009e"+
		"\13\3\2\2\2\u009f\u00a0\7\17\2\2\u00a0\u00a1\b\7\1\2\u00a1\u00a2\7+\2"+
		"\2\u00a2\u00a3\5\16\b\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\b\7\1\2\u00a5"+
		"\u00a6\7+\2\2\u00a6\r\3\2\2\2\u00a7\u00aa\5\20\t\2\u00a8\u00aa\7+\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\17\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00b8\5\22\n\2\u00af\u00b8\5 \21\2\u00b0\u00b8\5\32\16\2\u00b1\u00b8"+
		"\5\30\r\2\u00b2\u00b8\5\34\17\2\u00b3\u00b8\5\36\20\2\u00b4\u00b8\5\24"+
		"\13\2\u00b5\u00b8\5\26\f\2\u00b6\u00b8\5\f\7\2\u00b7\u00ae\3\2\2\2\u00b7"+
		"\u00af\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2"+
		"\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\21\3\2\2\2\u00b9\u00ba\5\n\6\2\u00ba\u00bb\7,\2\2"+
		"\u00bb\u00be\b\n\1\2\u00bc\u00bd\7\20\2\2\u00bd\u00bf\5\"\22\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c9\3\2\2\2\u00c0\u00c1\7\7\2\2\u00c1"+
		"\u00c2\7,\2\2\u00c2\u00c5\b\n\1\2\u00c3\u00c4\7\20\2\2\u00c4\u00c6\5\""+
		"\22\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c0\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7+\2\2\u00cd"+
		"\23\3\2\2\2\u00ce\u00cf\t\3\2\2\u00cf\u00d0\7\23\2\2\u00d0\u00d1\7,\2"+
		"\2\u00d1\u00da\7\t\2\2\u00d2\u00d7\5\"\22\2\u00d3\u00d4\7\7\2\2\u00d4"+
		"\u00d6\5\"\22\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00d2\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\n"+
		"\2\2\u00dd\u00de\7+\2\2\u00de\25\3\2\2\2\u00df\u00e0\7\24\2\2\u00e0\u00e1"+
		"\7\t\2\2\u00e1\u00e2\5\"\22\2\u00e2\u00e3\7\n\2\2\u00e3\u00e4\7+\2\2\u00e4"+
		"\27\3\2\2\2\u00e5\u00e6\7\25\2\2\u00e6\u00e7\b\r\1\2\u00e7\u00e8\5\"\22"+
		"\2\u00e8\u00e9\7+\2\2\u00e9\u00ea\5\16\b\2\u00ea\u00f4\b\r\1\2\u00eb\u00ec"+
		"\7\26\2\2\u00ec\u00ed\b\r\1\2\u00ed\u00ee\5\"\22\2\u00ee\u00ef\7+\2\2"+
		"\u00ef\u00f0\5\16\b\2\u00f0\u00f1\b\r\1\2\u00f1\u00f3\3\2\2\2\u00f2\u00eb"+
		"\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00fd\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\27\2\2\u00f8\u00f9\b"+
		"\r\1\2\u00f9\u00fa\7+\2\2\u00fa\u00fb\5\16\b\2\u00fb\u00fc\b\r\1\2\u00fc"+
		"\u00fe\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0100\7\6\2\2\u0100\u0101\7+\2\2\u0101\31\3\2\2\2\u0102\u0103"+
		"\7\30\2\2\u0103\u0104\b\16\1\2\u0104\u0105\7,\2\2\u0105\u0106\7\31\2\2"+
		"\u0106\u0107\5\"\22\2\u0107\u0108\7+\2\2\u0108\u0109\5\16\b\2\u0109\u010a"+
		"\7\6\2\2\u010a\u010b\b\16\1\2\u010b\u010c\7+\2\2\u010c\33\3\2\2\2\u010d"+
		"\u010e\7\32\2\2\u010e\u010f\7+\2\2\u010f\35\3\2\2\2\u0110\u0111\7\33\2"+
		"\2\u0111\u0112\7+\2\2\u0112\37\3\2\2\2\u0113\u0114\5\"\22\2\u0114\u0115"+
		"\7+\2\2\u0115!\3\2\2\2\u0116\u0117\5$\23\2\u0117\u0118\b\22\1\2\u0118"+
		"#\3\2\2\2\u0119\u011a\5&\24\2\u011a\u011b\7\20\2\2\u011b\u011c\5$\23\2"+
		"\u011c\u011d\b\23\1\2\u011d\u0122\3\2\2\2\u011e\u011f\5&\24\2\u011f\u0120"+
		"\b\23\1\2\u0120\u0122\3\2\2\2\u0121\u0119\3\2\2\2\u0121\u011e\3\2\2\2"+
		"\u0122%\3\2\2\2\u0123\u0124\5*\26\2\u0124\u0125\5(\25\2\u0125\u0126\b"+
		"\24\1\2\u0126\'\3\2\2\2\u0127\u0128\7\34\2\2\u0128\u0129\5*\26\2\u0129"+
		"\u012a\5(\25\2\u012a\u012b\b\25\1\2\u012b\u012e\3\2\2\2\u012c\u012e\b"+
		"\25\1\2\u012d\u0127\3\2\2\2\u012d\u012c\3\2\2\2\u012e)\3\2\2\2\u012f\u0130"+
		"\5.\30\2\u0130\u0131\5,\27\2\u0131\u0132\b\26\1\2\u0132+\3\2\2\2\u0133"+
		"\u0134\7\35\2\2\u0134\u0135\5.\30\2\u0135\u0136\5,\27\2\u0136\u0137\b"+
		"\27\1\2\u0137\u013a\3\2\2\2\u0138\u013a\b\27\1\2\u0139\u0133\3\2\2\2\u0139"+
		"\u0138\3\2\2\2\u013a-\3\2\2\2\u013b\u013c\5\62\32\2\u013c\u013d\5\60\31"+
		"\2\u013d\u013e\b\30\1\2\u013e/\3\2\2\2\u013f\u0140\t\4\2\2\u0140\u0141"+
		"\5\62\32\2\u0141\u0142\5\60\31\2\u0142\u0143\b\31\1\2\u0143\u0146\3\2"+
		"\2\2\u0144\u0146\b\31\1\2\u0145\u013f\3\2\2\2\u0145\u0144\3\2\2\2\u0146"+
		"\61\3\2\2\2\u0147\u0148\5\66\34\2\u0148\u0149\5\64\33\2\u0149\u014a\b"+
		"\32\1\2\u014a\63\3\2\2\2\u014b\u014c\t\5\2\2\u014c\u014d\5\66\34\2\u014d"+
		"\u014e\b\33\1\2\u014e\u014f\5\64\33\2\u014f\u0152\3\2\2\2\u0150\u0152"+
		"\b\33\1\2\u0151\u014b\3\2\2\2\u0151\u0150\3\2\2\2\u0152\65\3\2\2\2\u0153"+
		"\u0154\5:\36\2\u0154\u0155\58\35\2\u0155\u0156\b\34\1\2\u0156\67\3\2\2"+
		"\2\u0157\u0158\t\6\2\2\u0158\u0159\5:\36\2\u0159\u015a\b\35\1\2\u015a"+
		"\u015b\58\35\2\u015b\u015e\3\2\2\2\u015c\u015e\b\35\1\2\u015d\u0157\3"+
		"\2\2\2\u015d\u015c\3\2\2\2\u015e9\3\2\2\2\u015f\u0160\5> \2\u0160\u0161"+
		"\5<\37\2\u0161\u0162\b\36\1\2\u0162;\3\2\2\2\u0163\u0164\t\7\2\2\u0164"+
		"\u0165\5> \2\u0165\u0166\b\37\1\2\u0166\u0167\5<\37\2\u0167\u016a\3\2"+
		"\2\2\u0168\u016a\b\37\1\2\u0169\u0163\3\2\2\2\u0169\u0168\3\2\2\2\u016a"+
		"=\3\2\2\2\u016b\u016c\t\b\2\2\u016c\u016d\5> \2\u016d\u016e\b \1\2\u016e"+
		"\u0173\3\2\2\2\u016f\u0170\5@!\2\u0170\u0171\b \1\2\u0171\u0173\3\2\2"+
		"\2\u0172\u016b\3\2\2\2\u0172\u016f\3\2\2\2\u0173?\3\2\2\2\u0174\u0175"+
		"\5D#\2\u0175\u0176\5B\"\2\u0176\u0177\b!\1\2\u0177A\3\2\2\2\u0178\u0179"+
		"\7\f\2\2\u0179\u017a\5\"\22\2\u017a\u017b\b\"\1\2\u017b\u017c\7\r\2\2"+
		"\u017c\u017d\5B\"\2\u017d\u017e\b\"\1\2\u017e\u0181\3\2\2\2\u017f\u0181"+
		"\b\"\1\2\u0180\u0178\3\2\2\2\u0180\u017f\3\2\2\2\u0181C\3\2\2\2\u0182"+
		"\u0183\7(\2\2\u0183\u01a4\b#\1\2\u0184\u0185\7)\2\2\u0185\u01a4\b#\1\2"+
		"\u0186\u0187\7*\2\2\u0187\u01a4\b#\1\2\u0188\u0189\7,\2\2\u0189\u01a4"+
		"\b#\1\2\u018a\u018b\7%\2\2\u018b\u018c\5\"\22\2\u018c\u0193\b#\1\2\u018d"+
		"\u018e\7\7\2\2\u018e\u018f\5\"\22\2\u018f\u0190\b#\1\2\u0190\u0192\3\2"+
		"\2\2\u0191\u018d\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\b#"+
		"\1\2\u0197\u0198\7&\2\2\u0198\u01a4\3\2\2\2\u0199\u019a\7\'\2\2\u019a"+
		"\u019b\7\t\2\2\u019b\u019c\7(\2\2\u019c\u019d\7\n\2\2\u019d\u01a4\b#\1"+
		"\2\u019e\u019f\7\t\2\2\u019f\u01a0\5\"\22\2\u01a0\u01a1\7\n\2\2\u01a1"+
		"\u01a2\b#\1\2\u01a2\u01a4\3\2\2\2\u01a3\u0182\3\2\2\2\u01a3\u0184\3\2"+
		"\2\2\u01a3\u0186\3\2\2\2\u01a3\u0188\3\2\2\2\u01a3\u018a\3\2\2\2\u01a3"+
		"\u0199\3\2\2\2\u01a3\u019e\3\2\2\2\u01a4E\3\2\2\2!IKZ\\k~\u0081\u0091"+
		"\u009a\u009d\u00a9\u00ab\u00b7\u00be\u00c5\u00c9\u00d7\u00da\u00f4\u00fd"+
		"\u0121\u012d\u0139\u0145\u0151\u015d\u0169\u0172\u0180\u0193\u01a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}