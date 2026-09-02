import entidades.Roupa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Roupa> roupas = new ArrayList<>();

        while (true) {
            System.out.println("===MENU DE OPÇÕES===");
            System.out.println("1 - Registrar Roupas");
            System.out.println("2 - Listar Roupas");
            System.out.println("3 - Atualizar Roupa");
            System.out.println("4 - Excluir Roupa");
            System.out.println("5 - Sair");
            System.out.println("Digite uma opção: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Digite a marca da roupa: ");
                    String marca = sc.nextLine();
                    System.out.println("Digite a tamanho da roupa: ");
                    String tamanho = sc.nextLine();
                    System.out.println("Digite a quantidade da roupa: ");
                    int quantidade = sc.nextInt();
                    System.out.println("Digite a valor da roupa: ");
                    double valor = sc.nextDouble();

                    Roupa roupa = new Roupa(marca, tamanho, quantidade, valor);
                    roupas.add(roupa);
                    break;

                case "2":
                    if (roupas.isEmpty()) {
                        System.out.println("Nenhuma roupa registrada.");
                    } else {
                        System.out.println("|  ID  |  MARCA  |  TAMANHO  |  QUANTIDADE  |  VALOR  |");
                        for (int i = 0; i < roupas.size(); i++) {
                            System.out.println("|" + i + "|" + roupas.get(i).toString() + "|");
                        }
                    }
                    break;
                case "3":
                    System.out.println("Informe o ID da roupa: ");
                    int idRoupa = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Informe a marca da roupa: ");
                    String alterarMarca = sc.nextLine();
                    System.out.println("Informe a tamanho da roupa: ");
                    String alterarTamanho = sc.nextLine();
                    System.out.println("Informe a quantidade da roupa: ");
                    int alterarQuantidade = sc.nextInt();
                    System.out.println("Informe a valor da roupa: ");
                    double alterarValor = sc.nextDouble();

                    var alterarRoupa = roupas.get(idRoupa);

                    alterarRoupa.setMarca(alterarMarca);
                    alterarRoupa.setTamanho(alterarTamanho);
                    alterarRoupa.setQuantidade(alterarQuantidade);
                    alterarRoupa.setValor(alterarValor);

                    System.out.println("Roupa atualizada com sucesso!");
                    break;
                case "4":
                    System.out.println("Informe o ID da roupa: ");
                    int idRemover = sc.nextInt();
                    sc.nextLine();

                    roupas.remove(idRemover);

                    System.out.println("Roupa removida com sucesso!");
                    break;
                case "5":
                    return;
            }

        }

    }
}
