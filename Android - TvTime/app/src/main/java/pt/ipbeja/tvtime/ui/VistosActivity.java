package pt.ipbeja.tvtime.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.List;

import pt.ipbeja.tvtime.R;
import pt.ipbeja.tvtime.model.AppDatabase;
import pt.ipbeja.tvtime.model.Serie;
import pt.ipbeja.tvtime.model.SeriesDAO;
import pt.ipbeja.tvtime.model.Visto;
import pt.ipbeja.tvtime.model.VistosDAO;

public class VistosActivity extends AppCompatActivity {

    private  static long serieId;
    private boolean visto;
    private VistosAdapter vistosAdapter;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, VistosActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistos);

        this.vistosAdapter = new VistosAdapter(this);
        ListView listView = findViewById(R.id.listViewVistos);


      //  VistosDAO vistosDAO = AppDatabase.getInstance(this).getVistosDAO();
        //List<Visto> seriesVistas = vistosDAO.getVistosBySerieId(serieId, );

       // ListView listView = findViewById(R.id.listViewVistos);
        //VistosAdapter adapter = new VistosAdapter(Visto.getIdSerie(), this);
        //listView.setAdapter(adapter);

        Visto visto = AppDatabase.getInstance(this).getVistosDAO().getVistosBySerieId(this.serieId);




    }

    @Override
    protected void onResume() {
        super.onResume();

        List<Serie> serieList = AppDatabase.getInstance(this).getSeriesDAO().getSerieById(serieId);

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
