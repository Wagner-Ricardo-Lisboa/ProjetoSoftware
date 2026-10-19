package entidades;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public void exibirInformacoes(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Valor do produto: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }

    public boolean vender(int quantidade) {

        if (quantidade <= 0) {
            return false;
        }

        if (quantidade > quantidadeEstoque) {
            return false;
        }

        quantidadeEstoque -= quantidade;
        return true;
    }

    public double calcularTotal() {
        return getPreco() * getQuantidadeEstoque();
    }

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nPreco: R$" + preco +
                "\nQuantidade Estoque: " + quantidadeEstoque;
    }


}
