package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Favorito {

    @PrimaryKey(autoGenerate = true)
    private long idUser;
    private long idSerie;
    private boolean favorito;



    public Favorito(long idUser, long idSerie, boolean favorito ){
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

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public void setIdSerie(long idSerie) {
        this.idSerie = idSerie;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
}
