import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class ArrayListaNomes {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        //Adicionando Valores
        nomes.add("Wagner");
        nomes.add("Walter");
        nomes.add("Patrick");
        nomes.add("Richard");

        //Adicionar Valores em posições espcíficas
        nomes.add(2,"Paulo");
        nomes.add(3,"Robin");

        //Verificar o tamanho da lista
        System.out.println("O tamanho da lista é: " +  nomes.size());

        //Acessar o segundo nome da lista
        System.out.println("O segundo nome da lista é: " + nomes.get(1));

        //Alterar um valor
        nomes.set(1,"Maria");
        System.out.println("O segundo nome da lista agora é: " + nomes.get(1));

        //Encontrar uma posição a partir do seu valor
        System.out.println(nomes.indexOf("Paulo"));

        //Remover valores de uma lista
        nomes.remove(1);
        nomes.remove("Wagner");

        //ForEach
        for(String nome : nomes) {
            System.out.println(nome);
        }

        //Função Anônima
        nomes.removeIf(nome -> nome.toLowerCase().contains("a"));

        for(String nome : nomes) {
            System.out.println(nomes);
        }


    }

}
