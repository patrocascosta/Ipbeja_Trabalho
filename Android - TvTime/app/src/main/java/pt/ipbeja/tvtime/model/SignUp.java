package pt.ipbeja.tvtime.model;

        import android.content.Context;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.EditText;

        import pt.ipbeja.tvtime.R;

public class SignUp extends AppCompatActivity {


    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextNacionalidade;


    public static void startActivity(Context context) {
        Intent intent = new Intent(context, SignUp.class);
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
            // TODO: avisar utilizador
            Log.i("SignUp", "Tem de preencher os campos todos");
            return;
        }


        User user = new User(0, email, password, nacionalidade);
        AppDatabase.getInstance(this).getUserDAO().insert(user);
        finish();



    }
}
