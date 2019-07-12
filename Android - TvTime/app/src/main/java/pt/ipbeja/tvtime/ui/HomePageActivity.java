package pt.ipbeja.tvtime.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

import pt.ipbeja.tvtime.R;
import pt.ipbeja.tvtime.model.AppDatabase;
import pt.ipbeja.tvtime.model.Categoria;
import pt.ipbeja.tvtime.model.Serie;
import pt.ipbeja.tvtime.model.SeriesDAO;
import pt.ipbeja.tvtime.model.Visto;

public class HomePageActivity extends AppCompatActivity {

    private ImageView imageViewThriller;
    private ImageView imageViewComedia;
    private ImageView imageViewDrama;
    private ImageView imageViewCrime;
    private Boolean visto;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, HomePageActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.imageViewThriller = findViewById(R.id.image1);
        this.imageViewComedia = findViewById(R.id.image2);
        this.imageViewDrama = findViewById(R.id.image3);
        this.imageViewCrime = findViewById(R.id.image4);

        this.populateImageView();
    }

    private void populateImageView() {
        SeriesDAO seriesDAO = AppDatabase.getInstance(this).getSeriesDAO();

        List<Serie> seriesThriller = seriesDAO.getSeriesByCategory(Categoria.THRILLER);
        List<Serie> seriesComedia = seriesDAO.getSeriesByCategory(Categoria.COMEDIA);
        List<Serie> seriesDrama = seriesDAO.getSeriesByCategory(Categoria.DRAMA);
        List<Serie> seriesCrime = seriesDAO.getSeriesByCategory(Categoria.CRIME);

        //List<Serie> serieVista = seriesDAO.getSeriebyVistos(Visto.visto);

        if (seriesThriller.size() > 0) {
            Serie serieThriller = seriesThriller.get(0); // obter primeiro elemento da lista de series com categoria Thriller (1)
            if (serieThriller != null) { // verificar se o elemento está inicializado (diferente de null) - quer dizer que existe serie na posição 0 da lista
                Glide.with(this).load(serieThriller.getImagem()).into(this.imageViewThriller); // Carregar imagem (url) dessa serie para a imagemView correspondente

            }
        }


        if (seriesComedia.size() > 0) {
            Serie serieComedia = seriesComedia.get(0);
            if (serieComedia != null) {
                Glide.with(this).load(serieComedia.getImagem()).into(this.imageViewComedia);
            }
        }


        if (seriesDrama.size() > 0) {
            Serie serieDrama = seriesDrama.get(0);
            if (serieDrama != null) {
                Glide.with(this).load(serieDrama.getImagem()).into(this.imageViewDrama);
            }
        }


        if (seriesCrime.size() > 0) {
            Serie serieCrime = seriesCrime.get(0);
            if (serieCrime != null) {
                Glide.with(this).load(serieCrime.getImagem()).into(this.imageViewCrime);
            }
        }


    }

    public void gofavoritos(View view) {
        FavoritosActivity.startActivity(this);
    }

    public void govistos(View view) {
        VistosActivity.startActivity(this);
    }

    public void logout(View view) {
        SessionManager.deleteSession(this);
        MainActivity.startActivity(this);
        finish();
    }

    public void goSeries(View view) {
        SeriesActivity.startActivity(this);

    }
}
