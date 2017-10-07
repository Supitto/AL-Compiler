grammar LinguagemAlgoritimica;

//Regras

programa : declaracoes ALGORITMO corpo FIM_ALGORITMO;
declaracoes: (decl_local_global declaracoes)?;
decl_local_global : decl_local | decl_global;
decl_local: DECLARE variavel |
            CONSTANTE ID DOIS_PONTOS tipo_basico IGUAL_ASSIMILACAO valor_constante|
            TIPO ID DOIS_PONTOS tipo;
variavel: ID dimensao mais_var* DOIS_PONTOS tipo;
// mais_var: (VIRGULA ID dimensao mais_var)?;
mais_var: VIRGULA ID dimensao;
identificador : ponteiros_opcionais ID dimensao outros_ident;
ponteiros_opcionais : (CIRCUNFLEXO ponteiros_opcionais)?;
outros_ident : (PONTO ID dimensao)?;
dimensao : (ABRE_COLCHETE exp_aritimetica FECHA_COLCHETE dimensao)?;
tipo : registro | tipo_estendido;
mais_ident : (VIRGULA identificador mais_ident)?;
//mais_variaveis : (variavel mais_variaveis)?;
tipo_basico : LITERAL|REAL|INTEIRO|LOGICO;
tipo_basico_ident : tipo_basico | ID;
tipo_estendido : ponteiros_opcionais tipo_basico_ident;
valor_constante : CADEIA|NUM_INT|NUM_REAL|BOOLEANO;
//registro : REGISTRO variavel mais_variaveis FIM_REGISTRO;
registro : REGISTRO variavel* FIM_REGISTRO;
decl_global : PROCEDIMENTO ID ABRE_PARENTESES parametros_opcional FECHA_PARENTESES declaracoes_locais comandos FIM_PROCEDIMENTO |
              FUNCAO ID ABRE_PARENTESES parametros_opcional FECHA_PARENTESES DOIS_PONTOS tipo_estendido declaracoes_locais comandos FIM_FUNCAO;
parametros_opcional : parametro?;
parametro : var_opcional identificador mais_ident DOIS_PONTOS tipo_estendido mais_parametros;
var_opcional : VAR?;
mais_parametros : (VIRGULA parametro)?;
declaracoes_locais : (decl_local declaracoes_locais)?;
corpo : declaracoes_locais comandos;

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
atribuicao : ID chamada_atribuicao;
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
exp_aritimetica : termo outros_termos*;
op_multiplicacao: VEZES|DIVIDIR;
op_adicao:MAIS|MENOS;
// termo:fator outros_fatores;
termo: fator outros_fatores*;
// outros_termos: (op_adicao termo outros_termos)?;
outros_termos: op_adicao termo;
// fator: parcela outras_parcelas;
fator: parcela outras_parcelas*;
// outros_fatores:(op_multiplicacao fator outros_fatores)?;
outros_fatores: op_multiplicacao fator;
parcela: op_unario parcela_unario
        |parcela_nao_unario;
// parcela_unario: CIRCUNFLEXO ID outros_ident dimensao
parcela_unario: identificador
               |ID chamada_partes
               |NUM_INT
               |NUM_REAL
               |ABRE_PARENTESES expressao FECHA_PARENTESES;
// parcela_nao_unario:'&' ID outros_ident dimensao
parcela_nao_unario: '&' identificador
                  |CADEIA;
outras_parcelas: '%'parcela;
/* chamada_partes : (ABRE_PARENTESES expressao mais_expressao FECHA_PARENTESES
                   |outros_ident dimensao)?; */
chamada_partes: ABRE_PARENTESES expressao mais_expressao FECHA_PARENTESES;
// exp_relacional: exp_aritimetica op_opcional;
exp_relacional: exp_aritimetica op_opcional*;
// op_opcional: (op_relacional exp_aritimetica)?;
op_opcional: op_relacional exp_aritimetica;
op_relacional :'='|'<>'|'>='|'<='|'>'|'<';
// expressao : termo_logico outros_termos_logicos;
expressao : termo_logico outros_termos_logicos*;
op_nao: 'nao'?;
// termo_logico : fator_logico outros_fatores_logicos;
termo_logico : fator_logico outros_fatores_logicos*;
// outros_termos_logicos: ('ou' termo_logico outros_termos_logicos)?;
outros_termos_logicos: 'ou' termo_logico;
fator_logico: op_nao parcela_logica;
// outros_fatores_logicos:('e' fator_logico outros_fatores_logicos)?;
outros_fatores_logicos: 'e' fator_logico;
parcela_logica: BOOLEANO|exp_relacional;
//Lexemas

ALGORITMO : 'algoritmo';
FIM_ALGORITMO: 'fim_algoritmo';
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
FUNCAO : 'funcao';
ABRE_PARENTESES : '(';
FECHA_PARENTESES : ')';
FIM_PROCEDIMENTO : 'fim_procedimento';
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

COMENTARIO : '{' ~('}')* '}' -> skip;
WS : ('\n'|'\r'|'\t'|' ') -> skip;

COMENTARIO_INCOMPLETO : '{' ~('}')* { throw new ParseCancellationException("Linha "+getLine()+": comentario nao fechado\n"); };
ERROR : . { throw new ParseCancellationException("Linha "+getLine()+": "+getText()+" - simbolo nao identificado\n"); };
