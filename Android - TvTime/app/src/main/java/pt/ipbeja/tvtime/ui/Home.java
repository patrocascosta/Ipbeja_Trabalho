package pt.ipbeja.tvtime.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pt.ipbeja.tvtime.R;

public class Home extends AppCompatActivity {

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, Home.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);





    }
}
