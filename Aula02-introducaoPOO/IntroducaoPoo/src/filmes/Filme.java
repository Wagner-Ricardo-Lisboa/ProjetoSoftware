package filmes;

public class Filme {
    //Atributos
    String titulo;
    String genero;
    int duracao;

    //Ingressos
    int qtdingresso;
    int anolancamento;
    double valorIngresso;

    @Override
    public String toString() {
        return
                "\nTítulo: " + titulo +
                "\nGênero: " + genero +
                "\nDuração: " + duracao +
                "\nQuantidade de ingressos: " + qtdingresso +
                "\nAno de Lançamento: " + anolancamento +
                "\nValor do ingresso: " + valorIngresso
                ;
    }
}
