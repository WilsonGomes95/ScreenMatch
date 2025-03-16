public class Principal {
    public static void main(String[] args) throws Exception {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972, 175);

        System.out.println(meuFilme);
        meuFilme.avaliacao(5);
        meuFilme.avaliacao(4.5);
        meuFilme.avaliacao(4.5);
        System.out.println(meuFilme);
        System.out.println("Média: " + String.format("%.2f",meuFilme.pegaMedia()));
        









    }
}
