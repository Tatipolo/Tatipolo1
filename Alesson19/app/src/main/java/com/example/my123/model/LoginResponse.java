package com.example.my123.model;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    // поля для отправки на сервер
    @SerializedName("result")
    public boolean result;
    @SerializedName("error")
    public String error;
    @SerializedName("token")
    public String token; // информация о пользователе


}
