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


	  int checkDimLenValidationInArray(int size){
	    if(size <= 0){
	      printErrors(size,"size of array is negative");
	      size = 0;
	    }
	    return size;
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << NL))) != 0)) {
				{
				setState(90);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
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
			if (_la==T__8 || _la==T__9) {
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
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<Integer> dims = new ArrayList<Integer>();
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				{
				setState(142);
				match(T__8);
				}
				((TypeContext)_localctx).t =  new IntType();
				}
				break;
			case T__9:
				{
				{
				setState(144);
				match(T__9);
				}
				((TypeContext)_localctx).t =  new CharacterType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(148);
				match(T__10);
				setState(149);
				((TypeContext)_localctx).size = match(CONST_NUM);
				setState(150);
				match(T__11);

				      dims.add(checkDimLenValidationInArray((((TypeContext)_localctx).size!=null?Integer.valueOf(((TypeContext)_localctx).size.getText()):0)));
				}
				}
				setState(156);
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
			setState(159);
			match(T__12);
			beginScope();
			setState(161);
			match(NL);
			setState(162);
			statements();
			setState(163);
			match(T__3);
			endScope();
			setState(165);
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
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << NL) | (1L << ID))) != 0)) {
				{
				setState(169);
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
					setState(167);
					statement();
					}
					break;
				case NL:
					{
					setState(168);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(173);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				stm_vardef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				stm_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				stm_foreach();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				stm_if_elseif_else();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				stm_quit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				stm_break();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(180);
				stm_tell();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				stm_write();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(182);
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
			setState(185);
			((Stm_vardefContext)_localctx).tp = type();
			setState(186);
			((Stm_vardefContext)_localctx).name = match(ID);

			      addVarItem((((Stm_vardefContext)_localctx).name!=null?((Stm_vardefContext)_localctx).name.getText():null), ((Stm_vardefContext)_localctx).tp.t, (((Stm_vardefContext)_localctx).name!=null?((Stm_vardefContext)_localctx).name.getLine():0), Register.SP);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(188);
				match(T__13);
				setState(189);
				expr();
				}
			}

			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(192);
				match(T__4);
				setState(193);
				((Stm_vardefContext)_localctx).name = match(ID);

				      addVarItem((((Stm_vardefContext)_localctx).name!=null?((Stm_vardefContext)_localctx).name.getText():null), ((Stm_vardefContext)_localctx).tp.t, (((Stm_vardefContext)_localctx).name!=null?((Stm_vardefContext)_localctx).name.getLine():0), Register.SP);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(195);
					match(T__13);
					setState(196);
					expr();
					}
				}

				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(207);
			match(T__16);
			setState(208);
			match(ID);
			setState(209);
			match(T__6);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				setState(210);
				expr();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(211);
					match(T__4);
					setState(212);
					expr();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(220);
			match(T__7);
			setState(221);
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
			setState(223);
			match(T__17);
			setState(224);
			match(T__6);
			setState(225);
			expr();
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
			setState(229);
			match(T__18);
			beginScope();
			setState(231);
			expr();
			setState(232);
			match(NL);
			setState(233);
			statements();
			endScope();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(235);
				match(T__19);
				beginScope();
				setState(237);
				expr();
				setState(238);
				match(NL);
				setState(239);
				statements();
				endScope();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(247);
				match(T__20);
				beginScope();
				setState(249);
				match(NL);
				setState(250);
				statements();
				endScope();
				}
			}

			setState(255);
			match(T__3);
			setState(256);
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
			setState(258);
			match(T__21);
			beginScope(); foreachCount++;
			setState(260);
			match(ID);
			setState(261);
			match(T__22);
			setState(262);
			expr();
			setState(263);
			match(NL);
			setState(264);
			statements();
			setState(265);
			match(T__3);
			endScope(); foreachCount--;
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
			setState(272);
			((Stm_breakContext)_localctx).ln = match(T__24);
			setState(273);
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
			setState(276);
			expr();
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
			setState(279);
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
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				expr_or();
				setState(282);
				match(T__13);
				setState(283);
				expr_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
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
			setState(288);
			expr_and();
			setState(289);
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
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(T__25);
				setState(292);
				expr_and();
				setState(293);
				expr_or_tmp();
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
			setState(298);
			expr_eq();
			setState(299);
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
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(T__26);
				setState(302);
				expr_eq();
				setState(303);
				expr_and_tmp();
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
			setState(308);
			expr_cmp();
			setState(309);
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
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
				expr_cmp();
				setState(313);
				expr_eq_tmp();
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
			setState(318);
			expr_add();
			setState(319);
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
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(322);
				expr_add();
				setState(323);
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
			setState(328);
			expr_mult();
			setState(329);
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
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(332);
				expr_mult();
				setState(333);
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
			setState(338);
			expr_un();
			setState(339);
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
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(342);
				expr_un();
				setState(343);
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
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(349);
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
				setState(350);
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
			setState(353);
			expr_other();
			setState(354);
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
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(T__10);
				setState(357);
				expr();
				setState(358);
				match(T__11);
				setState(359);
				expr_mem_tmp();
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
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(CONST_NUM);
				}
				break;
			case CONST_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(CONST_CHAR);
				}
				break;
			case CONST_STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				match(CONST_STR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				match(ID);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				match(T__34);
				setState(369);
				expr();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(370);
					match(T__4);
					setState(371);
					expr();
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(377);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(379);
				match(T__36);
				setState(380);
				match(T__6);
				setState(381);
				match(CONST_NUM);
				setState(382);
				match(T__7);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(383);
				match(T__6);
				setState(384);
				expr();
				setState(385);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0188\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3]\n\3\f\3\16\3`\13\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0081\n\5\f\5"+
		"\16\5\u0084\13\5\5\5\u0086\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0095\n\6\3\6\3\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e"+
		"\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u00ac\n\b\f"+
		"\b\16\b\u00af\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ba\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00c1\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c8\n\n\7\n"+
		"\u00ca\n\n\f\n\16\n\u00cd\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u00d8\n\13\f\13\16\13\u00db\13\13\5\13\u00dd\n\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00f5\n\r\f\r\16\r\u00f8\13\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0100\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0121\n\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u012b\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0135\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u013f\n\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u0149\n\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0153\n\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u015d\n\37\3 \3 \3 \5 \u0162\n \3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u016d\n\"\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0177\n#\f#\16#\u017a"+
		"\13#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0186\n#\3#\2\2$\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\t\3\3++\4\2\21"+
		"\22,,\3\2\36\37\3\2\4\5\3\2 !\3\2\"#\4\2!!$$\2\u0190\2F\3\2\2\2\4R\3\2"+
		"\2\2\6e\3\2\2\2\br\3\2\2\2\n\u008f\3\2\2\2\f\u00a1\3\2\2\2\16\u00ad\3"+
		"\2\2\2\20\u00b9\3\2\2\2\22\u00bb\3\2\2\2\24\u00d0\3\2\2\2\26\u00e1\3\2"+
		"\2\2\30\u00e7\3\2\2\2\32\u0104\3\2\2\2\34\u010f\3\2\2\2\36\u0112\3\2\2"+
		"\2 \u0116\3\2\2\2\"\u0119\3\2\2\2$\u0120\3\2\2\2&\u0122\3\2\2\2(\u012a"+
		"\3\2\2\2*\u012c\3\2\2\2,\u0134\3\2\2\2.\u0136\3\2\2\2\60\u013e\3\2\2\2"+
		"\62\u0140\3\2\2\2\64\u0148\3\2\2\2\66\u014a\3\2\2\28\u0152\3\2\2\2:\u0154"+
		"\3\2\2\2<\u015c\3\2\2\2>\u0161\3\2\2\2@\u0163\3\2\2\2B\u016c\3\2\2\2D"+
		"\u0185\3\2\2\2FM\b\2\1\2GH\5\4\3\2HI\b\2\1\2IL\3\2\2\2JL\7+\2\2KG\3\2"+
		"\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\b\2"+
		"\1\2Q\3\3\2\2\2RS\7\3\2\2ST\7,\2\2TU\7\4\2\2UV\7(\2\2VW\7\5\2\2WX\7+\2"+
		"\2X^\b\3\1\2Y]\5\6\4\2Z]\5\b\5\2[]\7+\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2"+
		"\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\b\3\1\2bc\7"+
		"\6\2\2cd\t\2\2\2d\5\3\2\2\2ef\5\n\6\2fg\7,\2\2gm\b\4\1\2hi\7\7\2\2ij\7"+
		",\2\2jl\b\4\1\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3"+
		"\2\2\2pq\7+\2\2q\7\3\2\2\2rs\b\5\1\2st\7\b\2\2tu\7,\2\2u\u0085\7\t\2\2"+
		"vw\5\n\6\2wx\b\5\1\2xy\7,\2\2y\u0082\b\5\1\2z{\7\7\2\2{|\5\n\6\2|}\b\5"+
		"\1\2}~\7,\2\2~\177\b\5\1\2\177\u0081\3\2\2\2\u0080z\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085v\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u0088\7\n\2\2\u0088\u0089\7+\2\2\u0089\u008a\b\5\1\2\u008a\u008b"+
		"\5\16\b\2\u008b\u008c\7\6\2\2\u008c\u008d\7+\2\2\u008d\u008e\b\5\1\2\u008e"+
		"\t\3\2\2\2\u008f\u0094\b\6\1\2\u0090\u0091\7\13\2\2\u0091\u0095\b\6\1"+
		"\2\u0092\u0093\7\f\2\2\u0093\u0095\b\6\1\2\u0094\u0090\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0095\u009c\3\2\2\2\u0096\u0097\7\r\2\2\u0097\u0098\7(\2\2\u0098"+
		"\u0099\7\16\2\2\u0099\u009b\b\6\1\2\u009a\u0096\3\2\2\2\u009b\u009e\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\b\6\1\2\u00a0\13\3\2\2\2\u00a1\u00a2\7\17\2"+
		"\2\u00a2\u00a3\b\7\1\2\u00a3\u00a4\7+\2\2\u00a4\u00a5\5\16\b\2\u00a5\u00a6"+
		"\7\6\2\2\u00a6\u00a7\b\7\1\2\u00a7\u00a8\7+\2\2\u00a8\r\3\2\2\2\u00a9"+
		"\u00ac\5\20\t\2\u00aa\u00ac\7+\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2"+
		"\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\17\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00ba\5\22\n\2\u00b1\u00ba\5 \21"+
		"\2\u00b2\u00ba\5\32\16\2\u00b3\u00ba\5\30\r\2\u00b4\u00ba\5\34\17\2\u00b5"+
		"\u00ba\5\36\20\2\u00b6\u00ba\5\24\13\2\u00b7\u00ba\5\26\f\2\u00b8\u00ba"+
		"\5\f\7\2\u00b9\u00b0\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b2\3\2\2\2\u00b9"+
		"\u00b3\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\21\3\2\2\2\u00bb\u00bc"+
		"\5\n\6\2\u00bc\u00bd\7,\2\2\u00bd\u00c0\b\n\1\2\u00be\u00bf\7\20\2\2\u00bf"+
		"\u00c1\5\"\22\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00cb\3"+
		"\2\2\2\u00c2\u00c3\7\7\2\2\u00c3\u00c4\7,\2\2\u00c4\u00c7\b\n\1\2\u00c5"+
		"\u00c6\7\20\2\2\u00c6\u00c8\5\"\22\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3"+
		"\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c2\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\7+\2\2\u00cf\23\3\2\2\2\u00d0\u00d1\t\3\2\2\u00d1\u00d2"+
		"\7\23\2\2\u00d2\u00d3\7,\2\2\u00d3\u00dc\7\t\2\2\u00d4\u00d9\5\"\22\2"+
		"\u00d5\u00d6\7\7\2\2\u00d6\u00d8\5\"\22\2\u00d7\u00d5\3\2\2\2\u00d8\u00db"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00df\7\n\2\2\u00df\u00e0\7+\2\2\u00e0\25\3\2\2\2\u00e1\u00e2"+
		"\7\24\2\2\u00e2\u00e3\7\t\2\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5\7\n\2\2"+
		"\u00e5\u00e6\7+\2\2\u00e6\27\3\2\2\2\u00e7\u00e8\7\25\2\2\u00e8\u00e9"+
		"\b\r\1\2\u00e9\u00ea\5\"\22\2\u00ea\u00eb\7+\2\2\u00eb\u00ec\5\16\b\2"+
		"\u00ec\u00f6\b\r\1\2\u00ed\u00ee\7\26\2\2\u00ee\u00ef\b\r\1\2\u00ef\u00f0"+
		"\5\"\22\2\u00f0\u00f1\7+\2\2\u00f1\u00f2\5\16\b\2\u00f2\u00f3\b\r\1\2"+
		"\u00f3\u00f5\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00ff\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fa\7\27\2\2\u00fa\u00fb\b\r\1\2\u00fb\u00fc\7+\2\2\u00fc\u00fd\5\16"+
		"\b\2\u00fd\u00fe\b\r\1\2\u00fe\u0100\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\6\2\2\u0102\u0103\7+"+
		"\2\2\u0103\31\3\2\2\2\u0104\u0105\7\30\2\2\u0105\u0106\b\16\1\2\u0106"+
		"\u0107\7,\2\2\u0107\u0108\7\31\2\2\u0108\u0109\5\"\22\2\u0109\u010a\7"+
		"+\2\2\u010a\u010b\5\16\b\2\u010b\u010c\7\6\2\2\u010c\u010d\b\16\1\2\u010d"+
		"\u010e\7+\2\2\u010e\33\3\2\2\2\u010f\u0110\7\32\2\2\u0110\u0111\7+\2\2"+
		"\u0111\35\3\2\2\2\u0112\u0113\7\33\2\2\u0113\u0114\7+\2\2\u0114\u0115"+
		"\b\20\1\2\u0115\37\3\2\2\2\u0116\u0117\5\"\22\2\u0117\u0118\7+\2\2\u0118"+
		"!\3\2\2\2\u0119\u011a\5$\23\2\u011a#\3\2\2\2\u011b\u011c\5&\24\2\u011c"+
		"\u011d\7\20\2\2\u011d\u011e\5$\23\2\u011e\u0121\3\2\2\2\u011f\u0121\5"+
		"&\24\2\u0120\u011b\3\2\2\2\u0120\u011f\3\2\2\2\u0121%\3\2\2\2\u0122\u0123"+
		"\5*\26\2\u0123\u0124\5(\25\2\u0124\'\3\2\2\2\u0125\u0126\7\34\2\2\u0126"+
		"\u0127\5*\26\2\u0127\u0128\5(\25\2\u0128\u012b\3\2\2\2\u0129\u012b\3\2"+
		"\2\2\u012a\u0125\3\2\2\2\u012a\u0129\3\2\2\2\u012b)\3\2\2\2\u012c\u012d"+
		"\5.\30\2\u012d\u012e\5,\27\2\u012e+\3\2\2\2\u012f\u0130\7\35\2\2\u0130"+
		"\u0131\5.\30\2\u0131\u0132\5,\27\2\u0132\u0135\3\2\2\2\u0133\u0135\3\2"+
		"\2\2\u0134\u012f\3\2\2\2\u0134\u0133\3\2\2\2\u0135-\3\2\2\2\u0136\u0137"+
		"\5\62\32\2\u0137\u0138\5\60\31\2\u0138/\3\2\2\2\u0139\u013a\t\4\2\2\u013a"+
		"\u013b\5\62\32\2\u013b\u013c\5\60\31\2\u013c\u013f\3\2\2\2\u013d\u013f"+
		"\3\2\2\2\u013e\u0139\3\2\2\2\u013e\u013d\3\2\2\2\u013f\61\3\2\2\2\u0140"+
		"\u0141\5\66\34\2\u0141\u0142\5\64\33\2\u0142\63\3\2\2\2\u0143\u0144\t"+
		"\5\2\2\u0144\u0145\5\66\34\2\u0145\u0146\5\64\33\2\u0146\u0149\3\2\2\2"+
		"\u0147\u0149\3\2\2\2\u0148\u0143\3\2\2\2\u0148\u0147\3\2\2\2\u0149\65"+
		"\3\2\2\2\u014a\u014b\5:\36\2\u014b\u014c\58\35\2\u014c\67\3\2\2\2\u014d"+
		"\u014e\t\6\2\2\u014e\u014f\5:\36\2\u014f\u0150\58\35\2\u0150\u0153\3\2"+
		"\2\2\u0151\u0153\3\2\2\2\u0152\u014d\3\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"9\3\2\2\2\u0154\u0155\5> \2\u0155\u0156\5<\37\2\u0156;\3\2\2\2\u0157\u0158"+
		"\t\7\2\2\u0158\u0159\5> \2\u0159\u015a\5<\37\2\u015a\u015d\3\2\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u0157\3\2\2\2\u015c\u015b\3\2\2\2\u015d=\3\2\2\2"+
		"\u015e\u015f\t\b\2\2\u015f\u0162\5> \2\u0160\u0162\5@!\2\u0161\u015e\3"+
		"\2\2\2\u0161\u0160\3\2\2\2\u0162?\3\2\2\2\u0163\u0164\5D#\2\u0164\u0165"+
		"\5B\"\2\u0165A\3\2\2\2\u0166\u0167\7\r\2\2\u0167\u0168\5\"\22\2\u0168"+
		"\u0169\7\16\2\2\u0169\u016a\5B\"\2\u016a\u016d\3\2\2\2\u016b\u016d\3\2"+
		"\2\2\u016c\u0166\3\2\2\2\u016c\u016b\3\2\2\2\u016dC\3\2\2\2\u016e\u0186"+
		"\7(\2\2\u016f\u0186\7)\2\2\u0170\u0186\7*\2\2\u0171\u0186\7,\2\2\u0172"+
		"\u0173\7%\2\2\u0173\u0178\5\"\22\2\u0174\u0175\7\7\2\2\u0175\u0177\5\""+
		"\22\2\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7&"+
		"\2\2\u017c\u0186\3\2\2\2\u017d\u017e\7\'\2\2\u017e\u017f\7\t\2\2\u017f"+
		"\u0180\7(\2\2\u0180\u0186\7\n\2\2\u0181\u0182\7\t\2\2\u0182\u0183\5\""+
		"\22\2\u0183\u0184\7\n\2\2\u0184\u0186\3\2\2\2\u0185\u016e\3\2\2\2\u0185"+
		"\u016f\3\2\2\2\u0185\u0170\3\2\2\2\u0185\u0171\3\2\2\2\u0185\u0172\3\2"+
		"\2\2\u0185\u017d\3\2\2\2\u0185\u0181\3\2\2\2\u0186E\3\2\2\2 KM\\^m\u0082"+
		"\u0085\u0094\u009c\u00ab\u00ad\u00b9\u00c0\u00c7\u00cb\u00d9\u00dc\u00f6"+
		"\u00ff\u0120\u012a\u0134\u013e\u0148\u0152\u015c\u0161\u016c\u0178\u0185";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}