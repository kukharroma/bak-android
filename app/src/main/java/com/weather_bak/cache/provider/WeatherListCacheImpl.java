package com.weather_bak.cache.provider;

import android.content.Context;
import android.content.SharedPreferences;

import com.weather_bak.cache.serializer.Serializer;
import com.weather_bak.cache.serializer.WeatherListSerializerImpl;
import com.weather_bak.model.WeatherList;

/**
 * Created by roma on 15.06.15.
 */
public class WeatherListCacheImpl implements Cache<WeatherList> {

    private static final String WEATHER_LIST_CACHE_PREFS_KEY = "com.weather_bak.cache.provider.WeatherListCacheImpl";
    private static final String WEATHER_LIST_PREFS_KEY = "weatherList";

    private Context context;
    private SharedPreferences preferences;
    private Serializer<WeatherList> serializer = new WeatherListSerializerImpl();

    public WeatherListCacheImpl(Context context) {
        this.context = context;
        this.preferences = context.getSharedPreferences(WEATHER_LIST_CACHE_PREFS_KEY, Context.MODE_PRIVATE);
    }

    @Override
    public WeatherList get() {
        if (isCached()) {
            return serializer.deserialize(preferences.getString(WEATHER_LIST_PREFS_KEY, null));
        }
        return null;

    }

    @Override
    public void put(WeatherList weatherList) {
        preferences.edit().putString(WEATHER_LIST_PREFS_KEY, serializer.serialize(weatherList)).apply();
    }

    @Override
    public void clear() {
        preferences.edit().remove(WEATHER_LIST_PREFS_KEY).apply();
    }

    @Override
    public boolean isCached() {
        return preferences.getString(WEATHER_LIST_PREFS_KEY, null) != null;
    }
}
