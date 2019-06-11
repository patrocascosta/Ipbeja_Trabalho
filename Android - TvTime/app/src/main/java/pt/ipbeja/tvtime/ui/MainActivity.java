package pt.ipbeja.tvtime.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

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
            Home.startActivity(this);
            finish();
        }
    }

    public void login(View view) {
        String email = this.editTextEmail.getText().toString();
        String password = this.editTextPassword.getText().toString();

        if (email.isEmpty() || password.isEmpty()) {
            // TODO: avisar o utilizador
            Log.i("MainActivity", "Preencher todos os campos!");
            return;
        }

        User user = AppDatabase.getInstance(this).getUserDAO().getUserByEmail(email);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                // Log In Sucesso
                Home.startActivity(this);
                SessionManager.saveSession(this, user.getUserId());
            } else {
                // TODO: Avisar Utilizador
                Log.i("MainActivity", "Password Errada!");
            }
        } else {
            // TODO: Avisar Utilizador
            Log.i("MainActivity", "Utilizador Não EXISTE!");
        }
    }



}
