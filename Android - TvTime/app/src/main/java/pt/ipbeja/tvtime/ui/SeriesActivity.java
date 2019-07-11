package pt.ipbeja.tvtime.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import pt.ipbeja.tvtime.R;
import pt.ipbeja.tvtime.model.AppDatabase;
import pt.ipbeja.tvtime.model.Serie;

public class SeriesActivity extends AppCompatActivity {

    private static final String EXTRA_SERIE_ID = "serieId";

        private TextView textViewPontuação;
        private TextView textViewNome;
        private TextView textViwDescricao;
        private CheckBox checkBoxTemporadas;
        private long serieId;


    public static void startActivity(Context context) {
        Intent intent = new Intent(context, SeriesActivity.class);
        context.startActivity(intent);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);

        if (getIntent().getExtras() == null){
            finish();;
            return;
        }
        this.serieId= getIntent().getExtras().getLong(EXTRA_SERIE_ID, -1);

    if (this.serieId == -1){
        finish();
        return;
    }
    this.textViewNome= findViewById(R.id.textViewNome);
    this.textViewPontuação= findViewById(R.id.textViewPontuacao);
    this.textViwDescricao= findViewById(R.id.textViewDescricao);

    Serie serie = AppDatabase.getInstance(this).getSeriesDAO().getSerieById(this.serieId);

    this.textViewNome.setText(serie.getNomeSerie());
    this.textViwDescricao.setText(serie.getDescricao());
    this.textViewPontuação.setText(serie.getImdb());





    }
}
