public class listaNomes {

    public static void main(String[] args) {

    String[] nomes = new String[5];

    nomes[0] = "Maria";
    nomes[1] = "João";
    nomes[2] = "Pedro";
    nomes[3] = "Mário";
    nomes[4] = "Roger";
    for (int i = 0; i < nomes.length; i++) {
        System.out.println(nomes[i]);
    }

    for (String nome : nomes) {
        System.out.println(nome);
    }
    }

}
