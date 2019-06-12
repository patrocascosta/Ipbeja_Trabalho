package pt.ipbeja.tvtime.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Favoritos {

    @PrimaryKey(autoGenerate = true)
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
