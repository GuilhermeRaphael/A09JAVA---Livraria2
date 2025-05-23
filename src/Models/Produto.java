package Models;

public abstract class Produto {
    private String descricao;
    private String genero;
    private int estoqueDisponivel;
    private double precoCusto;
    private double precoVenda;

    public void comprar(int qtde){
        estoqueDisponivel += qtde;
    }

    public void vender (int qtde){
        estoqueDisponivel -= qtde;
    }

    public abstract void listarProduto(); //metodo abstrato nao tem codigo, mas os filhos tem que usar o metodo

    public abstract void calcularPrecoVenda(); //metodo abstrato nao tem codigo, mas os filhos tem que usar o metodo

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}
