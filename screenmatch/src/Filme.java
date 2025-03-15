public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double SomaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


    @Override
    public String toString(){
        return String.format("""
        Nome: %s
        Ano de lançamento: %d
        Avaliação: %.1f
        """, nome, anoDeLancamento, SomaDasAvaliacoes);
    }

    public void avaliacao(double nota){
        SomaDasAvaliacoes += nota;
    }

}
