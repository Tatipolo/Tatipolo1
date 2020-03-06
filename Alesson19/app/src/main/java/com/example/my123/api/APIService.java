package com.example.my123.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static retrofit2.converter.gson.GsonConverterFactory.*;

public class APIService {
    private Retrofit mRetrofit;
    // паттерн Singleton - создаем открытый и статический метод
    private static APIService instance;
    public static APIService getInstance() {
        if (instance == null) {
            // инициализация instance
            instance = new APIService();
            // паттерн FabricBuilder
            instance.mRetrofit = new Retrofit.Builder().baseUrl("http://127.0.0.1:8080")
                    .addConverterFactory(GsonConverterFactory.create()).build();


        }
        return instance;
    }

    public My123 getAPI () {
        return mRetrofit.create(My123.class);

    }
}
