package pt.ipbeja.tvtime.model;

public class Episodios {

    private long idEpisodio;
    private String nomeEpisodio;
    private int duracao;
    private int idTemporada;

public Episodios(Long idEpisodio, String nomeEpisodio, int duracao, int idTemporad)  {
    this.idEpisodio= idEpisodio;
    this.nomeEpisodio= nomeEpisodio;
    this.duracao= duracao;
    this.idTemporada= idTemporad;

}

    public long getIdEpisodio() {
        return idEpisodio;
    }

    public String getNomeEpisodio() {
        return nomeEpisodio;
    }

    public void setNomeEpisodio(String nomeEpisodio) {
        this.nomeEpisodio = nomeEpisodio;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getIdTemporada() {
        return idTemporada;
    }
}
