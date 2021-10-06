public class QuantidadeMinimaItem {

    public static boolean precisaReposicao(String item) {
        if ("pao".equals(item)) {
            if (ItensPorQuantidade.pao < 600){
                return true;
            }

        }

        if ("torta".equals(item)) {
            if (ItensPorQuantidade.torta < 10){
                return true;
            }

        }

        if ("sanduiche".equals(item)) {
            if (ItensPorQuantidade.sanduiche <= 1){
                return true;
            }

        }

        if ("cafe".equals(item)) {
            if (ItensPorQuantidade.leite < 12){
                return true;
            }

        }

        if ("leite".equals(item)) {
            if (ItensPorQuantidade.cafe < 12){
                return true;
            }

        }

        return false;
    }

    public static void retiradaDoEstoque(String item, int quantidade){

        if ("pao".equals(item));{
            ItensPorQuantidade.setPao(ItensPorQuantidade.getPao() - (quantidade * 60));
        }

        if ("torta".equals(item)){
            ItensPorQuantidade.setTorta(ItensPorQuantidade.getTorta() - quantidade);
        }

        if ("sanduiche".equals(item)){
            ItensPorQuantidade.setSanduiche(ItensPorQuantidade.getSanduiche() - quantidade);
        }

        if ("cafe".equals(item)){
            ItensPorQuantidade.setCafe(ItensPorQuantidade.getCafe() - quantidade);
        }

        if ("leite".equals(item)){
            ItensPorQuantidade.setLeite(ItensPorQuantidade.getLeite() - quantidade);
        }

    }

}
