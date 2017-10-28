// Generated from ATalk.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ATalkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, CM=4, NATURALNUM=5, ARITHNUM=6, ACTOR=7, RECEIVER=8, 
		SENDER=9, SELF=10, READ=11, WRITE=12, IF=13, ELSEIF=14, ELSE=15, FOREACH=16, 
		IN=17, BEGIN=18, END=19, BREAK=20, QUIT=21, INT=22, CHAR=23, EQUAL=24, 
		NOTEQUAL=25, LT=26, GT=27, OR=28, AND=29, NOT=30, LPAR=31, RPAR=32, ADD=33, 
		SUB=34, MULT=35, DIV=36, ASSIGN=37, LBRAC=38, RBRAC=39, NEWLINE=40, SENDOP=41, 
		WS=42, ID=43, STRING=44, CHARACTER=45;
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_actor_block = 2, RULE_reciever = 3, 
		RULE_reciever_block = 4, RULE_statement = 5, RULE_begin_end_block = 6, 
		RULE_defenition_arguments = 7, RULE_global_var_dec = 8, RULE_call_arguments = 9, 
		RULE_initialization = 10, RULE_rvalue = 11, RULE_assignment = 12, RULE_assignment_multi = 13, 
		RULE_function_call = 14, RULE_read_function = 15, RULE_write_function = 16, 
		RULE_send = 17, RULE_type = 18, RULE_operation = 19, RULE_or_op = 20, 
		RULE_and_op = 21, RULE_equality_op = 22, RULE_comparison_op = 23, RULE_add_op = 24, 
		RULE_mult_op = 25, RULE_single_operator_op = 26, RULE_operands = 27, RULE_if_statement = 28, 
		RULE_condition_block = 29, RULE_foreach_statement = 30, RULE_foreach_block = 31, 
		RULE_array_init = 32, RULE_value = 33;
	public static final String[] ruleNames = {
		"program", "actor", "actor_block", "reciever", "reciever_block", "statement", 
		"begin_end_block", "defenition_arguments", "global_var_dec", "call_arguments", 
		"initialization", "rvalue", "assignment", "assignment_multi", "function_call", 
		"read_function", "write_function", "send", "type", "operation", "or_op", 
		"and_op", "equality_op", "comparison_op", "add_op", "mult_op", "single_operator_op", 
		"operands", "if_statement", "condition_block", "foreach_statement", "foreach_block", 
		"array_init", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'{'", "'}'", null, null, null, "'actor'", "'receiver'", 
		"'sender'", "'self'", "'read'", "'write'", "'if'", "'elseif'", "'else'", 
		"'foreach'", "'in'", "'begin'", "'end'", "'break'", "'quit'", "'int'", 
		"'char'", "'=='", "'<>'", "'<'", "'>'", "'or'", "'and'", "'not'", "'('", 
		"')'", "'+'", "'-'", "'*'", "'/'", "'='", "'['", "']'", null, "'<<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "CM", "NATURALNUM", "ARITHNUM", "ACTOR", "RECEIVER", 
		"SENDER", "SELF", "READ", "WRITE", "IF", "ELSEIF", "ELSE", "FOREACH", 
		"IN", "BEGIN", "END", "BREAK", "QUIT", "INT", "CHAR", "EQUAL", "NOTEQUAL", 
		"LT", "GT", "OR", "AND", "NOT", "LPAR", "RPAR", "ADD", "SUB", "MULT", 
		"DIV", "ASSIGN", "LBRAC", "RBRAC", "NEWLINE", "SENDOP", "WS", "ID", "STRING", 
		"CHARACTER"
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
	public String getGrammarFileName() { return "ATalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  void print(String str){
	    System.out.println(str);
	  }

	public ATalkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ATalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ATalkParser.NEWLINE, i);
		}
		public List<ActorContext> actor() {
			return getRuleContexts(ActorContext.class);
		}
		public ActorContext actor(int i) {
			return getRuleContext(ActorContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					{
					setState(68);
					match(NEWLINE);
					}
					}
					break;
				case ACTOR:
					{
					{
					setState(69);
					actor();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ACTOR || _la==NEWLINE );
			print("code");
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
		public TerminalNode ACTOR() { return getToken(ATalkParser.ACTOR, 0); }
		public TerminalNode ID() { return getToken(ATalkParser.ID, 0); }
		public TerminalNode LT() { return getToken(ATalkParser.LT, 0); }
		public TerminalNode NATURALNUM() { return getToken(ATalkParser.NATURALNUM, 0); }
		public TerminalNode GT() { return getToken(ATalkParser.GT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ATalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ATalkParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(ATalkParser.END, 0); }
		public TerminalNode EOF() { return getToken(ATalkParser.EOF, 0); }
		public Actor_blockContext actor_block() {
			return getRuleContext(Actor_blockContext.class,0);
		}
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterActor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitActor(this);
		}
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ACTOR);
			setState(77);
			match(ID);
			setState(78);
			match(LT);
			setState(79);
			match(NATURALNUM);
			setState(80);
			match(GT);
			setState(81);
			match(NEWLINE);
			{
			setState(82);
			actor_block();
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(83);
				match(NEWLINE);
				}
			}

			setState(86);
			match(END);
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			print("actor");
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

	public static class Actor_blockContext extends ParserRuleContext {
		public List<RecieverContext> reciever() {
			return getRuleContexts(RecieverContext.class);
		}
		public RecieverContext reciever(int i) {
			return getRuleContext(RecieverContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ATalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ATalkParser.NEWLINE, i);
		}
		public List<Global_var_decContext> global_var_dec() {
			return getRuleContexts(Global_var_decContext.class);
		}
		public Global_var_decContext global_var_dec(int i) {
			return getRuleContext(Global_var_decContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public Actor_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterActor_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitActor_block(this);
		}
	}

	public final Actor_blockContext actor_block() throws RecognitionException {
		Actor_blockContext _localctx = new Actor_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actor_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(98);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case RECEIVER:
						{
						setState(90);
						reciever();
						}
						break;
					case INT:
					case CHAR:
						{
						{
						setState(91);
						global_var_dec();
						setState(92);
						match(NEWLINE);
						}
						}
						break;
					case ID:
						{
						{
						setState(94);
						assignment();
						setState(95);
						match(NEWLINE);
						}
						}
						break;
					case NEWLINE:
						{
						setState(97);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
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

	public static class RecieverContext extends ParserRuleContext {
		public TerminalNode RECEIVER() { return getToken(ATalkParser.RECEIVER, 0); }
		public TerminalNode ID() { return getToken(ATalkParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(ATalkParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ATalkParser.RPAR, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ATalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ATalkParser.NEWLINE, i);
		}
		public Reciever_blockContext reciever_block() {
			return getRuleContext(Reciever_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(ATalkParser.END, 0); }
		public Defenition_argumentsContext defenition_arguments() {
			return getRuleContext(Defenition_argumentsContext.class,0);
		}
		public RecieverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reciever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterReciever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitReciever(this);
		}
	}

	public final RecieverContext reciever() throws RecognitionException {
		RecieverContext _localctx = new RecieverContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reciever);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(RECEIVER);
			setState(104);
			match(ID);
			setState(105);
			match(LPAR);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==CHAR) {
				{
				setState(106);
				defenition_arguments();
				}
			}

			setState(109);
			match(RPAR);
			setState(110);
			match(NEWLINE);
			setState(111);
			reciever_block();
			setState(112);
			match(END);
			setState(113);
			match(NEWLINE);
			print("reciever");
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

	public static class Reciever_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ATalkParser.NEWLINE, 0); }
		public Reciever_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reciever_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterReciever_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitReciever_block(this);
		}
	}

	public final Reciever_blockContext reciever_block() throws RecognitionException {
		Reciever_blockContext _localctx = new Reciever_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reciever_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NATURALNUM:
			case ARITHNUM:
			case SENDER:
			case SELF:
			case READ:
			case WRITE:
			case IF:
			case FOREACH:
			case BEGIN:
			case END:
			case BREAK:
			case QUIT:
			case INT:
			case CHAR:
			case LPAR:
			case ID:
			case STRING:
			case CHARACTER:
				{
				setState(116);
				statement();
				}
				break;
			case NEWLINE:
				{
				setState(117);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public List<TerminalNode> NEWLINE() { return getTokens(ATalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ATalkParser.NEWLINE, i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<Assignment_multiContext> assignment_multi() {
			return getRuleContexts(Assignment_multiContext.class);
		}
		public Assignment_multiContext assignment_multi(int i) {
			return getRuleContext(Assignment_multiContext.class,i);
		}
		public List<InitializationContext> initialization() {
			return getRuleContexts(InitializationContext.class);
		}
		public InitializationContext initialization(int i) {
			return getRuleContext(InitializationContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public List<Foreach_statementContext> foreach_statement() {
			return getRuleContexts(Foreach_statementContext.class);
		}
		public Foreach_statementContext foreach_statement(int i) {
			return getRuleContext(Foreach_statementContext.class,i);
		}
		public List<SendContext> send() {
			return getRuleContexts(SendContext.class);
		}
		public SendContext send(int i) {
			return getRuleContext(SendContext.class,i);
		}
		public List<Begin_end_blockContext> begin_end_block() {
			return getRuleContexts(Begin_end_blockContext.class);
		}
		public Begin_end_blockContext begin_end_block(int i) {
			return getRuleContext(Begin_end_blockContext.class,i);
		}
		public List<TerminalNode> QUIT() { return getTokens(ATalkParser.QUIT); }
		public TerminalNode QUIT(int i) {
			return getToken(ATalkParser.QUIT, i);
		}
		public List<TerminalNode> BREAK() { return getTokens(ATalkParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(ATalkParser.BREAK, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURALNUM) | (1L << ARITHNUM) | (1L << SENDER) | (1L << SELF) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << FOREACH) | (1L << BEGIN) | (1L << BREAK) | (1L << QUIT) | (1L << INT) | (1L << CHAR) | (1L << LPAR) | (1L << ID) | (1L << STRING) | (1L << CHARACTER))) != 0)) {
				{
				{
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(120);
					function_call();
					}
					break;
				case 2:
					{
					setState(121);
					assignment();
					}
					break;
				case 3:
					{
					setState(122);
					assignment_multi();
					}
					break;
				case 4:
					{
					setState(123);
					initialization();
					}
					break;
				case 5:
					{
					setState(124);
					operation();
					}
					break;
				case 6:
					{
					setState(125);
					if_statement();
					}
					break;
				case 7:
					{
					setState(126);
					foreach_statement();
					}
					break;
				case 8:
					{
					setState(127);
					send();
					}
					break;
				case 9:
					{
					setState(128);
					begin_end_block();
					}
					break;
				case 10:
					{
					setState(129);
					match(QUIT);
					}
					break;
				case 11:
					{
					setState(130);
					match(BREAK);
					}
					break;
				}
				setState(133);
				match(NEWLINE);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			print("statement");
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

	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ATalkParser.BEGIN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ATalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ATalkParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(ATalkParser.END, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterBegin_end_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitBegin_end_block(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(BEGIN);
			setState(142);
			match(NEWLINE);
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(143);
				statement();
				}
				break;
			case 2:
				{
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(144);
					match(NEWLINE);
					}
				}

				}
				break;
			}
			setState(149);
			match(END);
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

	public static class Defenition_argumentsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(ATalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkParser.ID, i);
		}
		public Defenition_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defenition_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterDefenition_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitDefenition_arguments(this);
		}
	}

	public final Defenition_argumentsContext defenition_arguments() throws RecognitionException {
		Defenition_argumentsContext _localctx = new Defenition_argumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defenition_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151);
			type();
			setState(152);
			match(ID);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(153);
				match(T__0);
				setState(154);
				type();
				setState(155);
				match(ID);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Global_var_decContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ATalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkParser.ID, i);
		}
		public Global_var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterGlobal_var_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitGlobal_var_dec(this);
		}
	}

	public final Global_var_decContext global_var_dec() throws RecognitionException {
		Global_var_decContext _localctx = new Global_var_decContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_global_var_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(162);
			type();
			setState(163);
			match(ID);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(164);
				match(T__0);
				setState(165);
				match(ID);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Call_argumentsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ATalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ATalkParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ATalkParser.STRING, i);
		}
		public List<TerminalNode> CHARACTER() { return getTokens(ATalkParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(ATalkParser.CHARACTER, i);
		}
		public List<TerminalNode> ARITHNUM() { return getTokens(ATalkParser.ARITHNUM); }
		public TerminalNode ARITHNUM(int i) {
			return getToken(ATalkParser.ARITHNUM, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public Call_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterCall_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitCall_arguments(this);
		}
	}

	public final Call_argumentsContext call_arguments() throws RecognitionException {
		Call_argumentsContext _localctx = new Call_argumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_call_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(171);
				match(ID);
				}
				break;
			case 2:
				{
				setState(172);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(173);
				match(CHARACTER);
				}
				break;
			case 4:
				{
				setState(174);
				match(ARITHNUM);
				}
				break;
			case 5:
				{
				setState(175);
				operation();
				}
				break;
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(178);
				match(T__0);
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(179);
					match(ID);
					}
					break;
				case 2:
					{
					setState(180);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(181);
					match(CHARACTER);
					}
					break;
				case 4:
					{
					setState(182);
					match(ARITHNUM);
					}
					break;
				case 5:
					{
					setState(183);
					operation();
					}
					break;
				}
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class InitializationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ATalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkParser.ID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(ATalkParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(ATalkParser.ASSIGN, i);
		}
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitInitialization(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(191);
			type();
			setState(192);
			match(ID);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(193);
				match(ASSIGN);
				setState(194);
				rvalue();
				}
			}

			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(197);
				match(T__0);
				setState(198);
				match(ID);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(199);
					match(ASSIGN);
					setState(200);
					rvalue();
					}
				}

				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			print("initialization variable");
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

	public static class RvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ATalkParser.ID, 0); }
		public TerminalNode STRING() { return getToken(ATalkParser.STRING, 0); }
		public TerminalNode CHARACTER() { return getToken(ATalkParser.CHARACTER, 0); }
		public TerminalNode ARITHNUM() { return getToken(ATalkParser.ARITHNUM, 0); }
		public TerminalNode NATURALNUM() { return getToken(ATalkParser.NATURALNUM, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitRvalue(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		RvalueContext _localctx = new RvalueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(210);
				match(ID);
				}
				break;
			case 2:
				{
				setState(211);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(212);
				match(CHARACTER);
				}
				break;
			case 4:
				{
				setState(213);
				match(ARITHNUM);
				}
				break;
			case 5:
				{
				setState(214);
				match(NATURALNUM);
				}
				break;
			case 6:
				{
				setState(215);
				assignment();
				}
				break;
			case 7:
				{
				setState(216);
				operation();
				}
				break;
			case 8:
				{
				setState(217);
				array_init();
				}
				break;
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ATalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(ATalkParser.ASSIGN, 0); }
		public Read_functionContext read_function() {
			return getRuleContext(Read_functionContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ATalkParser.STRING, 0); }
		public TerminalNode CHARACTER() { return getToken(ATalkParser.CHARACTER, 0); }
		public TerminalNode ARITHNUM() { return getToken(ATalkParser.ARITHNUM, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(220);
			match(ID);
			setState(221);
			match(ASSIGN);
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(222);
				read_function();
				}
				break;
			case 2:
				{
				setState(223);
				operation();
				}
				break;
			case 3:
				{
				setState(224);
				array_init();
				}
				break;
			case 4:
				{
				setState(225);
				match(ID);
				}
				break;
			case 5:
				{
				setState(226);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(227);
				match(CHARACTER);
				}
				break;
			case 7:
				{
				setState(228);
				match(ARITHNUM);
				}
				break;
			case 8:
				{
				setState(229);
				assignment();
				}
				break;
			}
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

	public static class Assignment_multiContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public Assignment_multiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_multi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterAssignment_multi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitAssignment_multi(this);
		}
	}

	public final Assignment_multiContext assignment_multi() throws RecognitionException {
		Assignment_multiContext _localctx = new Assignment_multiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_multi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			assignment();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(233);
				match(T__0);
				setState(234);
				assignment();
				}
				}
				setState(239);
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

	public static class Function_callContext extends ParserRuleContext {
		public Read_functionContext read_function() {
			return getRuleContext(Read_functionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ATalkParser.NEWLINE, 0); }
		public Write_functionContext write_function() {
			return getRuleContext(Write_functionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ATalkParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(ATalkParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ATalkParser.RPAR, 0); }
		public Call_argumentsContext call_arguments() {
			return getRuleContext(Call_argumentsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_call);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(240);
				read_function();
				setState(241);
				match(NEWLINE);
				}
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(243);
				write_function();
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(244);
				match(ID);
				setState(245);
				match(LPAR);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURALNUM) | (1L << ARITHNUM) | (1L << READ) | (1L << LPAR) | (1L << ID) | (1L << STRING) | (1L << CHARACTER))) != 0)) {
					{
					setState(246);
					call_arguments();
					}
				}

				setState(249);
				match(RPAR);
				}
				print("function call");
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

	public static class Read_functionContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(ATalkParser.READ, 0); }
		public TerminalNode LPAR() { return getToken(ATalkParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ATalkParser.RPAR, 0); }
		public TerminalNode ARITHNUM() { return getToken(ATalkParser.ARITHNUM, 0); }
		public TerminalNode NATURALNUM() { return getToken(ATalkParser.NATURALNUM, 0); }
		public Read_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterRead_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitRead_function(this);
		}
	}

	public final Read_functionContext read_function() throws RecognitionException {
		Read_functionContext _localctx = new Read_functionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_read_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(READ);
			setState(255);
			match(LPAR);
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==NATURALNUM || _la==ARITHNUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(257);
			match(RPAR);
			print("read function");
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

	public static class Write_functionContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(ATalkParser.WRITE, 0); }
		public TerminalNode LPAR() { return getToken(ATalkParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ATalkParser.RPAR, 0); }
		public TerminalNode STRING() { return getToken(ATalkParser.STRING, 0); }
		public TerminalNode CHARACTER() { return getToken(ATalkParser.CHARACTER, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(ATalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkParser.ID, i);
		}
		public List<TerminalNode> LBRAC() { return getTokens(ATalkParser.LBRAC); }
		public TerminalNode LBRAC(int i) {
			return getToken(ATalkParser.LBRAC, i);
		}
		public List<TerminalNode> RBRAC() { return getTokens(ATalkParser.RBRAC); }
		public TerminalNode RBRAC(int i) {
			return getToken(ATalkParser.RBRAC, i);
		}
		public List<TerminalNode> ARITHNUM() { return getTokens(ATalkParser.ARITHNUM); }
		public TerminalNode ARITHNUM(int i) {
			return getToken(ATalkParser.ARITHNUM, i);
		}
		public List<TerminalNode> NATURALNUM() { return getTokens(ATalkParser.NATURALNUM); }
		public TerminalNode NATURALNUM(int i) {
			return getToken(ATalkParser.NATURALNUM, i);
		}
		public Write_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterWrite_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitWrite_function(this);
		}
	}

	public final Write_functionContext write_function() throws RecognitionException {
		Write_functionContext _localctx = new Write_functionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_write_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(WRITE);
			setState(261);
			match(LPAR);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				{
				setState(262);
				match(ID);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRAC) {
					{
					{
					setState(263);
					match(LBRAC);
					setState(268);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(264);
						operation();
						}
						break;
					case 2:
						{
						setState(265);
						match(ID);
						}
						break;
					case 3:
						{
						setState(266);
						match(ARITHNUM);
						}
						break;
					case 4:
						{
						setState(267);
						match(NATURALNUM);
						}
						break;
					}
					setState(270);
					match(RBRAC);
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(276);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(277);
				match(CHARACTER);
				}
				break;
			case 4:
				{
				setState(278);
				operation();
				}
				break;
			}
			setState(281);
			match(RPAR);
			print("write function");
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

	public static class SendContext extends ParserRuleContext {
		public TerminalNode SENDOP() { return getToken(ATalkParser.SENDOP, 0); }
		public List<TerminalNode> ID() { return getTokens(ATalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(ATalkParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ATalkParser.RPAR, 0); }
		public TerminalNode SENDER() { return getToken(ATalkParser.SENDER, 0); }
		public TerminalNode SELF() { return getToken(ATalkParser.SELF, 0); }
		public Call_argumentsContext call_arguments() {
			return getRuleContext(Call_argumentsContext.class,0);
		}
		public SendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterSend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitSend(this);
		}
	}

	public final SendContext send() throws RecognitionException {
		SendContext _localctx = new SendContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_send);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SENDER) | (1L << SELF) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(285);
			match(SENDOP);
			setState(286);
			match(ID);
			setState(287);
			match(LPAR);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURALNUM) | (1L << ARITHNUM) | (1L << READ) | (1L << LPAR) | (1L << ID) | (1L << STRING) | (1L << CHARACTER))) != 0)) {
				{
				setState(288);
				call_arguments();
				}
			}

			setState(291);
			match(RPAR);
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
		public TerminalNode INT() { return getToken(ATalkParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(ATalkParser.CHAR, 0); }
		public List<TerminalNode> LBRAC() { return getTokens(ATalkParser.LBRAC); }
		public TerminalNode LBRAC(int i) {
			return getToken(ATalkParser.LBRAC, i);
		}
		public List<TerminalNode> NATURALNUM() { return getTokens(ATalkParser.NATURALNUM); }
		public TerminalNode NATURALNUM(int i) {
			return getToken(ATalkParser.NATURALNUM, i);
		}
		public List<TerminalNode> RBRAC() { return getTokens(ATalkParser.RBRAC); }
		public TerminalNode RBRAC(int i) {
			return getToken(ATalkParser.RBRAC, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRAC) {
				{
				{
				setState(294);
				match(LBRAC);
				setState(295);
				match(NATURALNUM);
				setState(296);
				match(RBRAC);
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			print("type");
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

	public static class OperationContext extends ParserRuleContext {
		public Or_opContext or_op() {
			return getRuleContext(Or_opContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			or_op();
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

	public static class Or_opContext extends ParserRuleContext {
		public And_opContext and_op() {
			return getRuleContext(And_opContext.class,0);
		}
		public TerminalNode OR() { return getToken(ATalkParser.OR, 0); }
		public Or_opContext or_op() {
			return getRuleContext(Or_opContext.class,0);
		}
		public Or_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterOr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitOr_op(this);
		}
	}

	public final Or_opContext or_op() throws RecognitionException {
		Or_opContext _localctx = new Or_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_or_op);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				and_op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(307);
				and_op();
				setState(308);
				match(OR);
				setState(309);
				or_op();
				}
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

	public static class And_opContext extends ParserRuleContext {
		public Equality_opContext equality_op() {
			return getRuleContext(Equality_opContext.class,0);
		}
		public TerminalNode AND() { return getToken(ATalkParser.AND, 0); }
		public And_opContext and_op() {
			return getRuleContext(And_opContext.class,0);
		}
		public And_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterAnd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitAnd_op(this);
		}
	}

	public final And_opContext and_op() throws RecognitionException {
		And_opContext _localctx = new And_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_and_op);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(313);
				equality_op();
				setState(314);
				match(AND);
				setState(315);
				and_op();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				equality_op();
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

	public static class Equality_opContext extends ParserRuleContext {
		public Comparison_opContext comparison_op() {
			return getRuleContext(Comparison_opContext.class,0);
		}
		public Equality_opContext equality_op() {
			return getRuleContext(Equality_opContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ATalkParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ATalkParser.NOTEQUAL, 0); }
		public Equality_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterEquality_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitEquality_op(this);
		}
	}

	public final Equality_opContext equality_op() throws RecognitionException {
		Equality_opContext _localctx = new Equality_opContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_equality_op);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(320);
				comparison_op();
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(322);
				equality_op();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				comparison_op();
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

	public static class Comparison_opContext extends ParserRuleContext {
		public Add_opContext add_op() {
			return getRuleContext(Add_opContext.class,0);
		}
		public Comparison_opContext comparison_op() {
			return getRuleContext(Comparison_opContext.class,0);
		}
		public TerminalNode GT() { return getToken(ATalkParser.GT, 0); }
		public TerminalNode LT() { return getToken(ATalkParser.LT, 0); }
		public Comparison_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterComparison_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitComparison_op(this);
		}
	}

	public final Comparison_opContext comparison_op() throws RecognitionException {
		Comparison_opContext _localctx = new Comparison_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparison_op);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(327);
				add_op();
				setState(328);
				_la = _input.LA(1);
				if ( !(_la==LT || _la==GT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(329);
				comparison_op();
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				add_op();
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

	public static class Add_opContext extends ParserRuleContext {
		public Mult_opContext mult_op() {
			return getRuleContext(Mult_opContext.class,0);
		}
		public Add_opContext add_op() {
			return getRuleContext(Add_opContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ATalkParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ATalkParser.SUB, 0); }
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitAdd_op(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_add_op);
		int _la;
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(334);
				mult_op();
				setState(335);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(336);
				add_op();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				mult_op();
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

	public static class Mult_opContext extends ParserRuleContext {
		public Single_operator_opContext single_operator_op() {
			return getRuleContext(Single_operator_opContext.class,0);
		}
		public Mult_opContext mult_op() {
			return getRuleContext(Mult_opContext.class,0);
		}
		public TerminalNode MULT() { return getToken(ATalkParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(ATalkParser.DIV, 0); }
		public Mult_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterMult_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitMult_op(this);
		}
	}

	public final Mult_opContext mult_op() throws RecognitionException {
		Mult_opContext _localctx = new Mult_opContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mult_op);
		int _la;
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(341);
				single_operator_op();
				setState(342);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(343);
				mult_op();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				single_operator_op();
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

	public static class Single_operator_opContext extends ParserRuleContext {
		public OperandsContext operands() {
			return getRuleContext(OperandsContext.class,0);
		}
		public Single_operator_opContext single_operator_op() {
			return getRuleContext(Single_operator_opContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ATalkParser.NOT, 0); }
		public TerminalNode SUB() { return getToken(ATalkParser.SUB, 0); }
		public Single_operator_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_operator_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterSingle_operator_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitSingle_operator_op(this);
		}
	}

	public final Single_operator_opContext single_operator_op() throws RecognitionException {
		Single_operator_opContext _localctx = new Single_operator_opContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_single_operator_op);
		int _la;
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(348);
				operands();
				setState(349);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(350);
				single_operator_op();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				operands();
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

	public static class OperandsContext extends ParserRuleContext {
		public List<TerminalNode> ARITHNUM() { return getTokens(ATalkParser.ARITHNUM); }
		public TerminalNode ARITHNUM(int i) {
			return getToken(ATalkParser.ARITHNUM, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ATalkParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ATalkParser.STRING, i);
		}
		public List<TerminalNode> CHARACTER() { return getTokens(ATalkParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(ATalkParser.CHARACTER, i);
		}
		public List<TerminalNode> NATURALNUM() { return getTokens(ATalkParser.NATURALNUM); }
		public TerminalNode NATURALNUM(int i) {
			return getToken(ATalkParser.NATURALNUM, i);
		}
		public Read_functionContext read_function() {
			return getRuleContext(Read_functionContext.class,0);
		}
		public OperandsContext operands() {
			return getRuleContext(OperandsContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ATalkParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ATalkParser.RPAR, 0); }
		public List<TerminalNode> ID() { return getTokens(ATalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkParser.ID, i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<TerminalNode> LBRAC() { return getTokens(ATalkParser.LBRAC); }
		public TerminalNode LBRAC(int i) {
			return getToken(ATalkParser.LBRAC, i);
		}
		public List<TerminalNode> RBRAC() { return getTokens(ATalkParser.RBRAC); }
		public TerminalNode RBRAC(int i) {
			return getToken(ATalkParser.RBRAC, i);
		}
		public OperandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterOperands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitOperands(this);
		}
	}

	public final OperandsContext operands() throws RecognitionException {
		OperandsContext _localctx = new OperandsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				{
				setState(355);
				match(LPAR);
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(356);
					assignment();
					}
					break;
				case 2:
					{
					setState(357);
					operation();
					}
					break;
				}
				setState(360);
				match(RPAR);
				}
				}
				break;
			case ID:
				{
				{
				setState(362);
				match(ID);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRAC) {
					{
					{
					setState(363);
					match(LBRAC);
					setState(370);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(364);
						operation();
						}
						break;
					case 2:
						{
						setState(365);
						match(ID);
						}
						break;
					case 3:
						{
						setState(366);
						match(STRING);
						}
						break;
					case 4:
						{
						setState(367);
						match(CHARACTER);
						}
						break;
					case 5:
						{
						setState(368);
						match(ARITHNUM);
						}
						break;
					case 6:
						{
						setState(369);
						match(NATURALNUM);
						}
						break;
					}
					setState(372);
					match(RBRAC);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ARITHNUM:
				{
				setState(378);
				match(ARITHNUM);
				}
				break;
			case STRING:
				{
				setState(379);
				match(STRING);
				}
				break;
			case CHARACTER:
				{
				setState(380);
				match(CHARACTER);
				}
				break;
			case NATURALNUM:
				{
				setState(381);
				match(NATURALNUM);
				}
				break;
			case READ:
				{
				setState(382);
				read_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURALNUM) | (1L << ARITHNUM) | (1L << READ) | (1L << LPAR) | (1L << ID) | (1L << STRING) | (1L << CHARACTER))) != 0)) {
				{
				setState(385);
				operands();
				}
			}

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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(ATalkParser.END, 0); }
		public TerminalNode IF() { return getToken(ATalkParser.IF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ATalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ATalkParser.NEWLINE, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(ATalkParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(ATalkParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(ATalkParser.ELSE, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<TerminalNode> ARITHNUM() { return getTokens(ATalkParser.ARITHNUM); }
		public TerminalNode ARITHNUM(int i) {
			return getToken(ATalkParser.ARITHNUM, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(388);
			match(IF);
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(389);
				operation();
				}
				break;
			case 2:
				{
				setState(390);
				match(ARITHNUM);
				}
				break;
			}
			setState(393);
			match(NEWLINE);
			setState(394);
			condition_block();
			}
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(396);
				match(ELSEIF);
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(397);
					operation();
					}
					break;
				case 2:
					{
					setState(398);
					match(ARITHNUM);
					}
					break;
				}
				setState(401);
				match(NEWLINE);
				setState(402);
				condition_block();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(408);
				match(ELSE);
				setState(409);
				match(NEWLINE);
				setState(410);
				condition_block();
				}
			}

			setState(413);
			match(END);
			print("if statement");
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

	public static class Condition_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitCondition_block(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(416);
			statement();
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

	public static class Foreach_statementContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(ATalkParser.FOREACH, 0); }
		public List<TerminalNode> ID() { return getTokens(ATalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkParser.ID, i);
		}
		public TerminalNode IN() { return getToken(ATalkParser.IN, 0); }
		public TerminalNode NEWLINE() { return getToken(ATalkParser.NEWLINE, 0); }
		public TerminalNode END() { return getToken(ATalkParser.END, 0); }
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public Foreach_blockContext foreach_block() {
			return getRuleContext(Foreach_blockContext.class,0);
		}
		public List<TerminalNode> LBRAC() { return getTokens(ATalkParser.LBRAC); }
		public TerminalNode LBRAC(int i) {
			return getToken(ATalkParser.LBRAC, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<TerminalNode> RBRAC() { return getTokens(ATalkParser.RBRAC); }
		public TerminalNode RBRAC(int i) {
			return getToken(ATalkParser.RBRAC, i);
		}
		public Foreach_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterForeach_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitForeach_statement(this);
		}
	}

	public final Foreach_statementContext foreach_statement() throws RecognitionException {
		Foreach_statementContext _localctx = new Foreach_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_foreach_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(FOREACH);
			setState(419);
			match(ID);
			setState(420);
			match(IN);
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(421);
				match(ID);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRAC) {
					{
					{
					setState(422);
					match(LBRAC);
					setState(423);
					operation();
					setState(424);
					match(RBRAC);
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
				{
				setState(431);
				array_init();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(434);
			match(NEWLINE);
			{
			setState(435);
			foreach_block();
			}
			setState(436);
			match(END);
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

	public static class Foreach_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Foreach_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterForeach_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitForeach_block(this);
		}
	}

	public final Foreach_blockContext foreach_block() throws RecognitionException {
		Foreach_blockContext _localctx = new Foreach_blockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_foreach_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(438);
			statement();
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

	public static class Array_initContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Array_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterArray_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitArray_init(this);
		}
	}

	public final Array_initContext array_init() throws RecognitionException {
		Array_initContext _localctx = new Array_initContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_array_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(T__1);
			{
			setState(441);
			value();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(442);
				match(T__0);
				setState(443);
				value();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(449);
			match(T__2);
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

	public static class ValueContext extends ParserRuleContext {
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Read_functionContext read_function() {
			return getRuleContext(Read_functionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ATalkParser.ID, 0); }
		public TerminalNode STRING() { return getToken(ATalkParser.STRING, 0); }
		public TerminalNode CHARACTER() { return getToken(ATalkParser.CHARACTER, 0); }
		public TerminalNode NATURALNUM() { return getToken(ATalkParser.NATURALNUM, 0); }
		public TerminalNode ARITHNUM() { return getToken(ATalkParser.ARITHNUM, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkListener ) ((ATalkListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(451);
				array_init();
				}
				break;
			case 2:
				{
				setState(452);
				operation();
				}
				break;
			case 3:
				{
				setState(453);
				read_function();
				}
				break;
			case 4:
				{
				setState(454);
				match(ID);
				}
				break;
			case 5:
				{
				setState(455);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(456);
				match(CHARACTER);
				}
				break;
			case 7:
				{
				setState(457);
				match(NATURALNUM);
				}
				break;
			case 8:
				{
				setState(458);
				match(ARITHNUM);
				}
				break;
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u01d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\6\2I\n\2\r\2\16\2J\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3W\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4e\n\4\f\4\16\4h\13\4\3\5\3\5\3\5\3\5\5\5n\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\5\6y\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u0086\n\7\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\5\b\u0094\n\b\5\b\u0096\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00a0\n\t\f\t\16\t\u00a3\13\t\3\n\3\n\3\n\3\n\7\n\u00a9\n\n\f\n\16"+
		"\n\u00ac\13\n\3\13\3\13\3\13\3\13\3\13\5\13\u00b3\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00bb\n\13\7\13\u00bd\n\13\f\13\16\13\u00c0\13\13"+
		"\3\f\3\f\3\f\3\f\5\f\u00c6\n\f\3\f\3\f\3\f\3\f\5\f\u00cc\n\f\7\f\u00ce"+
		"\n\f\f\f\16\f\u00d1\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00dd"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e9\n\16"+
		"\3\17\3\17\3\17\7\17\u00ee\n\17\f\17\16\17\u00f1\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00fa\n\20\3\20\3\20\3\20\5\20\u00ff\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u010f\n\22\3\22\7\22\u0112\n\22\f\22\16\22\u0115\13\22\3\22\3\22\3"+
		"\22\5\22\u011a\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0124"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u012c\n\24\f\24\16\24\u012f\13"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u013a\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0141\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0148"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u014f\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0156\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u015d\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u0164\n\34\3\35\3\35\3\35\5\35\u0169\n\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0175\n\35\3\35\7\35\u0178"+
		"\n\35\f\35\16\35\u017b\13\35\3\35\3\35\3\35\3\35\3\35\5\35\u0182\n\35"+
		"\3\35\5\35\u0185\n\35\3\36\3\36\3\36\5\36\u018a\n\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u0192\n\36\3\36\3\36\7\36\u0196\n\36\f\36\16\36\u0199"+
		"\13\36\3\36\3\36\3\36\5\36\u019e\n\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \7 \u01ad\n \f \16 \u01b0\13 \3 \5 \u01b3\n \3 \3 \3 "+
		"\3 \3!\3!\3\"\3\"\3\"\3\"\7\"\u01bf\n\"\f\"\16\"\u01c2\13\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\5#\u01ce\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\13\3\3**\3\2\7\b\4\2\13\f-"+
		"-\3\2\30\31\3\2\32\33\3\2\34\35\3\2#$\3\2%&\4\2  $$\2\u020f\2H\3\2\2\2"+
		"\4N\3\2\2\2\6f\3\2\2\2\bi\3\2\2\2\nx\3\2\2\2\f\u008a\3\2\2\2\16\u008f"+
		"\3\2\2\2\20\u0099\3\2\2\2\22\u00a4\3\2\2\2\24\u00b2\3\2\2\2\26\u00c1\3"+
		"\2\2\2\30\u00dc\3\2\2\2\32\u00de\3\2\2\2\34\u00ea\3\2\2\2\36\u00fe\3\2"+
		"\2\2 \u0100\3\2\2\2\"\u0106\3\2\2\2$\u011e\3\2\2\2&\u0127\3\2\2\2(\u0132"+
		"\3\2\2\2*\u0139\3\2\2\2,\u0140\3\2\2\2.\u0147\3\2\2\2\60\u014e\3\2\2\2"+
		"\62\u0155\3\2\2\2\64\u015c\3\2\2\2\66\u0163\3\2\2\28\u0181\3\2\2\2:\u0186"+
		"\3\2\2\2<\u01a2\3\2\2\2>\u01a4\3\2\2\2@\u01b8\3\2\2\2B\u01ba\3\2\2\2D"+
		"\u01cd\3\2\2\2FI\7*\2\2GI\5\4\3\2HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2"+
		"\2\2JK\3\2\2\2KL\3\2\2\2LM\b\2\1\2M\3\3\2\2\2NO\7\t\2\2OP\7-\2\2PQ\7\34"+
		"\2\2QR\7\7\2\2RS\7\35\2\2ST\7*\2\2TV\5\6\4\2UW\7*\2\2VU\3\2\2\2VW\3\2"+
		"\2\2WX\3\2\2\2XY\7\25\2\2YZ\t\2\2\2Z[\b\3\1\2[\5\3\2\2\2\\e\5\b\5\2]^"+
		"\5\22\n\2^_\7*\2\2_e\3\2\2\2`a\5\32\16\2ab\7*\2\2be\3\2\2\2ce\7*\2\2d"+
		"\\\3\2\2\2d]\3\2\2\2d`\3\2\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2"+
		"g\7\3\2\2\2hf\3\2\2\2ij\7\n\2\2jk\7-\2\2km\7!\2\2ln\5\20\t\2ml\3\2\2\2"+
		"mn\3\2\2\2no\3\2\2\2op\7\"\2\2pq\7*\2\2qr\5\n\6\2rs\7\25\2\2st\7*\2\2"+
		"tu\b\5\1\2u\t\3\2\2\2vy\5\f\7\2wy\7*\2\2xv\3\2\2\2xw\3\2\2\2y\13\3\2\2"+
		"\2z\u0086\5\36\20\2{\u0086\5\32\16\2|\u0086\5\34\17\2}\u0086\5\26\f\2"+
		"~\u0086\5(\25\2\177\u0086\5:\36\2\u0080\u0086\5> \2\u0081\u0086\5$\23"+
		"\2\u0082\u0086\5\16\b\2\u0083\u0086\7\27\2\2\u0084\u0086\7\26\2\2\u0085"+
		"z\3\2\2\2\u0085{\3\2\2\2\u0085|\3\2\2\2\u0085}\3\2\2\2\u0085~\3\2\2\2"+
		"\u0085\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0082"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\7*\2\2\u0088\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008e\b\7\1\2\u008e\r\3\2\2\2\u008f\u0090\7\24\2\2\u0090\u0095\7*\2\2"+
		"\u0091\u0096\5\f\7\2\u0092\u0094\7*\2\2\u0093\u0092\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\7\25\2\2\u0098\17\3\2\2\2\u0099\u009a\5&\24"+
		"\2\u009a\u00a1\7-\2\2\u009b\u009c\7\3\2\2\u009c\u009d\5&\24\2\u009d\u009e"+
		"\7-\2\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\21\3\2\2\2\u00a3\u00a1\3\2\2"+
		"\2\u00a4\u00a5\5&\24\2\u00a5\u00aa\7-\2\2\u00a6\u00a7\7\3\2\2\u00a7\u00a9"+
		"\7-\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\23\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b3\7-\2\2"+
		"\u00ae\u00b3\7.\2\2\u00af\u00b3\7/\2\2\u00b0\u00b3\7\b\2\2\u00b1\u00b3"+
		"\5(\25\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00be\3\2\2\2\u00b4\u00ba\7\3"+
		"\2\2\u00b5\u00bb\7-\2\2\u00b6\u00bb\7.\2\2\u00b7\u00bb\7/\2\2\u00b8\u00bb"+
		"\7\b\2\2\u00b9\u00bb\5(\25\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba"+
		"\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bd\3\2"+
		"\2\2\u00bc\u00b4\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\25\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\5&\24"+
		"\2\u00c2\u00c5\7-\2\2\u00c3\u00c4\7\'\2\2\u00c4\u00c6\5\30\r\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00cf\3\2\2\2\u00c7\u00c8\7\3\2\2\u00c8"+
		"\u00cb\7-\2\2\u00c9\u00ca\7\'\2\2\u00ca\u00cc\5\30\r\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c7\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\b\f\1\2\u00d3\27\3\2\2\2\u00d4\u00dd"+
		"\7-\2\2\u00d5\u00dd\7.\2\2\u00d6\u00dd\7/\2\2\u00d7\u00dd\7\b\2\2\u00d8"+
		"\u00dd\7\7\2\2\u00d9\u00dd\5\32\16\2\u00da\u00dd\5(\25\2\u00db\u00dd\5"+
		"B\"\2\u00dc\u00d4\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc"+
		"\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00db\3\2\2\2\u00dd\31\3\2\2\2\u00de\u00df\7-\2\2\u00df\u00e8"+
		"\7\'\2\2\u00e0\u00e9\5 \21\2\u00e1\u00e9\5(\25\2\u00e2\u00e9\5B\"\2\u00e3"+
		"\u00e9\7-\2\2\u00e4\u00e9\7.\2\2\u00e5\u00e9\7/\2\2\u00e6\u00e9\7\b\2"+
		"\2\u00e7\u00e9\5\32\16\2\u00e8\u00e0\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8"+
		"\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e5\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\33\3\2\2\2\u00ea\u00ef"+
		"\5\32\16\2\u00eb\u00ec\7\3\2\2\u00ec\u00ee\5\32\16\2\u00ed\u00eb\3\2\2"+
		"\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\35"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\5 \21\2\u00f3\u00f4\7*\2\2\u00f4"+
		"\u00ff\3\2\2\2\u00f5\u00ff\5\"\22\2\u00f6\u00f7\7-\2\2\u00f7\u00f9\7!"+
		"\2\2\u00f8\u00fa\5\24\13\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\7\"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\b\20"+
		"\1\2\u00fe\u00f2\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f6\3\2\2\2\u00ff"+
		"\37\3\2\2\2\u0100\u0101\7\r\2\2\u0101\u0102\7!\2\2\u0102\u0103\t\3\2\2"+
		"\u0103\u0104\7\"\2\2\u0104\u0105\b\21\1\2\u0105!\3\2\2\2\u0106\u0107\7"+
		"\16\2\2\u0107\u0119\7!\2\2\u0108\u0113\7-\2\2\u0109\u010e\7(\2\2\u010a"+
		"\u010f\5(\25\2\u010b\u010f\7-\2\2\u010c\u010f\7\b\2\2\u010d\u010f\7\7"+
		"\2\2\u010e\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\7)\2\2\u0111\u0109\3\2"+
		"\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u011a\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011a\7.\2\2\u0117\u011a\7/\2"+
		"\2\u0118\u011a\5(\25\2\u0119\u0108\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\"\2\2\u011c"+
		"\u011d\b\22\1\2\u011d#\3\2\2\2\u011e\u011f\t\4\2\2\u011f\u0120\7+\2\2"+
		"\u0120\u0121\7-\2\2\u0121\u0123\7!\2\2\u0122\u0124\5\24\13\2\u0123\u0122"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7\"\2\2\u0126"+
		"%\3\2\2\2\u0127\u012d\t\5\2\2\u0128\u0129\7(\2\2\u0129\u012a\7\7\2\2\u012a"+
		"\u012c\7)\2\2\u012b\u0128\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0131\b\24\1\2\u0131\'\3\2\2\2\u0132\u0133\5*\26\2\u0133)\3\2\2\2\u0134"+
		"\u013a\5,\27\2\u0135\u0136\5,\27\2\u0136\u0137\7\36\2\2\u0137\u0138\5"+
		"*\26\2\u0138\u013a\3\2\2\2\u0139\u0134\3\2\2\2\u0139\u0135\3\2\2\2\u013a"+
		"+\3\2\2\2\u013b\u013c\5.\30\2\u013c\u013d\7\37\2\2\u013d\u013e\5,\27\2"+
		"\u013e\u0141\3\2\2\2\u013f\u0141\5.\30\2\u0140\u013b\3\2\2\2\u0140\u013f"+
		"\3\2\2\2\u0141-\3\2\2\2\u0142\u0143\5\60\31\2\u0143\u0144\t\6\2\2\u0144"+
		"\u0145\5.\30\2\u0145\u0148\3\2\2\2\u0146\u0148\5\60\31\2\u0147\u0142\3"+
		"\2\2\2\u0147\u0146\3\2\2\2\u0148/\3\2\2\2\u0149\u014a\5\62\32\2\u014a"+
		"\u014b\t\7\2\2\u014b\u014c\5\60\31\2\u014c\u014f\3\2\2\2\u014d\u014f\5"+
		"\62\32\2\u014e\u0149\3\2\2\2\u014e\u014d\3\2\2\2\u014f\61\3\2\2\2\u0150"+
		"\u0151\5\64\33\2\u0151\u0152\t\b\2\2\u0152\u0153\5\62\32\2\u0153\u0156"+
		"\3\2\2\2\u0154\u0156\5\64\33\2\u0155\u0150\3\2\2\2\u0155\u0154\3\2\2\2"+
		"\u0156\63\3\2\2\2\u0157\u0158\5\66\34\2\u0158\u0159\t\t\2\2\u0159\u015a"+
		"\5\64\33\2\u015a\u015d\3\2\2\2\u015b\u015d\5\66\34\2\u015c\u0157\3\2\2"+
		"\2\u015c\u015b\3\2\2\2\u015d\65\3\2\2\2\u015e\u015f\58\35\2\u015f\u0160"+
		"\t\n\2\2\u0160\u0161\5\66\34\2\u0161\u0164\3\2\2\2\u0162\u0164\58\35\2"+
		"\u0163\u015e\3\2\2\2\u0163\u0162\3\2\2\2\u0164\67\3\2\2\2\u0165\u0168"+
		"\7!\2\2\u0166\u0169\5\32\16\2\u0167\u0169\5(\25\2\u0168\u0166\3\2\2\2"+
		"\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\7\"\2\2\u016b\u0182"+
		"\3\2\2\2\u016c\u0179\7-\2\2\u016d\u0174\7(\2\2\u016e\u0175\5(\25\2\u016f"+
		"\u0175\7-\2\2\u0170\u0175\7.\2\2\u0171\u0175\7/\2\2\u0172\u0175\7\b\2"+
		"\2\u0173\u0175\7\7\2\2\u0174\u016e\3\2\2\2\u0174\u016f\3\2\2\2\u0174\u0170"+
		"\3\2\2\2\u0174\u0171\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0178\7)\2\2\u0177\u016d\3\2\2\2\u0178\u017b\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0182\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u0182\7\b\2\2\u017d\u0182\7.\2\2\u017e\u0182\7/\2"+
		"\2\u017f\u0182\7\7\2\2\u0180\u0182\5 \21\2\u0181\u0165\3\2\2\2\u0181\u016c"+
		"\3\2\2\2\u0181\u017c\3\2\2\2\u0181\u017d\3\2\2\2\u0181\u017e\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0185\58"+
		"\35\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u01859\3\2\2\2\u0186\u0189"+
		"\7\17\2\2\u0187\u018a\5(\25\2\u0188\u018a\7\b\2\2\u0189\u0187\3\2\2\2"+
		"\u0189\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\7*\2\2\u018c\u018d"+
		"\5<\37\2\u018d\u0197\3\2\2\2\u018e\u0191\7\20\2\2\u018f\u0192\5(\25\2"+
		"\u0190\u0192\7\b\2\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0194\7*\2\2\u0194\u0196\5<\37\2\u0195\u018e\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019d\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7\21\2\2\u019b\u019c\7*\2\2\u019c"+
		"\u019e\5<\37\2\u019d\u019a\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u01a0\7\25\2\2\u01a0\u01a1\b\36\1\2\u01a1;\3\2\2\2\u01a2\u01a3"+
		"\5\f\7\2\u01a3=\3\2\2\2\u01a4\u01a5\7\22\2\2\u01a5\u01a6\7-\2\2\u01a6"+
		"\u01b2\7\23\2\2\u01a7\u01ae\7-\2\2\u01a8\u01a9\7(\2\2\u01a9\u01aa\5(\25"+
		"\2\u01aa\u01ab\7)\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ad\u01b0"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b3\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b1\u01b3\5B\"\2\u01b2\u01a7\3\2\2\2\u01b2\u01b1\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\7*\2\2\u01b5\u01b6\5@!\2\u01b6\u01b7"+
		"\7\25\2\2\u01b7?\3\2\2\2\u01b8\u01b9\5\f\7\2\u01b9A\3\2\2\2\u01ba\u01bb"+
		"\7\4\2\2\u01bb\u01c0\5D#\2\u01bc\u01bd\7\3\2\2\u01bd\u01bf\5D#\2\u01be"+
		"\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4\7\5\2\2\u01c4"+
		"C\3\2\2\2\u01c5\u01ce\5B\"\2\u01c6\u01ce\5(\25\2\u01c7\u01ce\5 \21\2\u01c8"+
		"\u01ce\7-\2\2\u01c9\u01ce\7.\2\2\u01ca\u01ce\7/\2\2\u01cb\u01ce\7\7\2"+
		"\2\u01cc\u01ce\7\b\2\2\u01cd\u01c5\3\2\2\2\u01cd\u01c6\3\2\2\2\u01cd\u01c7"+
		"\3\2\2\2\u01cd\u01c8\3\2\2\2\u01cd\u01c9\3\2\2\2\u01cd\u01ca\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ceE\3\2\2\2\63HJVdfmx\u0085\u008a"+
		"\u0093\u0095\u00a1\u00aa\u00b2\u00ba\u00be\u00c5\u00cb\u00cf\u00dc\u00e8"+
		"\u00ef\u00f9\u00fe\u010e\u0113\u0119\u0123\u012d\u0139\u0140\u0147\u014e"+
		"\u0155\u015c\u0163\u0168\u0174\u0179\u0181\u0184\u0189\u0191\u0197\u019d"+
		"\u01ae\u01b2\u01c0\u01cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}