package pt.ipbeja.tvtime.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import pt.ipbeja.tvtime.R;

public class FavoritosActivity extends AppCompatActivity {

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, FavoritosActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
    }

    public void gohome(View view) {
        HomePageActivity.startActivity(this);
    }

    public void gofavoritos(View view) {
        FavoritosActivity.startActivity(this);
    }

    public void logout(View view) {
        SessionManager.deleteSession(this);
        MainActivity.startActivity(this);
        finish();
    }
}
