package Models;

public class Dvd extends Produto{

    private String diretor;
    private String duracao;
    private String censura;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }

    @Override
    public void listarProduto() {
        System.out.println("Diretor: " + diretor);
        System.out.println("Durção: " + duracao);
        System.out.println("Censura: "+ censura);
        System.out.println("Descrição: "+ getDescricao());
        System.out.println("Genero: " + getGenero());
        System.out.println("Estoque disponível: " + getEstoqueDisponivel());
        System.out.println("Preço Venda: " + getPrecoVenda());
    }

    @Override
    public void calcularPrecoVenda()
    {
        setPrecoVenda(getPrecoCusto() * 1.30);
    }

    public void calcularPrecoVenda(double cotacaoDolar) //sobrecarga de metodo, metodo com mesmo nome mas com metodo diferente
    {
        setPrecoVenda(getPrecoCusto() * 1.30 * cotacaoDolar);
    }

}
