/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corretortrabalho1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author daniellucredio
 */
public class CorretorTrabalho1 {

    static int numCT1 = 0;
    static int numCT2 = 0;
    static int numCT3 = 0;
    static int numCT1Corretos = 0;
    static int numCT2Corretos = 0;
    static int numCT3Corretos = 0;

    public static void main(String[] args) throws Exception {
        if (args.length < 6) {
            System.out.println("Uso: java -jar CorretorTrabalho1.java "
                    + "<caminho para o compilador executavel> "
                    + "<caminho para o compilador gcc> "
                    + "<caminho para uma pasta temporaria> "
                    + "<caminho para a pasta com os casos de teste> "
                    + "\"RAs dos alunos do grupo\" "
                    + "tipoTeste (sintatico|semantico|gerador|tudo");
            System.exit(0);
        }
        String executavel = args[0];
        String compiladorGcc = args[1];
        String diretorioTemporario = args[2];
        String diretorioCasosDeTeste = args[3];
        String grupo = args[4];
        String tipoTeste = args[5];

        if (!tipoTeste.equals("sintatico") && !tipoTeste.equals("semantico") && !tipoTeste.equals("gerador") && !tipoTeste.equals("tudo")) {
            System.out.println("Na opcao tipoTeste, especifique: sintatico ou semantico ou gerador ou tudo");
            System.exit(0);
        }

        File fDiretorioCasosDeTeste = new File(diretorioCasosDeTeste);
        if (!fDiretorioCasosDeTeste.isDirectory() || !fDiretorioCasosDeTeste.exists()) {
            System.out.println("Caminho " + diretorioCasosDeTeste + " nao existe ou nao e uma pasta!");
            System.exit(0);
        }

        File fPastaDeTrabalho = new File(diretorioTemporario, "saidaProduzida");
        if (fPastaDeTrabalho.exists() && fPastaDeTrabalho.isDirectory()) {
            FileUtils.deleteDirectory(fPastaDeTrabalho);

        }
        fPastaDeTrabalho.mkdirs();

        File f1 = new File(fDiretorioCasosDeTeste, "1.arquivos_com_erros_sintaticos");
        File f2 = new File(fDiretorioCasosDeTeste, "2.arquivos_com_erros_semanticos");
        File f3 = new File(fDiretorioCasosDeTeste, "3.arquivos_sem_erros");
        File f1Entrada = new File(f1, "entrada");
        File f1Saida = new File(f1, "saida");
        File f2Entrada = new File(f2, "entrada");
        File f2Saida = new File(f2, "saida");
        File f3Entrada = new File(f3, "1.entrada");
        File f3EntradaExecucao = new File(f3, "3.entrada_execucao");
        File f3Saida = new File(f3, "4.saida");

        if (!(f1Entrada.exists() && f1Entrada.isDirectory()
                || f1Saida.exists() && f1Saida.isDirectory()
                || f2Entrada.exists() && f2Entrada.isDirectory()
                || f2Saida.exists() && f2Saida.isDirectory()
                || f3Entrada.exists() && f3Entrada.isDirectory()
                || f3EntradaExecucao.exists() && f3EntradaExecucao.isDirectory()
                || f3Saida.exists() && f3Saida.isDirectory())) {
            System.out.println(
                    "Pasta de casos de testes corrompida. Verifique "
                    + "se as seguintes subpastas estao presentes:");
            System.out.println(f1Entrada.getAbsolutePath());
            System.out.println(f1Saida.getAbsolutePath());
            System.out.println(f2Entrada.getAbsolutePath());
            System.out.println(f2Saida.getAbsolutePath());
            System.out.println(f3Entrada.getAbsolutePath());
            System.out.println(f3EntradaExecucao.getAbsolutePath());
            System.out.println(f3Saida.getAbsolutePath());
            System.exit(0);
        }

        float notaCT1 = 0;
        float notaCT2 = 0;
        float notaCT3 = 0;

        if (tipoTeste.equals("tudo") || tipoTeste.equals("sintatico")) {
            System.out.println("Corrigindo analisador sintatico ...");
            analisaSintatico(executavel, f1Entrada, f1Saida, fPastaDeTrabalho);
            notaCT1 = 10.0f * (((float) numCT1Corretos) / ((float) numCT1));

        }
        if (tipoTeste.equals("tudo") || tipoTeste.equals("semantico")) {
            System.out.println("Corrigindo analisador semantico ...");
            analisaSemanticoComErros(executavel, f2Entrada, f2Saida, fPastaDeTrabalho);
            notaCT2 = 10.0f * (((float) numCT2Corretos) / ((float) numCT2));
        }
        if (tipoTeste.equals("tudo") || tipoTeste.equals("gerador")) {
            System.out.println("Corrigindo gerador de codigo ...");
            analisaGeradorDeCodigo(executavel, compiladorGcc, f3Entrada, f3EntradaExecucao, f3Saida, fPastaDeTrabalho);
            notaCT3 = 10.0f * (((float) numCT3Corretos) / ((float) numCT3));
        }

        System.out.println("\n\n==================================");
        System.out.println("Nota do grupo \"" + grupo + "\":");

        System.out.println("CT1 = " + notaCT1 + " (" + numCT1Corretos + "/" + numCT1 + ")");
        System.out.println("CT2 = " + notaCT2 + " (" + numCT2Corretos + "/" + numCT2 + ")");
        System.out.println("CT3 = " + notaCT3 + " (" + numCT3Corretos + "/" + numCT3 + ")");
        System.out.println("==================================");
    }

