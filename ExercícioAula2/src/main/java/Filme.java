public class Filme {

    private Diretor diretorFilme;
    private String nomeFilme;
    private String descricaoFilme;
    private int duracaoEmMinutos;
    private int anoLancamento;
    private int notaAvaliacao;

    public Filme(Diretor diretorFilme, String nomeFilme, String descricaoFilme, int duracaoEmMinutos, int anoLancamento, int notaAvaliacao) throws AvaliacaoForaDoPadraoException {
        this.diretorFilme = diretorFilme;
        this.nomeFilme = nomeFilme;
        this.descricaoFilme = descricaoFilme;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.anoLancamento = anoLancamento;
        if (notaAvaliacao > 0 & notaAvaliacao <= 5){
            this.notaAvaliacao = notaAvaliacao;
        } else {
            throw new AvaliacaoForaDoPadraoException();
        }

    }

    public void reproduzir(){
        System.out.println(this.nomeFilme);
        System.out.println(this.descricaoFilme);
        System.out.println(this.duracaoEmMinutos + " minutos");
        System.out.println("Diretor do filme: " + diretorFilme.getNome());
    }
}
