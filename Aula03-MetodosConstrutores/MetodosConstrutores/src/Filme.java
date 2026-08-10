import javax.swing.*;

public class Filme {

    String titulo;
    String genero;
    String autor;
    int duracao;
    double valor;
    int qtdIngressos;

    public Filme(String titulo, String genero, String autor, int duracao, double valor, int qtdIngressos) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.duracao = duracao;
        this.valor = valor;
        this.qtdIngressos = qtdIngressos;
    }

    public void decrementaingressos(int ingressos) {

        if (ingressos > 0 && ingressos <= this.qtdIngressos) {
            this.qtdIngressos -= ingressos;
            System.out.println("Ingressos comprados com sucesso!");
        } else {
            System.out.println("Quantidade inválida");
        }

    }

    public double compraingresso(int ingressos) {
        if (ingressos > 0 && ingressos <= this.qtdIngressos) {
            return ingressos * this.valor;
    } else {
       return 0;
    }
}

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                "\nGenero: " + genero +
                "\nAutor: " + autor +
                "\nDuracao: " + duracao +
                "\nValor do ingresso: " + valor +
                "\nQuantidade de ingressos disponíveis: " + qtdIngressos;
    }
}
