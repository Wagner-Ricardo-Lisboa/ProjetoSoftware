package filmes;

public class Principal {
    public static void main(String[] args) {

        Filme homemaranha = new Filme();
        homemaranha.titulo = "Homem-Aranha Um Novo Dia";
        homemaranha.genero = "Ação";
        homemaranha.anolancamento = 2026;
        homemaranha.duracao = 145;
        homemaranha.valorIngresso = 45;
        homemaranha.qtdingresso = 5;

        Filme interestelar = new Filme();
        interestelar.titulo = "Interestelar";
        interestelar.genero = "Ficção Científica";
        interestelar.anolancamento = 2014;
        interestelar.duracao = 169;
        interestelar.valorIngresso = 25;
        interestelar.qtdingresso = 1;

        System.out.println(homemaranha.toString());
        System.out.println(interestelar.toString());

    }
}
