import Models.Livro;

public class Principal {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setPrecoVenda(100);
        livro.calcularPrecoVenda();


    }
}
