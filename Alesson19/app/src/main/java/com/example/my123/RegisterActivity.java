package com.example.my123;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText email = findViewById(R.id.email);
        //final EditText name = findViewById(R.id.name);
        final EditText password = findViewById(R.id.password);
        final EditText confirmPassword = findViewById(R.id.confirmPassword);
        Button okBtn = findViewById(R.id.okBtn);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String error = "";
              if (email.getText().toString().equals("")){
                  error += "Укажите Email\n";

              }
                /*if (name.getText().toString().equals("")){
                    error += "Укажите Имя\n";

              }*/
                if (password.getText().toString().equals("")){
                    error += "Укажите Пароль\n";

              }
                if (confirmPassword.getText().toString().equals("")){
                    error += "Укажите Пароль\n";

                }
                if (!password.getText().toString().equals("")
                        && !confirmPassword.getText().toString().equals("") ){
                  if (!password.getText().toString().equals(confirmPassword.getText().toString())){
                      error += "Пароли должны совпадать";
                  }
                }
                if (!error.equals("")){
                    showError(error);
                }
            }
        });
    }

    public void showError (String error){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage(error);
        alert.setTitle("Ошибка");
        alert.setCancelable(true);
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {}
        });
        alert.setIcon(R.drawable.ic_launcher_background);
        alert.create().show();
    }
}
