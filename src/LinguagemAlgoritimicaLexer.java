// Generated from LinguagemAlgoritimica.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ALGORITMO=15, FIM_ALGORITMO=16, 
		CONSTANTE=17, DECLARE=18, TIPO=19, DOIS_PONTOS=20, IGUAL_ASSIMILACAO=21, 
		VIRGULA=22, CIRCUNFLEXO=23, PONTO=24, ABRE_COLCHETE=25, FECHA_COLCHETE=26, 
		REGISTRO=27, FIM_REGISTRO=28, PROCEDIMENTO=29, FUNCAO=30, ABRE_PARENTESES=31, 
		FECHA_PARENTESES=32, FIM_PROCEDIMENTO=33, FIM_FUNCAO=34, LEIA=35, ESCREVA=36, 
		SE=37, FIM_SE=38, ENTAO=39, CASO=40, FIM_CASO=41, PARA=42, SEJA=43, FIM_PARA=44, 
		FACA=45, ATE=46, ENQUANTO=47, FIM_ENQUANTO=48, RETORNE=49, SENAO=50, MENOS=51, 
		MAIS=52, VEZES=53, DIVIDIR=54, VAR=55, BOOLEANO=56, LITERAL=57, INTEIRO=58, 
		REAL=59, LOGICO=60, NUM_REAL=61, NUM_INT=62, CADEIA=63, ID=64, COMENTARIO=65, 
		WS=66, ERROR=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "ALGORITMO", "FIM_ALGORITMO", 
		"CONSTANTE", "DECLARE", "TIPO", "DOIS_PONTOS", "IGUAL_ASSIMILACAO", "VIRGULA", 
		"CIRCUNFLEXO", "PONTO", "ABRE_COLCHETE", "FECHA_COLCHETE", "REGISTRO", 
		"FIM_REGISTRO", "PROCEDIMENTO", "FUNCAO", "ABRE_PARENTESES", "FECHA_PARENTESES", 
		"FIM_PROCEDIMENTO", "FIM_FUNCAO", "LEIA", "ESCREVA", "SE", "FIM_SE", "ENTAO", 
		"CASO", "FIM_CASO", "PARA", "SEJA", "FIM_PARA", "FACA", "ATE", "ENQUANTO", 
		"FIM_ENQUANTO", "RETORNE", "SENAO", "MENOS", "MAIS", "VEZES", "DIVIDIR", 
		"VAR", "BOOLEANO", "LITERAL", "INTEIRO", "REAL", "LOGICO", "NUM_REAL", 
		"NUM_INT", "CADEIA", "ID", "COMENTARIO", "WS", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<-'", "'..'", "'&'", "'%'", "'<>'", "'>='", "'<='", "'>'", "'<'", 
		"'nao'", "'ou'", "'e'", "'verdadeiro'", "'falso'", "'algoritmo'", "'fim_algoritmo'", 
		"'constante'", "'declare'", "'tipo'", "':'", "'='", "','", "'^'", "'.'", 
		"'['", "']'", "'registro'", "'fim_registro'", "'procedimento'", "'funcao'", 
		"'('", "')'", "'fim_procedimento'", "'fim_funcao'", "'leia'", "'escreva'", 
		"'se'", "'fim_se'", "'entao'", "'caso'", "'fim_caso'", "'para'", "'seja'", 
		"'fim_para'", "'faca'", "'ate'", "'enquanto'", "'fim_enquanto'", "'retorne'", 
		"'senao'", "'-'", "'+'", "'*'", "'/'", "'var'", null, "'literal'", "'inteiro'", 
		"'real'", "'logico'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ALGORITMO", "FIM_ALGORITMO", "CONSTANTE", "DECLARE", 
		"TIPO", "DOIS_PONTOS", "IGUAL_ASSIMILACAO", "VIRGULA", "CIRCUNFLEXO", 
		"PONTO", "ABRE_COLCHETE", "FECHA_COLCHETE", "REGISTRO", "FIM_REGISTRO", 
		"PROCEDIMENTO", "FUNCAO", "ABRE_PARENTESES", "FECHA_PARENTESES", "FIM_PROCEDIMENTO", 
		"FIM_FUNCAO", "LEIA", "ESCREVA", "SE", "FIM_SE", "ENTAO", "CASO", "FIM_CASO", 
		"PARA", "SEJA", "FIM_PARA", "FACA", "ATE", "ENQUANTO", "FIM_ENQUANTO", 
		"RETORNE", "SENAO", "MENOS", "MAIS", "VEZES", "DIVIDIR", "VAR", "BOOLEANO", 
		"LITERAL", "INTEIRO", "REAL", "LOGICO", "NUM_REAL", "NUM_INT", "CADEIA", 
		"ID", "COMENTARIO", "WS", "ERROR"
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
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 66:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 throw new ParseCancellationException("Linha "+getLine()+": "+getText()+" - simbolo nao identificado");
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u0217\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u01c8\n9"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3="+
		"\3=\3=\3=\3=\3=\3>\6>\u01e7\n>\r>\16>\u01e8\3>\3>\6>\u01ed\n>\r>\16>\u01ee"+
		"\3?\6?\u01f2\n?\r?\16?\u01f3\3@\3@\7@\u01f8\n@\f@\16@\u01fb\13@\3@\3@"+
		"\3A\3A\7A\u0201\nA\fA\16A\u0204\13A\3B\3B\7B\u0208\nB\fB\16B\u020b\13"+
		"B\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\2\2E\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\3\2\7\5\2\f\f\17\17$$\5\2C\\aac|\6\2\62;C\\aac|\3\2\177"+
		"\177\5\2\13\f\17\17\"\"\2\u021d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\3\u0089\3\2\2"+
		"\2\5\u008c\3\2\2\2\7\u008f\3\2\2\2\t\u0091\3\2\2\2\13\u0093\3\2\2\2\r"+
		"\u0096\3\2\2\2\17\u0099\3\2\2\2\21\u009c\3\2\2\2\23\u009e\3\2\2\2\25\u00a0"+
		"\3\2\2\2\27\u00a4\3\2\2\2\31\u00a7\3\2\2\2\33\u00a9\3\2\2\2\35\u00b4\3"+
		"\2\2\2\37\u00ba\3\2\2\2!\u00c4\3\2\2\2#\u00d2\3\2\2\2%\u00dc\3\2\2\2\'"+
		"\u00e4\3\2\2\2)\u00e9\3\2\2\2+\u00eb\3\2\2\2-\u00ed\3\2\2\2/\u00ef\3\2"+
		"\2\2\61\u00f1\3\2\2\2\63\u00f3\3\2\2\2\65\u00f5\3\2\2\2\67\u00f7\3\2\2"+
		"\29\u0100\3\2\2\2;\u010d\3\2\2\2=\u011a\3\2\2\2?\u0121\3\2\2\2A\u0123"+
		"\3\2\2\2C\u0125\3\2\2\2E\u0136\3\2\2\2G\u0141\3\2\2\2I\u0146\3\2\2\2K"+
		"\u014e\3\2\2\2M\u0151\3\2\2\2O\u0158\3\2\2\2Q\u015e\3\2\2\2S\u0163\3\2"+
		"\2\2U\u016c\3\2\2\2W\u0171\3\2\2\2Y\u0176\3\2\2\2[\u017f\3\2\2\2]\u0184"+
		"\3\2\2\2_\u0188\3\2\2\2a\u0191\3\2\2\2c\u019e\3\2\2\2e\u01a6\3\2\2\2g"+
		"\u01ac\3\2\2\2i\u01ae\3\2\2\2k\u01b0\3\2\2\2m\u01b2\3\2\2\2o\u01b4\3\2"+
		"\2\2q\u01c7\3\2\2\2s\u01c9\3\2\2\2u\u01d1\3\2\2\2w\u01d9\3\2\2\2y\u01de"+
		"\3\2\2\2{\u01e6\3\2\2\2}\u01f1\3\2\2\2\177\u01f5\3\2\2\2\u0081\u01fe\3"+
		"\2\2\2\u0083\u0205\3\2\2\2\u0085\u0210\3\2\2\2\u0087\u0214\3\2\2\2\u0089"+
		"\u008a\7>\2\2\u008a\u008b\7/\2\2\u008b\4\3\2\2\2\u008c\u008d\7\60\2\2"+
		"\u008d\u008e\7\60\2\2\u008e\6\3\2\2\2\u008f\u0090\7(\2\2\u0090\b\3\2\2"+
		"\2\u0091\u0092\7\'\2\2\u0092\n\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0095"+
		"\7@\2\2\u0095\f\3\2\2\2\u0096\u0097\7@\2\2\u0097\u0098\7?\2\2\u0098\16"+
		"\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7?\2\2\u009b\20\3\2\2\2\u009c"+
		"\u009d\7@\2\2\u009d\22\3\2\2\2\u009e\u009f\7>\2\2\u009f\24\3\2\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7q\2\2\u00a3\26\3\2\2\2\u00a4"+
		"\u00a5\7q\2\2\u00a5\u00a6\7w\2\2\u00a6\30\3\2\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\32\3\2\2\2\u00a9\u00aa\7x\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7t\2\2\u00ac"+
		"\u00ad\7f\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7g\2\2"+
		"\u00b0\u00b1\7k\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7q\2\2\u00b3\34\3\2"+
		"\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8"+
		"\7u\2\2\u00b8\u00b9\7q\2\2\u00b9\36\3\2\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc"+
		"\7n\2\2\u00bc\u00bd\7i\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7k\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7o\2\2\u00c2\u00c3\7q\2\2"+
		"\u00c3 \3\2\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7o\2"+
		"\2\u00c7\u00c8\7a\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb"+
		"\7i\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7k\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7o\2\2\u00d0\u00d1\7q\2\2\u00d1\"\3\2\2\2\u00d2"+
		"\u00d3\7e\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7u\2\2"+
		"\u00d6\u00d7\7v\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da"+
		"\7v\2\2\u00da\u00db\7g\2\2\u00db$\3\2\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de"+
		"\7g\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7c\2\2\u00e1"+
		"\u00e2\7t\2\2\u00e2\u00e3\7g\2\2\u00e3&\3\2\2\2\u00e4\u00e5\7v\2\2\u00e5"+
		"\u00e6\7k\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7q\2\2\u00e8(\3\2\2\2\u00e9"+
		"\u00ea\7<\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7?\2\2\u00ec,\3\2\2\2\u00ed\u00ee"+
		"\7.\2\2\u00ee.\3\2\2\2\u00ef\u00f0\7`\2\2\u00f0\60\3\2\2\2\u00f1\u00f2"+
		"\7\60\2\2\u00f2\62\3\2\2\2\u00f3\u00f4\7]\2\2\u00f4\64\3\2\2\2\u00f5\u00f6"+
		"\7_\2\2\u00f6\66\3\2\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa"+
		"\7i\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7v\2\2\u00fd"+
		"\u00fe\7t\2\2\u00fe\u00ff\7q\2\2\u00ff8\3\2\2\2\u0100\u0101\7h\2\2\u0101"+
		"\u0102\7k\2\2\u0102\u0103\7o\2\2\u0103\u0104\7a\2\2\u0104\u0105\7t\2\2"+
		"\u0105\u0106\7g\2\2\u0106\u0107\7i\2\2\u0107\u0108\7k\2\2\u0108\u0109"+
		"\7u\2\2\u0109\u010a\7v\2\2\u010a\u010b\7t\2\2\u010b\u010c\7q\2\2\u010c"+
		":\3\2\2\2\u010d\u010e\7r\2\2\u010e\u010f\7t\2\2\u010f\u0110\7q\2\2\u0110"+
		"\u0111\7e\2\2\u0111\u0112\7g\2\2\u0112\u0113\7f\2\2\u0113\u0114\7k\2\2"+
		"\u0114\u0115\7o\2\2\u0115\u0116\7g\2\2\u0116\u0117\7p\2\2\u0117\u0118"+
		"\7v\2\2\u0118\u0119\7q\2\2\u0119<\3\2\2\2\u011a\u011b\7h\2\2\u011b\u011c"+
		"\7w\2\2\u011c\u011d\7p\2\2\u011d\u011e\7e\2\2\u011e\u011f\7c\2\2\u011f"+
		"\u0120\7q\2\2\u0120>\3\2\2\2\u0121\u0122\7*\2\2\u0122@\3\2\2\2\u0123\u0124"+
		"\7+\2\2\u0124B\3\2\2\2\u0125\u0126\7h\2\2\u0126\u0127\7k\2\2\u0127\u0128"+
		"\7o\2\2\u0128\u0129\7a\2\2\u0129\u012a\7r\2\2\u012a\u012b\7t\2\2\u012b"+
		"\u012c\7q\2\2\u012c\u012d\7e\2\2\u012d\u012e\7g\2\2\u012e\u012f\7f\2\2"+
		"\u012f\u0130\7k\2\2\u0130\u0131\7o\2\2\u0131\u0132\7g\2\2\u0132\u0133"+
		"\7p\2\2\u0133\u0134\7v\2\2\u0134\u0135\7q\2\2\u0135D\3\2\2\2\u0136\u0137"+
		"\7h\2\2\u0137\u0138\7k\2\2\u0138\u0139\7o\2\2\u0139\u013a\7a\2\2\u013a"+
		"\u013b\7h\2\2\u013b\u013c\7w\2\2\u013c\u013d\7p\2\2\u013d\u013e\7e\2\2"+
		"\u013e\u013f\7c\2\2\u013f\u0140\7q\2\2\u0140F\3\2\2\2\u0141\u0142\7n\2"+
		"\2\u0142\u0143\7g\2\2\u0143\u0144\7k\2\2\u0144\u0145\7c\2\2\u0145H\3\2"+
		"\2\2\u0146\u0147\7g\2\2\u0147\u0148\7u\2\2\u0148\u0149\7e\2\2\u0149\u014a"+
		"\7t\2\2\u014a\u014b\7g\2\2\u014b\u014c\7x\2\2\u014c\u014d\7c\2\2\u014d"+
		"J\3\2\2\2\u014e\u014f\7u\2\2\u014f\u0150\7g\2\2\u0150L\3\2\2\2\u0151\u0152"+
		"\7h\2\2\u0152\u0153\7k\2\2\u0153\u0154\7o\2\2\u0154\u0155\7a\2\2\u0155"+
		"\u0156\7u\2\2\u0156\u0157\7g\2\2\u0157N\3\2\2\2\u0158\u0159\7g\2\2\u0159"+
		"\u015a\7p\2\2\u015a\u015b\7v\2\2\u015b\u015c\7c\2\2\u015c\u015d\7q\2\2"+
		"\u015dP\3\2\2\2\u015e\u015f\7e\2\2\u015f\u0160\7c\2\2\u0160\u0161\7u\2"+
		"\2\u0161\u0162\7q\2\2\u0162R\3\2\2\2\u0163\u0164\7h\2\2\u0164\u0165\7"+
		"k\2\2\u0165\u0166\7o\2\2\u0166\u0167\7a\2\2\u0167\u0168\7e\2\2\u0168\u0169"+
		"\7c\2\2\u0169\u016a\7u\2\2\u016a\u016b\7q\2\2\u016bT\3\2\2\2\u016c\u016d"+
		"\7r\2\2\u016d\u016e\7c\2\2\u016e\u016f\7t\2\2\u016f\u0170\7c\2\2\u0170"+
		"V\3\2\2\2\u0171\u0172\7u\2\2\u0172\u0173\7g\2\2\u0173\u0174\7l\2\2\u0174"+
		"\u0175\7c\2\2\u0175X\3\2\2\2\u0176\u0177\7h\2\2\u0177\u0178\7k\2\2\u0178"+
		"\u0179\7o\2\2\u0179\u017a\7a\2\2\u017a\u017b\7r\2\2\u017b\u017c\7c\2\2"+
		"\u017c\u017d\7t\2\2\u017d\u017e\7c\2\2\u017eZ\3\2\2\2\u017f\u0180\7h\2"+
		"\2\u0180\u0181\7c\2\2\u0181\u0182\7e\2\2\u0182\u0183\7c\2\2\u0183\\\3"+
		"\2\2\2\u0184\u0185\7c\2\2\u0185\u0186\7v\2\2\u0186\u0187\7g\2\2\u0187"+
		"^\3\2\2\2\u0188\u0189\7g\2\2\u0189\u018a\7p\2\2\u018a\u018b\7s\2\2\u018b"+
		"\u018c\7w\2\2\u018c\u018d\7c\2\2\u018d\u018e\7p\2\2\u018e\u018f\7v\2\2"+
		"\u018f\u0190\7q\2\2\u0190`\3\2\2\2\u0191\u0192\7h\2\2\u0192\u0193\7k\2"+
		"\2\u0193\u0194\7o\2\2\u0194\u0195\7a\2\2\u0195\u0196\7g\2\2\u0196\u0197"+
		"\7p\2\2\u0197\u0198\7s\2\2\u0198\u0199\7w\2\2\u0199\u019a\7c\2\2\u019a"+
		"\u019b\7p\2\2\u019b\u019c\7v\2\2\u019c\u019d\7q\2\2\u019db\3\2\2\2\u019e"+
		"\u019f\7t\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7v\2\2\u01a1\u01a2\7q\2\2"+
		"\u01a2\u01a3\7t\2\2\u01a3\u01a4\7p\2\2\u01a4\u01a5\7g\2\2\u01a5d\3\2\2"+
		"\2\u01a6\u01a7\7u\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7p\2\2\u01a9\u01aa"+
		"\7c\2\2\u01aa\u01ab\7q\2\2\u01abf\3\2\2\2\u01ac\u01ad\7/\2\2\u01adh\3"+
		"\2\2\2\u01ae\u01af\7-\2\2\u01afj\3\2\2\2\u01b0\u01b1\7,\2\2\u01b1l\3\2"+
		"\2\2\u01b2\u01b3\7\61\2\2\u01b3n\3\2\2\2\u01b4\u01b5\7x\2\2\u01b5\u01b6"+
		"\7c\2\2\u01b6\u01b7\7t\2\2\u01b7p\3\2\2\2\u01b8\u01b9\7x\2\2\u01b9\u01ba"+
		"\7g\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc\7f\2\2\u01bc\u01bd\7c\2\2\u01bd"+
		"\u01be\7f\2\2\u01be\u01bf\7g\2\2\u01bf\u01c0\7k\2\2\u01c0\u01c1\7t\2\2"+
		"\u01c1\u01c8\7q\2\2\u01c2\u01c3\7h\2\2\u01c3\u01c4\7c\2\2\u01c4\u01c5"+
		"\7n\2\2\u01c5\u01c6\7u\2\2\u01c6\u01c8\7q\2\2\u01c7\u01b8\3\2\2\2\u01c7"+
		"\u01c2\3\2\2\2\u01c8r\3\2\2\2\u01c9\u01ca\7n\2\2\u01ca\u01cb\7k\2\2\u01cb"+
		"\u01cc\7v\2\2\u01cc\u01cd\7g\2\2\u01cd\u01ce\7t\2\2\u01ce\u01cf\7c\2\2"+
		"\u01cf\u01d0\7n\2\2\u01d0t\3\2\2\2\u01d1\u01d2\7k\2\2\u01d2\u01d3\7p\2"+
		"\2\u01d3\u01d4\7v\2\2\u01d4\u01d5\7g\2\2\u01d5\u01d6\7k\2\2\u01d6\u01d7"+
		"\7t\2\2\u01d7\u01d8\7q\2\2\u01d8v\3\2\2\2\u01d9\u01da\7t\2\2\u01da\u01db"+
		"\7g\2\2\u01db\u01dc\7c\2\2\u01dc\u01dd\7n\2\2\u01ddx\3\2\2\2\u01de\u01df"+
		"\7n\2\2\u01df\u01e0\7q\2\2\u01e0\u01e1\7i\2\2\u01e1\u01e2\7k\2\2\u01e2"+
		"\u01e3\7e\2\2\u01e3\u01e4\7q\2\2\u01e4z\3\2\2\2\u01e5\u01e7\4\62;\2\u01e6"+
		"\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2"+
		"\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\7\60\2\2\u01eb\u01ed\4\62;\2\u01ec"+
		"\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef|\3\2\2\2\u01f0\u01f2\4\62;\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4~\3\2\2\2\u01f5"+
		"\u01f9\7$\2\2\u01f6\u01f8\n\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2"+
		"\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u01fd\7$\2\2\u01fd\u0080\3\2\2\2\u01fe\u0202\t\3"+
		"\2\2\u01ff\u0201\t\4\2\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0082\3\2\2\2\u0204\u0202\3\2"+
		"\2\2\u0205\u0209\7}\2\2\u0206\u0208\n\5\2\2\u0207\u0206\3\2\2\2\u0208"+
		"\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2"+
		"\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7\177\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u020f\bB\2\2\u020f\u0084\3\2\2\2\u0210\u0211\t\6\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0213\bC\2\2\u0213\u0086\3\2\2\2\u0214\u0215\13\2\2\2\u0215"+
		"\u0216\bD\3\2\u0216\u0088\3\2\2\2\n\2\u01c7\u01e8\u01ee\u01f3\u01f9\u0202"+
		"\u0209\4\b\2\2\3D\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}