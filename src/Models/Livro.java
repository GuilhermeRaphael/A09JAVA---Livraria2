package Models;

public class Livro extends Produto {

    private String autor;
    private String editora;
    private String edicao;

    @Override
    public void listarProduto() {

    }

    @Override
    public void calcularPrecoVenda() {
       setPrecoVenda(getPrecoCusto() * 1.15);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
}
