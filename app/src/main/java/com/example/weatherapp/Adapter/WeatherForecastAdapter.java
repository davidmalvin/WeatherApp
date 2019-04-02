package com.example.weatherapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import com.example.weatherapp.Common.Common;
import com.example.weatherapp.Model.WeatherForecastResult;
import com.example.weatherapp.Model.WeatherResult;
import com.example.weatherapp.R;
import com.squareup.picasso.Picasso;

public class WeatherForecastAdapter extends RecyclerView.Adapter<WeatherForecastAdapter.MyViewHolder> {

    Context context;
    WeatherForecastResult weatherForecastResult;

    public WeatherForecastAdapter(Context context) {
        this.context = context;
    }

    public WeatherForecastAdapter(WeatherForecastResult weatherForecastResult) {
        this.weatherForecastResult = weatherForecastResult;
    }

    @NonNull
    @Override
    public WeatherForecastAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_weather_forecast,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherForecastAdapter.MyViewHolder holder, int position) {
        Picasso.get().load(String.valueOf(new StringBuilder("https://openweathermap.org/img/w/")
                .append(WeatherForecastResult.List.get(position).weather.get(0).getIcon())
                .append(".png"))).into(holder.img_weather);

        holder.txt_date_time.setText(new StringBuilder(Common.convertUnixToDate(weatherForecastResult.List.get(position).dt)));
        holder.txt_description.setText(new StringBuilder(weatherForecastResult.List.get(position).weather.get(0).getDescription()));
        holder.txt_temperature.setText(new StringBuilder(String.valueOf(weatherForecastResult.List.get(position)
                .main.getTemp())).append("°C"));
    }




    @Override
    public int getItemCount() {
        return weatherForecastResult.List.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txt_date_time,txt_description,txt_temperature;
        ImageView img_weather;
        public MyViewHolder(View itemView) {
            super(itemView);
            img_weather=(ImageView)itemView.findViewById(R.id.img_weather);
            txt_date_time=(TextView)itemView.findViewById(R.id.txt_date);
            txt_description=(TextView)itemView.findViewById(R.id.txt_description);
            txt_temperature=(TextView)itemView.findViewById(R.id.txt_temperature);


        }
    }




}
