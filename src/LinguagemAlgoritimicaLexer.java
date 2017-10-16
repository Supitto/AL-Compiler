// Generated from /home/supitto/IdeaProjects/AL-Compiler/src/LinguagemAlgoritimica.g4 by ANTLR 4.7
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
		T__9=10, T__10=11, T__11=12, ALGORITMO=13, FIM_ALGORITMO=14, CONSTANTE=15, 
		DECLARE=16, TIPO=17, DOIS_PONTOS=18, IGUAL_ASSIMILACAO=19, VIRGULA=20, 
		CIRCUNFLEXO=21, PONTO=22, ABRE_COLCHETE=23, FECHA_COLCHETE=24, REGISTRO=25, 
		FIM_REGISTRO=26, PROCEDIMENTO=27, FUNCAO=28, ABRE_PARENTESES=29, FECHA_PARENTESES=30, 
		FIM_PROCEDIMENTO=31, FIM_FUNCAO=32, LEIA=33, ESCREVA=34, SE=35, FIM_SE=36, 
		ENTAO=37, CASO=38, FIM_CASO=39, PARA=40, SEJA=41, FIM_PARA=42, FACA=43, 
		ATE=44, ENQUANTO=45, FIM_ENQUANTO=46, RETORNE=47, SENAO=48, MENOS=49, 
		MAIS=50, VEZES=51, DIVIDIR=52, VAR=53, BOOLEANO=54, LITERAL=55, INTEIRO=56, 
		REAL=57, LOGICO=58, NUM_REAL=59, NUM_INT=60, CADEIA=61, ID=62, COMENTARIO=63, 
		WS=64, COMENTARIO_INCOMPLETO=65, ERROR=66;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "ALGORITMO", "FIM_ALGORITMO", "CONSTANTE", "DECLARE", 
		"TIPO", "DOIS_PONTOS", "IGUAL_ASSIMILACAO", "VIRGULA", "CIRCUNFLEXO", 
		"PONTO", "ABRE_COLCHETE", "FECHA_COLCHETE", "REGISTRO", "FIM_REGISTRO", 
		"PROCEDIMENTO", "FUNCAO", "ABRE_PARENTESES", "FECHA_PARENTESES", "FIM_PROCEDIMENTO", 
		"FIM_FUNCAO", "LEIA", "ESCREVA", "SE", "FIM_SE", "ENTAO", "CASO", "FIM_CASO", 
		"PARA", "SEJA", "FIM_PARA", "FACA", "ATE", "ENQUANTO", "FIM_ENQUANTO", 
		"RETORNE", "SENAO", "MENOS", "MAIS", "VEZES", "DIVIDIR", "VAR", "BOOLEANO", 
		"LITERAL", "INTEIRO", "REAL", "LOGICO", "NUM_REAL", "NUM_INT", "CADEIA", 
		"ID", "COMENTARIO", "WS", "COMENTARIO_INCOMPLETO", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<-'", "'..'", "'&'", "'%'", "'<>'", "'>='", "'<='", "'>'", "'<'", 
		"'nao'", "'ou'", "'e'", "'algoritmo'", "'fim_algoritmo'", "'constante'", 
		"'declare'", "'tipo'", "':'", "'='", "','", "'^'", "'.'", "'['", "']'", 
		"'registro'", "'fim_registro'", "'procedimento'", "'funcao'", "'('", "')'", 
		"'fim_procedimento'", "'fim_funcao'", "'leia'", "'escreva'", "'se'", "'fim_se'", 
		"'entao'", "'caso'", "'fim_caso'", "'para'", "'seja'", "'fim_para'", "'faca'", 
		"'ate'", "'enquanto'", "'fim_enquanto'", "'retorne'", "'senao'", "'-'", 
		"'+'", "'*'", "'/'", "'var'", null, "'literal'", "'inteiro'", "'real'", 
		"'logico'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ALGORITMO", "FIM_ALGORITMO", "CONSTANTE", "DECLARE", "TIPO", "DOIS_PONTOS", 
		"IGUAL_ASSIMILACAO", "VIRGULA", "CIRCUNFLEXO", "PONTO", "ABRE_COLCHETE", 
		"FECHA_COLCHETE", "REGISTRO", "FIM_REGISTRO", "PROCEDIMENTO", "FUNCAO", 
		"ABRE_PARENTESES", "FECHA_PARENTESES", "FIM_PROCEDIMENTO", "FIM_FUNCAO", 
		"LEIA", "ESCREVA", "SE", "FIM_SE", "ENTAO", "CASO", "FIM_CASO", "PARA", 
		"SEJA", "FIM_PARA", "FACA", "ATE", "ENQUANTO", "FIM_ENQUANTO", "RETORNE", 
		"SENAO", "MENOS", "MAIS", "VEZES", "DIVIDIR", "VAR", "BOOLEANO", "LITERAL", 
		"INTEIRO", "REAL", "LOGICO", "NUM_REAL", "NUM_INT", "CADEIA", "ID", "COMENTARIO", 
		"WS", "COMENTARIO_INCOMPLETO", "ERROR"
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
		case 64:
			COMENTARIO_INCOMPLETO_action((RuleContext)_localctx, actionIndex);
			break;
		case 65:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_INCOMPLETO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 throw new ParseCancellationException("Linha "+getLine()+": comentario nao fechado\n"); 
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 throw new ParseCancellationException("Linha "+getLine()+": "+getText()+" - simbolo nao identificado\n"); 
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u020d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u01b5\n\67\38\38\38\38\38\38\38\38\39\3"+
		"9\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\6<\u01d4\n"+
		"<\r<\16<\u01d5\3<\3<\6<\u01da\n<\r<\16<\u01db\3=\6=\u01df\n=\r=\16=\u01e0"+
		"\3>\3>\7>\u01e5\n>\f>\16>\u01e8\13>\3>\3>\3?\3?\7?\u01ee\n?\f?\16?\u01f1"+
		"\13?\3@\3@\7@\u01f5\n@\f@\16@\u01f8\13@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B"+
		"\7B\u0204\nB\fB\16B\u0207\13B\3B\3B\3C\3C\3C\2\2D\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\3\2\7\5\2\f\f\17\17$$\5\2C\\aac|\6\2\62;C\\aac|\3\2\177"+
		"\177\5\2\13\f\17\17\"\"\2\u0214\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
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
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u008a\3\2\2"+
		"\2\7\u008d\3\2\2\2\t\u008f\3\2\2\2\13\u0091\3\2\2\2\r\u0094\3\2\2\2\17"+
		"\u0097\3\2\2\2\21\u009a\3\2\2\2\23\u009c\3\2\2\2\25\u009e\3\2\2\2\27\u00a2"+
		"\3\2\2\2\31\u00a5\3\2\2\2\33\u00a7\3\2\2\2\35\u00b1\3\2\2\2\37\u00bf\3"+
		"\2\2\2!\u00c9\3\2\2\2#\u00d1\3\2\2\2%\u00d6\3\2\2\2\'\u00d8\3\2\2\2)\u00da"+
		"\3\2\2\2+\u00dc\3\2\2\2-\u00de\3\2\2\2/\u00e0\3\2\2\2\61\u00e2\3\2\2\2"+
		"\63\u00e4\3\2\2\2\65\u00ed\3\2\2\2\67\u00fa\3\2\2\29\u0107\3\2\2\2;\u010e"+
		"\3\2\2\2=\u0110\3\2\2\2?\u0112\3\2\2\2A\u0123\3\2\2\2C\u012e\3\2\2\2E"+
		"\u0133\3\2\2\2G\u013b\3\2\2\2I\u013e\3\2\2\2K\u0145\3\2\2\2M\u014b\3\2"+
		"\2\2O\u0150\3\2\2\2Q\u0159\3\2\2\2S\u015e\3\2\2\2U\u0163\3\2\2\2W\u016c"+
		"\3\2\2\2Y\u0171\3\2\2\2[\u0175\3\2\2\2]\u017e\3\2\2\2_\u018b\3\2\2\2a"+
		"\u0193\3\2\2\2c\u0199\3\2\2\2e\u019b\3\2\2\2g\u019d\3\2\2\2i\u019f\3\2"+
		"\2\2k\u01a1\3\2\2\2m\u01b4\3\2\2\2o\u01b6\3\2\2\2q\u01be\3\2\2\2s\u01c6"+
		"\3\2\2\2u\u01cb\3\2\2\2w\u01d3\3\2\2\2y\u01de\3\2\2\2{\u01e2\3\2\2\2}"+
		"\u01eb\3\2\2\2\177\u01f2\3\2\2\2\u0081\u01fd\3\2\2\2\u0083\u0201\3\2\2"+
		"\2\u0085\u020a\3\2\2\2\u0087\u0088\7>\2\2\u0088\u0089\7/\2\2\u0089\4\3"+
		"\2\2\2\u008a\u008b\7\60\2\2\u008b\u008c\7\60\2\2\u008c\6\3\2\2\2\u008d"+
		"\u008e\7(\2\2\u008e\b\3\2\2\2\u008f\u0090\7\'\2\2\u0090\n\3\2\2\2\u0091"+
		"\u0092\7>\2\2\u0092\u0093\7@\2\2\u0093\f\3\2\2\2\u0094\u0095\7@\2\2\u0095"+
		"\u0096\7?\2\2\u0096\16\3\2\2\2\u0097\u0098\7>\2\2\u0098\u0099\7?\2\2\u0099"+
		"\20\3\2\2\2\u009a\u009b\7@\2\2\u009b\22\3\2\2\2\u009c\u009d\7>\2\2\u009d"+
		"\24\3\2\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7q\2\2\u00a1"+
		"\26\3\2\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7w\2\2\u00a4\30\3\2\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7n\2\2\u00a9"+
		"\u00aa\7i\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7k\2\2"+
		"\u00ad\u00ae\7v\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7q\2\2\u00b0\34\3\2"+
		"\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7o\2\2\u00b4\u00b5"+
		"\7a\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7i\2\2\u00b8"+
		"\u00b9\7q\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7v\2\2"+
		"\u00bc\u00bd\7o\2\2\u00bd\u00be\7q\2\2\u00be\36\3\2\2\2\u00bf\u00c0\7"+
		"e\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4"+
		"\7v\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7v\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8 \3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"\u00cc\7e\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7t\2\2"+
		"\u00cf\u00d0\7g\2\2\u00d0\"\3\2\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7k"+
		"\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7q\2\2\u00d5$\3\2\2\2\u00d6\u00d7"+
		"\7<\2\2\u00d7&\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9(\3\2\2\2\u00da\u00db\7"+
		".\2\2\u00db*\3\2\2\2\u00dc\u00dd\7`\2\2\u00dd,\3\2\2\2\u00de\u00df\7\60"+
		"\2\2\u00df.\3\2\2\2\u00e0\u00e1\7]\2\2\u00e1\60\3\2\2\2\u00e2\u00e3\7"+
		"_\2\2\u00e3\62\3\2\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7"+
		"\7i\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		"\u00eb\7t\2\2\u00eb\u00ec\7q\2\2\u00ec\64\3\2\2\2\u00ed\u00ee\7h\2\2\u00ee"+
		"\u00ef\7k\2\2\u00ef\u00f0\7o\2\2\u00f0\u00f1\7a\2\2\u00f1\u00f2\7t\2\2"+
		"\u00f2\u00f3\7g\2\2\u00f3\u00f4\7i\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6"+
		"\7u\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7q\2\2\u00f9"+
		"\66\3\2\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7q\2\2\u00fd"+
		"\u00fe\7e\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7f\2\2\u0100\u0101\7k\2\2"+
		"\u0101\u0102\7o\2\2\u0102\u0103\7g\2\2\u0103\u0104\7p\2\2\u0104\u0105"+
		"\7v\2\2\u0105\u0106\7q\2\2\u01068\3\2\2\2\u0107\u0108\7h\2\2\u0108\u0109"+
		"\7w\2\2\u0109\u010a\7p\2\2\u010a\u010b\7e\2\2\u010b\u010c\7c\2\2\u010c"+
		"\u010d\7q\2\2\u010d:\3\2\2\2\u010e\u010f\7*\2\2\u010f<\3\2\2\2\u0110\u0111"+
		"\7+\2\2\u0111>\3\2\2\2\u0112\u0113\7h\2\2\u0113\u0114\7k\2\2\u0114\u0115"+
		"\7o\2\2\u0115\u0116\7a\2\2\u0116\u0117\7r\2\2\u0117\u0118\7t\2\2\u0118"+
		"\u0119\7q\2\2\u0119\u011a\7e\2\2\u011a\u011b\7g\2\2\u011b\u011c\7f\2\2"+
		"\u011c\u011d\7k\2\2\u011d\u011e\7o\2\2\u011e\u011f\7g\2\2\u011f\u0120"+
		"\7p\2\2\u0120\u0121\7v\2\2\u0121\u0122\7q\2\2\u0122@\3\2\2\2\u0123\u0124"+
		"\7h\2\2\u0124\u0125\7k\2\2\u0125\u0126\7o\2\2\u0126\u0127\7a\2\2\u0127"+
		"\u0128\7h\2\2\u0128\u0129\7w\2\2\u0129\u012a\7p\2\2\u012a\u012b\7e\2\2"+
		"\u012b\u012c\7c\2\2\u012c\u012d\7q\2\2\u012dB\3\2\2\2\u012e\u012f\7n\2"+
		"\2\u012f\u0130\7g\2\2\u0130\u0131\7k\2\2\u0131\u0132\7c\2\2\u0132D\3\2"+
		"\2\2\u0133\u0134\7g\2\2\u0134\u0135\7u\2\2\u0135\u0136\7e\2\2\u0136\u0137"+
		"\7t\2\2\u0137\u0138\7g\2\2\u0138\u0139\7x\2\2\u0139\u013a\7c\2\2\u013a"+
		"F\3\2\2\2\u013b\u013c\7u\2\2\u013c\u013d\7g\2\2\u013dH\3\2\2\2\u013e\u013f"+
		"\7h\2\2\u013f\u0140\7k\2\2\u0140\u0141\7o\2\2\u0141\u0142\7a\2\2\u0142"+
		"\u0143\7u\2\2\u0143\u0144\7g\2\2\u0144J\3\2\2\2\u0145\u0146\7g\2\2\u0146"+
		"\u0147\7p\2\2\u0147\u0148\7v\2\2\u0148\u0149\7c\2\2\u0149\u014a\7q\2\2"+
		"\u014aL\3\2\2\2\u014b\u014c\7e\2\2\u014c\u014d\7c\2\2\u014d\u014e\7u\2"+
		"\2\u014e\u014f\7q\2\2\u014fN\3\2\2\2\u0150\u0151\7h\2\2\u0151\u0152\7"+
		"k\2\2\u0152\u0153\7o\2\2\u0153\u0154\7a\2\2\u0154\u0155\7e\2\2\u0155\u0156"+
		"\7c\2\2\u0156\u0157\7u\2\2\u0157\u0158\7q\2\2\u0158P\3\2\2\2\u0159\u015a"+
		"\7r\2\2\u015a\u015b\7c\2\2\u015b\u015c\7t\2\2\u015c\u015d\7c\2\2\u015d"+
		"R\3\2\2\2\u015e\u015f\7u\2\2\u015f\u0160\7g\2\2\u0160\u0161\7l\2\2\u0161"+
		"\u0162\7c\2\2\u0162T\3\2\2\2\u0163\u0164\7h\2\2\u0164\u0165\7k\2\2\u0165"+
		"\u0166\7o\2\2\u0166\u0167\7a\2\2\u0167\u0168\7r\2\2\u0168\u0169\7c\2\2"+
		"\u0169\u016a\7t\2\2\u016a\u016b\7c\2\2\u016bV\3\2\2\2\u016c\u016d\7h\2"+
		"\2\u016d\u016e\7c\2\2\u016e\u016f\7e\2\2\u016f\u0170\7c\2\2\u0170X\3\2"+
		"\2\2\u0171\u0172\7c\2\2\u0172\u0173\7v\2\2\u0173\u0174\7g\2\2\u0174Z\3"+
		"\2\2\2\u0175\u0176\7g\2\2\u0176\u0177\7p\2\2\u0177\u0178\7s\2\2\u0178"+
		"\u0179\7w\2\2\u0179\u017a\7c\2\2\u017a\u017b\7p\2\2\u017b\u017c\7v\2\2"+
		"\u017c\u017d\7q\2\2\u017d\\\3\2\2\2\u017e\u017f\7h\2\2\u017f\u0180\7k"+
		"\2\2\u0180\u0181\7o\2\2\u0181\u0182\7a\2\2\u0182\u0183\7g\2\2\u0183\u0184"+
		"\7p\2\2\u0184\u0185\7s\2\2\u0185\u0186\7w\2\2\u0186\u0187\7c\2\2\u0187"+
		"\u0188\7p\2\2\u0188\u0189\7v\2\2\u0189\u018a\7q\2\2\u018a^\3\2\2\2\u018b"+
		"\u018c\7t\2\2\u018c\u018d\7g\2\2\u018d\u018e\7v\2\2\u018e\u018f\7q\2\2"+
		"\u018f\u0190\7t\2\2\u0190\u0191\7p\2\2\u0191\u0192\7g\2\2\u0192`\3\2\2"+
		"\2\u0193\u0194\7u\2\2\u0194\u0195\7g\2\2\u0195\u0196\7p\2\2\u0196\u0197"+
		"\7c\2\2\u0197\u0198\7q\2\2\u0198b\3\2\2\2\u0199\u019a\7/\2\2\u019ad\3"+
		"\2\2\2\u019b\u019c\7-\2\2\u019cf\3\2\2\2\u019d\u019e\7,\2\2\u019eh\3\2"+
		"\2\2\u019f\u01a0\7\61\2\2\u01a0j\3\2\2\2\u01a1\u01a2\7x\2\2\u01a2\u01a3"+
		"\7c\2\2\u01a3\u01a4\7t\2\2\u01a4l\3\2\2\2\u01a5\u01a6\7x\2\2\u01a6\u01a7"+
		"\7g\2\2\u01a7\u01a8\7t\2\2\u01a8\u01a9\7f\2\2\u01a9\u01aa\7c\2\2\u01aa"+
		"\u01ab\7f\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad\7k\2\2\u01ad\u01ae\7t\2\2"+
		"\u01ae\u01b5\7q\2\2\u01af\u01b0\7h\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2"+
		"\7n\2\2\u01b2\u01b3\7u\2\2\u01b3\u01b5\7q\2\2\u01b4\u01a5\3\2\2\2\u01b4"+
		"\u01af\3\2\2\2\u01b5n\3\2\2\2\u01b6\u01b7\7n\2\2\u01b7\u01b8\7k\2\2\u01b8"+
		"\u01b9\7v\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc\7c\2\2"+
		"\u01bc\u01bd\7n\2\2\u01bdp\3\2\2\2\u01be\u01bf\7k\2\2\u01bf\u01c0\7p\2"+
		"\2\u01c0\u01c1\7v\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3\7k\2\2\u01c3\u01c4"+
		"\7t\2\2\u01c4\u01c5\7q\2\2\u01c5r\3\2\2\2\u01c6\u01c7\7t\2\2\u01c7\u01c8"+
		"\7g\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7n\2\2\u01cat\3\2\2\2\u01cb\u01cc"+
		"\7n\2\2\u01cc\u01cd\7q\2\2\u01cd\u01ce\7i\2\2\u01ce\u01cf\7k\2\2\u01cf"+
		"\u01d0\7e\2\2\u01d0\u01d1\7q\2\2\u01d1v\3\2\2\2\u01d2\u01d4\4\62;\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\7\60\2\2\u01d8\u01da\4\62;\2\u01d9"+
		"\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dcx\3\2\2\2\u01dd\u01df\4\62;\2\u01de\u01dd\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1z\3\2\2\2\u01e2"+
		"\u01e6\7$\2\2\u01e3\u01e5\n\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2"+
		"\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8"+
		"\u01e6\3\2\2\2\u01e9\u01ea\7$\2\2\u01ea|\3\2\2\2\u01eb\u01ef\t\3\2\2\u01ec"+
		"\u01ee\t\4\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2"+
		"\2\2\u01ef\u01f0\3\2\2\2\u01f0~\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f6"+
		"\7}\2\2\u01f3\u01f5\n\5\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f9\u01fa\7\177\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\b@\2\2\u01fc"+
		"\u0080\3\2\2\2\u01fd\u01fe\t\6\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\bA"+
		"\2\2\u0200\u0082\3\2\2\2\u0201\u0205\7}\2\2\u0202\u0204\n\5\2\2\u0203"+
		"\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u0208\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0209\bB\3\2\u0209"+
		"\u0084\3\2\2\2\u020a\u020b\13\2\2\2\u020b\u020c\bC\4\2\u020c\u0086\3\2"+
		"\2\2\13\2\u01b4\u01d5\u01db\u01e0\u01e6\u01ef\u01f6\u0205\5\b\2\2\3B\2"+
		"\3C\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}