package entidades;

public class Roupa {
    private String marca;
    private String tamanho;
    private int quantidade;
    private double valor;

    public Roupa(String marca, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return marca + "|" + tamanho + "|" + quantidade + "|" + valor;
    }
}