package pt.ipbeja.tvtime.model;

<<<<<<< HEAD
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
=======
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Vistos {
    @PrimaryKey(autoGenerate = true)
    private long idUser;
    private long idEpisodio;
    private boolean visto;
    private String minutos;
>>>>>>> 1c3c38473ed8268dd36cd59a0ae511b63cd5eaec

import pt.ipbeja.tvtime.R;

public class Vistos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistos);
    }
}
