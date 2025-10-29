package com.example.apiweatherex;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface WeatherApiService {
    @POST("")
    Call<WeatherResponse> getApi(
            @Query("maxDayTemperature") String maxDayTemperature,
            @Body WeatherDTO weatherDTO
    );
}
