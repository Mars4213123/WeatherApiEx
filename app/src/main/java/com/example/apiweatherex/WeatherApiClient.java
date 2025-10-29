package com.example.apiweatherex;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherApiClient {
    public static final String ApiKey = "";
    public static WeatherApiService GetApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.weather.yandex.ru/graphql/query")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(WeatherApiService.class);
    }
}
