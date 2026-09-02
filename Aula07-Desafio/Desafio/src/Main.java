import entidades.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.println("====MENU DE OPÇÕES====");
            System.out.println("1 - Registrar Roupas");
            System.out.println("2 - Listar Roupas");
            System.out.println("3 - Atualizar Roupa");
            System.out.println("4 - Excluir Roupa");
            System.out.println("5 - Exibir valor do estoque");
            System.out.println("6 - Sair");
            System.out.println("Digite uma opção: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome da roupa: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a quantidade da roupa: ");
                    int quantidade = sc.nextInt();
                    System.out.println("Digite o preco da roupa: ");
                    double preco = sc.nextDouble();

                    Produto produto = new Produto(nome, quantidade, preco);
                    produtos.add(produto);
                    break;

                case "2":
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhuma roupa registrada.");
                    } else {
                        System.out.println("|  ID  |  NOME DA ROUPA  |  QUANTIDADE  |  PREÇO  |");
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println("|" + i + "|" + produtos.get(i).toString() + "|");
                        }
                    }
                    break;
                case "3":
                    System.out.println("Informe o ID da roupa: ");
                    int idRoupa = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Informe o nome da roupa: ");
                    String alterarNome = sc.nextLine();
                    System.out.println("Informe a quantidade da roupa: ");
                    int alterarQuantidade = sc.nextInt();
                    System.out.println("Informe o preco da roupa: ");
                    double alterarPreco = sc.nextDouble();

                    var alterarRoupa = produtos.get(idRoupa);

                    alterarRoupa.setNome(alterarNome);
                    alterarRoupa.setQuantidade(alterarQuantidade);
                    alterarRoupa.setPreco(alterarPreco);

                    System.out.println("Roupa atualizada com sucesso!");
                    break;
                case "4":
                    System.out.println("Informe o ID da roupa: ");
                    int idRemover = sc.nextInt();
                    sc.nextLine();

                    produtos.remove(idRemover);

                    System.out.println("Roupa removida com sucesso!");
                    break;
                case "5":
                    double valorTotal = 0;

                    for (Produto p : produtos) {
                        valorTotal += p.valorEstoque();
                    }

                    System.out.println("Valor total do estoque: R$ " + valorTotal);
                    break;
                case "6":
                    return;
            }

        }

    }
}
