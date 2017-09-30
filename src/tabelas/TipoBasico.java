package tabelas;

public enum TipoBasico {
    inteiro, real, logico, literal;

    public static TipoBasico getTipoBasico(String tipo) {
        try {
            return TipoBasico.valueOf(tipo);
        }
        catch(IllegalArgumentException e) {
            return null;
        }
    }

    public static boolean isTipoBasico(String tipo) {
        try {
            TipoBasico.valueOf(tipo);
            return true;
        }
        catch(IllegalArgumentException e) {
            return false;
        }
    }

}
