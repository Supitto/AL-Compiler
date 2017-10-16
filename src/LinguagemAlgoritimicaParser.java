// Generated from /home/supitto/IdeaProjects/AL-Compiler/src/LinguagemAlgoritimica.g4 by ANTLR 4.7
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
	public static final int
		RULE_programa = 0, RULE_decl_local_global = 1, RULE_decl_local = 2, RULE_variavel = 3, 
		RULE_mais_var = 4, RULE_identificador = 5, RULE_ponteiros_opcionais = 6, 
		RULE_outros_ident = 7, RULE_dimensao = 8, RULE_tipo = 9, RULE_mais_ident = 10, 
		RULE_tipo_basico = 11, RULE_tipo_basico_ident = 12, RULE_tipo_estendido = 13, 
		RULE_valor_constante = 14, RULE_registro = 15, RULE_decl_global = 16, 
		RULE_parametros_opcional = 17, RULE_parametro = 18, RULE_var_opcional = 19, 
		RULE_mais_parametros = 20, RULE_declaracoes_locais = 21, RULE_corpo = 22, 
		RULE_comandos = 23, RULE_cmd = 24, RULE_leia = 25, RULE_escreva = 26, 
		RULE_se = 27, RULE_caso = 28, RULE_para = 29, RULE_enquanto = 30, RULE_faca = 31, 
		RULE_chamada = 32, RULE_atribuicao = 33, RULE_retorne = 34, RULE_mais_expressao = 35, 
		RULE_senao_opcional = 36, RULE_argumentos_opcional = 37, RULE_selecao = 38, 
		RULE_constantes = 39, RULE_mais_constante = 40, RULE_numero_intervalo = 41, 
		RULE_intervalo_opcional = 42, RULE_op_unario = 43, RULE_exp_aritimetica = 44, 
		RULE_op_multiplicacao = 45, RULE_op_adicao = 46, RULE_termo = 47, RULE_outros_termos = 48, 
		RULE_fator = 49, RULE_outros_fatores = 50, RULE_parcela = 51, RULE_parcela_unario = 52, 
		RULE_parcela_nao_unario = 53, RULE_outras_parcelas = 54, RULE_chamada_partes = 55, 
		RULE_exp_relacional = 56, RULE_op_opcional = 57, RULE_op_relacional = 58, 
		RULE_expressao = 59, RULE_op_nao = 60, RULE_termo_logico = 61, RULE_outros_termos_logicos = 62, 
		RULE_fator_logico = 63, RULE_outros_fatores_logicos = 64, RULE_parcela_logica = 65;
	public static final String[] ruleNames = {
		"programa", "decl_local_global", "decl_local", "variavel", "mais_var", 
		"identificador", "ponteiros_opcionais", "outros_ident", "dimensao", "tipo", 
		"mais_ident", "tipo_basico", "tipo_basico_ident", "tipo_estendido", "valor_constante", 
		"registro", "decl_global", "parametros_opcional", "parametro", "var_opcional", 
		"mais_parametros", "declaracoes_locais", "corpo", "comandos", "cmd", "leia", 
		"escreva", "se", "caso", "para", "enquanto", "faca", "chamada", "atribuicao", 
		"retorne", "mais_expressao", "senao_opcional", "argumentos_opcional", 
		"selecao", "constantes", "mais_constante", "numero_intervalo", "intervalo_opcional", 
		"op_unario", "exp_aritimetica", "op_multiplicacao", "op_adicao", "termo", 
		"outros_termos", "fator", "outros_fatores", "parcela", "parcela_unario", 
		"parcela_nao_unario", "outras_parcelas", "chamada_partes", "exp_relacional", 
		"op_opcional", "op_relacional", "expressao", "op_nao", "termo_logico", 
		"outros_termos_logicos", "fator_logico", "outros_fatores_logicos", "parcela_logica"
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
		public TerminalNode ALGORITMO() { return getToken(LinguagemAlgoritimicaParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(LinguagemAlgoritimicaParser.FIM_ALGORITMO, 0); }
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANTE) | (1L << DECLARE) | (1L << TIPO) | (1L << PROCEDIMENTO) | (1L << FUNCAO))) != 0)) {
				{
				{
				setState(132);
				decl_local_global();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(ALGORITMO);
			setState(139);
			corpo();
			setState(140);
			match(FIM_ALGORITMO);
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
		enterRule(_localctx, 2, RULE_decl_local_global);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTANTE:
			case DECLARE:
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				decl_local();
				}
				break;
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
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
		enterRule(_localctx, 4, RULE_decl_local);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(DECLARE);
				setState(147);
				variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(CONSTANTE);
				setState(149);
				match(ID);
				setState(150);
				match(DOIS_PONTOS);
				setState(151);
				tipo_basico();
				setState(152);
				match(IGUAL_ASSIMILACAO);
				setState(153);
				valor_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(TIPO);
				setState(156);
				match(ID);
				setState(157);
				match(DOIS_PONTOS);
				setState(158);
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
		public TerminalNode DOIS_PONTOS() { return getToken(LinguagemAlgoritimicaParser.DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<Mais_varContext> mais_var() {
			return getRuleContexts(Mais_varContext.class);
		}
		public Mais_varContext mais_var(int i) {
			return getRuleContext(Mais_varContext.class,i);
		}
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
		enterRule(_localctx, 6, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);
			setState(162);
			dimensao();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(163);
				mais_var();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(DOIS_PONTOS);
			setState(170);
			tipo();
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
		enterRule(_localctx, 8, RULE_mais_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(VIRGULA);
			setState(173);
			match(ID);
			setState(174);
			dimensao();
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
		enterRule(_localctx, 10, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			ponteiros_opcionais();
			setState(177);
			match(ID);
			setState(178);
			dimensao();
			setState(179);
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
		enterRule(_localctx, 12, RULE_ponteiros_opcionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CIRCUNFLEXO) {
				{
				setState(181);
				match(CIRCUNFLEXO);
				setState(182);
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
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
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
		enterRule(_localctx, 14, RULE_outros_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTO) {
				{
				setState(185);
				match(PONTO);
				setState(186);
				match(ID);
				setState(187);
				dimensao();
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
		enterRule(_localctx, 16, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABRE_COLCHETE) {
				{
				setState(190);
				match(ABRE_COLCHETE);
				setState(191);
				exp_aritimetica();
				setState(192);
				match(FECHA_COLCHETE);
				setState(193);
				dimensao();
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
		enterRule(_localctx, 18, RULE_tipo);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
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
				setState(198);
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
		public TerminalNode VIRGULA() { return getToken(LinguagemAlgoritimicaParser.VIRGULA, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
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
		enterRule(_localctx, 20, RULE_mais_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(VIRGULA);
			setState(202);
			identificador();
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
		enterRule(_localctx, 22, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << INTEIRO) | (1L << REAL) | (1L << LOGICO))) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_tipo_basico_ident);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				tipo_basico();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
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
		enterRule(_localctx, 26, RULE_tipo_estendido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			ponteiros_opcionais();
			setState(211);
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
		enterRule(_localctx, 28, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << NUM_REAL) | (1L << NUM_INT) | (1L << CADEIA))) != 0)) ) {
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

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(LinguagemAlgoritimicaParser.REGISTRO, 0); }
		public TerminalNode FIM_REGISTRO() { return getToken(LinguagemAlgoritimicaParser.FIM_REGISTRO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
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
		enterRule(_localctx, 30, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(REGISTRO);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(216);
				variavel();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(LinguagemAlgoritimicaParser.FIM_PROCEDIMENTO, 0); }
		public TerminalNode FUNCAO() { return getToken(LinguagemAlgoritimicaParser.FUNCAO, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(LinguagemAlgoritimicaParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIM_FUNCAO() { return getToken(LinguagemAlgoritimicaParser.FIM_FUNCAO, 0); }
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<Decl_localContext> decl_local() {
			return getRuleContexts(Decl_localContext.class);
		}
		public Decl_localContext decl_local(int i) {
			return getRuleContext(Decl_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
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
		enterRule(_localctx, 32, RULE_decl_global);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(PROCEDIMENTO);
				setState(225);
				match(ID);
				setState(226);
				match(ABRE_PARENTESES);
				setState(227);
				parametros_opcional();
				setState(228);
				match(FECHA_PARENTESES);
				setState(229);
				declaracoes_locais();
				setState(230);
				comandos();
				setState(231);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(FUNCAO);
				setState(234);
				match(ID);
				setState(235);
				match(ABRE_PARENTESES);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIRCUNFLEXO) | (1L << VAR) | (1L << ID))) != 0)) {
					{
					{
					setState(236);
					parametro();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(FECHA_PARENTESES);
				setState(243);
				match(DOIS_PONTOS);
				setState(244);
				tipo_estendido();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANTE) | (1L << DECLARE) | (1L << TIPO))) != 0)) {
					{
					{
					setState(245);
					decl_local();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIRCUNFLEXO) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ID))) != 0)) {
					{
					{
					setState(251);
					cmd();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(FIM_FUNCAO);
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
		enterRule(_localctx, 34, RULE_parametros_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIRCUNFLEXO) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				setState(261);
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
		public TerminalNode DOIS_PONTOS() { return getToken(LinguagemAlgoritimicaParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public Mais_parametrosContext mais_parametros() {
			return getRuleContext(Mais_parametrosContext.class,0);
		}
		public List<Mais_identContext> mais_ident() {
			return getRuleContexts(Mais_identContext.class);
		}
		public Mais_identContext mais_ident(int i) {
			return getRuleContext(Mais_identContext.class,i);
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
		enterRule(_localctx, 36, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			var_opcional();
			setState(265);
			identificador();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(266);
				mais_ident();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(DOIS_PONTOS);
			setState(273);
			tipo_estendido();
			setState(274);
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
		enterRule(_localctx, 38, RULE_var_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(276);
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
		enterRule(_localctx, 40, RULE_mais_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(279);
				match(VIRGULA);
				setState(280);
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
		enterRule(_localctx, 42, RULE_declaracoes_locais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANTE) | (1L << DECLARE) | (1L << TIPO))) != 0)) {
				{
				setState(283);
				decl_local();
				setState(284);
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
		public List<Decl_localContext> decl_local() {
			return getRuleContexts(Decl_localContext.class);
		}
		public Decl_localContext decl_local(int i) {
			return getRuleContext(Decl_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
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
		enterRule(_localctx, 44, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANTE) | (1L << DECLARE) | (1L << TIPO))) != 0)) {
				{
				{
				setState(288);
				decl_local();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIRCUNFLEXO) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ID))) != 0)) {
				{
				{
				setState(294);
				cmd();
				}
				}
				setState(299);
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
		enterRule(_localctx, 46, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIRCUNFLEXO) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ID))) != 0)) {
				{
				setState(300);
				cmd();
				setState(301);
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
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
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
		enterRule(_localctx, 48, RULE_cmd);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				leia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				escreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				se();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				caso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				para();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				enquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				faca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(312);
				chamada();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(313);
				atribuicao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(314);
				retorne();
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

	public static class LeiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(LinguagemAlgoritimicaParser.LEIA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.ABRE_PARENTESES, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.FECHA_PARENTESES, 0); }
		public List<Mais_identContext> mais_ident() {
			return getRuleContexts(Mais_identContext.class);
		}
		public Mais_identContext mais_ident(int i) {
			return getRuleContext(Mais_identContext.class,i);
		}
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
		enterRule(_localctx, 50, RULE_leia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LEIA);
			setState(318);
			match(ABRE_PARENTESES);
			setState(319);
			identificador();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(320);
				mais_ident();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
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
		public TerminalNode FECHA_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.FECHA_PARENTESES, 0); }
		public List<Mais_expressaoContext> mais_expressao() {
			return getRuleContexts(Mais_expressaoContext.class);
		}
		public Mais_expressaoContext mais_expressao(int i) {
			return getRuleContext(Mais_expressaoContext.class,i);
		}
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
		enterRule(_localctx, 52, RULE_escreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(ESCREVA);
			setState(329);
			match(ABRE_PARENTESES);
			setState(330);
			expressao();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(331);
				mais_expressao();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
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
		enterRule(_localctx, 54, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(SE);
			setState(340);
			expressao();
			setState(341);
			match(ENTAO);
			setState(342);
			comandos();
			setState(343);
			senao_opcional();
			setState(344);
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
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(LinguagemAlgoritimicaParser.FIM_CASO, 0); }
		public List<SelecaoContext> selecao() {
			return getRuleContexts(SelecaoContext.class);
		}
		public SelecaoContext selecao(int i) {
			return getRuleContext(SelecaoContext.class,i);
		}
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
		enterRule(_localctx, 56, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(CASO);
			setState(347);
			exp_aritimetica();
			setState(348);
			match(SEJA);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MENOS || _la==NUM_INT) {
				{
				{
				setState(349);
				selecao();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			senao_opcional();
			setState(356);
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
		public TerminalNode FIM_PARA() { return getToken(LinguagemAlgoritimicaParser.FIM_PARA, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
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
		enterRule(_localctx, 58, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(PARA);
			setState(359);
			match(ID);
			setState(360);
			match(T__0);
			setState(361);
			exp_aritimetica();
			setState(362);
			match(ATE);
			setState(363);
			exp_aritimetica();
			setState(364);
			match(FACA);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIRCUNFLEXO) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ID))) != 0)) {
				{
				{
				setState(365);
				cmd();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
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
		public TerminalNode FIM_ENQUANTO() { return getToken(LinguagemAlgoritimicaParser.FIM_ENQUANTO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
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
		enterRule(_localctx, 60, RULE_enquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(ENQUANTO);
			setState(374);
			expressao();
			setState(375);
			match(FACA);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIRCUNFLEXO) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ID))) != 0)) {
				{
				{
				setState(376);
				cmd();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
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
		public TerminalNode ATE() { return getToken(LinguagemAlgoritimicaParser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
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
		enterRule(_localctx, 62, RULE_faca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(FACA);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIRCUNFLEXO) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ID))) != 0)) {
				{
				{
				setState(385);
				cmd();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			match(ATE);
			setState(392);
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

	public static class ChamadaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.ABRE_PARENTESES, 0); }
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(LinguagemAlgoritimicaParser.FECHA_PARENTESES, 0); }
		public ChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitChamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaContext chamada() throws RecognitionException {
		ChamadaContext _localctx = new ChamadaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_chamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(ID);
			setState(395);
			match(ABRE_PARENTESES);
			setState(396);
			argumentos_opcional();
			setState(397);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
		enterRule(_localctx, 66, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			identificador();
			setState(400);
			match(T__0);
			setState(401);
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
		enterRule(_localctx, 68, RULE_retorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(RETORNE);
			setState(404);
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
		enterRule(_localctx, 70, RULE_mais_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(VIRGULA);
			setState(407);
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

	public static class Senao_opcionalContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(LinguagemAlgoritimicaParser.SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
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
		enterRule(_localctx, 72, RULE_senao_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(409);
				match(SENAO);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIRCUNFLEXO) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ID))) != 0)) {
					{
					{
					setState(410);
					cmd();
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Argumentos_opcionalContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<Mais_expressaoContext> mais_expressao() {
			return getRuleContexts(Mais_expressaoContext.class);
		}
		public Mais_expressaoContext mais_expressao(int i) {
			return getRuleContext(Mais_expressaoContext.class,i);
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
		enterRule(_localctx, 74, RULE_argumentos_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			expressao();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(419);
				mais_expressao();
				}
				}
				setState(424);
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

	public static class SelecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(LinguagemAlgoritimicaParser.DOIS_PONTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
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
		enterRule(_localctx, 76, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			constantes();
			setState(426);
			match(DOIS_PONTOS);
			setState(427);
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
		enterRule(_localctx, 78, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			numero_intervalo();
			setState(430);
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
		enterRule(_localctx, 80, RULE_mais_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(432);
				match(VIRGULA);
				setState(433);
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
		enterRule(_localctx, 82, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			op_unario();
			setState(437);
			match(NUM_INT);
			setState(438);
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
		enterRule(_localctx, 84, RULE_intervalo_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(440);
				match(T__1);
				setState(441);
				op_unario();
				setState(442);
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
		enterRule(_localctx, 86, RULE_op_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MENOS) {
				{
				setState(446);
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
		public List<Outros_termosContext> outros_termos() {
			return getRuleContexts(Outros_termosContext.class);
		}
		public Outros_termosContext outros_termos(int i) {
			return getRuleContext(Outros_termosContext.class,i);
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
		enterRule(_localctx, 88, RULE_exp_aritimetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			termo();
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(450);
					outros_termos();
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class Op_multiplicacaoContext extends ParserRuleContext {
		public TerminalNode VEZES() { return getToken(LinguagemAlgoritimicaParser.VEZES, 0); }
		public TerminalNode DIVIDIR() { return getToken(LinguagemAlgoritimicaParser.DIVIDIR, 0); }
		public Op_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).enterOp_multiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemAlgoritimicaListener ) ((LinguagemAlgoritimicaListener)listener).exitOp_multiplicacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemAlgoritimicaVisitor ) return ((LinguagemAlgoritimicaVisitor<? extends T>)visitor).visitOp_multiplicacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !(_la==VEZES || _la==DIVIDIR) ) {
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
		enterRule(_localctx, 92, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !(_la==MENOS || _la==MAIS) ) {
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

	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public List<Outros_fatoresContext> outros_fatores() {
			return getRuleContexts(Outros_fatoresContext.class);
		}
		public Outros_fatoresContext outros_fatores(int i) {
			return getRuleContext(Outros_fatoresContext.class,i);
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
		enterRule(_localctx, 94, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			fator();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VEZES || _la==DIVIDIR) {
				{
				{
				setState(461);
				outros_fatores();
				}
				}
				setState(466);
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

	public static class Outros_termosContext extends ParserRuleContext {
		public Op_adicaoContext op_adicao() {
			return getRuleContext(Op_adicaoContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
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
		enterRule(_localctx, 96, RULE_outros_termos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			op_adicao();
			setState(468);
			termo();
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
		public List<Outras_parcelasContext> outras_parcelas() {
			return getRuleContexts(Outras_parcelasContext.class);
		}
		public Outras_parcelasContext outras_parcelas(int i) {
			return getRuleContext(Outras_parcelasContext.class,i);
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
		enterRule(_localctx, 98, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			parcela();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(471);
				outras_parcelas();
				}
				}
				setState(476);
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

	public static class Outros_fatoresContext extends ParserRuleContext {
		public Op_multiplicacaoContext op_multiplicacao() {
			return getRuleContext(Op_multiplicacaoContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
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
		enterRule(_localctx, 100, RULE_outros_fatores);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			op_multiplicacao();
			setState(478);
			fator();
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
		enterRule(_localctx, 102, RULE_parcela);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CIRCUNFLEXO:
			case ABRE_PARENTESES:
			case MENOS:
			case NUM_REAL:
			case NUM_INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				op_unario();
				setState(481);
				parcela_unario();
				}
				break;
			case T__2:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
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
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ID() { return getToken(LinguagemAlgoritimicaParser.ID, 0); }
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
		enterRule(_localctx, 104, RULE_parcela_unario);
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(ID);
				setState(488);
				chamada_partes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				match(ABRE_PARENTESES);
				setState(492);
				expressao();
				setState(493);
				match(FECHA_PARENTESES);
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

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
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
		enterRule(_localctx, 106, RULE_parcela_nao_unario);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(T__2);
				setState(498);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
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
		enterRule(_localctx, 108, RULE_outras_parcelas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(T__3);
			setState(503);
			parcela();
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
		enterRule(_localctx, 110, RULE_chamada_partes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(ABRE_PARENTESES);
			setState(506);
			expressao();
			setState(507);
			mais_expressao();
			setState(508);
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

	public static class Exp_relacionalContext extends ParserRuleContext {
		public Exp_aritimeticaContext exp_aritimetica() {
			return getRuleContext(Exp_aritimeticaContext.class,0);
		}
		public List<Op_opcionalContext> op_opcional() {
			return getRuleContexts(Op_opcionalContext.class);
		}
		public Op_opcionalContext op_opcional(int i) {
			return getRuleContext(Op_opcionalContext.class,i);
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
		enterRule(_localctx, 112, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			exp_aritimetica();
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << IGUAL_ASSIMILACAO))) != 0)) {
				{
				{
				setState(511);
				op_opcional();
				}
				}
				setState(516);
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
		enterRule(_localctx, 114, RULE_op_opcional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			op_relacional();
			setState(518);
			exp_aritimetica();
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
		enterRule(_localctx, 116, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << IGUAL_ASSIMILACAO))) != 0)) ) {
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public List<Outros_termos_logicosContext> outros_termos_logicos() {
			return getRuleContexts(Outros_termos_logicosContext.class);
		}
		public Outros_termos_logicosContext outros_termos_logicos(int i) {
			return getRuleContext(Outros_termos_logicosContext.class,i);
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
		enterRule(_localctx, 118, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			termo_logico();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(523);
				outros_termos_logicos();
				}
				}
				setState(528);
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
		enterRule(_localctx, 120, RULE_op_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(529);
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
		public List<Outros_fatores_logicosContext> outros_fatores_logicos() {
			return getRuleContexts(Outros_fatores_logicosContext.class);
		}
		public Outros_fatores_logicosContext outros_fatores_logicos(int i) {
			return getRuleContext(Outros_fatores_logicosContext.class,i);
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
		enterRule(_localctx, 122, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			fator_logico();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(533);
				outros_fatores_logicos();
				}
				}
				setState(538);
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

	public static class Outros_termos_logicosContext extends ParserRuleContext {
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
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
		enterRule(_localctx, 124, RULE_outros_termos_logicos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(T__10);
			setState(540);
			termo_logico();
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
		enterRule(_localctx, 126, RULE_fator_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			op_nao();
			setState(543);
			parcela_logica();
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
		enterRule(_localctx, 128, RULE_outros_fatores_logicos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(T__11);
			setState(546);
			fator_logico();
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
		public TerminalNode BOOLEANO() { return getToken(LinguagemAlgoritimicaParser.BOOLEANO, 0); }
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
		enterRule(_localctx, 130, RULE_parcela_logica);
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(BOOLEANO);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u022b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\7\2\u0088\n\2\f\2\16\2\u008b"+
		"\13\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3\u0093\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a2\n\4\3\5\3\5\3\5\7\5\u00a7\n\5\f\5"+
		"\16\5\u00aa\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\5\b\u00ba\n\b\3\t\3\t\3\t\5\t\u00bf\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c6"+
		"\n\n\3\13\3\13\5\13\u00ca\n\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u00d3"+
		"\n\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\7\21\u00dc\n\21\f\21\16\21\u00df"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00f0\n\22\f\22\16\22\u00f3\13\22\3\22\3\22\3\22\3\22"+
		"\7\22\u00f9\n\22\f\22\16\22\u00fc\13\22\3\22\7\22\u00ff\n\22\f\22\16\22"+
		"\u0102\13\22\3\22\3\22\5\22\u0106\n\22\3\23\5\23\u0109\n\23\3\24\3\24"+
		"\3\24\7\24\u010e\n\24\f\24\16\24\u0111\13\24\3\24\3\24\3\24\3\24\3\25"+
		"\5\25\u0118\n\25\3\26\3\26\5\26\u011c\n\26\3\27\3\27\3\27\5\27\u0121\n"+
		"\27\3\30\7\30\u0124\n\30\f\30\16\30\u0127\13\30\3\30\7\30\u012a\n\30\f"+
		"\30\16\30\u012d\13\30\3\31\3\31\3\31\5\31\u0132\n\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u013e\n\32\3\33\3\33\3\33\3\33"+
		"\7\33\u0144\n\33\f\33\16\33\u0147\13\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\7\34\u014f\n\34\f\34\16\34\u0152\13\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u0161\n\36\f\36\16\36\u0164\13"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0171"+
		"\n\37\f\37\16\37\u0174\13\37\3\37\3\37\3 \3 \3 \3 \7 \u017c\n \f \16 "+
		"\u017f\13 \3 \3 \3!\3!\7!\u0185\n!\f!\16!\u0188\13!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\7&\u019e\n&\f&\16&\u01a1"+
		"\13&\5&\u01a3\n&\3\'\3\'\7\'\u01a7\n\'\f\'\16\'\u01aa\13\'\3(\3(\3(\3"+
		"(\3)\3)\3)\3*\3*\5*\u01b5\n*\3+\3+\3+\3+\3,\3,\3,\3,\5,\u01bf\n,\3-\5"+
		"-\u01c2\n-\3.\3.\7.\u01c6\n.\f.\16.\u01c9\13.\3/\3/\3\60\3\60\3\61\3\61"+
		"\7\61\u01d1\n\61\f\61\16\61\u01d4\13\61\3\62\3\62\3\62\3\63\3\63\7\63"+
		"\u01db\n\63\f\63\16\63\u01de\13\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\5\65\u01e7\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01f2"+
		"\n\66\3\67\3\67\3\67\5\67\u01f7\n\67\38\38\38\39\39\39\39\39\3:\3:\7:"+
		"\u0203\n:\f:\16:\u0206\13:\3;\3;\3;\3<\3<\3=\3=\7=\u020f\n=\f=\16=\u0212"+
		"\13=\3>\5>\u0215\n>\3?\3?\7?\u0219\n?\f?\16?\u021c\13?\3@\3@\3@\3A\3A"+
		"\3A\3B\3B\3B\3C\3C\5C\u0229\nC\3C\2\2D\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\2\7\3\29<\4\288=?\3\2\65\66\3\2\63\64\4\2\7\13\25\25\2\u0222"+
		"\2\u0089\3\2\2\2\4\u0092\3\2\2\2\6\u00a1\3\2\2\2\b\u00a3\3\2\2\2\n\u00ae"+
		"\3\2\2\2\f\u00b2\3\2\2\2\16\u00b9\3\2\2\2\20\u00be\3\2\2\2\22\u00c5\3"+
		"\2\2\2\24\u00c9\3\2\2\2\26\u00cb\3\2\2\2\30\u00ce\3\2\2\2\32\u00d2\3\2"+
		"\2\2\34\u00d4\3\2\2\2\36\u00d7\3\2\2\2 \u00d9\3\2\2\2\"\u0105\3\2\2\2"+
		"$\u0108\3\2\2\2&\u010a\3\2\2\2(\u0117\3\2\2\2*\u011b\3\2\2\2,\u0120\3"+
		"\2\2\2.\u0125\3\2\2\2\60\u0131\3\2\2\2\62\u013d\3\2\2\2\64\u013f\3\2\2"+
		"\2\66\u014a\3\2\2\28\u0155\3\2\2\2:\u015c\3\2\2\2<\u0168\3\2\2\2>\u0177"+
		"\3\2\2\2@\u0182\3\2\2\2B\u018c\3\2\2\2D\u0191\3\2\2\2F\u0195\3\2\2\2H"+
		"\u0198\3\2\2\2J\u01a2\3\2\2\2L\u01a4\3\2\2\2N\u01ab\3\2\2\2P\u01af\3\2"+
		"\2\2R\u01b4\3\2\2\2T\u01b6\3\2\2\2V\u01be\3\2\2\2X\u01c1\3\2\2\2Z\u01c3"+
		"\3\2\2\2\\\u01ca\3\2\2\2^\u01cc\3\2\2\2`\u01ce\3\2\2\2b\u01d5\3\2\2\2"+
		"d\u01d8\3\2\2\2f\u01df\3\2\2\2h\u01e6\3\2\2\2j\u01f1\3\2\2\2l\u01f6\3"+
		"\2\2\2n\u01f8\3\2\2\2p\u01fb\3\2\2\2r\u0200\3\2\2\2t\u0207\3\2\2\2v\u020a"+
		"\3\2\2\2x\u020c\3\2\2\2z\u0214\3\2\2\2|\u0216\3\2\2\2~\u021d\3\2\2\2\u0080"+
		"\u0220\3\2\2\2\u0082\u0223\3\2\2\2\u0084\u0228\3\2\2\2\u0086\u0088\5\4"+
		"\3\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\17"+
		"\2\2\u008d\u008e\5.\30\2\u008e\u008f\7\20\2\2\u008f\3\3\2\2\2\u0090\u0093"+
		"\5\6\4\2\u0091\u0093\5\"\22\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2"+
		"\u0093\5\3\2\2\2\u0094\u0095\7\22\2\2\u0095\u00a2\5\b\5\2\u0096\u0097"+
		"\7\21\2\2\u0097\u0098\7@\2\2\u0098\u0099\7\24\2\2\u0099\u009a\5\30\r\2"+
		"\u009a\u009b\7\25\2\2\u009b\u009c\5\36\20\2\u009c\u00a2\3\2\2\2\u009d"+
		"\u009e\7\23\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7\24\2\2\u00a0\u00a2\5"+
		"\24\13\2\u00a1\u0094\3\2\2\2\u00a1\u0096\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2"+
		"\7\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4\u00a8\5\22\n\2\u00a5\u00a7\5\n\6\2"+
		"\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\24\2\2"+
		"\u00ac\u00ad\5\24\13\2\u00ad\t\3\2\2\2\u00ae\u00af\7\26\2\2\u00af\u00b0"+
		"\7@\2\2\u00b0\u00b1\5\22\n\2\u00b1\13\3\2\2\2\u00b2\u00b3\5\16\b\2\u00b3"+
		"\u00b4\7@\2\2\u00b4\u00b5\5\22\n\2\u00b5\u00b6\5\20\t\2\u00b6\r\3\2\2"+
		"\2\u00b7\u00b8\7\27\2\2\u00b8\u00ba\5\16\b\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\17\3\2\2\2\u00bb\u00bc\7\30\2\2\u00bc\u00bd\7@\2"+
		"\2\u00bd\u00bf\5\22\n\2\u00be\u00bb\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\21\3\2\2\2\u00c0\u00c1\7\31\2\2\u00c1\u00c2\5Z.\2\u00c2\u00c3\7\32\2"+
		"\2\u00c3\u00c4\5\22\n\2\u00c4\u00c6\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\23\3\2\2\2\u00c7\u00ca\5 \21\2\u00c8\u00ca\5\34\17"+
		"\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\25\3\2\2\2\u00cb\u00cc"+
		"\7\26\2\2\u00cc\u00cd\5\f\7\2\u00cd\27\3\2\2\2\u00ce\u00cf\t\2\2\2\u00cf"+
		"\31\3\2\2\2\u00d0\u00d3\5\30\r\2\u00d1\u00d3\7@\2\2\u00d2\u00d0\3\2\2"+
		"\2\u00d2\u00d1\3\2\2\2\u00d3\33\3\2\2\2\u00d4\u00d5\5\16\b\2\u00d5\u00d6"+
		"\5\32\16\2\u00d6\35\3\2\2\2\u00d7\u00d8\t\3\2\2\u00d8\37\3\2\2\2\u00d9"+
		"\u00dd\7\33\2\2\u00da\u00dc\5\b\5\2\u00db\u00da\3\2\2\2\u00dc\u00df\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e1\7\34\2\2\u00e1!\3\2\2\2\u00e2\u00e3\7\35\2"+
		"\2\u00e3\u00e4\7@\2\2\u00e4\u00e5\7\37\2\2\u00e5\u00e6\5$\23\2\u00e6\u00e7"+
		"\7 \2\2\u00e7\u00e8\5,\27\2\u00e8\u00e9\5\60\31\2\u00e9\u00ea\7!\2\2\u00ea"+
		"\u0106\3\2\2\2\u00eb\u00ec\7\36\2\2\u00ec\u00ed\7@\2\2\u00ed\u00f1\7\37"+
		"\2\2\u00ee\u00f0\5&\24\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f4\u00f5\7 \2\2\u00f5\u00f6\7\24\2\2\u00f6\u00fa\5\34\17\2\u00f7"+
		"\u00f9\5\6\4\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0100\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00ff\5\62\32\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0104\7\"\2\2\u0104\u0106\3\2\2\2\u0105\u00e2\3\2\2\2\u0105\u00eb\3\2"+
		"\2\2\u0106#\3\2\2\2\u0107\u0109\5&\24\2\u0108\u0107\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109%\3\2\2\2\u010a\u010b\5(\25\2\u010b\u010f\5\f\7\2\u010c"+
		"\u010e\5\26\f\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3"+
		"\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0113\7\24\2\2\u0113\u0114\5\34\17\2\u0114\u0115\5*\26\2\u0115\'\3\2"+
		"\2\2\u0116\u0118\7\67\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		")\3\2\2\2\u0119\u011a\7\26\2\2\u011a\u011c\5&\24\2\u011b\u0119\3\2\2\2"+
		"\u011b\u011c\3\2\2\2\u011c+\3\2\2\2\u011d\u011e\5\6\4\2\u011e\u011f\5"+
		",\27\2\u011f\u0121\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"-\3\2\2\2\u0122\u0124\5\6\4\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2"+
		"\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012b\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0128\u012a\5\62\32\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2"+
		"\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c/\3\2\2\2\u012d\u012b\3"+
		"\2\2\2\u012e\u012f\5\62\32\2\u012f\u0130\5\60\31\2\u0130\u0132\3\2\2\2"+
		"\u0131\u012e\3\2\2\2\u0131\u0132\3\2\2\2\u0132\61\3\2\2\2\u0133\u013e"+
		"\5\64\33\2\u0134\u013e\5\66\34\2\u0135\u013e\58\35\2\u0136\u013e\5:\36"+
		"\2\u0137\u013e\5<\37\2\u0138\u013e\5> \2\u0139\u013e\5@!\2\u013a\u013e"+
		"\5B\"\2\u013b\u013e\5D#\2\u013c\u013e\5F$\2\u013d\u0133\3\2\2\2\u013d"+
		"\u0134\3\2\2\2\u013d\u0135\3\2\2\2\u013d\u0136\3\2\2\2\u013d\u0137\3\2"+
		"\2\2\u013d\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013a\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\63\3\2\2\2\u013f\u0140\7#\2\2"+
		"\u0140\u0141\7\37\2\2\u0141\u0145\5\f\7\2\u0142\u0144\5\26\f\2\u0143\u0142"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7 \2\2\u0149\65\3\2\2\2"+
		"\u014a\u014b\7$\2\2\u014b\u014c\7\37\2\2\u014c\u0150\5x=\2\u014d\u014f"+
		"\5H%\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7 "+
		"\2\2\u0154\67\3\2\2\2\u0155\u0156\7%\2\2\u0156\u0157\5x=\2\u0157\u0158"+
		"\7\'\2\2\u0158\u0159\5\60\31\2\u0159\u015a\5J&\2\u015a\u015b\7&\2\2\u015b"+
		"9\3\2\2\2\u015c\u015d\7(\2\2\u015d\u015e\5Z.\2\u015e\u0162\7+\2\2\u015f"+
		"\u0161\5N(\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2"+
		"\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166"+
		"\5J&\2\u0166\u0167\7)\2\2\u0167;\3\2\2\2\u0168\u0169\7*\2\2\u0169\u016a"+
		"\7@\2\2\u016a\u016b\7\3\2\2\u016b\u016c\5Z.\2\u016c\u016d\7.\2\2\u016d"+
		"\u016e\5Z.\2\u016e\u0172\7-\2\2\u016f\u0171\5\62\32\2\u0170\u016f\3\2"+
		"\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7,\2\2\u0176=\3\2\2\2\u0177"+
		"\u0178\7/\2\2\u0178\u0179\5x=\2\u0179\u017d\7-\2\2\u017a\u017c\5\62\32"+
		"\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7\60\2\2"+
		"\u0181?\3\2\2\2\u0182\u0186\7-\2\2\u0183\u0185\5\62\32\2\u0184\u0183\3"+
		"\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7.\2\2\u018a\u018b\5x="+
		"\2\u018bA\3\2\2\2\u018c\u018d\7@\2\2\u018d\u018e\7\37\2\2\u018e\u018f"+
		"\5L\'\2\u018f\u0190\7 \2\2\u0190C\3\2\2\2\u0191\u0192\5\f\7\2\u0192\u0193"+
		"\7\3\2\2\u0193\u0194\5x=\2\u0194E\3\2\2\2\u0195\u0196\7\61\2\2\u0196\u0197"+
		"\5x=\2\u0197G\3\2\2\2\u0198\u0199\7\26\2\2\u0199\u019a\5x=\2\u019aI\3"+
		"\2\2\2\u019b\u019f\7\62\2\2\u019c\u019e\5\62\32\2\u019d\u019c\3\2\2\2"+
		"\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a3"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u019b\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"K\3\2\2\2\u01a4\u01a8\5x=\2\u01a5\u01a7\5H%\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9M\3\2\2\2"+
		"\u01aa\u01a8\3\2\2\2\u01ab\u01ac\5P)\2\u01ac\u01ad\7\24\2\2\u01ad\u01ae"+
		"\5\60\31\2\u01aeO\3\2\2\2\u01af\u01b0\5T+\2\u01b0\u01b1\5R*\2\u01b1Q\3"+
		"\2\2\2\u01b2\u01b3\7\26\2\2\u01b3\u01b5\5P)\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5S\3\2\2\2\u01b6\u01b7\5X-\2\u01b7\u01b8\7>\2\2\u01b8"+
		"\u01b9\5V,\2\u01b9U\3\2\2\2\u01ba\u01bb\7\4\2\2\u01bb\u01bc\5X-\2\u01bc"+
		"\u01bd\7>\2\2\u01bd\u01bf\3\2\2\2\u01be\u01ba\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bfW\3\2\2\2\u01c0\u01c2\7\63\2\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2Y\3\2\2\2\u01c3\u01c7\5`\61\2\u01c4\u01c6\5b\62\2\u01c5"+
		"\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8[\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\t\4\2\2\u01cb]\3\2"+
		"\2\2\u01cc\u01cd\t\5\2\2\u01cd_\3\2\2\2\u01ce\u01d2\5d\63\2\u01cf\u01d1"+
		"\5f\64\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3a\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\5^\60\2"+
		"\u01d6\u01d7\5`\61\2\u01d7c\3\2\2\2\u01d8\u01dc\5h\65\2\u01d9\u01db\5"+
		"n8\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dde\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\5\\/\2\u01e0"+
		"\u01e1\5d\63\2\u01e1g\3\2\2\2\u01e2\u01e3\5X-\2\u01e3\u01e4\5j\66\2\u01e4"+
		"\u01e7\3\2\2\2\u01e5\u01e7\5l\67\2\u01e6\u01e2\3\2\2\2\u01e6\u01e5\3\2"+
		"\2\2\u01e7i\3\2\2\2\u01e8\u01f2\5\f\7\2\u01e9\u01ea\7@\2\2\u01ea\u01f2"+
		"\5p9\2\u01eb\u01f2\7>\2\2\u01ec\u01f2\7=\2\2\u01ed\u01ee\7\37\2\2\u01ee"+
		"\u01ef\5x=\2\u01ef\u01f0\7 \2\2\u01f0\u01f2\3\2\2\2\u01f1\u01e8\3\2\2"+
		"\2\u01f1\u01e9\3\2\2\2\u01f1\u01eb\3\2\2\2\u01f1\u01ec\3\2\2\2\u01f1\u01ed"+
		"\3\2\2\2\u01f2k\3\2\2\2\u01f3\u01f4\7\5\2\2\u01f4\u01f7\5\f\7\2\u01f5"+
		"\u01f7\7?\2\2\u01f6\u01f3\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7m\3\2\2\2\u01f8"+
		"\u01f9\7\6\2\2\u01f9\u01fa\5h\65\2\u01fao\3\2\2\2\u01fb\u01fc\7\37\2\2"+
		"\u01fc\u01fd\5x=\2\u01fd\u01fe\5H%\2\u01fe\u01ff\7 \2\2\u01ffq\3\2\2\2"+
		"\u0200\u0204\5Z.\2\u0201\u0203\5t;\2\u0202\u0201\3\2\2\2\u0203\u0206\3"+
		"\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205s\3\2\2\2\u0206\u0204"+
		"\3\2\2\2\u0207\u0208\5v<\2\u0208\u0209\5Z.\2\u0209u\3\2\2\2\u020a\u020b"+
		"\t\6\2\2\u020bw\3\2\2\2\u020c\u0210\5|?\2\u020d\u020f\5~@\2\u020e\u020d"+
		"\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"y\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0215\7\f\2\2\u0214\u0213\3\2\2\2"+
		"\u0214\u0215\3\2\2\2\u0215{\3\2\2\2\u0216\u021a\5\u0080A\2\u0217\u0219"+
		"\5\u0082B\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2"+
		"\2\u021a\u021b\3\2\2\2\u021b}\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e"+
		"\7\r\2\2\u021e\u021f\5|?\2\u021f\177\3\2\2\2\u0220\u0221\5z>\2\u0221\u0222"+
		"\5\u0084C\2\u0222\u0081\3\2\2\2\u0223\u0224\7\16\2\2\u0224\u0225\5\u0080"+
		"A\2\u0225\u0083\3\2\2\2\u0226\u0229\78\2\2\u0227\u0229\5r:\2\u0228\u0226"+
		"\3\2\2\2\u0228\u0227\3\2\2\2\u0229\u0085\3\2\2\2\60\u0089\u0092\u00a1"+
		"\u00a8\u00b9\u00be\u00c5\u00c9\u00d2\u00dd\u00f1\u00fa\u0100\u0105\u0108"+
		"\u010f\u0117\u011b\u0120\u0125\u012b\u0131\u013d\u0145\u0150\u0162\u0172"+
		"\u017d\u0186\u019f\u01a2\u01a8\u01b4\u01be\u01c1\u01c7\u01d2\u01dc\u01e6"+
		"\u01f1\u01f6\u0204\u0210\u0214\u021a\u0228";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}