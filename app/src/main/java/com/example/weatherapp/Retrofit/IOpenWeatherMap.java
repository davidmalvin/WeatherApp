package com.example.weatherapp.Retrofit;

import com.example.weatherapp.Model.WeatherResult;
import com.example.weatherapp.Model.*;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLatLng(String valueOf, String s, String apiKey, @Query("lat") String unit);

    @GET("forecast")
    Observable<WeatherForecastResult> getForecastWeatherByLatLng(@Query("lat")String lat,
                                                 @Query ("lon") String lng,
                                                 @Query ("appid") String appid,
                                                 @Query("unit") String unit);








}
