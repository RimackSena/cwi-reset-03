public class ItensPorQuantidade {

    static int pao = 3600;
    static int torta = 64;
    static int sanduiche = 20;
    static int leite = 20;
    static int cafe = 20;


    public static int getPao() {
        return pao;
    }

    public static void setPao(int pao) {
        ItensPorQuantidade.pao = pao;
    }

    public static int getTorta() {
        return torta;
    }

    public static void setTorta(int torta) {
        ItensPorQuantidade.torta = torta;
    }

    public static int getSanduiche() {
        return sanduiche;
    }

    public static void setSanduiche(int sanduiche) {
        ItensPorQuantidade.sanduiche = sanduiche;
    }

    public static int getLeite() {
        return leite;
    }

    public static void setLeite(int leite) {
        ItensPorQuantidade.leite = leite;
    }

    public static int getCafe() {
        return cafe;
    }

    public static void setCafe(int cafe) {
        ItensPorQuantidade.cafe = cafe;
    }

    public static int quantidadeEmEstoque (String item){
        if ("pao".equals(item)) {
            return getPao();
        }

        if ("torta".equals(item)) {
            return getTorta();
        }

        if ("sanduiche".equals(item)) {
            return getSanduiche();
        }

        if ("cafe".equals(item)) {
            return getCafe();
        }

        if ("leite".equals(item)) {
            return getLeite();
        }
        return 0;
    }
}
