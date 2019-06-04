package pt.ipbeja.tvtime.model;

public class Favoritos {
    private long idUser;
    private long idSerie;
    private boolean favorito;



    public Favoritos(long idUser, long idSerie, boolean favorito ){
        this.idUser= idUser;
        this.idSerie=idSerie;
        this.favorito=favorito;
    }

    public long getIdUser() {
        return idUser;
    }

    public long getIdSerie() {
        return idSerie;
    }

    public boolean isFavorito() {
        return favorito;
    }
}
