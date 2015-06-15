package com.weather_bak.cache.serializer;

import com.google.gson.Gson;
import com.weather_bak.model.WeatherList;

/**
 * Created by roma on 15.06.15.
 */
public class WeatherListSerializerImpl implements Serializer<WeatherList> {

    private Gson gson = new Gson();

    @Override
    public String serialize(WeatherList weatherList) {
        return null;
    }

    @Override
    public WeatherList deserialize(String json) {
        return null;
    }
}
