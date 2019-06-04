package pt.ipbeja.tvtime.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pt.ipbeja.tvtime.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        source.getLoginEmailPass();

        int m = source.getLoginEmailPass().size();

    }


}
