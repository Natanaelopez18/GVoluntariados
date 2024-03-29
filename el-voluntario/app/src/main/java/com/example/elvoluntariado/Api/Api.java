package com.example.elvoluntariado.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

    private final static String URL = "https://voluntariosge.herokuapp.com/api";

    public static String getBase(){
        return URL + "/";
    }

    public static ApiInterface instance(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.getBase())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ApiInterface.class);
    }
}
