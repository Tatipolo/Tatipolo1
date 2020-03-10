package com.example.my123;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.my123.api.APIService;
import com.example.my123.model.LoginRequest;
import com.example.my123.model.LoginResponse;
import com.example.my123.model.RegistrationResponce;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText email = findViewById(R.id.email);
        @SuppressLint("WrongViewCast") final EditText name = findViewById(R.id.name);
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

                if (name.getText().toString().equals("")) {
                    error += "Укажите Имя\n";

                }
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
                    return;
                }
                registerUser(name.getText().toString(),
                email.getText().toString(),
                        password.getText().toString()
                );






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
    public void registerUser (String name, String email, String password){
        LoginRequest r = new LoginRequest();
        r.Email = email;
        r.Password = password;
        r.name = name;
        APIService.getInstance().getAPI().registration(r).enqueue(new Callback<RegistrationResponce>() {
            @Override
            public void onResponse(Call<RegistrationResponce> call, Response<RegistrationResponce> response) {
                RegistrationResponce resp = response.body();
                if (!resp.result) {
                   showError(resp.error);
                    // обработка ошибки
                }else {
                    showConfirmActivity();
                }
            }

            @Override
            public void onFailure(Call<RegistrationResponce> call, Throwable t) {
                // обработка ошибки
                showError(t.getMessage());
            }
        });
    }

    public void showConfirmActivity() {
        Intent i = new Intent(this, ConfirmActivity.class);
        startActivity(i);
    }
}
