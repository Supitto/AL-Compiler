// Generated from LinguagemAlgoritimica.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguagemAlgoritimicaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ALGORITIMO=15, FIM_ALGORITIMO=16, 
		CONSTANTE=17, DECLARE=18, TIPO=19, DOIS_PONTOS=20, IGUAL_ASSIMILACAO=21, 
		VIRGULA=22, CIRCUNFLEXO=23, PONTO=24, ABRE_COLCHETE=25, FECHA_COLCHETE=26, 
		REGISTRO=27, FIM_REGISTRO=28, PROCEDIMENTO=29, ABRE_PARENTESES=30, FECHA_PARENTESES=31, 
		FIM_FUNCAO=32, LEIA=33, ESCREVA=34, SE=35, FIM_SE=36, ENTAO=37, CASO=38, 
		FIM_CASO=39, PARA=40, SEJA=41, FIM_PARA=42, FACA=43, ATE=44, ENQUANTO=45, 
		FIM_ENQUANTO=46, RETORNE=47, SENAO=48, MENOS=49, MAIS=50, VEZES=51, DIVIDIR=52, 
		VAR=53, BOOLEANO=54, LITERAL=55, INTEIRO=56, REAL=57, LOGICO=58, NUM_REAL=59, 
		NUM_INT=60, CADEIA=61, ID=62, COMENTARIO=63, WS=64;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "ALGORITIMO", "FIM_ALGORITIMO", 
		"CONSTANTE", "DECLARE", "TIPO", "DOIS_PONTOS", "IGUAL_ASSIMILACAO", "VIRGULA", 
		"CIRCUNFLEXO", "PONTO", "ABRE_COLCHETE", "FECHA_COLCHETE", "REGISTRO", 
		"FIM_REGISTRO", "PROCEDIMENTO", "ABRE_PARENTESES", "FECHA_PARENTESES", 
		"FIM_FUNCAO", "LEIA", "ESCREVA", "SE", "FIM_SE", "ENTAO", "CASO", "FIM_CASO", 
		"PARA", "SEJA", "FIM_PARA", "FACA", "ATE", "ENQUANTO", "FIM_ENQUANTO", 
		"RETORNE", "SENAO", "MENOS", "MAIS", "VEZES", "DIVIDIR", "VAR", "BOOLEANO", 
		"LITERAL", "INTEIRO", "REAL", "LOGICO", "NUM_REAL", "NUM_INT", "CADEIA", 
		"ID", "COMENTARIO", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<-'", "'..'", "'&'", "'%'", "'<>'", "'>='", "'<='", "'>'", "'<'", 
		"'nao'", "'ou'", "'e'", "'verdadeiro'", "'falso'", "'algoritmo'", "'fim_algoritimo'", 
		"'constante'", "'declare'", "'tipo'", "':'", "'='", "','", "'^'", "'.'", 
		"'['", "']'", "'registro'", "'fim_registro'", "'procedimento'", "'('", 
		"')'", "'fim_funcao'", "'leia'", "'escreva'", "'se'", "'fim_se'", "'entao'", 
		"'caso'", "'fim_caso'", "'para'", "'seja'", "'fim_para'", "'faca'", "'ate'", 
		"'enquanto'", "'fim_enquanto'", "'retorne'", "'senao'", "'-'", "'+'", 
		"'*'", "'/'", "'var'", null, "'literal'", "'inteiro'", "'real'", "'logico'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ALGORITIMO", "FIM_ALGORITIMO", "CONSTANTE", "DECLARE", 
		"TIPO", "DOIS_PONTOS", "IGUAL_ASSIMILACAO", "VIRGULA", "CIRCUNFLEXO", 
		"PONTO", "ABRE_COLCHETE", "FECHA_COLCHETE", "REGISTRO", "FIM_REGISTRO", 
		"PROCEDIMENTO", "ABRE_PARENTESES", "FECHA_PARENTESES", "FIM_FUNCAO", "LEIA", 
		"ESCREVA", "SE", "FIM_SE", "ENTAO", "CASO", "FIM_CASO", "PARA", "SEJA", 
		"FIM_PARA", "FACA", "ATE", "ENQUANTO", "FIM_ENQUANTO", "RETORNE", "SENAO", 
		"MENOS", "MAIS", "VEZES", "DIVIDIR", "VAR", "BOOLEANO", "LITERAL", "INTEIRO", 
		"REAL", "LOGICO", "NUM_REAL", "NUM_INT", "CADEIA", "ID", "COMENTARIO", 
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


	public LinguagemAlgoritimicaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LinguagemAlgoritimica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2B\u01f2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u01ab\n\67\38\38\38\38\38\38\38\38\39\39\39\39\39\39\3"+
		"9\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\6<\u01ca\n<\r<\16<\u01cb\3"+
		"<\3<\6<\u01d0\n<\r<\16<\u01d1\3=\6=\u01d5\n=\r=\16=\u01d6\3>\3>\7>\u01db"+
		"\n>\f>\16>\u01de\13>\3>\3>\3?\3?\7?\u01e4\n?\f?\16?\u01e7\13?\3@\3@\3"+
		"@\3@\3@\3@\3A\3A\3A\3A\2\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\3\2\7\5\2\f\f\17"+
		"\17$$\5\2C\\aac|\6\2\62;C\\aac|\3\2\177\177\5\2\13\f\17\17\"\"\u01f7\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u0086"+
		"\3\2\2\2\7\u0089\3\2\2\2\t\u008b\3\2\2\2\13\u008d\3\2\2\2\r\u0090\3\2"+
		"\2\2\17\u0093\3\2\2\2\21\u0096\3\2\2\2\23\u0098\3\2\2\2\25\u009a\3\2\2"+
		"\2\27\u009e\3\2\2\2\31\u00a1\3\2\2\2\33\u00a3\3\2\2\2\35\u00ae\3\2\2\2"+
		"\37\u00b4\3\2\2\2!\u00be\3\2\2\2#\u00cd\3\2\2\2%\u00d7\3\2\2\2\'\u00df"+
		"\3\2\2\2)\u00e4\3\2\2\2+\u00e6\3\2\2\2-\u00e8\3\2\2\2/\u00ea\3\2\2\2\61"+
		"\u00ec\3\2\2\2\63\u00ee\3\2\2\2\65\u00f0\3\2\2\2\67\u00f2\3\2\2\29\u00fb"+
		"\3\2\2\2;\u0108\3\2\2\2=\u0115\3\2\2\2?\u0117\3\2\2\2A\u0119\3\2\2\2C"+
		"\u0124\3\2\2\2E\u0129\3\2\2\2G\u0131\3\2\2\2I\u0134\3\2\2\2K\u013b\3\2"+
		"\2\2M\u0141\3\2\2\2O\u0146\3\2\2\2Q\u014f\3\2\2\2S\u0154\3\2\2\2U\u0159"+
		"\3\2\2\2W\u0162\3\2\2\2Y\u0167\3\2\2\2[\u016b\3\2\2\2]\u0174\3\2\2\2_"+
		"\u0181\3\2\2\2a\u0189\3\2\2\2c\u018f\3\2\2\2e\u0191\3\2\2\2g\u0193\3\2"+
		"\2\2i\u0195\3\2\2\2k\u0197\3\2\2\2m\u01aa\3\2\2\2o\u01ac\3\2\2\2q\u01b4"+
		"\3\2\2\2s\u01bc\3\2\2\2u\u01c1\3\2\2\2w\u01c9\3\2\2\2y\u01d4\3\2\2\2{"+
		"\u01d8\3\2\2\2}\u01e1\3\2\2\2\177\u01e8\3\2\2\2\u0081\u01ee\3\2\2\2\u0083"+
		"\u0084\7>\2\2\u0084\u0085\7/\2\2\u0085\4\3\2\2\2\u0086\u0087\7\60\2\2"+
		"\u0087\u0088\7\60\2\2\u0088\6\3\2\2\2\u0089\u008a\7(\2\2\u008a\b\3\2\2"+
		"\2\u008b\u008c\7\'\2\2\u008c\n\3\2\2\2\u008d\u008e\7>\2\2\u008e\u008f"+
		"\7@\2\2\u008f\f\3\2\2\2\u0090\u0091\7@\2\2\u0091\u0092\7?\2\2\u0092\16"+
		"\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0095\7?\2\2\u0095\20\3\2\2\2\u0096"+
		"\u0097\7@\2\2\u0097\22\3\2\2\2\u0098\u0099\7>\2\2\u0099\24\3\2\2\2\u009a"+
		"\u009b\7p\2\2\u009b\u009c\7c\2\2\u009c\u009d\7q\2\2\u009d\26\3\2\2\2\u009e"+
		"\u009f\7q\2\2\u009f\u00a0\7w\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\32\3\2\2\2\u00a3\u00a4\7x\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7t\2\2\u00a6"+
		"\u00a7\7f\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa\u00ab\7k\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7q\2\2\u00ad\34\3\2"+
		"\2\2\u00ae\u00af\7h\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2"+
		"\7u\2\2\u00b2\u00b3\7q\2\2\u00b3\36\3\2\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6"+
		"\7n\2\2\u00b6\u00b7\7i\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7k\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7o\2\2\u00bc\u00bd\7q\2\2"+
		"\u00bd \3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7o\2"+
		"\2\u00c1\u00c2\7a\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5"+
		"\7i\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7k\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7o\2\2\u00cb\u00cc\7q\2\2"+
		"\u00cc\"\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7p"+
		"\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7g\2\2\u00d6$\3\2\2\2\u00d7\u00d8"+
		"\7f\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7n\2\2\u00db"+
		"\u00dc\7c\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de&\3\2\2\2\u00df"+
		"\u00e0\7v\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7r\2\2\u00e2\u00e3\7q\2\2"+
		"\u00e3(\3\2\2\2\u00e4\u00e5\7<\2\2\u00e5*\3\2\2\2\u00e6\u00e7\7?\2\2\u00e7"+
		",\3\2\2\2\u00e8\u00e9\7.\2\2\u00e9.\3\2\2\2\u00ea\u00eb\7`\2\2\u00eb\60"+
		"\3\2\2\2\u00ec\u00ed\7\60\2\2\u00ed\62\3\2\2\2\u00ee\u00ef\7]\2\2\u00ef"+
		"\64\3\2\2\2\u00f0\u00f1\7_\2\2\u00f1\66\3\2\2\2\u00f2\u00f3\7t\2\2\u00f3"+
		"\u00f4\7g\2\2\u00f4\u00f5\7i\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7u\2\2"+
		"\u00f7\u00f8\7v\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7q\2\2\u00fa8\3\2\2"+
		"\2\u00fb\u00fc\7h\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7o\2\2\u00fe\u00ff"+
		"\7a\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7g\2\2\u0101\u0102\7i\2\2\u0102"+
		"\u0103\7k\2\2\u0103\u0104\7u\2\2\u0104\u0105\7v\2\2\u0105\u0106\7t\2\2"+
		"\u0106\u0107\7q\2\2\u0107:\3\2\2\2\u0108\u0109\7r\2\2\u0109\u010a\7t\2"+
		"\2\u010a\u010b\7q\2\2\u010b\u010c\7e\2\2\u010c\u010d\7g\2\2\u010d\u010e"+
		"\7f\2\2\u010e\u010f\7k\2\2\u010f\u0110\7o\2\2\u0110\u0111\7g\2\2\u0111"+
		"\u0112\7p\2\2\u0112\u0113\7v\2\2\u0113\u0114\7q\2\2\u0114<\3\2\2\2\u0115"+
		"\u0116\7*\2\2\u0116>\3\2\2\2\u0117\u0118\7+\2\2\u0118@\3\2\2\2\u0119\u011a"+
		"\7h\2\2\u011a\u011b\7k\2\2\u011b\u011c\7o\2\2\u011c\u011d\7a\2\2\u011d"+
		"\u011e\7h\2\2\u011e\u011f\7w\2\2\u011f\u0120\7p\2\2\u0120\u0121\7e\2\2"+
		"\u0121\u0122\7c\2\2\u0122\u0123\7q\2\2\u0123B\3\2\2\2\u0124\u0125\7n\2"+
		"\2\u0125\u0126\7g\2\2\u0126\u0127\7k\2\2\u0127\u0128\7c\2\2\u0128D\3\2"+
		"\2\2\u0129\u012a\7g\2\2\u012a\u012b\7u\2\2\u012b\u012c\7e\2\2\u012c\u012d"+
		"\7t\2\2\u012d\u012e\7g\2\2\u012e\u012f\7x\2\2\u012f\u0130\7c\2\2\u0130"+
		"F\3\2\2\2\u0131\u0132\7u\2\2\u0132\u0133\7g\2\2\u0133H\3\2\2\2\u0134\u0135"+
		"\7h\2\2\u0135\u0136\7k\2\2\u0136\u0137\7o\2\2\u0137\u0138\7a\2\2\u0138"+
		"\u0139\7u\2\2\u0139\u013a\7g\2\2\u013aJ\3\2\2\2\u013b\u013c\7g\2\2\u013c"+
		"\u013d\7p\2\2\u013d\u013e\7v\2\2\u013e\u013f\7c\2\2\u013f\u0140\7q\2\2"+
		"\u0140L\3\2\2\2\u0141\u0142\7e\2\2\u0142\u0143\7c\2\2\u0143\u0144\7u\2"+
		"\2\u0144\u0145\7q\2\2\u0145N\3\2\2\2\u0146\u0147\7h\2\2\u0147\u0148\7"+
		"k\2\2\u0148\u0149\7o\2\2\u0149\u014a\7a\2\2\u014a\u014b\7e\2\2\u014b\u014c"+
		"\7c\2\2\u014c\u014d\7u\2\2\u014d\u014e\7q\2\2\u014eP\3\2\2\2\u014f\u0150"+
		"\7r\2\2\u0150\u0151\7c\2\2\u0151\u0152\7t\2\2\u0152\u0153\7c\2\2\u0153"+
		"R\3\2\2\2\u0154\u0155\7u\2\2\u0155\u0156\7g\2\2\u0156\u0157\7l\2\2\u0157"+
		"\u0158\7c\2\2\u0158T\3\2\2\2\u0159\u015a\7h\2\2\u015a\u015b\7k\2\2\u015b"+
		"\u015c\7o\2\2\u015c\u015d\7a\2\2\u015d\u015e\7r\2\2\u015e\u015f\7c\2\2"+
		"\u015f\u0160\7t\2\2\u0160\u0161\7c\2\2\u0161V\3\2\2\2\u0162\u0163\7h\2"+
		"\2\u0163\u0164\7c\2\2\u0164\u0165\7e\2\2\u0165\u0166\7c\2\2\u0166X\3\2"+
		"\2\2\u0167\u0168\7c\2\2\u0168\u0169\7v\2\2\u0169\u016a\7g\2\2\u016aZ\3"+
		"\2\2\2\u016b\u016c\7g\2\2\u016c\u016d\7p\2\2\u016d\u016e\7s\2\2\u016e"+
		"\u016f\7w\2\2\u016f\u0170\7c\2\2\u0170\u0171\7p\2\2\u0171\u0172\7v\2\2"+
		"\u0172\u0173\7q\2\2\u0173\\\3\2\2\2\u0174\u0175\7h\2\2\u0175\u0176\7k"+
		"\2\2\u0176\u0177\7o\2\2\u0177\u0178\7a\2\2\u0178\u0179\7g\2\2\u0179\u017a"+
		"\7p\2\2\u017a\u017b\7s\2\2\u017b\u017c\7w\2\2\u017c\u017d\7c\2\2\u017d"+
		"\u017e\7p\2\2\u017e\u017f\7v\2\2\u017f\u0180\7q\2\2\u0180^\3\2\2\2\u0181"+
		"\u0182\7t\2\2\u0182\u0183\7g\2\2\u0183\u0184\7v\2\2\u0184\u0185\7q\2\2"+
		"\u0185\u0186\7t\2\2\u0186\u0187\7p\2\2\u0187\u0188\7g\2\2\u0188`\3\2\2"+
		"\2\u0189\u018a\7u\2\2\u018a\u018b\7g\2\2\u018b\u018c\7p\2\2\u018c\u018d"+
		"\7c\2\2\u018d\u018e\7q\2\2\u018eb\3\2\2\2\u018f\u0190\7/\2\2\u0190d\3"+
		"\2\2\2\u0191\u0192\7-\2\2\u0192f\3\2\2\2\u0193\u0194\7,\2\2\u0194h\3\2"+
		"\2\2\u0195\u0196\7\61\2\2\u0196j\3\2\2\2\u0197\u0198\7x\2\2\u0198\u0199"+
		"\7c\2\2\u0199\u019a\7t\2\2\u019al\3\2\2\2\u019b\u019c\7x\2\2\u019c\u019d"+
		"\7g\2\2\u019d\u019e\7t\2\2\u019e\u019f\7f\2\2\u019f\u01a0\7c\2\2\u01a0"+
		"\u01a1\7f\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a3\7k\2\2\u01a3\u01a4\7t\2\2"+
		"\u01a4\u01ab\7q\2\2\u01a5\u01a6\7h\2\2\u01a6\u01a7\7c\2\2\u01a7\u01a8"+
		"\7n\2\2\u01a8\u01a9\7u\2\2\u01a9\u01ab\7q\2\2\u01aa\u019b\3\2\2\2\u01aa"+
		"\u01a5\3\2\2\2\u01abn\3\2\2\2\u01ac\u01ad\7n\2\2\u01ad\u01ae\7k\2\2\u01ae"+
		"\u01af\7v\2\2\u01af\u01b0\7g\2\2\u01b0\u01b1\7t\2\2\u01b1\u01b2\7c\2\2"+
		"\u01b2\u01b3\7n\2\2\u01b3p\3\2\2\2\u01b4\u01b5\7k\2\2\u01b5\u01b6\7p\2"+
		"\2\u01b6\u01b7\7v\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7k\2\2\u01b9\u01ba"+
		"\7t\2\2\u01ba\u01bb\7q\2\2\u01bbr\3\2\2\2\u01bc\u01bd\7t\2\2\u01bd\u01be"+
		"\7g\2\2\u01be\u01bf\7c\2\2\u01bf\u01c0\7n\2\2\u01c0t\3\2\2\2\u01c1\u01c2"+
		"\7n\2\2\u01c2\u01c3\7q\2\2\u01c3\u01c4\7i\2\2\u01c4\u01c5\7k\2\2\u01c5"+
		"\u01c6\7e\2\2\u01c6\u01c7\7q\2\2\u01c7v\3\2\2\2\u01c8\u01ca\4\62;\2\u01c9"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\7\60\2\2\u01ce\u01d0\4\62;\2\u01cf"+
		"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2x\3\2\2\2\u01d3\u01d5\4\62;\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6"+
		"\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7z\3\2\2\2\u01d8"+
		"\u01dc\7$\2\2\u01d9\u01db\n\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2"+
		"\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01df\u01e0\7$\2\2\u01e0|\3\2\2\2\u01e1\u01e5\t\3\2\2\u01e2"+
		"\u01e4\t\4\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6~\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9"+
		"\7}\2\2\u01e9\u01ea\n\5\2\2\u01ea\u01eb\7\177\2\2\u01eb\u01ec\3\2\2\2"+
		"\u01ec\u01ed\b@\2\2\u01ed\u0080\3\2\2\2\u01ee\u01ef\t\6\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\u01f1\bA\2\2\u01f1\u0082\3\2\2\2\t\2\u01aa\u01cb\u01d1"+
		"\u01d6\u01dc\u01e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}