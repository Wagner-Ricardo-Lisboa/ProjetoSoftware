import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Filme filme = new Filme("Bastardos Inglórios",
                "Ação",
                "Quentin Tarantino",
                153,
                26,
                100);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println(filme.toString());


        System.out.println("Digite a quantidade de ingressos desejados: ");
        int ingressos = sc.nextInt();
        sc.nextLine();

        System.out.println("Olá, " + nome + ", A sua compra ficou no valor de " + "R$" + filme.compraingresso(ingressos));
        filme.decrementaingressos(ingressos);

        sc.close();

    }
}
