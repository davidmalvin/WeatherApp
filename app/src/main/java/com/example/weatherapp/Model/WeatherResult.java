package com.example.weatherapp.Model;
import java.util.*;
public class WeatherResult {

    private Coord Coord;
    private static List<Weather> Weather;
    private String base;
    private static Main Main;
    private Wind wind;
    private Clouds clouds;
    private int dt;
    private Sys sys;
    private int id;
    private static String name;
    private int cod;



    public WeatherResult (){

    }

        public Coord getCoord() {
            return Coord;
        }

        public void setCoord(Coord coord) {
            Coord = coord;
        }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public static Main getMain() {
        return Main;
    }

    public void setMain(Main main) {
        Main = main;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public static List<Weather> getWeather() {
        return Weather;
    }

    public void setWeather(List<Weather> weather) {
        this.Weather = weather;
    }
}


