package pt.ipbeja.tvtime.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pt.ipbeja.tvtime.R;

public class VistosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistos);
    }

    public void gohome(View view) {
        Home.startActivity(this);
    }

    public void gofavoritos(View view) {
        FavoritosActivity.startActivity(this);
    }
}
