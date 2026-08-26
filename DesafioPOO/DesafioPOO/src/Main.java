import Loja.Roupa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Roupa roupa = new Roupa(
                "Gucci",
                "Camiseta",
                "G",
                200,
                300);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();


        System.out.println("Digite a quantidade que gostaria de comprar: ");
        int quantidade = sc.nextInt();
        System.out.println("Digite a quantidade que gostaria de incrementar: ");
        int incrementaQuantidade = sc.nextInt();
        System.out.println("Olá, " + nome + ", A sua compra ficou no valor de " + "R$" + roupa.calculaValor(quantidade));

        sc.close();
    }
}