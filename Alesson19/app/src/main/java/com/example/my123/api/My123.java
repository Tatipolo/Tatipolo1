package com.example.my123.api;

import com.example.my123.model.ConfirmRequest;
import com.example.my123.model.LoginRequest;
import com.example.my123.model.LoginResponse;
import com.example.my123.model.RegistrationRequest;
import com.example.my123.model.RegistrationResponce;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface My123 {
        @POST("/login")
        Call<LoginResponse> login(@Body LoginRequest r);

        @POST("/registration")
        Call<RegistrationResponce> registration(@Body LoginRequest r);

        @POST("/confirm")
        Call<ConfirmRequest> registration(@Body ConfirmRequest r);
}
