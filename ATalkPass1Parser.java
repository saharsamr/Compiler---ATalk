// Generated from ATalkPass1.g4 by ANTLR 4.7

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
public class ATalkPass1Parser extends Parser {
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
	public String getGrammarFileName() { return "ATalkPass1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  String codeData = "";
	  int foreachCount = 0;
	  int errorOccured = 0;
	  int actorCount=0;
	  int receiverCount=0;
	  int repeatedVarCount = 0;

	  void beginScope() {
	    	int localOffset = 0;
	    	int globalOffset = 0;

	    	if(SymbolTable.top != null) {
	        	localOffset = SymbolTable.top.getOffset(Register.SP);
	        	globalOffset = SymbolTable.top.getOffset(Register.GP);
	    	}

	        SymbolTable.push(new SymbolTable(SymbolTable.top));

	        SymbolTable.top.setOffset(Register.SP, localOffset);
	        SymbolTable.top.setOffset(Register.GP, globalOffset);
	    }

	  void endScope() {
	      codeData += ("Stack offset: " + SymbolTable.top.getOffset(Register.SP) + "\n\n");
	      if(SymbolTable.top.getPreSymbolTable() != null) {
	            SymbolTable.top.getPreSymbolTable().setOffset(
	                Register.GP,
	                SymbolTable.top.getOffset(Register.GP)
	            );
	        }
	        SymbolTable.pop();
	  }

	  void addVarItem(String name, Type type, int lineNum, Register reg){
	    try{
	      if (reg == Register.SP)
	        putLocalVar(name, type);
	      else if (reg == Register.GP)
	        putGlobalVar(name, type);
	      printVarData(name, type, reg);
	    }catch(ItemAlreadyExistsException e){
	      repeatedVarCount++;
	      printErrors(lineNum , "Variable <" + name + "> already exist!");
	      try{
	        if (reg == Register.SP)
	          putLocalVar(name + "_temporary_" + repeatedVarCount, type);
	        else if (reg == Register.GP)
	          putGlobalVar(name + "_temporary_" + repeatedVarCount, type);
	      }catch(ItemAlreadyExistsException ex){}
	    }
	  }

	  void addActor(int size, String name, int lineNum){
	    if( size <= 0 ){
	      size=0;
	      printErrors(lineNum, "size of Actor queue is negative.");
	    }
	    codeData += ("Actor\n\tname: "+ name
	        + "\n\tActor queue size: " + size + "\n\n");
	    try{
	      putActor(name, SymbolTable.top.getOffset(Register.GP));
	    }catch(ActorAlreadyExistsException e){
	      actorCount++;
	      printErrors(lineNum,"Actor <" + name + "> already exist!");
	      String new_name = name + "_temporary_" + actorCount;
	      try{
	        putActor(new_name, SymbolTable.top.getOffset(Register.GP));
	      }catch(ActorAlreadyExistsException ex){}
	    }
	  }

	  void addReceiver(String receiverName,String actorName, int lineNum, ArrayList<Type> argumentTypes){
	     try{
	       putReceiver(receiverName, actorName, argumentTypes);
	       printRecieverData(receiverName, argumentTypes);
	     }catch(ReceiverAlreadyExistsException e){
	       receiverCount++;
	       SymbolTableItemReceiver temp = new SymbolTableItemReceiver(receiverName,actorName,argumentTypes);
	       printErrors(lineNum,"Reciever <" + temp.getKey() + "> already exist!");
	       String new_name = receiverName + "_temporary_" + receiverCount;
	       try{
	         putReceiver(new_name, actorName, argumentTypes);
	       }catch(ReceiverAlreadyExistsException ex){}
	     }
	  }

	  void putLocalVar(String name, Type type) throws ItemAlreadyExistsException {
	      SymbolTable.top.put(
	          new SymbolTableLocalVariableItem(
	              new Variable(name, type),
	              SymbolTable.top.getOffset(Register.SP)
	          )
	      );
	  }

	  void putGlobalVar(String name, Type type) throws ItemAlreadyExistsException {
	      SymbolTable.top.put(
	          new SymbolTableGlobalVariableItem(
	              new Variable(name, type),
	              SymbolTable.top.getOffset(Register.GP)
	          )
	      );
	  }

	  void putActor(String name, int offset)throws ActorAlreadyExistsException{
	    try{
	      SymbolTable.top.put(
	          new SymbolTableItemActor(name,
	              SymbolTable.top.getOffset(Register.GP)
	          )
	      );
	    }catch(ItemAlreadyExistsException e){
	      throw new ActorAlreadyExistsException();
	    }
	  }

	  void putReceiver(String name,String actorName, ArrayList<Type> argumentTypes)throws ReceiverAlreadyExistsException{
	    try{
	      SymbolTable.top.put(
	          new SymbolTableItemReceiver(name,actorName,argumentTypes)
	      );
	    }catch(ItemAlreadyExistsException e){
	      throw new ReceiverAlreadyExistsException();
	    }
	  }

	  void addRecieverArguments(ArrayList<Type> argumentTypes, ArrayList<String> argumentsNames, int lineNum){
	    for (int i = 0; i < argumentTypes.size(); i++)
	      addVarItem(argumentsNames.get(i), argumentTypes.get(i), lineNum, Register.SP);
	  }

	  void printVarData(String name, Type type, Register reg){
	    codeData += ("Variable \n\tname: "+ name + "\n\tType: " + type + "\n\tOffset:" + (SymbolTable.top.getOffset(reg) - type.size())
	          + "\n\tVarible size: " + type.size() + "\n\n");
	  }

	  void printRecieverData(String recName, ArrayList<Type> argumentTypes){
	    String arguments = "(";
	    for (int i = 0; i < argumentTypes.size(); i++){
	      arguments += argumentTypes.get(i).toString();
	      if (i!=argumentTypes.size()-1)
	        arguments+=", ";
	    }
	    arguments += ")";
	    codeData += ("Reciever: " + recName + arguments + "\n\n.");
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

	public ATalkPass1Parser(TokenStream input) {
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
		public List<TerminalNode> NL() { return getTokens(ATalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass1Parser.NL, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			beginScope();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==NL) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(69);
					actor();
					actorCount++;
					}
					break;
				case NL:
					{
					setState(72);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			      endScope();
			      if(actorCount == 0)
			        printErrors(-1,"actor doesnt found!");
			      if(errorOccured == 0)
			        print(codeData);
			  
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
		public Token name;
		public Token size;
		public List<TerminalNode> NL() { return getTokens(ATalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass1Parser.NL, i);
		}
		public TerminalNode ID() { return getToken(ATalkPass1Parser.ID, 0); }
		public TerminalNode CONST_NUM() { return getToken(ATalkPass1Parser.CONST_NUM, 0); }
		public TerminalNode EOF() { return getToken(ATalkPass1Parser.EOF, 0); }
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterActor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitActor(this);
		}
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__0);
			setState(81);
			((ActorContext)_localctx).name = match(ID);
			setState(82);
			match(T__1);
			setState(83);
			((ActorContext)_localctx).size = match(CONST_NUM);
			setState(84);
			match(T__2);
			setState(85);
			match(NL);

			      addActor((((ActorContext)_localctx).size!=null?Integer.valueOf(((ActorContext)_localctx).size.getText()):0), (((ActorContext)_localctx).name!=null?((ActorContext)_localctx).name.getText():null), (((ActorContext)_localctx).name!=null?((ActorContext)_localctx).name.getLine():0));  beginScope();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__11) | (1L << NL))) != 0)) {
				{
				setState(90);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__11:
					{
					setState(87);
					state();
					}
					break;
				case T__5:
					{
					setState(88);
					receiver((((ActorContext)_localctx).name!=null?((ActorContext)_localctx).name.getText():null));
					}
					break;
				case NL:
					{
					setState(89);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			endScope();
			setState(96);
			match(T__3);
			setState(97);
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
		public TypeContext tp;
		public Token name;
		public TerminalNode NL() { return getToken(ATalkPass1Parser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ATalkPass1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkPass1Parser.ID, i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			((StateContext)_localctx).tp = type();
			setState(100);
			((StateContext)_localctx).name = match(ID);

			      addVarItem((((StateContext)_localctx).name!=null?((StateContext)_localctx).name.getText():null), ((StateContext)_localctx).tp.t, (((StateContext)_localctx).name!=null?((StateContext)_localctx).name.getLine():0), Register.GP);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(102);
				match(T__4);
				setState(103);
				((StateContext)_localctx).name = match(ID);

				      addVarItem((((StateContext)_localctx).name!=null?((StateContext)_localctx).name.getText():null), ((StateContext)_localctx).tp.t, (((StateContext)_localctx).name!=null?((StateContext)_localctx).name.getLine():0), Register.GP);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
		public String actorName;
		public Token name;
		public TypeContext tp;
		public Token argName;
		public List<TerminalNode> NL() { return getTokens(ATalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass1Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ATalkPass1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkPass1Parser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReceiverContext(ParserRuleContext parent, int invokingState, String actorName) {
			super(parent, invokingState);
			this.actorName = actorName;
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver(String actorName) throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState(), actorName);
		enterRule(_localctx, 6, RULE_receiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Type> argumentsTypes = new ArrayList<Type>();
			   ArrayList<String> argumentsNames = new ArrayList<String>(); 
			setState(113);
			match(T__5);
			setState(114);
			((ReceiverContext)_localctx).name = match(ID);
			setState(115);
			match(T__6);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__11) {
				{
				setState(116);
				((ReceiverContext)_localctx).tp = type();
				argumentsTypes.add(((ReceiverContext)_localctx).tp.t);
				setState(118);
				((ReceiverContext)_localctx).argName = match(ID);
				argumentsNames.add((((ReceiverContext)_localctx).argName!=null?((ReceiverContext)_localctx).argName.getText():null));
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(120);
					match(T__4);
					setState(121);
					((ReceiverContext)_localctx).tp = type();
					argumentsTypes.add(((ReceiverContext)_localctx).tp.t);
					setState(123);
					((ReceiverContext)_localctx).argName = match(ID);
					argumentsNames.add((((ReceiverContext)_localctx).argName!=null?((ReceiverContext)_localctx).argName.getText():null));
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(133);
			match(T__7);
			setState(134);
			match(NL);
			addReceiver((((ReceiverContext)_localctx).name!=null?((ReceiverContext)_localctx).name.getText():null), _localctx.actorName, (((ReceiverContext)_localctx).name!=null?((ReceiverContext)_localctx).name.getLine():0), argumentsTypes);
			           beginScope();
			           addRecieverArguments(argumentsTypes, argumentsNames, (((ReceiverContext)_localctx).name!=null?((ReceiverContext)_localctx).name.getLine():0));
			         
			setState(136);
			statements();
			setState(137);
			match(T__3);
			setState(138);
			match(NL);
			endScope();
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
		public List<TerminalNode> CONST_NUM() { return getTokens(ATalkPass1Parser.CONST_NUM); }
		public TerminalNode CONST_NUM(int i) {
			return getToken(ATalkPass1Parser.CONST_NUM, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__8);
				((TypeContext)_localctx).t =  new CharacterType();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(143);
					match(T__9);
					setState(144);
					((TypeContext)_localctx).size = match(CONST_NUM);
					setState(145);
					match(T__10);
					//TODO:
					      if((((TypeContext)_localctx).size!=null?Integer.valueOf(((TypeContext)_localctx).size.getText()):0) <= 0)
					        printErrors((((TypeContext)_localctx).size!=null?((TypeContext)_localctx).size.getLine():0), "Array size is negative.");
					      ((TypeContext)_localctx).t =  new ArrayType((((TypeContext)_localctx).size!=null?Integer.valueOf(((TypeContext)_localctx).size.getText()):0), _localctx.t );
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__11);
				((TypeContext)_localctx).t =  new IntType();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(154);
					match(T__9);
					setState(155);
					((TypeContext)_localctx).size = match(CONST_NUM);
					setState(156);
					match(T__10);

					    if((((TypeContext)_localctx).size!=null?Integer.valueOf(((TypeContext)_localctx).size.getText()):0) <= 0)
					      printErrors((((TypeContext)_localctx).size!=null?((TypeContext)_localctx).size.getLine():0), "Array size is negative.");
					    ((TypeContext)_localctx).t =  new ArrayType((((TypeContext)_localctx).size!=null?Integer.valueOf(((TypeContext)_localctx).size.getText()):0), _localctx.t );
					}
					}
					setState(162);
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
		public List<TerminalNode> NL() { return getTokens(ATalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass1Parser.NL, i);
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__12);
			beginScope();
			setState(167);
			match(NL);
			setState(168);
			statements();
			setState(169);
			match(T__3);
			endScope();
			setState(171);
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
		public List<TerminalNode> NL() { return getTokens(ATalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass1Parser.NL, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << NL) | (1L << ID))) != 0)) {
				{
				setState(175);
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
					setState(173);
					statement();
					}
					break;
				case NL:
					{
					setState(174);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(179);
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				stm_vardef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				stm_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				stm_foreach();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				stm_if_elseif_else();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				stm_quit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				stm_break();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(186);
				stm_tell();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(187);
				stm_write();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
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
		public TypeContext tp;
		public Token name;
		public TerminalNode NL() { return getToken(ATalkPass1Parser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ATalkPass1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkPass1Parser.ID, i);
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterStm_vardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitStm_vardef(this);
		}
	}

	public final Stm_vardefContext stm_vardef() throws RecognitionException {
		Stm_vardefContext _localctx = new Stm_vardefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stm_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((Stm_vardefContext)_localctx).tp = type();
			setState(192);
			((Stm_vardefContext)_localctx).name = match(ID);

			      addVarItem((((Stm_vardefContext)_localctx).name!=null?((Stm_vardefContext)_localctx).name.getText():null), ((Stm_vardefContext)_localctx).tp.t, (((Stm_vardefContext)_localctx).name!=null?((Stm_vardefContext)_localctx).name.getLine():0), Register.SP);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(194);
				match(T__13);
				setState(195);
				expr();
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(198);
				match(T__4);
				setState(199);
				((Stm_vardefContext)_localctx).name = match(ID);

				      addVarItem((((Stm_vardefContext)_localctx).name!=null?((Stm_vardefContext)_localctx).name.getText():null), ((Stm_vardefContext)_localctx).tp.t, (((Stm_vardefContext)_localctx).name!=null?((Stm_vardefContext)_localctx).name.getLine():0), Register.SP);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(201);
					match(T__13);
					setState(202);
					expr();
					}
				}

				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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
		public List<TerminalNode> ID() { return getTokens(ATalkPass1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ATalkPass1Parser.ID, i);
		}
		public TerminalNode NL() { return getToken(ATalkPass1Parser.NL, 0); }
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterStm_tell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitStm_tell(this);
		}
	}

	public final Stm_tellContext stm_tell() throws RecognitionException {
		Stm_tellContext _localctx = new Stm_tellContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stm_tell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(213);
			match(T__16);
			setState(214);
			match(ID);
			setState(215);
			match(T__6);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				setState(216);
				expr();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(217);
					match(T__4);
					setState(218);
					expr();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(226);
			match(T__7);
			setState(227);
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
		public TerminalNode NL() { return getToken(ATalkPass1Parser.NL, 0); }
		public Stm_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterStm_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitStm_write(this);
		}
	}

	public final Stm_writeContext stm_write() throws RecognitionException {
		Stm_writeContext _localctx = new Stm_writeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stm_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__17);
			setState(230);
			match(T__6);
			setState(231);
			expr();
			setState(232);
			match(T__7);
			setState(233);
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
		public List<TerminalNode> NL() { return getTokens(ATalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass1Parser.NL, i);
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterStm_if_elseif_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitStm_if_elseif_else(this);
		}
	}

	public final Stm_if_elseif_elseContext stm_if_elseif_else() throws RecognitionException {
		Stm_if_elseif_elseContext _localctx = new Stm_if_elseif_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stm_if_elseif_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__18);
			beginScope();
			setState(237);
			expr();
			setState(238);
			match(NL);
			setState(239);
			statements();
			endScope();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(241);
				match(T__19);
				beginScope();
				setState(243);
				expr();
				setState(244);
				match(NL);
				setState(245);
				statements();
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
				statements();
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
		public TerminalNode ID() { return getToken(ATalkPass1Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(ATalkPass1Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ATalkPass1Parser.NL, i);
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterStm_foreach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitStm_foreach(this);
		}
	}

	public final Stm_foreachContext stm_foreach() throws RecognitionException {
		Stm_foreachContext _localctx = new Stm_foreachContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stm_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__21);
			beginScope(); foreachCount++;
			setState(266);
			match(ID);
			setState(267);
			match(T__22);
			setState(268);
			expr();
			setState(269);
			match(NL);
			setState(270);
			statements();
			setState(271);
			match(T__3);
			endScope(); foreachCount--;
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

	public static class Stm_quitContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(ATalkPass1Parser.NL, 0); }
		public Stm_quitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_quit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterStm_quit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitStm_quit(this);
		}
	}

	public final Stm_quitContext stm_quit() throws RecognitionException {
		Stm_quitContext _localctx = new Stm_quitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stm_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__23);
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

	public static class Stm_breakContext extends ParserRuleContext {
		public Token ln;
		public TerminalNode NL() { return getToken(ATalkPass1Parser.NL, 0); }
		public Stm_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterStm_break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitStm_break(this);
		}
	}

	public final Stm_breakContext stm_break() throws RecognitionException {
		Stm_breakContext _localctx = new Stm_breakContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stm_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((Stm_breakContext)_localctx).ln = match(T__24);
			setState(279);
			match(NL);

			      if(foreachCount == 0)
			        printErrors((((Stm_breakContext)_localctx).ln!=null?((Stm_breakContext)_localctx).ln.getLine():0), "<break> statement is used out of foreach block.");
			    
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
		public TerminalNode NL() { return getToken(ATalkPass1Parser.NL, 0); }
		public Stm_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterStm_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitStm_assignment(this);
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
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			expr_assign();
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_assign(this);
		}
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_assign);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				expr_or();
				setState(288);
				match(T__13);
				setState(289);
				expr_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				expr_or();
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_or(this);
		}
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			expr_and();
			setState(295);
			expr_or_tmp();
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_or_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_or_tmp(this);
		}
	}

	public final Expr_or_tmpContext expr_or_tmp() throws RecognitionException {
		Expr_or_tmpContext _localctx = new Expr_or_tmpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_or_tmp);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(T__25);
				setState(298);
				expr_and();
				setState(299);
				expr_or_tmp();
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_and(this);
		}
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			expr_eq();
			setState(305);
			expr_and_tmp();
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_and_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_and_tmp(this);
		}
	}

	public final Expr_and_tmpContext expr_and_tmp() throws RecognitionException {
		Expr_and_tmpContext _localctx = new Expr_and_tmpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_and_tmp);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(T__26);
				setState(308);
				expr_eq();
				setState(309);
				expr_and_tmp();
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_eq(this);
		}
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			expr_cmp();
			setState(315);
			expr_eq_tmp();
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_eq_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_eq_tmp(this);
		}
	}

	public final Expr_eq_tmpContext expr_eq_tmp() throws RecognitionException {
		Expr_eq_tmpContext _localctx = new Expr_eq_tmpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_eq_tmp);
		int _la;
		try {
			setState(322);
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
				expr_cmp();
				setState(319);
				expr_eq_tmp();
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_cmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_cmp(this);
		}
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			expr_add();
			setState(325);
			expr_cmp_tmp();
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
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmp_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_cmp_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_cmp_tmp(this);
		}
	}

	public final Expr_cmp_tmpContext expr_cmp_tmp() throws RecognitionException {
		Expr_cmp_tmpContext _localctx = new Expr_cmp_tmpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_cmp_tmp);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				expr_add();
				setState(329);
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_add(this);
		}
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			expr_mult();
			setState(335);
			expr_add_tmp();
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
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_add_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_add_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_add_tmp(this);
		}
	}

	public final Expr_add_tmpContext expr_add_tmp() throws RecognitionException {
		Expr_add_tmpContext _localctx = new Expr_add_tmpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_add_tmp);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(338);
				expr_mult();
				setState(339);
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_mult(this);
		}
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			expr_un();
			setState(345);
			expr_mult_tmp();
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
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_mult_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_mult_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_mult_tmp(this);
		}
	}

	public final Expr_mult_tmpContext expr_mult_tmp() throws RecognitionException {
		Expr_mult_tmpContext _localctx = new Expr_mult_tmpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr_mult_tmp);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(348);
				expr_un();
				setState(349);
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_un(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_un(this);
		}
	}

	public final Expr_unContext expr_un() throws RecognitionException {
		Expr_unContext _localctx = new Expr_unContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_un);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(355);
				expr_un();
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
				setState(356);
				expr_mem();
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_mem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_mem(this);
		}
	}

	public final Expr_memContext expr_mem() throws RecognitionException {
		Expr_memContext _localctx = new Expr_memContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_mem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			expr_other();
			setState(360);
			expr_mem_tmp();
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_mem_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_mem_tmp(this);
		}
	}

	public final Expr_mem_tmpContext expr_mem_tmp() throws RecognitionException {
		Expr_mem_tmpContext _localctx = new Expr_mem_tmpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_mem_tmp);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(T__9);
				setState(363);
				expr();
				setState(364);
				match(T__10);
				setState(365);
				expr_mem_tmp();
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
		public TerminalNode CONST_NUM() { return getToken(ATalkPass1Parser.CONST_NUM, 0); }
		public TerminalNode CONST_CHAR() { return getToken(ATalkPass1Parser.CONST_CHAR, 0); }
		public TerminalNode CONST_STR() { return getToken(ATalkPass1Parser.CONST_STR, 0); }
		public TerminalNode ID() { return getToken(ATalkPass1Parser.ID, 0); }
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
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).enterExpr_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATalkPass1Listener ) ((ATalkPass1Listener)listener).exitExpr_other(this);
		}
	}

	public final Expr_otherContext expr_other() throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_other);
		int _la;
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(CONST_NUM);
				}
				break;
			case CONST_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(CONST_CHAR);
				}
				break;
			case CONST_STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				match(CONST_STR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(ID);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				match(T__34);
				setState(375);
				expr();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(376);
					match(T__4);
					setState(377);
					expr();
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(385);
				match(T__36);
				setState(386);
				match(T__6);
				setState(387);
				match(CONST_NUM);
				setState(388);
				match(T__7);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(389);
				match(T__6);
				setState(390);
				expr();
				setState(391);
				match(T__7);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u018e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3]\n\3\f\3\16\3`\13\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0081\n\5\f\5"+
		"\16\5\u0084\13\5\5\5\u0086\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u0096\n\6\f\6\16\6\u0099\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u00a1\n\6\f\6\16\6\u00a4\13\6\5\6\u00a6\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\7\b\u00b2\n\b\f\b\16\b\u00b5\13\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c0\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c7\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00ce\n\n\7\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00de\n\13\f\13\16\13\u00e1"+
		"\13\13\5\13\u00e3\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fb\n\r\f\r\16\r\u00fe"+
		"\13\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0106\n\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0127\n\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0131\n\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u013b\n\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0145\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u014f\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0159\n\35\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u0163\n\37\3 \3 \3 \5 \u0168"+
		"\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0173\n\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\7#\u017d\n#\f#\16#\u0180\13#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u018c"+
		"\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BD\2\t\3\3++\4\2\21\22,,\3\2\36\37\3\2\4\5\3\2 !\3\2\"#\4\2!!$$\2"+
		"\u0197\2F\3\2\2\2\4R\3\2\2\2\6e\3\2\2\2\br\3\2\2\2\n\u00a5\3\2\2\2\f\u00a7"+
		"\3\2\2\2\16\u00b3\3\2\2\2\20\u00bf\3\2\2\2\22\u00c1\3\2\2\2\24\u00d6\3"+
		"\2\2\2\26\u00e7\3\2\2\2\30\u00ed\3\2\2\2\32\u010a\3\2\2\2\34\u0115\3\2"+
		"\2\2\36\u0118\3\2\2\2 \u011c\3\2\2\2\"\u011f\3\2\2\2$\u0126\3\2\2\2&\u0128"+
		"\3\2\2\2(\u0130\3\2\2\2*\u0132\3\2\2\2,\u013a\3\2\2\2.\u013c\3\2\2\2\60"+
		"\u0144\3\2\2\2\62\u0146\3\2\2\2\64\u014e\3\2\2\2\66\u0150\3\2\2\28\u0158"+
		"\3\2\2\2:\u015a\3\2\2\2<\u0162\3\2\2\2>\u0167\3\2\2\2@\u0169\3\2\2\2B"+
		"\u0172\3\2\2\2D\u018b\3\2\2\2FM\b\2\1\2GH\5\4\3\2HI\b\2\1\2IL\3\2\2\2"+
		"JL\7+\2\2KG\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2"+
		"OM\3\2\2\2PQ\b\2\1\2Q\3\3\2\2\2RS\7\3\2\2ST\7,\2\2TU\7\4\2\2UV\7(\2\2"+
		"VW\7\5\2\2WX\7+\2\2X^\b\3\1\2Y]\5\6\4\2Z]\5\b\5\2[]\7+\2\2\\Y\3\2\2\2"+
		"\\Z\3\2\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2"+
		"\2\2ab\b\3\1\2bc\7\6\2\2cd\t\2\2\2d\5\3\2\2\2ef\5\n\6\2fg\7,\2\2gm\b\4"+
		"\1\2hi\7\7\2\2ij\7,\2\2jl\b\4\1\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2"+
		"\2\2np\3\2\2\2om\3\2\2\2pq\7+\2\2q\7\3\2\2\2rs\b\5\1\2st\7\b\2\2tu\7,"+
		"\2\2u\u0085\7\t\2\2vw\5\n\6\2wx\b\5\1\2xy\7,\2\2y\u0082\b\5\1\2z{\7\7"+
		"\2\2{|\5\n\6\2|}\b\5\1\2}~\7,\2\2~\177\b\5\1\2\177\u0081\3\2\2\2\u0080"+
		"z\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085v\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\n\2\2\u0088\u0089\7+\2\2\u0089"+
		"\u008a\b\5\1\2\u008a\u008b\5\16\b\2\u008b\u008c\7\6\2\2\u008c\u008d\7"+
		"+\2\2\u008d\u008e\b\5\1\2\u008e\t\3\2\2\2\u008f\u0090\7\13\2\2\u0090\u0097"+
		"\b\6\1\2\u0091\u0092\7\f\2\2\u0092\u0093\7(\2\2\u0093\u0094\7\r\2\2\u0094"+
		"\u0096\b\6\1\2\u0095\u0091\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u00a6\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\7\16\2\2\u009b\u00a2\b\6\1\2\u009c\u009d\7\f\2\2\u009d\u009e\7"+
		"(\2\2\u009e\u009f\7\r\2\2\u009f\u00a1\b\6\1\2\u00a0\u009c\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u008f\3\2\2\2\u00a5\u009a\3\2\2\2\u00a6"+
		"\13\3\2\2\2\u00a7\u00a8\7\17\2\2\u00a8\u00a9\b\7\1\2\u00a9\u00aa\7+\2"+
		"\2\u00aa\u00ab\5\16\b\2\u00ab\u00ac\7\6\2\2\u00ac\u00ad\b\7\1\2\u00ad"+
		"\u00ae\7+\2\2\u00ae\r\3\2\2\2\u00af\u00b2\5\20\t\2\u00b0\u00b2\7+\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\17\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00c0\5\22\n\2\u00b7\u00c0\5 \21\2\u00b8\u00c0\5\32\16\2\u00b9\u00c0"+
		"\5\30\r\2\u00ba\u00c0\5\34\17\2\u00bb\u00c0\5\36\20\2\u00bc\u00c0\5\24"+
		"\13\2\u00bd\u00c0\5\26\f\2\u00be\u00c0\5\f\7\2\u00bf\u00b6\3\2\2\2\u00bf"+
		"\u00b7\3\2\2\2\u00bf\u00b8\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00ba\3\2"+
		"\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\21\3\2\2\2\u00c1\u00c2\5\n\6\2\u00c2\u00c3\7,\2\2"+
		"\u00c3\u00c6\b\n\1\2\u00c4\u00c5\7\20\2\2\u00c5\u00c7\5\"\22\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00d1\3\2\2\2\u00c8\u00c9\7\7\2\2\u00c9"+
		"\u00ca\7,\2\2\u00ca\u00cd\b\n\1\2\u00cb\u00cc\7\20\2\2\u00cc\u00ce\5\""+
		"\22\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00c8\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7+\2\2\u00d5"+
		"\23\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9\7,\2"+
		"\2\u00d9\u00e2\7\t\2\2\u00da\u00df\5\"\22\2\u00db\u00dc\7\7\2\2\u00dc"+
		"\u00de\5\"\22\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00da\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\n"+
		"\2\2\u00e5\u00e6\7+\2\2\u00e6\25\3\2\2\2\u00e7\u00e8\7\24\2\2\u00e8\u00e9"+
		"\7\t\2\2\u00e9\u00ea\5\"\22\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\7+\2\2\u00ec"+
		"\27\3\2\2\2\u00ed\u00ee\7\25\2\2\u00ee\u00ef\b\r\1\2\u00ef\u00f0\5\"\22"+
		"\2\u00f0\u00f1\7+\2\2\u00f1\u00f2\5\16\b\2\u00f2\u00fc\b\r\1\2\u00f3\u00f4"+
		"\7\26\2\2\u00f4\u00f5\b\r\1\2\u00f5\u00f6\5\"\22\2\u00f6\u00f7\7+\2\2"+
		"\u00f7\u00f8\5\16\b\2\u00f8\u00f9\b\r\1\2\u00f9\u00fb\3\2\2\2\u00fa\u00f3"+
		"\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u0105\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\27\2\2\u0100\u0101\b"+
		"\r\1\2\u0101\u0102\7+\2\2\u0102\u0103\5\16\b\2\u0103\u0104\b\r\1\2\u0104"+
		"\u0106\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0108\7\6\2\2\u0108\u0109\7+\2\2\u0109\31\3\2\2\2\u010a\u010b"+
		"\7\30\2\2\u010b\u010c\b\16\1\2\u010c\u010d\7,\2\2\u010d\u010e\7\31\2\2"+
		"\u010e\u010f\5\"\22\2\u010f\u0110\7+\2\2\u0110\u0111\5\16\b\2\u0111\u0112"+
		"\7\6\2\2\u0112\u0113\b\16\1\2\u0113\u0114\7+\2\2\u0114\33\3\2\2\2\u0115"+
		"\u0116\7\32\2\2\u0116\u0117\7+\2\2\u0117\35\3\2\2\2\u0118\u0119\7\33\2"+
		"\2\u0119\u011a\7+\2\2\u011a\u011b\b\20\1\2\u011b\37\3\2\2\2\u011c\u011d"+
		"\5\"\22\2\u011d\u011e\7+\2\2\u011e!\3\2\2\2\u011f\u0120\5$\23\2\u0120"+
		"#\3\2\2\2\u0121\u0122\5&\24\2\u0122\u0123\7\20\2\2\u0123\u0124\5$\23\2"+
		"\u0124\u0127\3\2\2\2\u0125\u0127\5&\24\2\u0126\u0121\3\2\2\2\u0126\u0125"+
		"\3\2\2\2\u0127%\3\2\2\2\u0128\u0129\5*\26\2\u0129\u012a\5(\25\2\u012a"+
		"\'\3\2\2\2\u012b\u012c\7\34\2\2\u012c\u012d\5*\26\2\u012d\u012e\5(\25"+
		"\2\u012e\u0131\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012f"+
		"\3\2\2\2\u0131)\3\2\2\2\u0132\u0133\5.\30\2\u0133\u0134\5,\27\2\u0134"+
		"+\3\2\2\2\u0135\u0136\7\35\2\2\u0136\u0137\5.\30\2\u0137\u0138\5,\27\2"+
		"\u0138\u013b\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0135\3\2\2\2\u013a\u0139"+
		"\3\2\2\2\u013b-\3\2\2\2\u013c\u013d\5\62\32\2\u013d\u013e\5\60\31\2\u013e"+
		"/\3\2\2\2\u013f\u0140\t\4\2\2\u0140\u0141\5\62\32\2\u0141\u0142\5\60\31"+
		"\2\u0142\u0145\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u013f\3\2\2\2\u0144\u0143"+
		"\3\2\2\2\u0145\61\3\2\2\2\u0146\u0147\5\66\34\2\u0147\u0148\5\64\33\2"+
		"\u0148\63\3\2\2\2\u0149\u014a\t\5\2\2\u014a\u014b\5\66\34\2\u014b\u014c"+
		"\5\64\33\2\u014c\u014f\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0149\3\2\2\2"+
		"\u014e\u014d\3\2\2\2\u014f\65\3\2\2\2\u0150\u0151\5:\36\2\u0151\u0152"+
		"\58\35\2\u0152\67\3\2\2\2\u0153\u0154\t\6\2\2\u0154\u0155\5:\36\2\u0155"+
		"\u0156\58\35\2\u0156\u0159\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0153\3\2"+
		"\2\2\u0158\u0157\3\2\2\2\u01599\3\2\2\2\u015a\u015b\5> \2\u015b\u015c"+
		"\5<\37\2\u015c;\3\2\2\2\u015d\u015e\t\7\2\2\u015e\u015f\5> \2\u015f\u0160"+
		"\5<\37\2\u0160\u0163\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u015d\3\2\2\2\u0162"+
		"\u0161\3\2\2\2\u0163=\3\2\2\2\u0164\u0165\t\b\2\2\u0165\u0168\5> \2\u0166"+
		"\u0168\5@!\2\u0167\u0164\3\2\2\2\u0167\u0166\3\2\2\2\u0168?\3\2\2\2\u0169"+
		"\u016a\5D#\2\u016a\u016b\5B\"\2\u016bA\3\2\2\2\u016c\u016d\7\f\2\2\u016d"+
		"\u016e\5\"\22\2\u016e\u016f\7\r\2\2\u016f\u0170\5B\"\2\u0170\u0173\3\2"+
		"\2\2\u0171\u0173\3\2\2\2\u0172\u016c\3\2\2\2\u0172\u0171\3\2\2\2\u0173"+
		"C\3\2\2\2\u0174\u018c\7(\2\2\u0175\u018c\7)\2\2\u0176\u018c\7*\2\2\u0177"+
		"\u018c\7,\2\2\u0178\u0179\7%\2\2\u0179\u017e\5\"\22\2\u017a\u017b\7\7"+
		"\2\2\u017b\u017d\5\"\22\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0181\u0182\7&\2\2\u0182\u018c\3\2\2\2\u0183\u0184\7\'\2\2\u0184"+
		"\u0185\7\t\2\2\u0185\u0186\7(\2\2\u0186\u018c\7\n\2\2\u0187\u0188\7\t"+
		"\2\2\u0188\u0189\5\"\22\2\u0189\u018a\7\n\2\2\u018a\u018c\3\2\2\2\u018b"+
		"\u0174\3\2\2\2\u018b\u0175\3\2\2\2\u018b\u0176\3\2\2\2\u018b\u0177\3\2"+
		"\2\2\u018b\u0178\3\2\2\2\u018b\u0183\3\2\2\2\u018b\u0187\3\2\2\2\u018c"+
		"E\3\2\2\2!KM\\^m\u0082\u0085\u0097\u00a2\u00a5\u00b1\u00b3\u00bf\u00c6"+
		"\u00cd\u00d1\u00df\u00e2\u00fc\u0105\u0126\u0130\u013a\u0144\u014e\u0158"+
		"\u0162\u0167\u0172\u017e\u018b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}