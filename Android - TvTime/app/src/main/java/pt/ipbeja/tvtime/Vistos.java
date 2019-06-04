package pt.ipbeja.tvtime;

public class Vistos {
    private long idUser;
    private long idEpisodio;
    private boolean visto;
    private String minutos;


    public Vistos(long idUser, long idEpisodio, boolean visto, String minutos){
        this.idUser=idEpisodio;
        this.idEpisodio=idEpisodio;
        this.visto=visto;
        this.minutos=minutos;

    }

    public long getIdUser() {
        return idUser;
    }

    public long getIdEpisodio() {
        return idEpisodio;
    }

    public boolean getvisto() {
        return visto;
    }


    public String getMinutos() {
        return minutos;
    }
}
