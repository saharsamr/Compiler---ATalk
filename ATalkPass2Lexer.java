// Generated from ATalkPass2.g4 by ANTLR 4.7

      import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ATalkPass2Lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "CONST_NUM", "CONST_CHAR", "CONST_STR", 
		"NL", "ID", "COMMENT", "WS"
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

	  Type assignExprType(Type tp1, Type tp2, String msg, int line) {
	    try {
	      return checkCombinedArithExprTypes(tp1, tp2);
	    } catch(ArithmaticsOperandsException ex) {
	      printErrors(line, msg);
	      return new NoType();
	    }
	  }

	  Type checkEqualityExprType_tmp(Type tp1, Type tp2, int line) {
	    if(tp1.equals(tp2) || tp2.equals(new NoType()))
	      return tp1;
	    else{
	      printErrors(line, "Incompatible types for checking equality.");
	      return new NoType();
	    }
	  }

	  Type checkEqualityExprType(Type tp1, Type tp2, int line) {
	    if(tp1.equals(tp2))
	      return new IntType();
	    else if(tp2.equals(new NoType()))//NOTE: notype & notype is not handled?
	      return tp1;
	    else{
	      printErrors(line, "Incompatible types for checking equality.");
	      return new NoType();
	    }
	  }

	  Type assignAssignmentExprType(Type tp1, Type tp2, int line) {
	    if(tp1.equals(tp2))
	      return tp1;
	    else{
	      printErrors(line, "Invalid assignment.");
	      return new NoType();
	    }
	  }

	  void checkIterationExpr(String id, int line, Type tp){
	    try{
	    Type t = getIDFromSymTable(id, line);
	    tp = tp.dimensionAccess(1);
	    if(!t.equals(new NoType()))
	      printErrors(line, "variable <" + id + "> already declared in this scope.");
	    }catch(UndefinedDemensionsException ex){
	      printErrors(line, "Undefined demensions.");
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


	public ATalkPass2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ATalkPass2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 40:
			NL_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 setText("new_line"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0118\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3%"+
		"\3%\3&\3&\3&\3&\3&\3\'\5\'\u00eb\n\'\3\'\6\'\u00ee\n\'\r\'\16\'\u00ef"+
		"\3(\3(\3(\3(\3)\3)\7)\u00f8\n)\f)\16)\u00fb\13)\3)\3)\3*\5*\u0100\n*\3"+
		"*\3*\3*\3+\3+\7+\u0107\n+\f+\16+\u010a\13+\3,\3,\7,\u010e\n,\f,\16,\u0111"+
		"\13,\3,\3,\3-\3-\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\b\3\2\62"+
		";\5\2\f\f\17\17$$\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\""+
		"\"\2\u011d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5a\3\2\2\2\7c\3\2"+
		"\2\2\te\3\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23x\3\2"+
		"\2\2\25|\3\2\2\2\27\u0081\3\2\2\2\31\u0083\3\2\2\2\33\u0085\3\2\2\2\35"+
		"\u008b\3\2\2\2\37\u008d\3\2\2\2!\u0094\3\2\2\2#\u0099\3\2\2\2%\u009c\3"+
		"\2\2\2\'\u00a2\3\2\2\2)\u00a5\3\2\2\2+\u00ac\3\2\2\2-\u00b1\3\2\2\2/\u00b9"+
		"\3\2\2\2\61\u00bc\3\2\2\2\63\u00c1\3\2\2\2\65\u00c7\3\2\2\2\67\u00ca\3"+
		"\2\2\29\u00ce\3\2\2\2;\u00d1\3\2\2\2=\u00d4\3\2\2\2?\u00d6\3\2\2\2A\u00d8"+
		"\3\2\2\2C\u00da\3\2\2\2E\u00dc\3\2\2\2G\u00e0\3\2\2\2I\u00e2\3\2\2\2K"+
		"\u00e4\3\2\2\2M\u00ea\3\2\2\2O\u00f1\3\2\2\2Q\u00f5\3\2\2\2S\u00ff\3\2"+
		"\2\2U\u0104\3\2\2\2W\u010b\3\2\2\2Y\u0114\3\2\2\2[\\\7c\2\2\\]\7e\2\2"+
		"]^\7v\2\2^_\7q\2\2_`\7t\2\2`\4\3\2\2\2ab\7>\2\2b\6\3\2\2\2cd\7@\2\2d\b"+
		"\3\2\2\2ef\7g\2\2fg\7p\2\2gh\7f\2\2h\n\3\2\2\2ij\7.\2\2j\f\3\2\2\2kl\7"+
		"t\2\2lm\7g\2\2mn\7e\2\2no\7g\2\2op\7k\2\2pq\7x\2\2qr\7g\2\2rs\7t\2\2s"+
		"\16\3\2\2\2tu\7*\2\2u\20\3\2\2\2vw\7+\2\2w\22\3\2\2\2xy\7k\2\2yz\7p\2"+
		"\2z{\7v\2\2{\24\3\2\2\2|}\7e\2\2}~\7j\2\2~\177\7c\2\2\177\u0080\7t\2\2"+
		"\u0080\26\3\2\2\2\u0081\u0082\7]\2\2\u0082\30\3\2\2\2\u0083\u0084\7_\2"+
		"\2\u0084\32\3\2\2\2\u0085\u0086\7d\2\2\u0086\u0087\7g\2\2\u0087\u0088"+
		"\7i\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a\34\3\2\2\2\u008b\u008c"+
		"\7?\2\2\u008c\36\3\2\2\2\u008d\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f\u0090"+
		"\7p\2\2\u0090\u0091\7f\2\2\u0091\u0092\7g\2\2\u0092\u0093\7t\2\2\u0093"+
		" \3\2\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\u0097\7n\2\2\u0097"+
		"\u0098\7h\2\2\u0098\"\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7>\2\2\u009b"+
		"$\3\2\2\2\u009c\u009d\7y\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\u00a1\7g\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7h\2\2\u00a4(\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7h\2\2"+
		"\u00ab*\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7u\2"+
		"\2\u00af\u00b0\7g\2\2\u00b0,\3\2\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7"+
		"q\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7"+
		"\7e\2\2\u00b7\u00b8\7j\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb"+
		"\7p\2\2\u00bb\60\3\2\2\2\u00bc\u00bd\7s\2\2\u00bd\u00be\7w\2\2\u00be\u00bf"+
		"\7k\2\2\u00bf\u00c0\7v\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3"+
		"\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7m\2\2\u00c6"+
		"\64\3\2\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7t\2\2\u00c9\66\3\2\2\2\u00ca"+
		"\u00cb\7c\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7f\2\2\u00cd8\3\2\2\2\u00ce"+
		"\u00cf\7?\2\2\u00cf\u00d0\7?\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2"+
		"\u00d3\7@\2\2\u00d3<\3\2\2\2\u00d4\u00d5\7-\2\2\u00d5>\3\2\2\2\u00d6\u00d7"+
		"\7/\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7,\2\2\u00d9B\3\2\2\2\u00da\u00db\7"+
		"\61\2\2\u00dbD\3\2\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7q\2\2\u00de\u00df"+
		"\7v\2\2\u00dfF\3\2\2\2\u00e0\u00e1\7}\2\2\u00e1H\3\2\2\2\u00e2\u00e3\7"+
		"\177\2\2\u00e3J\3\2\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7"+
		"\7c\2\2\u00e7\u00e8\7f\2\2\u00e8L\3\2\2\2\u00e9\u00eb\7/\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ee\t\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0N\3\2\2\2\u00f1\u00f2\7)\2\2\u00f2\u00f3\13\2\2\2\u00f3\u00f4"+
		"\7)\2\2\u00f4P\3\2\2\2\u00f5\u00f9\7$\2\2\u00f6\u00f8\n\3\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7$\2\2\u00fdR\3\2\2\2\u00fe"+
		"\u0100\7\17\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3"+
		"\2\2\2\u0101\u0102\7\f\2\2\u0102\u0103\b*\2\2\u0103T\3\2\2\2\u0104\u0108"+
		"\t\4\2\2\u0105\u0107\t\5\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109V\3\2\2\2\u010a\u0108\3\2\2\2"+
		"\u010b\u010f\7%\2\2\u010c\u010e\n\6\2\2\u010d\u010c\3\2\2\2\u010e\u0111"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0113\b,\3\2\u0113X\3\2\2\2\u0114\u0115\t\7\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\b-\3\2\u0117Z\3\2\2\2\t\2\u00ea\u00ef\u00f9"+
		"\u00ff\u0108\u010f\4\3*\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}