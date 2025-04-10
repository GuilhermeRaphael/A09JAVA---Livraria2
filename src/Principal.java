import Models.Cd;
import Models.Dvd;
import Models.Livro;
import Models.Produto;

public class Principal {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setPrecoCusto(60);
        livro.calcularPrecoVenda();
        System.out.println(livro.getPrecoVenda());

        Dvd dvd = new Dvd();
        dvd.setPrecoCusto(80);
        dvd.calcularPrecoVenda();
        System.out.println(dvd.getPrecoVenda());

        Cd cd = new Cd();
        cd.setPrecoCusto(100);
        cd.calcularPrecoVenda();
        System.out.println(cd.getPrecoVenda());


    }
}
