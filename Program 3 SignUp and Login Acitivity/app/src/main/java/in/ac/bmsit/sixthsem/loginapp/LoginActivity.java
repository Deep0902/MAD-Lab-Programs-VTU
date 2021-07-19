package in.ac.bmsit.sixthsem.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText loginEmail;
    EditText loginPassword;
    Button login;
    String regEmail;
    String regPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginEmail = findViewById(R.id.loginEmail);
        loginPassword = findViewById(R.id.loginPassword);
        login = findViewById(R.id.login);
        regEmail = getIntent().getStringExtra("email");
        regPassword = getIntent().getStringExtra("password");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = loginEmail.getText().toString();
                String pass = loginPassword.getText().toString();
//                Log.v("Email",email);
//                Log.v("Password",pass);
                if(regEmail.equals(email) && regPassword.equals(pass)) {
                    Intent myInt = new Intent(LoginActivity.this, Successful.class);
                    startActivity(myInt);
                } else {
                    Toast.makeText(LoginActivity.this, "Wrong Credentials", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}