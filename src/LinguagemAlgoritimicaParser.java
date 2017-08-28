// Generated from LinguagemAlgoritimica.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguagemAlgoritimicaParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_decl_local = 3, 
		RULE_variavel = 4, RULE_mais_var = 5, RULE_identificador = 6, RULE_ponteiros_opcionais = 7, 
		RULE_outros_ident = 8, RULE_dimensao = 9, RULE_tipo = 10, RULE_mais_ident = 11, 
		RULE_mais_variaveis = 12, RULE_tipo_basico = 13, RULE_tipo_basico_ident = 14, 
		RULE_tipo_estendido = 15, RULE_valor_constante = 16, RULE_registro = 17, 
		RULE_decl_global = 18, RULE_parametros_opcional = 19, RULE_parametro = 20, 
		RULE_var_opcional = 21, RULE_mais_parametros = 22, RULE_declaracoes_locais = 23, 
		RULE_corpo = 24, RULE_comandos = 25, RULE_cmd = 26, RULE_leia = 27, RULE_escreva = 28, 
		RULE_se = 29, RULE_caso = 30, RULE_para = 31, RULE_enquanto = 32, RULE_faca = 33, 
		RULE_atribuicao_ponteiro = 34, RULE_atribuicao = 35, RULE_retorne = 36, 
		RULE_mais_expressao = 37, RULE_senao_opcional = 38, RULE_chamada_atribuicao = 39, 
		RULE_argumentos_opcional = 40, RULE_selecao = 41, RULE_mais_selecao = 42, 
		RULE_constantes = 43, RULE_mais_constante = 44, RULE_numero_intervalo = 45, 
		RULE_intervalo_opcional = 46, RULE_op_unario = 47, RULE_exp_aritimetica = 48, 
		RULE_op_multiplicaco = 49, RULE_op_adicao = 50, RULE_termo = 51, RULE_outros_termos = 52, 
		RULE_fator = 53, RULE_outros_fatores = 54, RULE_parcela = 55, RULE_parcela_unario = 56, 
		RULE_parcela_nao_unario = 57, RULE_outras_parcelas = 58, RULE_chamada_partes = 59, 
		RULE_exp_relacional = 60, RULE_op_opcional = 61, RULE_op_relacional = 62, 
		RULE_expressao = 63, RULE_op_nao = 64, RULE_termo_logico = 65, RULE_outros_termos_logicos = 66, 
		RULE_fator_logico = 67, RULE_outros_fatores_logicos = 68, RULE_parcela_logica = 69;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "decl_local", "variavel", 
		"mais_var", "identificador", "ponteiros_opcionais", "outros_ident", "dimensao", 
		"tipo", "mais_ident", "mais_variaveis", "tipo_basico", "tipo_basico_ident", 
		"tipo_estendido", "valor_constante", "registro", "decl_global", "parametros_opcional", 
		"parametro", "var_opcional", "mais_parametros", "declaracoes_locais", 
		"corpo", "comandos", "cmd", "leia", "escreva", "se", "caso", "para", "enquanto", 
		"faca", "atribuicao_ponteiro", "atribuicao", "retorne", "mais_expressao", 
		"senao_opcional", "chamada_atribuicao", "argumentos_opcional", "selecao", 
		"mais_selecao", "constantes", "mais_constante", "numero_intervalo", "intervalo_opcional", 
		"op_unario", "exp_aritimetica", "op_multiplicaco", "op_adicao", "termo", 
		"outros_termos", "fator", "outros_fatores", "parcela", "parcela_unario", 
		"parcela_nao_unario", "outras_parcelas", "chamada_partes", "exp_relacional", 
		"op_opcional", "op_relacional", "expressao", "op_nao", "termo_logico", 
		"outros_termos_logicos", "fator_logico", "outros_fatores_logicos", "parcela_logica"
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

	@Override
	public String getGrammarFileName() { return "LinguagemAlgoritimica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinguagemAlgoritimicaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITIMO() { return getToken(LinguagemAlgoritimicaParser.ALGORITIMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITIMO() { return getToken(LinguagemAlgoritimicaParser.FIM_ALGORITIMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			declaracoes();
			setState(141);
			match(ALGORITIMO);
			setState(142);
			corpo();
			setState(143);
			match(FIM_ALGORITIMO);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public Decl_local_globalContext decl_local_global() {
			return getRuleContext(Decl_local_globalContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANTE) | (1L << DECLARE) | (1L << TIPO) | (1L << PROCEDIMENTO))) != 0)) {
				{
				setState(145);
				decl_local_global();
				setState(146);
				declaracoes();
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

	public static class Decl_local_globalContext extends ParserRuleContext {
		public Decl_localContext decl_local() {
			return getRuleContext(Decl_localContext.class,0);
		}
		public Decl_globalContext decl_global() {
			return getRuleContext(Decl_globalContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitDecl_local_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitDecl_local_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case CONSTANTE:
			case DECLARE:
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				decl_local();
				}
				break;
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				decl_global();
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

	public static class Decl_localContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(LinguagemAlgoritimicaParser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(LinguagemAlgoritimicaParser.CONSTANTE, 0); }
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(LinguagemAlgoritimicaParser.DOIS_PONTOS, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IGUAL_ASSIMILACAO() { return getToken(LinguagemAlgoritimicaParser.IGUAL_ASSIMILACAO, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(LinguagemAlgoritimicaParser.TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Decl_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterDecl_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitDecl_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitDecl_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_localContext decl_local() throws RecognitionException {
		Decl_localContext _localctx = new Decl_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl_local);
		try {
			setState(167);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(DECLARE);
				setState(155);
				variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(CONSTANTE);
				setState(157);
				match(ID);
				setState(158);
				match(DOIS_PONTOS);
				setState(159);
				tipo_basico();
				setState(160);
				match(IGUAL_ASSIMILACAO);
				setState(161);
				valor_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(TIPO);
				setState(164);
				match(ID);
				setState(165);
				match(DOIS_PONTOS);
				setState(166);
				tipo();
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

	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(LinguagemAlgoritimicaParser.DOIS_PONTOS, 0); }
		public TerminalNode TIPO() { return getToken(LinguagemAlgoritimicaParser.TIPO, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ID);
			setState(170);
			dimensao();
			setState(171);
			mais_var();
			setState(172);
			match(DOIS_PONTOS);
			setState(173);
			match(TIPO);
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

	public static class Mais_varContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(LinguagemAlgoritimicaParser.VIRGULA, 0); }
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitMais_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitMais_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mais_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(175);
				match(VIRGULA);
				setState(176);
				match(ID);
				setState(177);
				dimensao();
				setState(178);
				mais_var();
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

	public static class IdentificadorContext extends ParserRuleContext {
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			ponteiros_opcionais();
			setState(183);
			match(ID);
			setState(184);
			dimensao();
			setState(185);
			outros_ident();
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

	public static class Ponteiros_opcionaisContext extends ParserRuleContext {
		public TerminalNode CIRCUNFLEXO() { return getToken(LinguagemAlgoritimicaParser.CIRCUNFLEXO, 0); }
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiros_opcionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterPonteiros_opcionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitPonteiros_opcionais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitPonteiros_opcionais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
		Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ponteiros_opcionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if (_la==CIRCUNFLEXO) {
				{
				setState(187);
				match(CIRCUNFLEXO);
				setState(188);
				ponteiros_opcionais();
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

	public static class Outros_identContext extends ParserRuleContext {
		public TerminalNode PONTO() { return getToken(LinguagemAlgoritimicaParser.PONTO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Outros_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterOutros_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitOutros_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitOutros_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_identContext outros_ident() throws RecognitionException {
		Outros_identContext _localctx = new Outros_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outros_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(191);
				match(PONTO);
				setState(192);
				identificador();
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

	public static class DimensaoContext extends ParserRuleContext {
		public TerminalNode ABRE_COLCHETE() { return getToken(LinguagemAlgoritimicaParser.ABRE_COLCHETE, 0); }
		public Exp_aritimeticaContext exp_aritimetica() {
			return getRuleContext(Exp_aritimeticaContext.class,0);
		}
		public TerminalNode FECHA_COLCHETE() { return getToken(LinguagemAlgoritimicaParser.FECHA_COLCHETE, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(195);
				match(ABRE_COLCHETE);
				setState(196);
				exp_aritimetica();
				setState(197);
				match(FECHA_COLCHETE);
				setState(198);
				dimensao();
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

	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				registro();
				}
				break;
			case CIRCUNFLEXO:
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				tipo_estendido();
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

	public static class Mais_identContext extends ParserRuleContext {
		public TerminalNode PONTO() { return getToken(LinguagemAlgoritimicaParser.PONTO, 0); }
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Mais_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterMais_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitMais_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitMais_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_identContext mais_ident() throws RecognitionException {
		Mais_identContext _localctx = new Mais_identContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if (_la==PONTO) {
				{
				setState(206);
				match(PONTO);
				setState(207);
				match(ID);
				setState(208);
				mais_ident();
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

	public static class Mais_variaveisContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public Mais_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterMais_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitMais_variaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitMais_variaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_variaveisContext mais_variaveis() throws RecognitionException {
		Mais_variaveisContext _localctx = new Mais_variaveisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mais_variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(211);
				variavel();
				setState(212);
				mais_variaveis();
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(LinguagemAlgoritimicaParser.LITERAL, 0); }
		public TerminalNode REAL() { return getToken(LinguagemAlgoritimicaParser.REAL, 0); }
		public TerminalNode INTEIRO() { return getToken(LinguagemAlgoritimicaParser.INTEIRO, 0); }
		public TerminalNode LOGICO() { return getToken(LinguagemAlgoritimicaParser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitTipo_basico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitTipo_basico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << INTEIRO) | (1L << REAL) | (1L << LOGICO))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitTipo_basico_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitTipo_basico_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_basico_ident);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				tipo_basico();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(ID);
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

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitTipo_estendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitTipo_estendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo_estendido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			ponteiros_opcionais();
			setState(223);
			tipo_basico_ident();
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

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(LinguagemAlgoritimicaParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(LinguagemAlgoritimicaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LinguagemAlgoritimicaParser.NUM_REAL, 0); }
		public TerminalNode BOOLEANO() { return getToken(LinguagemAlgoritimicaParser.BOOLEANO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitValor_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << NUM_REAL) | (1L << NUM_INT) | (1L << CADEIA))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(LinguagemAlgoritimicaParser.REGISTRO, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public TerminalNode FIM_REGISTRO() { return getToken(LinguagemAlgoritimicaParser.FIM_REGISTRO, 0); }
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(REGISTRO);
			setState(228);
			variavel();
			setState(229);
			mais_variaveis();
			setState(230);
			match(FIM_REGISTRO);
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

	public static class Decl_globalContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(LinguagemAlgoritimicaParser.PROCEDIMENTO, 0); }
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.ABRE_PARENTESES, 0); }
		public Parametros_opcionalContext parametros_opcional() {
			return getRuleContext(Parametros_opcionalContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.FECHA_PARENTESES, 0); }
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIM_FUNCAO() { return getToken(LinguagemAlgoritimicaParser.FIM_FUNCAO, 0); }
		public Decl_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterDecl_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitDecl_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitDecl_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_globalContext decl_global() throws RecognitionException {
		Decl_globalContext _localctx = new Decl_globalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_decl_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(PROCEDIMENTO);
			setState(233);
			match(ID);
			setState(234);
			match(ABRE_PARENTESES);
			setState(235);
			parametros_opcional();
			setState(236);
			match(FECHA_PARENTESES);
			setState(237);
			declaracoes_locais();
			setState(238);
			comandos();
			setState(239);
			match(FIM_FUNCAO);
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

	public static class Parametros_opcionalContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Parametros_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterParametros_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitParametros_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitParametros_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_opcionalContext parametros_opcional() throws RecognitionException {
		Parametros_opcionalContext _localctx = new Parametros_opcionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIRCUNFLEXO) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				setState(241);
				parametro();
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

	public static class ParametroContext extends ParserRuleContext {
		public Var_opcionalContext var_opcional() {
			return getRuleContext(Var_opcionalContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(LinguagemAlgoritimicaParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public Mais_parametrosContext mais_parametros() {
			return getRuleContext(Mais_parametrosContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			var_opcional();
			setState(245);
			identificador();
			setState(246);
			mais_ident();
			setState(247);
			match(DOIS_PONTOS);
			setState(248);
			tipo_estendido();
			setState(249);
			mais_parametros();
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

	public static class Var_opcionalContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LinguagemAlgoritimicaParser.VAR, 0); }
		public Var_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterVar_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitVar_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitVar_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_opcionalContext var_opcional() throws RecognitionException {
		Var_opcionalContext _localctx = new Var_opcionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(251);
				match(VAR);
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

	public static class Mais_parametrosContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(LinguagemAlgoritimicaParser.VIRGULA, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Mais_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterMais_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitMais_parametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitMais_parametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_parametrosContext mais_parametros() throws RecognitionException {
		Mais_parametrosContext _localctx = new Mais_parametrosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mais_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(254);
				match(VIRGULA);
				setState(255);
				parametro();
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

	public static class Declaracoes_locaisContext extends ParserRuleContext {
		public Decl_localContext decl_local() {
			return getRuleContext(Decl_localContext.class,0);
		}
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public Declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_locais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterDeclaracoes_locais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitDeclaracoes_locais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitDeclaracoes_locais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracoes_locaisContext declaracoes_locais() throws RecognitionException {
		Declaracoes_locaisContext _localctx = new Declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracoes_locais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANTE) | (1L << DECLARE) | (1L << TIPO))) != 0)) {
				{
				setState(258);
				decl_local();
				setState(259);
				declaracoes_locais();
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

	public static class CorpoContext extends ParserRuleContext {
		public Decl_localContext decl_local() {
			return getRuleContext(Decl_localContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			decl_local();
			setState(264);
			comandos();
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

	public static class ComandosContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CIRCUNFLEXO) | (1L << PONTO) | (1L << ABRE_COLCHETE) | (1L << ABRE_PARENTESES) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE))) != 0)) {
				{
				setState(266);
				cmd();
				setState(267);
				comandos();
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

	public static class CmdContext extends ParserRuleContext {
		public LeiaContext leia() {
			return getRuleContext(LeiaContext.class,0);
		}
		public EscrevaContext escreva() {
			return getRuleContext(EscrevaContext.class,0);
		}
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public CasoContext caso() {
			return getRuleContext(CasoContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public FacaContext faca() {
			return getRuleContext(FacaContext.class,0);
		}
		public Atribuicao_ponteiroContext atribuicao_ponteiro() {
			return getRuleContext(Atribuicao_ponteiroContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public RetorneContext retorne() {
			return getRuleContext(RetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmd);
		try {
			setState(281);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				leia();
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				escreva();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				se();
				}
				break;
			case CASO:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				caso();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				para();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 6);
				{
				setState(276);
				enquanto();
				}
				break;
			case FACA:
				enterOuterAlt(_localctx, 7);
				{
				setState(277);
				faca();
				}
				break;
			case CIRCUNFLEXO:
				enterOuterAlt(_localctx, 8);
				{
				setState(278);
				atribuicao_ponteiro();
				}
				break;
			case T__0:
			case PONTO:
			case ABRE_COLCHETE:
			case ABRE_PARENTESES:
				enterOuterAlt(_localctx, 9);
				{
				setState(279);
				atribuicao();
				}
				break;
			case RETORNE:
				enterOuterAlt(_localctx, 10);
				{
				setState(280);
				retorne();
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

	public static class LeiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(LinguagemAlgoritimicaParser.LEIA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.ABRE_PARENTESES, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.FECHA_PARENTESES, 0); }
		public LeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitLeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitLeia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeiaContext leia() throws RecognitionException {
		LeiaContext _localctx = new LeiaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_leia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(LEIA);
			setState(284);
			match(ABRE_PARENTESES);
			setState(285);
			identificador();
			setState(286);
			mais_ident();
			setState(287);
			match(FECHA_PARENTESES);
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

	public static class EscrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(LinguagemAlgoritimicaParser.ESCREVA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.FECHA_PARENTESES, 0); }
		public EscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitEscreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitEscreva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscrevaContext escreva() throws RecognitionException {
		EscrevaContext _localctx = new EscrevaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ESCREVA);
			setState(290);
			match(ABRE_PARENTESES);
			setState(291);
			expressao();
			setState(292);
			mais_expressao();
			setState(293);
			match(FECHA_PARENTESES);
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

	public static class SeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(LinguagemAlgoritimicaParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(LinguagemAlgoritimicaParser.ENTAO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public TerminalNode FIM_SE() { return getToken(LinguagemAlgoritimicaParser.FIM_SE, 0); }
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(SE);
			setState(296);
			expressao();
			setState(297);
			match(ENTAO);
			setState(298);
			comandos();
			setState(299);
			senao_opcional();
			setState(300);
			match(FIM_SE);
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

	public static class CasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(LinguagemAlgoritimicaParser.CASO, 0); }
		public Exp_aritimeticaContext exp_aritimetica() {
			return getRuleContext(Exp_aritimeticaContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(LinguagemAlgoritimicaParser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(LinguagemAlgoritimicaParser.FIM_CASO, 0); }
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_caso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(CASO);
			setState(303);
			exp_aritimetica();
			setState(304);
			match(SEJA);
			setState(305);
			selecao();
			setState(306);
			senao_opcional();
			setState(307);
			match(FIM_CASO);
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(LinguagemAlgoritimicaParser.PARA, 0); }
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
		public List<Exp_aritimeticaContext> exp_aritimetica() {
			return getRuleContexts(Exp_aritimeticaContext.class);
		}
		public Exp_aritimeticaContext exp_aritimetica(int i) {
			return getRuleContext(Exp_aritimeticaContext.class,i);
		}
		public TerminalNode ATE() { return getToken(LinguagemAlgoritimicaParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(LinguagemAlgoritimicaParser.FACA, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIM_PARA() { return getToken(LinguagemAlgoritimicaParser.FIM_PARA, 0); }
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(PARA);
			setState(310);
			match(ID);
			setState(311);
			match(T__0);
			setState(312);
			exp_aritimetica();
			setState(313);
			match(ATE);
			setState(314);
			exp_aritimetica();
			setState(315);
			match(FACA);
			setState(316);
			comandos();
			setState(317);
			match(FIM_PARA);
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

	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(LinguagemAlgoritimicaParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(LinguagemAlgoritimicaParser.FACA, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIM_ENQUANTO() { return getToken(LinguagemAlgoritimicaParser.FIM_ENQUANTO, 0); }
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(ENQUANTO);
			setState(320);
			expressao();
			setState(321);
			match(FACA);
			setState(322);
			comandos();
			setState(323);
			match(FIM_ENQUANTO);
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

	public static class FacaContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(LinguagemAlgoritimicaParser.FACA, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode ATE() { return getToken(LinguagemAlgoritimicaParser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitFaca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitFaca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacaContext faca() throws RecognitionException {
		FacaContext _localctx = new FacaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_faca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(FACA);
			setState(326);
			comandos();
			setState(327);
			match(ATE);
			setState(328);
			expressao();
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

	public static class Atribuicao_ponteiroContext extends ParserRuleContext {
		public TerminalNode CIRCUNFLEXO() { return getToken(LinguagemAlgoritimicaParser.CIRCUNFLEXO, 0); }
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Atribuicao_ponteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_ponteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterAtribuicao_ponteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitAtribuicao_ponteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitAtribuicao_ponteiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atribuicao_ponteiroContext atribuicao_ponteiro() throws RecognitionException {
		Atribuicao_ponteiroContext _localctx = new Atribuicao_ponteiroContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_atribuicao_ponteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(CIRCUNFLEXO);
			setState(331);
			match(ID);
			setState(332);
			outros_ident();
			setState(333);
			dimensao();
			setState(334);
			match(T__0);
			setState(335);
			expressao();
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public Chamada_atribuicaoContext chamada_atribuicao() {
			return getRuleContext(Chamada_atribuicaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			chamada_atribuicao();
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

	public static class RetorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(LinguagemAlgoritimicaParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitRetorne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitRetorne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetorneContext retorne() throws RecognitionException {
		RetorneContext _localctx = new RetorneContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_retorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(RETORNE);
			setState(340);
			expressao();
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

	public static class Mais_expressaoContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(LinguagemAlgoritimicaParser.VIRGULA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterMais_expressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitMais_expressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitMais_expressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_mais_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(342);
				match(VIRGULA);
				setState(343);
				expressao();
				setState(344);
				mais_expressao();
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

	public static class Senao_opcionalContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(LinguagemAlgoritimicaParser.SENAO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterSenao_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitSenao_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitSenao_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Senao_opcionalContext senao_opcional() throws RecognitionException {
		Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_senao_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(348);
				match(SENAO);
				setState(349);
				comandos();
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

	public static class Chamada_atribuicaoContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.ABRE_PARENTESES, 0); }
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.FECHA_PARENTESES, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterChamada_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitChamada_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitChamada_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_atribuicaoContext chamada_atribuicao() throws RecognitionException {
		Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_chamada_atribuicao);
		try {
			setState(361);
			switch (_input.LA(1)) {
			case ABRE_PARENTESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(ABRE_PARENTESES);
				setState(353);
				argumentos_opcional();
				setState(354);
				match(FECHA_PARENTESES);
				}
				break;
			case T__0:
			case PONTO:
			case ABRE_COLCHETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				outros_ident();
				setState(357);
				dimensao();
				setState(358);
				match(T__0);
				setState(359);
				expressao();
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

	public static class Argumentos_opcionalContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Argumentos_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterArgumentos_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitArgumentos_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitArgumentos_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argumentos_opcionalContext argumentos_opcional() throws RecognitionException {
		Argumentos_opcionalContext _localctx = new Argumentos_opcionalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argumentos_opcional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(363);
				expressao();
				setState(364);
				mais_expressao();
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

	public static class SelecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(LinguagemAlgoritimicaParser.DOIS_PONTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Mais_selecaoContext mais_selecao() {
			return getRuleContext(Mais_selecaoContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			constantes();
			setState(369);
			match(DOIS_PONTOS);
			setState(370);
			comandos();
			setState(371);
			mais_selecao();
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

	public static class Mais_selecaoContext extends ParserRuleContext {
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Mais_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterMais_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitMais_selecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitMais_selecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_selecaoContext mais_selecao() throws RecognitionException {
		Mais_selecaoContext _localctx = new Mais_selecaoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mais_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if (_la==MENOS || _la==NUM_INT) {
				{
				setState(373);
				selecao();
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

	public static class ConstantesContext extends ParserRuleContext {
		public Numero_intervaloContext numero_intervalo() {
			return getRuleContext(Numero_intervaloContext.class,0);
		}
		public Mais_constanteContext mais_constante() {
			return getRuleContext(Mais_constanteContext.class,0);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			numero_intervalo();
			setState(377);
			mais_constante();
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

	public static class Mais_constanteContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(LinguagemAlgoritimicaParser.VIRGULA, 0); }
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public Mais_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterMais_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitMais_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitMais_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_constanteContext mais_constante() throws RecognitionException {
		Mais_constanteContext _localctx = new Mais_constanteContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_mais_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(379);
				match(VIRGULA);
				setState(380);
				constantes();
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

	public static class Numero_intervaloContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LinguagemAlgoritimicaParser.NUM_INT, 0); }
		public Intervalo_opcionalContext intervalo_opcional() {
			return getRuleContext(Intervalo_opcionalContext.class,0);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitNumero_intervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitNumero_intervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			op_unario();
			setState(384);
			match(NUM_INT);
			setState(385);
			intervalo_opcional();
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

	public static class Intervalo_opcionalContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LinguagemAlgoritimicaParser.NUM_INT, 0); }
		public Intervalo_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterIntervalo_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitIntervalo_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitIntervalo_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
		Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_intervalo_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(387);
				match(T__1);
				setState(388);
				op_unario();
				setState(389);
				match(NUM_INT);
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

	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode MENOS() { return getToken(LinguagemAlgoritimicaParser.MENOS, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitOp_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitOp_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_op_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if (_la==MENOS) {
				{
				setState(393);
				match(MENOS);
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

	public static class Exp_aritimeticaContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Exp_aritimeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritimetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterExp_aritimetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitExp_aritimetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitExp_aritimetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_aritimeticaContext exp_aritimetica() throws RecognitionException {
		Exp_aritimeticaContext _localctx = new Exp_aritimeticaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_exp_aritimetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			termo();
			setState(397);
			outros_termos();
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

	public static class Op_multiplicacoContext extends ParserRuleContext {
		public TerminalNode VEZES() { return getToken(LinguagemAlgoritimicaParser.VEZES, 0); }
		public TerminalNode DIVIDIR() { return getToken(LinguagemAlgoritimicaParser.DIVIDIR, 0); }
		public Op_multiplicacoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicaco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterOp_multiplicaco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitOp_multiplicaco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitOp_multiplicaco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_multiplicacoContext op_multiplicaco() throws RecognitionException {
		Op_multiplicacoContext _localctx = new Op_multiplicacoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_op_multiplicaco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_la = _input.LA(1);
			if ( !(_la==VEZES || _la==DIVIDIR) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Op_adicaoContext extends ParserRuleContext {
		public TerminalNode MAIS() { return getToken(LinguagemAlgoritimicaParser.MAIS, 0); }
		public TerminalNode MENOS() { return getToken(LinguagemAlgoritimicaParser.MENOS, 0); }
		public Op_adicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_adicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterOp_adicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitOp_adicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitOp_adicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_adicaoContext op_adicao() throws RecognitionException {
		Op_adicaoContext _localctx = new Op_adicaoContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ( !(_la==MENOS || _la==MAIS) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			fator();
			setState(404);
			outros_fatores();
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

	public static class Outros_termosContext extends ParserRuleContext {
		public Op_adicaoContext op_adicao() {
			return getRuleContext(Op_adicaoContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Outros_termosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitOutros_termos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitOutros_termos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_outros_termos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(406);
				op_adicao();
				setState(407);
				termo();
				setState(408);
				outros_termos();
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

	public static class FatorContext extends ParserRuleContext {
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			parcela();
			setState(413);
			outras_parcelas();
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

	public static class Outros_fatoresContext extends ParserRuleContext {
		public Op_multiplicacoContext op_multiplicaco() {
			return getRuleContext(Op_multiplicacoContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public Outros_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterOutros_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitOutros_fatores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitOutros_fatores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_fatoresContext outros_fatores() throws RecognitionException {
		Outros_fatoresContext _localctx = new Outros_fatoresContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_outros_fatores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_la = _input.LA(1);
			if (_la==VEZES || _la==DIVIDIR) {
				{
				setState(415);
				op_multiplicaco();
				setState(416);
				fator();
				setState(417);
				outros_fatores();
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

	public static class ParcelaContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_parcela);
		try {
			setState(425);
			switch (_input.LA(1)) {
			case CIRCUNFLEXO:
			case ABRE_PARENTESES:
			case MENOS:
			case NUM_REAL:
			case NUM_INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				op_unario();
				setState(422);
				parcela_unario();
				}
				break;
			case T__2:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				parcela_nao_unario();
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

	public static class Parcela_unarioContext extends ParserRuleContext {
		public TerminalNode CIRCUNFLEXO() { return getToken(LinguagemAlgoritimicaParser.CIRCUNFLEXO, 0); }
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Chamada_partesContext chamada_partes() {
			return getRuleContext(Chamada_partesContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LinguagemAlgoritimicaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LinguagemAlgoritimicaParser.NUM_REAL, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.FECHA_PARENTESES, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitParcela_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitParcela_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_parcela_unario);
		try {
			setState(440);
			switch (_input.LA(1)) {
			case CIRCUNFLEXO:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(CIRCUNFLEXO);
				setState(428);
				match(ID);
				setState(429);
				outros_ident();
				setState(430);
				dimensao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(ID);
				setState(433);
				chamada_partes();
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(NUM_INT);
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(NUM_REAL);
				}
				break;
			case ABRE_PARENTESES:
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
				match(ABRE_PARENTESES);
				setState(437);
				expressao();
				setState(438);
				match(FECHA_PARENTESES);
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

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LinguagemAlgoritimicaParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitParcela_nao_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitParcela_nao_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parcela_nao_unario);
		try {
			setState(448);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(T__2);
				setState(443);
				match(ID);
				setState(444);
				outros_ident();
				setState(445);
				dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(CADEIA);
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

	public static class Outras_parcelasContext extends ParserRuleContext {
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public Outras_parcelasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outras_parcelas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterOutras_parcelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitOutras_parcelas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitOutras_parcelas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_outras_parcelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(450);
				match(T__3);
				setState(451);
				parcela();
				setState(452);
				outras_parcelas();
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

	public static class Chamada_partesContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.FECHA_PARENTESES, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Chamada_partesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_partes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterChamada_partes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitChamada_partes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitChamada_partes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_partesContext chamada_partes() throws RecognitionException {
		Chamada_partesContext _localctx = new Chamada_partesContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_chamada_partes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(456);
				match(ABRE_PARENTESES);
				setState(457);
				expressao();
				setState(458);
				mais_expressao();
				setState(459);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				{
				setState(461);
				outros_ident();
				setState(462);
				dimensao();
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

	public static class Exp_relacionalContext extends ParserRuleContext {
		public Exp_aritimeticaContext exp_aritimetica() {
			return getRuleContext(Exp_aritimeticaContext.class,0);
		}
		public Op_opcionalContext op_opcional() {
			return getRuleContext(Op_opcionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitExp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitExp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_exp_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			exp_aritimetica();
			setState(467);
			op_opcional();
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

	public static class Op_opcionalContext extends ParserRuleContext {
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_aritimeticaContext exp_aritimetica() {
			return getRuleContext(Exp_aritimeticaContext.class,0);
		}
		public Op_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterOp_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitOp_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitOp_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_opcionalContext op_opcional() throws RecognitionException {
		Op_opcionalContext _localctx = new Op_opcionalContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_op_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << IGUAL_ASSIMILACAO))) != 0)) {
				{
				setState(469);
				op_relacional();
				setState(470);
				exp_aritimetica();
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << IGUAL_ASSIMILACAO))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			termo_logico();
			setState(477);
			outros_termos_logicos();
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

	public static class Op_naoContext extends ParserRuleContext {
		public Op_naoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterOp_nao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitOp_nao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitOp_nao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_op_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(479);
				match(T__9);
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

	public static class Termo_logicoContext extends ParserRuleContext {
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitTermo_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitTermo_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_termo_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			fator_logico();
			setState(483);
			outros_fatores_logicos();
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

	public static class Outros_termos_logicosContext extends ParserRuleContext {
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public Outros_termos_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterOutros_termos_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitOutros_termos_logicos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitOutros_termos_logicos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_termos_logicosContext outros_termos_logicos() throws RecognitionException {
		Outros_termos_logicosContext _localctx = new Outros_termos_logicosContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_outros_termos_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(485);
				match(T__10);
				setState(486);
				termo_logico();
				setState(487);
				outros_termos_logicos();
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

	public static class Fator_logicoContext extends ParserRuleContext {
		public Op_naoContext op_nao() {
			return getRuleContext(Op_naoContext.class,0);
		}
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitFator_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitFator_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_fator_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(491);
				op_nao();
				setState(492);
				parcela_logica();
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

	public static class Outros_fatores_logicosContext extends ParserRuleContext {
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Outros_fatores_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterOutros_fatores_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitOutros_fatores_logicos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitOutros_fatores_logicos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_fatores_logicosContext outros_fatores_logicos() throws RecognitionException {
		Outros_fatores_logicosContext _localctx = new Outros_fatores_logicosContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_outros_fatores_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(496);
				match(T__11);
				setState(497);
				fator_logico();
				setState(498);
				outros_fatores_logicos();
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

	public static class Parcela_logicaContext extends ParserRuleContext {
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitParcela_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitParcela_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_parcela_logica);
		try {
			setState(505);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(T__13);
				}
				break;
			case T__2:
			case CIRCUNFLEXO:
			case ABRE_PARENTESES:
			case MENOS:
			case NUM_REAL:
			case NUM_INT:
			case CADEIA:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				exp_relacional();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3B\u01fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\5\3\u0097\n\3\3\4\3\4\5\4\u009b\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00aa\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00b7\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\5\t\u00c0\n\t\3\n\3\n\5\n\u00c4\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00cb"+
		"\n\13\3\f\3\f\5\f\u00cf\n\f\3\r\3\r\3\r\5\r\u00d4\n\r\3\16\3\16\3\16\5"+
		"\16\u00d9\n\16\3\17\3\17\3\20\3\20\5\20\u00df\n\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\5\25\u00f5\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\5\27"+
		"\u00ff\n\27\3\30\3\30\5\30\u0103\n\30\3\31\3\31\3\31\5\31\u0108\n\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\5\33\u0110\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u011c\n\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\5"+
		"\'\u015d\n\'\3(\3(\5(\u0161\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u016c\n)"+
		"\3*\3*\3*\5*\u0171\n*\3+\3+\3+\3+\3+\3,\5,\u0179\n,\3-\3-\3-\3.\3.\5."+
		"\u0180\n.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\5\60\u018a\n\60\3\61\5\61\u018d"+
		"\n\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\5\66\u019d\n\66\3\67\3\67\3\67\38\38\38\38\58\u01a6\n8\39\39\39"+
		"\39\59\u01ac\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u01bb\n:\3;"+
		"\3;\3;\3;\3;\3;\5;\u01c3\n;\3<\3<\3<\3<\5<\u01c9\n<\3=\3=\3=\3=\3=\3="+
		"\3=\3=\5=\u01d3\n=\3>\3>\3>\3?\3?\3?\5?\u01db\n?\3@\3@\3A\3A\3A\3B\5B"+
		"\u01e3\nB\3C\3C\3C\3D\3D\3D\3D\5D\u01ec\nD\3E\3E\3E\5E\u01f1\nE\3F\3F"+
		"\3F\3F\5F\u01f7\nF\3G\3G\3G\5G\u01fc\nG\3G\2\2H\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\2\7\3\29<\4\288=?\3\2\65"+
		"\66\3\2\63\64\4\2\7\13\27\27\u01eb\2\u008e\3\2\2\2\4\u0096\3\2\2\2\6\u009a"+
		"\3\2\2\2\b\u00a9\3\2\2\2\n\u00ab\3\2\2\2\f\u00b6\3\2\2\2\16\u00b8\3\2"+
		"\2\2\20\u00bf\3\2\2\2\22\u00c3\3\2\2\2\24\u00ca\3\2\2\2\26\u00ce\3\2\2"+
		"\2\30\u00d3\3\2\2\2\32\u00d8\3\2\2\2\34\u00da\3\2\2\2\36\u00de\3\2\2\2"+
		" \u00e0\3\2\2\2\"\u00e3\3\2\2\2$\u00e5\3\2\2\2&\u00ea\3\2\2\2(\u00f4\3"+
		"\2\2\2*\u00f6\3\2\2\2,\u00fe\3\2\2\2.\u0102\3\2\2\2\60\u0107\3\2\2\2\62"+
		"\u0109\3\2\2\2\64\u010f\3\2\2\2\66\u011b\3\2\2\28\u011d\3\2\2\2:\u0123"+
		"\3\2\2\2<\u0129\3\2\2\2>\u0130\3\2\2\2@\u0137\3\2\2\2B\u0141\3\2\2\2D"+
		"\u0147\3\2\2\2F\u014c\3\2\2\2H\u0153\3\2\2\2J\u0155\3\2\2\2L\u015c\3\2"+
		"\2\2N\u0160\3\2\2\2P\u016b\3\2\2\2R\u0170\3\2\2\2T\u0172\3\2\2\2V\u0178"+
		"\3\2\2\2X\u017a\3\2\2\2Z\u017f\3\2\2\2\\\u0181\3\2\2\2^\u0189\3\2\2\2"+
		"`\u018c\3\2\2\2b\u018e\3\2\2\2d\u0191\3\2\2\2f\u0193\3\2\2\2h\u0195\3"+
		"\2\2\2j\u019c\3\2\2\2l\u019e\3\2\2\2n\u01a5\3\2\2\2p\u01ab\3\2\2\2r\u01ba"+
		"\3\2\2\2t\u01c2\3\2\2\2v\u01c8\3\2\2\2x\u01d2\3\2\2\2z\u01d4\3\2\2\2|"+
		"\u01da\3\2\2\2~\u01dc\3\2\2\2\u0080\u01de\3\2\2\2\u0082\u01e2\3\2\2\2"+
		"\u0084\u01e4\3\2\2\2\u0086\u01eb\3\2\2\2\u0088\u01f0\3\2\2\2\u008a\u01f6"+
		"\3\2\2\2\u008c\u01fb\3\2\2\2\u008e\u008f\5\4\3\2\u008f\u0090\7\21\2\2"+
		"\u0090\u0091\5\62\32\2\u0091\u0092\7\22\2\2\u0092\3\3\2\2\2\u0093\u0094"+
		"\5\6\4\2\u0094\u0095\5\4\3\2\u0095\u0097\3\2\2\2\u0096\u0093\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\5\3\2\2\2\u0098\u009b\5\b\5\2\u0099\u009b\5&\24\2"+
		"\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\7\3\2\2\2\u009c\u009d\7"+
		"\24\2\2\u009d\u00aa\5\n\6\2\u009e\u009f\7\23\2\2\u009f\u00a0\7@\2\2\u00a0"+
		"\u00a1\7\26\2\2\u00a1\u00a2\5\34\17\2\u00a2\u00a3\7\27\2\2\u00a3\u00a4"+
		"\5\"\22\2\u00a4\u00aa\3\2\2\2\u00a5\u00a6\7\25\2\2\u00a6\u00a7\7@\2\2"+
		"\u00a7\u00a8\7\26\2\2\u00a8\u00aa\5\26\f\2\u00a9\u009c\3\2\2\2\u00a9\u009e"+
		"\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\t\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac"+
		"\u00ad\5\24\13\2\u00ad\u00ae\5\f\7\2\u00ae\u00af\7\26\2\2\u00af\u00b0"+
		"\7\25\2\2\u00b0\13\3\2\2\2\u00b1\u00b2\7\30\2\2\u00b2\u00b3\7@\2\2\u00b3"+
		"\u00b4\5\24\13\2\u00b4\u00b5\5\f\7\2\u00b5\u00b7\3\2\2\2\u00b6\u00b1\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\r\3\2\2\2\u00b8\u00b9\5\20\t\2\u00b9"+
		"\u00ba\7@\2\2\u00ba\u00bb\5\24\13\2\u00bb\u00bc\5\22\n\2\u00bc\17\3\2"+
		"\2\2\u00bd\u00be\7\31\2\2\u00be\u00c0\5\20\t\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\21\3\2\2\2\u00c1\u00c2\7\32\2\2\u00c2\u00c4\5\16"+
		"\b\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\23\3\2\2\2\u00c5\u00c6"+
		"\7\33\2\2\u00c6\u00c7\5b\62\2\u00c7\u00c8\7\34\2\2\u00c8\u00c9\5\24\13"+
		"\2\u00c9\u00cb\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\25"+
		"\3\2\2\2\u00cc\u00cf\5$\23\2\u00cd\u00cf\5 \21\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\27\3\2\2\2\u00d0\u00d1\7\32\2\2\u00d1\u00d2\7@\2"+
		"\2\u00d2\u00d4\5\30\r\2\u00d3\u00d0\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\31\3\2\2\2\u00d5\u00d6\5\n\6\2\u00d6\u00d7\5\32\16\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\33\3\2\2\2\u00da\u00db"+
		"\t\2\2\2\u00db\35\3\2\2\2\u00dc\u00df\5\34\17\2\u00dd\u00df\7@\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\37\3\2\2\2\u00e0\u00e1\5\20\t"+
		"\2\u00e1\u00e2\5\36\20\2\u00e2!\3\2\2\2\u00e3\u00e4\t\3\2\2\u00e4#\3\2"+
		"\2\2\u00e5\u00e6\7\35\2\2\u00e6\u00e7\5\n\6\2\u00e7\u00e8\5\32\16\2\u00e8"+
		"\u00e9\7\36\2\2\u00e9%\3\2\2\2\u00ea\u00eb\7\37\2\2\u00eb\u00ec\7@\2\2"+
		"\u00ec\u00ed\7 \2\2\u00ed\u00ee\5(\25\2\u00ee\u00ef\7!\2\2\u00ef\u00f0"+
		"\5\60\31\2\u00f0\u00f1\5\64\33\2\u00f1\u00f2\7\"\2\2\u00f2\'\3\2\2\2\u00f3"+
		"\u00f5\5*\26\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5)\3\2\2\2"+
		"\u00f6\u00f7\5,\27\2\u00f7\u00f8\5\16\b\2\u00f8\u00f9\5\30\r\2\u00f9\u00fa"+
		"\7\26\2\2\u00fa\u00fb\5 \21\2\u00fb\u00fc\5.\30\2\u00fc+\3\2\2\2\u00fd"+
		"\u00ff\7\67\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff-\3\2\2\2"+
		"\u0100\u0101\7\30\2\2\u0101\u0103\5*\26\2\u0102\u0100\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103/\3\2\2\2\u0104\u0105\5\b\5\2\u0105\u0106\5\60\31\2\u0106"+
		"\u0108\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0108\3\2\2\2\u0108\61\3\2\2"+
		"\2\u0109\u010a\5\b\5\2\u010a\u010b\5\64\33\2\u010b\63\3\2\2\2\u010c\u010d"+
		"\5\66\34\2\u010d\u010e\5\64\33\2\u010e\u0110\3\2\2\2\u010f\u010c\3\2\2"+
		"\2\u010f\u0110\3\2\2\2\u0110\65\3\2\2\2\u0111\u011c\58\35\2\u0112\u011c"+
		"\5:\36\2\u0113\u011c\5<\37\2\u0114\u011c\5> \2\u0115\u011c\5@!\2\u0116"+
		"\u011c\5B\"\2\u0117\u011c\5D#\2\u0118\u011c\5F$\2\u0119\u011c\5H%\2\u011a"+
		"\u011c\5J&\2\u011b\u0111\3\2\2\2\u011b\u0112\3\2\2\2\u011b\u0113\3\2\2"+
		"\2\u011b\u0114\3\2\2\2\u011b\u0115\3\2\2\2\u011b\u0116\3\2\2\2\u011b\u0117"+
		"\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\67\3\2\2\2\u011d\u011e\7#\2\2\u011e\u011f\7 \2\2\u011f\u0120\5\16\b\2"+
		"\u0120\u0121\5\30\r\2\u0121\u0122\7!\2\2\u01229\3\2\2\2\u0123\u0124\7"+
		"$\2\2\u0124\u0125\7 \2\2\u0125\u0126\5\u0080A\2\u0126\u0127\5L\'\2\u0127"+
		"\u0128\7!\2\2\u0128;\3\2\2\2\u0129\u012a\7%\2\2\u012a\u012b\5\u0080A\2"+
		"\u012b\u012c\7\'\2\2\u012c\u012d\5\64\33\2\u012d\u012e\5N(\2\u012e\u012f"+
		"\7&\2\2\u012f=\3\2\2\2\u0130\u0131\7(\2\2\u0131\u0132\5b\62\2\u0132\u0133"+
		"\7+\2\2\u0133\u0134\5T+\2\u0134\u0135\5N(\2\u0135\u0136\7)\2\2\u0136?"+
		"\3\2\2\2\u0137\u0138\7*\2\2\u0138\u0139\7@\2\2\u0139\u013a\7\3\2\2\u013a"+
		"\u013b\5b\62\2\u013b\u013c\7.\2\2\u013c\u013d\5b\62\2\u013d\u013e\7-\2"+
		"\2\u013e\u013f\5\64\33\2\u013f\u0140\7,\2\2\u0140A\3\2\2\2\u0141\u0142"+
		"\7/\2\2\u0142\u0143\5\u0080A\2\u0143\u0144\7-\2\2\u0144\u0145\5\64\33"+
		"\2\u0145\u0146\7\60\2\2\u0146C\3\2\2\2\u0147\u0148\7-\2\2\u0148\u0149"+
		"\5\64\33\2\u0149\u014a\7.\2\2\u014a\u014b\5\u0080A\2\u014bE\3\2\2\2\u014c"+
		"\u014d\7\31\2\2\u014d\u014e\7@\2\2\u014e\u014f\5\22\n\2\u014f\u0150\5"+
		"\24\13\2\u0150\u0151\7\3\2\2\u0151\u0152\5\u0080A\2\u0152G\3\2\2\2\u0153"+
		"\u0154\5P)\2\u0154I\3\2\2\2\u0155\u0156\7\61\2\2\u0156\u0157\5\u0080A"+
		"\2\u0157K\3\2\2\2\u0158\u0159\7\30\2\2\u0159\u015a\5\u0080A\2\u015a\u015b"+
		"\5L\'\2\u015b\u015d\3\2\2\2\u015c\u0158\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"M\3\2\2\2\u015e\u015f\7\62\2\2\u015f\u0161\5\64\33\2\u0160\u015e\3\2\2"+
		"\2\u0160\u0161\3\2\2\2\u0161O\3\2\2\2\u0162\u0163\7 \2\2\u0163\u0164\5"+
		"R*\2\u0164\u0165\7!\2\2\u0165\u016c\3\2\2\2\u0166\u0167\5\22\n\2\u0167"+
		"\u0168\5\24\13\2\u0168\u0169\7\3\2\2\u0169\u016a\5\u0080A\2\u016a\u016c"+
		"\3\2\2\2\u016b\u0162\3\2\2\2\u016b\u0166\3\2\2\2\u016cQ\3\2\2\2\u016d"+
		"\u016e\5\u0080A\2\u016e\u016f\5L\'\2\u016f\u0171\3\2\2\2\u0170\u016d\3"+
		"\2\2\2\u0170\u0171\3\2\2\2\u0171S\3\2\2\2\u0172\u0173\5X-\2\u0173\u0174"+
		"\7\26\2\2\u0174\u0175\5\64\33\2\u0175\u0176\5V,\2\u0176U\3\2\2\2\u0177"+
		"\u0179\5T+\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179W\3\2\2\2\u017a"+
		"\u017b\5\\/\2\u017b\u017c\5Z.\2\u017cY\3\2\2\2\u017d\u017e\7\30\2\2\u017e"+
		"\u0180\5X-\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180[\3\2\2\2\u0181"+
		"\u0182\5`\61\2\u0182\u0183\7>\2\2\u0183\u0184\5^\60\2\u0184]\3\2\2\2\u0185"+
		"\u0186\7\4\2\2\u0186\u0187\5`\61\2\u0187\u0188\7>\2\2\u0188\u018a\3\2"+
		"\2\2\u0189\u0185\3\2\2\2\u0189\u018a\3\2\2\2\u018a_\3\2\2\2\u018b\u018d"+
		"\7\63\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018da\3\2\2\2\u018e"+
		"\u018f\5h\65\2\u018f\u0190\5j\66\2\u0190c\3\2\2\2\u0191\u0192\t\4\2\2"+
		"\u0192e\3\2\2\2\u0193\u0194\t\5\2\2\u0194g\3\2\2\2\u0195\u0196\5l\67\2"+
		"\u0196\u0197\5n8\2\u0197i\3\2\2\2\u0198\u0199\5f\64\2\u0199\u019a\5h\65"+
		"\2\u019a\u019b\5j\66\2\u019b\u019d\3\2\2\2\u019c\u0198\3\2\2\2\u019c\u019d"+
		"\3\2\2\2\u019dk\3\2\2\2\u019e\u019f\5p9\2\u019f\u01a0\5v<\2\u01a0m\3\2"+
		"\2\2\u01a1\u01a2\5d\63\2\u01a2\u01a3\5l\67\2\u01a3\u01a4\5n8\2\u01a4\u01a6"+
		"\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6o\3\2\2\2\u01a7"+
		"\u01a8\5`\61\2\u01a8\u01a9\5r:\2\u01a9\u01ac\3\2\2\2\u01aa\u01ac\5t;\2"+
		"\u01ab\u01a7\3\2\2\2\u01ab\u01aa\3\2\2\2\u01acq\3\2\2\2\u01ad\u01ae\7"+
		"\31\2\2\u01ae\u01af\7@\2\2\u01af\u01b0\5\22\n\2\u01b0\u01b1\5\24\13\2"+
		"\u01b1\u01bb\3\2\2\2\u01b2\u01b3\7@\2\2\u01b3\u01bb\5x=\2\u01b4\u01bb"+
		"\7>\2\2\u01b5\u01bb\7=\2\2\u01b6\u01b7\7 \2\2\u01b7\u01b8\5\u0080A\2\u01b8"+
		"\u01b9\7!\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01ad\3\2\2\2\u01ba\u01b2\3\2"+
		"\2\2\u01ba\u01b4\3\2\2\2\u01ba\u01b5\3\2\2\2\u01ba\u01b6\3\2\2\2\u01bb"+
		"s\3\2\2\2\u01bc\u01bd\7\5\2\2\u01bd\u01be\7@\2\2\u01be\u01bf\5\22\n\2"+
		"\u01bf\u01c0\5\24\13\2\u01c0\u01c3\3\2\2\2\u01c1\u01c3\7?\2\2\u01c2\u01bc"+
		"\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3u\3\2\2\2\u01c4\u01c5\7\6\2\2\u01c5"+
		"\u01c6\5p9\2\u01c6\u01c7\5v<\2\u01c7\u01c9\3\2\2\2\u01c8\u01c4\3\2\2\2"+
		"\u01c8\u01c9\3\2\2\2\u01c9w\3\2\2\2\u01ca\u01cb\7 \2\2\u01cb\u01cc\5\u0080"+
		"A\2\u01cc\u01cd\5L\'\2\u01cd\u01ce\7!\2\2\u01ce\u01d3\3\2\2\2\u01cf\u01d0"+
		"\5\22\n\2\u01d0\u01d1\5\24\13\2\u01d1\u01d3\3\2\2\2\u01d2\u01ca\3\2\2"+
		"\2\u01d2\u01cf\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3y\3\2\2\2\u01d4\u01d5"+
		"\5b\62\2\u01d5\u01d6\5|?\2\u01d6{\3\2\2\2\u01d7\u01d8\5~@\2\u01d8\u01d9"+
		"\5b\62\2\u01d9\u01db\3\2\2\2\u01da\u01d7\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"}\3\2\2\2\u01dc\u01dd\t\6\2\2\u01dd\177\3\2\2\2\u01de\u01df\5\u0084C\2"+
		"\u01df\u01e0\5\u0086D\2\u01e0\u0081\3\2\2\2\u01e1\u01e3\7\f\2\2\u01e2"+
		"\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u0083\3\2\2\2\u01e4\u01e5\5\u0088"+
		"E\2\u01e5\u01e6\5\u008aF\2\u01e6\u0085\3\2\2\2\u01e7\u01e8\7\r\2\2\u01e8"+
		"\u01e9\5\u0084C\2\u01e9\u01ea\5\u0086D\2\u01ea\u01ec\3\2\2\2\u01eb\u01e7"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u0087\3\2\2\2\u01ed\u01ee\5\u0082B"+
		"\2\u01ee\u01ef\5\u008cG\2\u01ef\u01f1\3\2\2\2\u01f0\u01ed\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u0089\3\2\2\2\u01f2\u01f3\7\16\2\2\u01f3\u01f4\5"+
		"\u0088E\2\u01f4\u01f5\5\u008aF\2\u01f5\u01f7\3\2\2\2\u01f6\u01f2\3\2\2"+
		"\2\u01f6\u01f7\3\2\2\2\u01f7\u008b\3\2\2\2\u01f8\u01fc\7\17\2\2\u01f9"+
		"\u01fc\7\20\2\2\u01fa\u01fc\5z>\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fb\u01fa\3\2\2\2\u01fc\u008d\3\2\2\2(\u0096\u009a\u00a9\u00b6"+
		"\u00bf\u00c3\u00ca\u00ce\u00d3\u00d8\u00de\u00f4\u00fe\u0102\u0107\u010f"+
		"\u011b\u015c\u0160\u016b\u0170\u0178\u017f\u0189\u018c\u019c\u01a5\u01ab"+
		"\u01ba\u01c2\u01c8\u01d2\u01da\u01e2\u01eb\u01f0\u01f6\u01fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}