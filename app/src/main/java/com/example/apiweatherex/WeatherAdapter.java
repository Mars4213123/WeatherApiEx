package com.example.apiweatherex;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {
    public List<WeatherItem> weatherItems;
    public WeatherAdapter(List<WeatherItem> weatherItems) {
        this.weatherItems = weatherItems;
    }
    public void UpdateData(List<WeatherItem> weatherItems) {
        this.weatherItems = weatherItems;
        notifyDataSetChanged();
    }
    @Override
    public WeatherAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_weather, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WeatherAdapter.ViewHolder holder, int position) {
        WeatherItem item = weatherItems.get(position);

        holder.temperatureText.setText(item.temp);
    }

    @Override
    public int getItemCount() {
        return weatherItems.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView temperatureText;
        public ViewHolder(View itemView) {
            super(itemView);
            temperatureText = itemView.findViewById(R.id.temperatureText);
        }
    }
}
