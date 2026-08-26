package entidades;

public class Filme {

    private String nome;
    private String genero;
    private int duracao;
    private double valor;
    private int qtdIngressos;

    public Filme(String nome, String genero, int duracao, double valor, int qtdIngressos) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
        this.valor = valor;
        this.qtdIngressos = qtdIngressos;
    }

}
