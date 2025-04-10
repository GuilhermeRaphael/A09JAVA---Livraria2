package Models;

public class Livro extends Produto {

    private String autor;
    private String editora;
    private String edicao;

    @Override
    public void listarProduto() {
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Edição: "+ edicao);
        System.out.println("Descrição: "+ getDescricao());
        System.out.println("Genero: " + getGenero());
        System.out.println("Estoque disponível: " + getEstoqueDisponivel());
        System.out.println("Preço Venda: " + getPrecoVenda());
    }


    @Override
    public void calcularPrecoVenda()
    {
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
