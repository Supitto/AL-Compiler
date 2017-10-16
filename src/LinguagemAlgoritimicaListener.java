// Generated from /home/supitto/IdeaProjects/AL-Compiler/src/LinguagemAlgoritimica.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinguagemAlgoritimicaParser}.
 */
public interface LinguagemAlgoritimicaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LinguagemAlgoritimicaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LinguagemAlgoritimicaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(LinguagemAlgoritimicaParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(LinguagemAlgoritimicaParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#decl_local}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local(LinguagemAlgoritimicaParser.Decl_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#decl_local}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local(LinguagemAlgoritimicaParser.Decl_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(LinguagemAlgoritimicaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(LinguagemAlgoritimicaParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(LinguagemAlgoritimicaParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(LinguagemAlgoritimicaParser.Mais_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(LinguagemAlgoritimicaParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(LinguagemAlgoritimicaParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void enterPonteiros_opcionais(LinguagemAlgoritimicaParser.Ponteiros_opcionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void exitPonteiros_opcionais(LinguagemAlgoritimicaParser.Ponteiros_opcionaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void enterOutros_ident(LinguagemAlgoritimicaParser.Outros_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void exitOutros_ident(LinguagemAlgoritimicaParser.Outros_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(LinguagemAlgoritimicaParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(LinguagemAlgoritimicaParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LinguagemAlgoritimicaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LinguagemAlgoritimicaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void enterMais_ident(LinguagemAlgoritimicaParser.Mais_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void exitMais_ident(LinguagemAlgoritimicaParser.Mais_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(LinguagemAlgoritimicaParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(LinguagemAlgoritimicaParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(LinguagemAlgoritimicaParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(LinguagemAlgoritimicaParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(LinguagemAlgoritimicaParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(LinguagemAlgoritimicaParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(LinguagemAlgoritimicaParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(LinguagemAlgoritimicaParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(LinguagemAlgoritimicaParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(LinguagemAlgoritimicaParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#decl_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_global(LinguagemAlgoritimicaParser.Decl_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#decl_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_global(LinguagemAlgoritimicaParser.Decl_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void enterParametros_opcional(LinguagemAlgoritimicaParser.Parametros_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void exitParametros_opcional(LinguagemAlgoritimicaParser.Parametros_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(LinguagemAlgoritimicaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(LinguagemAlgoritimicaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void enterVar_opcional(LinguagemAlgoritimicaParser.Var_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void exitVar_opcional(LinguagemAlgoritimicaParser.Var_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void enterMais_parametros(LinguagemAlgoritimicaParser.Mais_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void exitMais_parametros(LinguagemAlgoritimicaParser.Mais_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_locais(LinguagemAlgoritimicaParser.Declaracoes_locaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_locais(LinguagemAlgoritimicaParser.Declaracoes_locaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(LinguagemAlgoritimicaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(LinguagemAlgoritimicaParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(LinguagemAlgoritimicaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(LinguagemAlgoritimicaParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LinguagemAlgoritimicaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LinguagemAlgoritimicaParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#leia}.
	 * @param ctx the parse tree
	 */
	void enterLeia(LinguagemAlgoritimicaParser.LeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#leia}.
	 * @param ctx the parse tree
	 */
	void exitLeia(LinguagemAlgoritimicaParser.LeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#escreva}.
	 * @param ctx the parse tree
	 */
	void enterEscreva(LinguagemAlgoritimicaParser.EscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#escreva}.
	 * @param ctx the parse tree
	 */
	void exitEscreva(LinguagemAlgoritimicaParser.EscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(LinguagemAlgoritimicaParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(LinguagemAlgoritimicaParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(LinguagemAlgoritimicaParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(LinguagemAlgoritimicaParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(LinguagemAlgoritimicaParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(LinguagemAlgoritimicaParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(LinguagemAlgoritimicaParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(LinguagemAlgoritimicaParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#faca}.
	 * @param ctx the parse tree
	 */
	void enterFaca(LinguagemAlgoritimicaParser.FacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#faca}.
	 * @param ctx the parse tree
	 */
	void exitFaca(LinguagemAlgoritimicaParser.FacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#chamada}.
	 * @param ctx the parse tree
	 */
	void enterChamada(LinguagemAlgoritimicaParser.ChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#chamada}.
	 * @param ctx the parse tree
	 */
	void exitChamada(LinguagemAlgoritimicaParser.ChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(LinguagemAlgoritimicaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(LinguagemAlgoritimicaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#retorne}.
	 * @param ctx the parse tree
	 */
	void enterRetorne(LinguagemAlgoritimicaParser.RetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#retorne}.
	 * @param ctx the parse tree
	 */
	void exitRetorne(LinguagemAlgoritimicaParser.RetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void enterMais_expressao(LinguagemAlgoritimicaParser.Mais_expressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void exitMais_expressao(LinguagemAlgoritimicaParser.Mais_expressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void enterSenao_opcional(LinguagemAlgoritimicaParser.Senao_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void exitSenao_opcional(LinguagemAlgoritimicaParser.Senao_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos_opcional(LinguagemAlgoritimicaParser.Argumentos_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos_opcional(LinguagemAlgoritimicaParser.Argumentos_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(LinguagemAlgoritimicaParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(LinguagemAlgoritimicaParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(LinguagemAlgoritimicaParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(LinguagemAlgoritimicaParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_constante}.
	 * @param ctx the parse tree
	 */
	void enterMais_constante(LinguagemAlgoritimicaParser.Mais_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_constante}.
	 * @param ctx the parse tree
	 */
	void exitMais_constante(LinguagemAlgoritimicaParser.Mais_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(LinguagemAlgoritimicaParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(LinguagemAlgoritimicaParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo_opcional(LinguagemAlgoritimicaParser.Intervalo_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo_opcional(LinguagemAlgoritimicaParser.Intervalo_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(LinguagemAlgoritimicaParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(LinguagemAlgoritimicaParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#exp_aritimetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritimetica(LinguagemAlgoritimicaParser.Exp_aritimeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#exp_aritimetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritimetica(LinguagemAlgoritimicaParser.Exp_aritimeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiplicacao(LinguagemAlgoritimicaParser.Op_multiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiplicacao(LinguagemAlgoritimicaParser.Op_multiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void enterOp_adicao(LinguagemAlgoritimicaParser.Op_adicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void exitOp_adicao(LinguagemAlgoritimicaParser.Op_adicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(LinguagemAlgoritimicaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(LinguagemAlgoritimicaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(LinguagemAlgoritimicaParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(LinguagemAlgoritimicaParser.Outros_termosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(LinguagemAlgoritimicaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(LinguagemAlgoritimicaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores(LinguagemAlgoritimicaParser.Outros_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores(LinguagemAlgoritimicaParser.Outros_fatoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(LinguagemAlgoritimicaParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(LinguagemAlgoritimicaParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(LinguagemAlgoritimicaParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(LinguagemAlgoritimicaParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(LinguagemAlgoritimicaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(LinguagemAlgoritimicaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void enterOutras_parcelas(LinguagemAlgoritimicaParser.Outras_parcelasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void exitOutras_parcelas(LinguagemAlgoritimicaParser.Outras_parcelasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void enterChamada_partes(LinguagemAlgoritimicaParser.Chamada_partesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void exitChamada_partes(LinguagemAlgoritimicaParser.Chamada_partesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(LinguagemAlgoritimicaParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(LinguagemAlgoritimicaParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void enterOp_opcional(LinguagemAlgoritimicaParser.Op_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void exitOp_opcional(LinguagemAlgoritimicaParser.Op_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(LinguagemAlgoritimicaParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(LinguagemAlgoritimicaParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(LinguagemAlgoritimicaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(LinguagemAlgoritimicaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void enterOp_nao(LinguagemAlgoritimicaParser.Op_naoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void exitOp_nao(LinguagemAlgoritimicaParser.Op_naoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(LinguagemAlgoritimicaParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(LinguagemAlgoritimicaParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos_logicos(LinguagemAlgoritimicaParser.Outros_termos_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos_logicos(LinguagemAlgoritimicaParser.Outros_termos_logicosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(LinguagemAlgoritimicaParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(LinguagemAlgoritimicaParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores_logicos(LinguagemAlgoritimicaParser.Outros_fatores_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores_logicos(LinguagemAlgoritimicaParser.Outros_fatores_logicosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemAlgoritimicaParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(LinguagemAlgoritimicaParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemAlgoritimicaParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(LinguagemAlgoritimicaParser.Parcela_logicaContext ctx);
}