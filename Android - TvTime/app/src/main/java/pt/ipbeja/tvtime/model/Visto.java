package pt.ipbeja.tvtime.model;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import pt.ipbeja.tvtime.R;

@Entity
public class Visto extends AppCompatActivity  {
    @PrimaryKey(autoGenerate = true)
    private long idUser;
    private long idSerie;
    public boolean visto = true;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistos);
    }

public Visto(long idUser, long idSerie, boolean visto){

    this.idUser=idUser;
    this.idSerie= idSerie;
    this.visto= visto;

}

    public long getIdUser() {
        return idUser;
    }

    public long getIdSerie() {
        return idSerie;
    }

    public boolean isVisto() {
        return visto;
    }



    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public void setIdSerie(long idEpisodio) {
        this.idSerie = idSerie;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }


}
