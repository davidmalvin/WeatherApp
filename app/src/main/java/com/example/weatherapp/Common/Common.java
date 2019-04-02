package com.example.weatherapp.Common;
import java.text.SimpleDateFormat;
import java.util.*;
import android.location.Location;

public class Common {

    public static final String API_KEY = "f6daa2d6bd3d8290b3a9cb5d3bbfcb1a";
    public static Location current_location = null;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt * 1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH: mm dd EEE MM yyyy");
        String formated = sdf.format(date);
        return formated;
    }


    public static String convertUnixToHour(long dt) {
        Date date = new Date(dt * 1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH: mm");
        String formated = sdf.format(date);
        return formated;
    }
}