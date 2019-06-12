package pt.ipbeja.tvtime.model;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import pt.ipbeja.tvtime.R;

@Entity
public class Vistos extends AppCompatActivity {
    @PrimaryKey(autoGenerate = true)
    private long idUser;
    private long idEpisodio;
    private boolean visto;
    private String minutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistos);
    }
}
