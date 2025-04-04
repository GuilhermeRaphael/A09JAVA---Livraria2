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

    }

    @Override
    public void calcularPrecoVenda() {
        setPrecoVenda(getPrecoCusto() * 1.30);
    }

    public void calcularPrecoVenda(double cotacaoDolar){
        setPrecoVenda(getPrecoCusto() * 1.30 * cotacaoDolar);
    }

}
