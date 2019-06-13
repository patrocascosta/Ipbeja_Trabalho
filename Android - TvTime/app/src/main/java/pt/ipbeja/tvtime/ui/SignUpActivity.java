package pt.ipbeja.tvtime.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import pt.ipbeja.tvtime.R;
import pt.ipbeja.tvtime.model.AppDatabase;
import pt.ipbeja.tvtime.model.User;

public class SignUpActivity extends AppCompatActivity {


    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextNacionalidade;


    public static void startActivity(Context context) {
        Intent intent = new Intent(context, SignUpActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        this.editTextEmail = findViewById(R.id.email);
        this.editTextPassword = findViewById(R.id.password);
        this.editTextNacionalidade = findViewById(R.id.nacionalidade);
    }

    public void signUp(View view) {
        String email = this.editTextEmail.getText().toString();
        String password = this.editTextPassword.getText().toString();
        String nacionalidade = this.editTextNacionalidade.getText().toString();

        if (email.isEmpty() || password.isEmpty() || nacionalidade.isEmpty()) {

            Log.i("SignUpActivity", "Tem de preencher os campos todos");
            return;
        }


        User user = new User(1, email, password, nacionalidade);
        AppDatabase.getInstance(this).getUserDAO().insert(user);
        finish();



    }
}