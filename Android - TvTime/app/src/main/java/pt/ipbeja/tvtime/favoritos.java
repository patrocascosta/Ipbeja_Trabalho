package pt.ipbeja.tvtime;

public class favoritos {
    private long idUser;
    private long idSerie;
    private boolean favorito;



    public favoritos(long idUser,long idSerie, boolean favorito ){
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
