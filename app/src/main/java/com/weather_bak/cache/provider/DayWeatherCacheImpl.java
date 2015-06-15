package com.weather_bak.cache.provider;

import android.content.Context;
import android.content.SharedPreferences;

import com.weather_bak.cache.serializer.DayWeatherSerializerImpl;
import com.weather_bak.cache.serializer.Serializer;
import com.weather_bak.model.DayWeather;

/**
 * Created by roma on 15.06.15.
 */
public class DayWeatherCacheImpl implements Cache<DayWeather> {


    private static final String DAY_WEATHER_CACHE_PREFS_KEY = "com.weather_bak.cache.provider.DayWeatherCacheImpl";
    private static final String DAY_WEATHER_PREFS_KEY = "dayWeather";

    private Context context;
    private SharedPreferences preferences;
    private Serializer<DayWeather> serializer = new DayWeatherSerializerImpl();

    public DayWeatherCacheImpl(Context context) {
        this.context = context;
        this.preferences = context.getSharedPreferences(DAY_WEATHER_CACHE_PREFS_KEY, Context.MODE_PRIVATE);
    }

    @Override
    public DayWeather get() {
        return serializer.deserialize(preferences.getString(DAY_WEATHER_PREFS_KEY, null));
    }

    @Override
    public void put(DayWeather dayWeather) {
        preferences.edit().putString(DAY_WEATHER_PREFS_KEY, serializer.serialize(dayWeather)).apply();
    }

    @Override
    public void clear() {
        preferences.edit().remove(DAY_WEATHER_PREFS_KEY).apply();
    }

    @Override
    public boolean isCached() {
        return preferences.getString(DAY_WEATHER_PREFS_KEY, null) != null;
    }
}
