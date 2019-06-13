package pt.ipbeja.tvtime.model;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import pt.ipbeja.tvtime.R;

@Entity
public class Vistos extends AppCompatActivity  {
    @PrimaryKey(autoGenerate = true)
    private long idUser;
    private long idEpisodio;
    private boolean visto;
    private String minutos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistos);
    }

public Vistos(long idUser, long idEpisodio, boolean visto, String minutos){

    this.idUser=idUser;
    this.idEpisodio= idEpisodio;
    this.visto= visto;
    this.minutos= minutos;
}

    public long getIdUser() {
        return idUser;
    }

    public long getIdEpisodio() {
        return idEpisodio;
    }

    public boolean isVisto() {
        return visto;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public void setIdEpisodio(long idEpisodio) {
        this.idEpisodio = idEpisodio;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }
}
