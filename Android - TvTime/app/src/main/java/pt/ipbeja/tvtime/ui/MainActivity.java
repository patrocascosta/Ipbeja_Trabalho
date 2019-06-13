package pt.ipbeja.tvtime.ui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import pt.ipbeja.tvtime.R;
import pt.ipbeja.tvtime.model.AppDatabase;
import pt.ipbeja.tvtime.model.User;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editTextEmail = findViewById(R.id.email);
        this.editTextPassword = findViewById(R.id.password);


        long userId = SessionManager.getActiveSession(this);
        if (userId > 0) {
            HomePageActivity.startActivity(this);
            finish();
        }
    }

    public void login(View view) {
        String email = this.editTextEmail.getText().toString();
        String password = this.editTextPassword.getText().toString();

        if (email.isEmpty() || password.isEmpty()) {

            Context context = getApplicationContext();
            CharSequence text = "Preencher todos os campos!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();


            Log.i("MainActivity", "Preencher todos os campos!");
            return;
        }

        User user = AppDatabase.getInstance(this).getUserDAO().getUserByEmail(email);
        if (user != null) {
            if (user.getPassword().equals(password)) {

                HomePageActivity.startActivity(this);
                SessionManager.saveSession(this, user.getUserId());
            } else {

                Context context = getApplicationContext();
                CharSequence text = "Password Errada!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


                Log.i("MainActivity", "Password Errada!");
            }
        } else {

            Context context = getApplicationContext();
            CharSequence text = "Utilizador Não EXISTE!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            Log.i("MainActivity", "Utilizador Não EXISTE!");
        }
    }

    public void signup(View view) {
        SignUpActivity.startActivity(this); }

}
