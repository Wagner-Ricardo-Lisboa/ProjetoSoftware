import entidades.Eletronico;
import entidades.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        while (true) {

            System.out.println("Menu de opções");
            System.out.println("1- Cadastrar Produto");
            System.out.println("2- Cadastrar eletrônico");
            System.out.println("3- Listar Produtos");
            System.out.println("4- Alterar Produto");
            System.out.println("5- Excluir Produto");
            System.out.println("6- Realizar Venda");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opção:");

            String opcao = sc.nextLine();

            switch (opcao) {

                case "1":

                    System.out.println("Digite o nome do produto:");
                    String nome = sc.nextLine();

                    System.out.println("Digite o valor do produto:");
                    double preco = sc.nextDouble();

                    System.out.println("Digite a quantidade do produto:");
                    int quantidadeEstoque = sc.nextInt();
                    sc.nextLine();

                    Produto produto = new Produto(nome, preco, quantidadeEstoque);
                    produtos.add(produto);

                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case "2":

                    System.out.println("Digite o nome do eletrônico:");
                    String nome2 = sc.nextLine();

                    System.out.println("Digite o valor do eletrônico:");
                    double preco2 = sc.nextDouble();

                    System.out.println("Digite a quantidade do eletrônico:");
                    int quantidadeEstoque2 = sc.nextInt();

                    System.out.println("Digite a garantia deste eletrônico:");
                    int garantia = sc.nextInt();
                    sc.nextLine();

                    Eletronico eletronico =
                            new Eletronico(nome2, preco2, quantidadeEstoque2, garantia);

                    produtos.add(eletronico);

                    System.out.println("Eletrônico cadastrado com sucesso!");
                    break;
                case "3":
                for (int i = 0; i < produtos.size(); i++) {

                    System.out.println("ID: " + i);
                    produtos.get(i).exibirInformacoes();
                    System.out.println("Valor total em estoque: R$ "
                            + produtos.get(i).calcularTotal());
                    System.out.println("--------------");
                }

                    break;

                case "4":

                    System.out.println("Informe o ID do produto:");
                    int idProduto = sc.nextInt();
                    sc.nextLine();

                    if (idProduto < 0 || idProduto >= produtos.size()) {
                        System.out.println("ID inválido!");
                        break;
                    }

                    System.out.println("Informe o novo nome:");
                    String alterarProduto = sc.nextLine();

                    System.out.println("Informe o novo preço:");
                    double alterarPrecoProduto = sc.nextDouble();

                    System.out.println("Informe a nova quantidade:");
                    int alterarQuantidadeEstoque = sc.nextInt();
                    sc.nextLine();

                    Produto mudarProduto = produtos.get(idProduto);

                    mudarProduto.setNome(alterarProduto);
                    mudarProduto.setPreco(alterarPrecoProduto);
                    mudarProduto.setQuantidadeEstoque(alterarQuantidadeEstoque);

                    System.out.println("Produto alterado com sucesso!");
                    break;

                case "5":

                    System.out.println("Digite o ID do produto:");
                    int idRemoverProduto = sc.nextInt();
                    sc.nextLine();

                    if (idRemoverProduto < 0 || idRemoverProduto >= produtos.size()) {
                        System.out.println("ID inválido!");
                        break;
                    }

                    produtos.remove(idRemoverProduto);

                    System.out.println("Produto removido com sucesso!");
                    break;

                case "6":

                    System.out.println("Digite o nome do produto:");
                    String nomeVenda = sc.nextLine();

                    boolean encontrado = false;

                    for (Produto p : produtos) {

                        if (p.getNome().equalsIgnoreCase(nomeVenda)) {

                            encontrado = true;

                            System.out.println("Quantidade para vender:");
                            int qtdVenda = sc.nextInt();
                            sc.nextLine();

                            if (p.vender(qtdVenda)) {

                                double valorTotal = qtdVenda * p.getPreco();

                                System.out.println("Venda realizada com sucesso!");
                                System.out.println("Valor total: R$ " + valorTotal);
                                System.out.println("Estoque restante: "
                                        + p.getQuantidadeEstoque());

                            } else {

                                if (qtdVenda <= 0) {
                                    System.out.println("Quantidade inválida!");
                                } else {
                                    System.out.println("Estoque insuficiente!");
                                    System.out.println("Estoque disponível: "
                                            + p.getQuantidadeEstoque());
                                }
                            }

                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case "0":

                    System.out.println("Programa encerrado!");
                    sc.close();
                    return;

                default:

                    System.out.println("Opção inválida!");
            }
        }
    }
}