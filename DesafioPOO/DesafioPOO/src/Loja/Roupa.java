package Loja;

public class Roupa {

    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidaderoupa;
    private double valor;

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidaderoupa = quantidade;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }
    public String getTipo() {
        return tipo;
    }
    public String getTamanho() {
        return tamanho;
    }
    public int getQuantidade() {
        return quantidaderoupa;
    }
    public double getValor() {
        return valor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public void setQuantidade(int quantidade) {
        this.quantidaderoupa = quantidade;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void decrementaQuantidade(int quantidade) {

        if (quantidade > 0 && quantidade <= this.quantidaderoupa) {
            this.quantidaderoupa -= quantidade;
            System.out.println("Compra efetuada");
        } else {
            System.out.println("Quantidade inválida");
        }
    }
    public double calculaValor(int quantidade) {

        if (quantidade > 0 && quantidade <= this.quantidaderoupa) {
            return quantidade * this.valor;
        } else {
            return 0;
        }
    }
    public void incrementaQuantidade(int quantidade) {

        if (quantidade > 0 && quantidade <= this.quantidaderoupa) {
            this.quantidaderoupa += quantidade;
            System.out.println("Roupas compradas com sucesso!");
        } else {
            System.out.println("Quantia inválida");
        }
    }
}