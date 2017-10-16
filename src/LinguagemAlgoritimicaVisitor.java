// Generated from /home/supitto/IdeaProjects/AL-Compiler/src/LinguagemAlgoritimica.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LinguagemAlgoritimicaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LinguagemAlgoritimicaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LinguagemAlgoritimicaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(LinguagemAlgoritimicaParser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#decl_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local(LinguagemAlgoritimicaParser.Decl_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(LinguagemAlgoritimicaParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_var(LinguagemAlgoritimicaParser.Mais_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(LinguagemAlgoritimicaParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPonteiros_opcionais(LinguagemAlgoritimicaParser.Ponteiros_opcionaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutros_ident(LinguagemAlgoritimicaParser.Outros_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(LinguagemAlgoritimicaParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LinguagemAlgoritimicaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_ident(LinguagemAlgoritimicaParser.Mais_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(LinguagemAlgoritimicaParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(LinguagemAlgoritimicaParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(LinguagemAlgoritimicaParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(LinguagemAlgoritimicaParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(LinguagemAlgoritimicaParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#decl_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_global(LinguagemAlgoritimicaParser.Decl_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#parametros_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_opcional(LinguagemAlgoritimicaParser.Parametros_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(LinguagemAlgoritimicaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#var_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_opcional(LinguagemAlgoritimicaParser.Var_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_parametros(LinguagemAlgoritimicaParser.Mais_parametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#declaracoes_locais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes_locais(LinguagemAlgoritimicaParser.Declaracoes_locaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(LinguagemAlgoritimicaParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(LinguagemAlgoritimicaParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(LinguagemAlgoritimicaParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#leia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeia(LinguagemAlgoritimicaParser.LeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#escreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscreva(LinguagemAlgoritimicaParser.EscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#se}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSe(LinguagemAlgoritimicaParser.SeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(LinguagemAlgoritimicaParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(LinguagemAlgoritimicaParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#enquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto(LinguagemAlgoritimicaParser.EnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#faca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaca(LinguagemAlgoritimicaParser.FacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#chamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada(LinguagemAlgoritimicaParser.ChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(LinguagemAlgoritimicaParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#retorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorne(LinguagemAlgoritimicaParser.RetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_expressao(LinguagemAlgoritimicaParser.Mais_expressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#senao_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenao_opcional(LinguagemAlgoritimicaParser.Senao_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#argumentos_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos_opcional(LinguagemAlgoritimicaParser.Argumentos_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(LinguagemAlgoritimicaParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(LinguagemAlgoritimicaParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#mais_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_constante(LinguagemAlgoritimicaParser.Mais_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(LinguagemAlgoritimicaParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#intervalo_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalo_opcional(LinguagemAlgoritimicaParser.Intervalo_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(LinguagemAlgoritimicaParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#exp_aritimetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritimetica(LinguagemAlgoritimicaParser.Exp_aritimeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_multiplicacao(LinguagemAlgoritimicaParser.Op_multiplicacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#op_adicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_adicao(LinguagemAlgoritimicaParser.Op_adicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(LinguagemAlgoritimicaParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_termos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutros_termos(LinguagemAlgoritimicaParser.Outros_termosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(LinguagemAlgoritimicaParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_fatores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutros_fatores(LinguagemAlgoritimicaParser.Outros_fatoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(LinguagemAlgoritimicaParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(LinguagemAlgoritimicaParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(LinguagemAlgoritimicaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#outras_parcelas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutras_parcelas(LinguagemAlgoritimicaParser.Outras_parcelasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#chamada_partes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_partes(LinguagemAlgoritimicaParser.Chamada_partesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(LinguagemAlgoritimicaParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#op_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_opcional(LinguagemAlgoritimicaParser.Op_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(LinguagemAlgoritimicaParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(LinguagemAlgoritimicaParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#op_nao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_nao(LinguagemAlgoritimicaParser.Op_naoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(LinguagemAlgoritimicaParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutros_termos_logicos(LinguagemAlgoritimicaParser.Outros_termos_logicosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(LinguagemAlgoritimicaParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutros_fatores_logicos(LinguagemAlgoritimicaParser.Outros_fatores_logicosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemAlgoritimicaParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(LinguagemAlgoritimicaParser.Parcela_logicaContext ctx);
}