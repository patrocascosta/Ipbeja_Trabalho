package pt.ipbeja.tvtime.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import pt.ipbeja.tvtime.R;
import pt.ipbeja.tvtime.model.Series;

public class Home extends AppCompatActivity {

    public static final String EXTRA_ID = "Id";

    private ImageView imageView;
    private long id ;
    private Series series;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, Home.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.imageView = findViewById(R.id.image1);





    }
}
