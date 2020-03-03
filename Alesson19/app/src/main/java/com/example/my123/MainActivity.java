package com.example.my123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText login = findViewById(R.id.login);
        final EditText password = findViewById(R.id.password);
        Button loginBtn = findViewById(R.id.loginBtn);
        final TextView errorMsg = findViewById(R.id.errorMsg);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String error ="";
                if (login.getText().toString().equals("")){
                    error = "Заполните поле \"Логин\"\n";

                }
                if (login.getText().toString().equals("")){
                    error += "Заполните поле \"Пароль\"\n";

                }
                if (!error.equals("")){
                    errorMsg.setText(error);
                    errorMsg.setVisibility(View.VISIBLE);
                    return;
                }
                showMenuActivity();

            }
        });
        TextView signapBtn = findViewById(R.id.signupBtn);
        signapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showStartActivity();

            }
        });
        TextWatcher t = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            errorMsg.setText("");
            }

            @Override
            public void afterTextChanged(Editable s) {}
        };
        login.addTextChangedListener(t);
        password.addTextChangedListener(t);
    }
    public void showMenuActivity(){
        Intent i = new Intent(this, MenuActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);

    }
    public void showStartActivity() {
        Intent i = new Intent(this, StartActivity.class);
        startActivity(i);
    }

}
