package pt.ipbeja.tvtime.model;

public class Temporadas {
    private long idTemporada;
    private int idSerie;
    private  int idEpisodio;



    public Temporadas(long idTemporada, int idSerie, int idEpisodio){
        this.idTemporada=idTemporada;
        this.idSerie=idSerie;
        this.idEpisodio=idEpisodio;
    }

    public long getIdTemporada() {
        return idTemporada;
    }

    public int getIdSerie() {
        return idSerie;
    }

    public int getIdEpisodio() {
        return idEpisodio;
    }
}
