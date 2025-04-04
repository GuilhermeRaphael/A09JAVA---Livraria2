package Models;

public class Cd extends Produto{

    private String artista;
    private String gravadora;
    private String paisOrigem;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @Override
    public void listarProduto() {

    }

    @Override
    public void calcularPrecoVenda() {
        setPrecoVenda(getPrecoCusto() * 1.20);
    }
}
