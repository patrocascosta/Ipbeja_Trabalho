package pt.ipbeja.tvtime.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import pt.ipbeja.tvtime.R;

public class SeriesActivity extends Activity {

private ImageView imageViewSeries;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, SeriesActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);

        this.imageViewSeries = findViewById(R.id.imageViewSerie);

    }


}
