public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano = false;
    private double SomaDasAvaliacoes = 0;
    private int totalDeAvaliacoes = 0;
    private int duracaoEmMinutos;


    public Filme(){
    }

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;

    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }





    @Override
    public String toString(){
        return String.format("Nome: %s\nAno de lançamento: %d\nAvaliação: %.1f\n", nome, anoDeLancamento, SomaDasAvaliacoes);
    }

    public void avaliacao(double nota){
        SomaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return SomaDasAvaliacoes / totalDeAvaliacoes;
    }

    

}
