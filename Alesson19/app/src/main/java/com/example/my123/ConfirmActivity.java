package com.example.my123;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.my123.api.APIService;
import com.example.my123.model.ConfirmRequest;
import com.example.my123.model.LoginRequest;
import com.example.my123.model.RegistrationResponce;

import retrofit2.Callback;

public class ConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        final EditText code = findViewById(R.id.code);
        final Button confirmBtn = findViewById(R.id.button);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (code.getText().toString().equals("")){
                    showError("введите код");
                    return;
                }
                confirmCode(code.getText().toString());

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

    public void confirmCode (String code) {
        //запрос на сервер
        ConfirmRequest r = new ConfirmRequest();
        r.code = code;

    }

}
