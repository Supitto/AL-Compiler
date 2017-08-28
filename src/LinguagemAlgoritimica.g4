grammar LinguagemAlgoritimica;

//Regras

programa : declaracoes ALGORITIMO corpo FIM_ALGORITIMO;
declaracoes: (decl_local_global declaracoes)?;
decl_local_global : decl_local | decl_global;
decl_local: DECLARE variavel |
            CONSTANTE ID DOIS_PONTOS tipo_basico IGUAL_ASSIMILACAO valor_constante|
            TIPO ID DOIS_PONTOS tipo;
variavel: ID dimensao mais_var DOIS_PONTOS TIPO;
mais_var: (VIRGULA ID dimensao mais_var)?;
identificador : ponteiros_opcionais ID dimensao outros_ident;
ponteiros_opcionais : (CIRCUNFLEXO ponteiros_opcionais)?;
outros_ident : (PONTO identificador)?;
dimensao : (ABRE_COLCHETE exp_aritimetica FECHA_COLCHETE dimensao)?;
tipo : registro | tipo_estendido;
mais_ident : (PONTO ID mais_ident)?;
mais_variaveis : (variavel mais_variaveis)?;
tipo_basico : LITERAL|REAL|INTEIRO|LOGICO;
tipo_basico_ident : tipo_basico | ID;
tipo_estendido : ponteiros_opcionais tipo_basico_ident;
valor_constante : CADEIA|NUM_INT|NUM_REAL|BOOLEANO;
registro : REGISTRO variavel mais_variaveis FIM_REGISTRO;
decl_global : PROCEDIMENTO ID ABRE_PARENTESES parametros_opcional FECHA_PARENTESES declaracoes_locais comandos FIM_FUNCAO;
parametros_opcional : parametro?;
parametro : var_opcional identificador mais_ident DOIS_PONTOS tipo_estendido mais_parametros;
var_opcional : VAR?;
mais_parametros : (VIRGULA parametro)?;
declaracoes_locais : (decl_local declaracoes_locais)?;
corpo : decl_local comandos;

comandos : (cmd comandos)?;
cmd : leia 
    | escreva
    | se
    | caso
    | para 
    | enquanto
    | faca
    | atribuicao_ponteiro
    | atribuicao
    | retorne;

leia : LEIA ABRE_PARENTESES identificador mais_ident FECHA_PARENTESES;
escreva : ESCREVA ABRE_PARENTESES expressao mais_expressao FECHA_PARENTESES;
se : SE expressao ENTAO comandos senao_opcional FIM_SE;
caso : CASO exp_aritimetica SEJA selecao senao_opcional FIM_CASO ;
para : PARA ID '<-' exp_aritimetica ATE exp_aritimetica FACA comandos FIM_PARA;
enquanto : ENQUANTO expressao FACA comandos FIM_ENQUANTO;
faca : FACA comandos ATE expressao;
atribuicao_ponteiro : CIRCUNFLEXO ID outros_ident dimensao '<-' expressao;
atribuicao : chamada_atribuicao;
retorne : RETORNE expressao;

mais_expressao : (VIRGULA expressao mais_expressao)?;
senao_opcional : (SENAO comandos)?;
chamada_atribuicao : ABRE_PARENTESES argumentos_opcional FECHA_PARENTESES
                    |outros_ident dimensao '<-' expressao;
argumentos_opcional : (expressao mais_expressao)? ;
selecao : constantes DOIS_PONTOS comandos mais_selecao;
mais_selecao : selecao?;
constantes: numero_intervalo mais_constante;
mais_constante: (VIRGULA constantes)?;
numero_intervalo : op_unario NUM_INT intervalo_opcional;
intervalo_opcional : ('..' op_unario NUM_INT)?; 
op_unario : MENOS?;
exp_aritimetica : termo outros_termos;
op_multiplicaco: VEZES|DIVIDIR;
op_adicao:MAIS|MENOS;
termo:fator outros_fatores;
outros_termos: (op_adicao termo outros_termos)?;
fator: parcela outras_parcelas;
outros_fatores:(op_multiplicaco fator outros_fatores)?;
parcela: op_unario parcela_unario
        |parcela_nao_unario;
parcela_unario: CIRCUNFLEXO ID outros_ident dimensao
               |ID chamada_partes
               |NUM_INT
               |NUM_REAL
               |ABRE_PARENTESES expressao FECHA_PARENTESES;
parcela_nao_unario:'&' ID outros_ident dimensao
                  |CADEIA;
outras_parcelas:('%'parcela outras_parcelas)?;
chamada_partes : (ABRE_PARENTESES expressao mais_expressao FECHA_PARENTESES
                |outros_ident dimensao)?;
exp_relacional: exp_aritimetica op_opcional;
op_opcional: (op_relacional exp_aritimetica)?;
op_relacional :'='|'<>'|'>='|'<='|'>'|'<';
expressao : termo_logico outros_termos_logicos;
op_nao: 'nao'?;
termo_logico : fator_logico outros_fatores_logicos;
outros_termos_logicos: ('ou' termo_logico outros_termos_logicos)?;
fator_logico: (op_nao parcela_logica)?;
outros_fatores_logicos:('e' fator_logico outros_fatores_logicos)?;
parcela_logica: 'verdadeiro'|'falso'|exp_relacional;
//Lexemas

ALGORITIMO : 'algoritimo';
FIM_ALGORITIMO: 'fim_algoritimo';
CONSTANTE: 'constante';
DECLARE : 'declare';
TIPO : 'tipo';
DOIS_PONTOS : ':';
IGUAL_ASSIMILACAO : '=';
VIRGULA : ',';
CIRCUNFLEXO : '^';
PONTO : '.';
ABRE_COLCHETE : '[';
FECHA_COLCHETE : ']';
REGISTRO : 'registro';
FIM_REGISTRO : 'fim_registro';
PROCEDIMENTO : 'procedimento';
ABRE_PARENTESES : '(';
FECHA_PARENTESES : ')';
FIM_FUNCAO : 'fim_funcao';
LEIA : 'leia';
ESCREVA : 'escreva';
SE : 'se';
FIM_SE : 'fim_se';
ENTAO : 'entao';
CASO : 'caso';
FIM_CASO : 'fim_caso';
PARA : 'para';
SEJA : 'seja';
FIM_PARA : 'fim_para';
FACA :'faca';
ATE : 'ate';
ENQUANTO : 'enquanto';
FIM_ENQUANTO : 'fim_enquanto';
RETORNE : 'retorne';
SENAO: 'senao';
MENOS : '-';
MAIS : '+';
VEZES : '*';
DIVIDIR : '/';

VAR : 'var';
BOOLEANO : 'verdadeiro'|'falso';
LITERAL : 'literal';
INTEIRO : 'inteiro';
REAL : 'real';
LOGICO: 'logico';
NUM_REAL : ('0'..'9')+ '.' ('0'..'9')+;
NUM_INT : ('0'..'9')+;
CADEIA : '"' ~('\r' | '\n' | '"')* '"' ;
ID : ('a'..'z'|'A'..'Z'|'_')  ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;