    private static void analisaSintatico(String executavel, File entrada, File saida, File pastaDeTrabalho) {
        File fSaida1 = new File(pastaDeTrabalho, "saidaSintatico");
        fSaida1.mkdirs();
        File[] casosDeTeste = entrada.listFiles();
        numCT1 = casosDeTeste.length;
        for (File ctEntrada : casosDeTeste) {
            System.out.println("   " + ctEntrada.getName());
            File fSaidaUsuario = new File(fSaida1, ctEntrada.getName());
            String cmd = executavel + " " + ctEntrada.getAbsolutePath() + " " + fSaidaUsuario.getAbsolutePath();
            System.out.println("Executando: " + cmd);
            try {
                Process p = Runtime.getRuntime().exec(cmd);
                p.waitFor();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }

        numCT1Corretos = compararPastas(saida, fSaida1);
    }

    private static void analisaSemanticoComErros(String executavel, File entrada, File saida, File pastaDeTrabalho) {
        File fSaida1 = new File(pastaDeTrabalho, "saidaSemanticoComErros");
        fSaida1.mkdirs();
        File[] casosDeTeste = entrada.listFiles();
        numCT2 = casosDeTeste.length;
        for (File ctEntrada : casosDeTeste) {
            System.out.println("   " + ctEntrada.getName());

            File fSaidaUsuario = new File(fSaida1, ctEntrada.getName());
            String cmd = executavel + " " + ctEntrada.getAbsolutePath() + " " + fSaidaUsuario.getAbsolutePath();
            System.out.println("Executando: " + cmd);
            try {
                Process p = Runtime.getRuntime().exec(cmd);
                p.waitFor();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }

        numCT2Corretos = compararPastas(saida, fSaida1);
    }

    private static void analisaGeradorDeCodigo(String executavel, String gcc, File entrada, File entradaExecucao, File saidaExecucaoCasosDeTeste, File pastaDeTrabalho) {
        System.out.println("   Gerando codigo...");
        File fSaida1 = new File(pastaDeTrabalho, "saidaGeradorDeCodigo");
        File fSaida2 = new File(pastaDeTrabalho, "saidaExecucao");
        fSaida1.mkdirs();
        fSaida2.mkdirs();
        File[] casosDeTeste = entrada.listFiles();
        numCT3 = casosDeTeste.length;
        for (File ctEntrada : casosDeTeste) {
            System.out.println("   " + ctEntrada.getName());

            File fSaidaUsuario = new File(fSaida1, ctEntrada.getName() + ".c");
            String cmd = executavel + " " + ctEntrada.getAbsolutePath() + " " + fSaidaUsuario.getAbsolutePath();
            try {
                Process p = Runtime.getRuntime().exec(cmd);
                p.waitFor();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("   Compilando codigo gerado...");
        for (File ctEntrada : casosDeTeste) {
            File fGerado = new File(fSaida1, ctEntrada.getName() + ".c");
            File fCompilado = new File(fSaida1, ctEntrada.getName() + ".out");
            String cmd = gcc + " " + fGerado.getAbsolutePath() + " -o " + fCompilado.getAbsolutePath();
            try {
                System.out.println(cmd);
                Process p = Runtime.getRuntime().exec(cmd);
                p.waitFor();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("   Testando codigo compilado...");
        for (File ctEntrada : casosDeTeste) {
            File fCompilado = new File(fSaida1, ctEntrada.getName() + ".out");
            File fEntradaExecucao = new File(entradaExecucao, ctEntrada.getName());
            File fSaidaExecucao = new File(fSaida2, ctEntrada.getName());

            String cmd = fCompilado.getAbsolutePath();

            try {
                Process p = Runtime.getRuntime().exec(cmd);
                OutputStream os = p.getOutputStream();
                InputStream is = p.getInputStream();

                FileInputStream fisEntradaExecucao = new FileInputStream(fEntradaExecucao);
                int b = fisEntradaExecucao.read();
                while (b != -1) {
                    os.write(b);
                    b = fisEntradaExecucao.read();
                }
                os.flush();
                fSaidaExecucao.createNewFile();

                FileOutputStream fosSaidaExecucao = new FileOutputStream(fSaidaExecucao);
                b = is.read();
                while (b != -1) {
                    fosSaidaExecucao.write(b);
                    b = is.read();
                }

                fosSaidaExecucao.flush();

                os.close();
                fosSaidaExecucao.close();
                is.close();
                fisEntradaExecucao.close();

                p.waitFor();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }

        numCT3Corretos = compararPastas(saidaExecucaoCasosDeTeste, fSaida2);

    }

    private static int compararPastas(File pastaCasosTeste, File pastaAluno) {
        int numAcertos = 0;
        File[] filesCasosTeste = pastaCasosTeste.listFiles();
        for (File fCasoTeste : filesCasosTeste) {
            if (!fCasoTeste.getName().endsWith("alt")) {
                File fAluno = new File(pastaAluno, fCasoTeste.getName());
                boolean igual = compararArquivos(fCasoTeste, fAluno);
                if (!igual) {
                    int alt = 1;
                    String altTxt = "." + alt + "alt";
                    File fCasoTesteAlt = new File(pastaCasosTeste, fCasoTeste.getName() + altTxt);
                    while (fCasoTesteAlt.exists()) {
                        igual = compararArquivos(fCasoTesteAlt, fAluno);
                        if (igual) {
                            break;
                        }
                        alt++;
                        altTxt = "." + alt + "alt";
                        fCasoTesteAlt = new File(pastaCasosTeste, fCasoTeste + altTxt);
                    }
                }
                if (!igual) {
                    File f = new File(fAluno.getParent(), "_erro_" + fAluno.getName());
                    fAluno.renameTo(f);
                } else {
                    File f = new File(fAluno.getParent(), "_ok_" + fAluno.getName());
                    fAluno.renameTo(f);
                    numAcertos++;
                }
            }
        }
        return numAcertos;
    }

    private static boolean compararArquivos(File fCasoTeste, File fAluno) {
        InputStream i1 = null;
        InputStream i2 = null;
        try {
            //System.out.println("Comparando:"+fCasoTeste.getName()+" - "+fAluno.getName());

            i1 = new FileInputStream(fCasoTeste);
            i2 = new FileInputStream(fAluno);


            boolean diferente = false;
            int char1 = -1;
            int char2 = -1;
            while ((char1 = i1.read()) != -1 & (char2 = i2.read()) != -1) {
                if (char1 == '\r') {
                    char1 = i1.read();
                }
                if (char2 == '\r') {
                    char2 = i2.read();
                }
                if (char1 != char2) {
                    return false;
                }
            }
            if (char1 != -1 || char2 != -1) {
                return false;
            }
            return true;
        } catch (FileNotFoundException fnfe) { // nunca irá ocorrer, pois o nome vem de uma listagem
        } catch (IOException ioe) { // não faz nada
        } finally {
            try {
                if (i1 != null) {
                    i1.close();
                }
                if (i2 != null) {
                    i2.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }
    /*
     private static void comparar(String nomeArquivo, InputStream saidaCorreta, String saidaObtida) throws Exception {
     InputStreamReader isr = new InputStreamReader(saidaCorreta);
     StringReader sr = new StringReader(saidaObtida);
     boolean diferente = false;
     int charFr = -1;
     int charSr = -1;
     while ((charFr = isr.read()) != -1 & (charSr = sr.read()) != -1) {
     if (charFr != charSr) {
     diferente = true;
     System.out.println("ERRO:" + nomeArquivo);
     System.out.println("=================== Saída obtida ==================");
     System.out.println(Saida.getTexto());
     System.out.println("===================================================");
     break;
     }
     }
     if (!diferente && (charFr != -1 || charSr != -1)) {
     diferente = true;
     System.out.println("ERRO:" + nomeArquivo);
     System.out.println("=================== Saída obtida ==================");
     System.out.println(Saida.getTexto());
     System.out.println("===================================================");
     }

     if (!diferente) {
     System.out.println("OK:" + nomeArquivo);
     }

     }*/
}
