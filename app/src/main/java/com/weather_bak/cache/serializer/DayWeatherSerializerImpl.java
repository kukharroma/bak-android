package com.weather_bak.cache.serializer;

import com.google.gson.Gson;
import com.weather_bak.model.DayWeather;

/**
 * Created by roma on 15.06.15.
 */
public class DayWeatherSerializerImpl implements Serializer<DayWeather>{

    private Gson gson = new Gson();

    @Override
    public String serialize(DayWeather dayWeather) {
        return null;
    }

    @Override
    public DayWeather deserialize(String json) {
        return null;
    }
}
