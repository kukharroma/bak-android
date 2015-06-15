package com.weather_bak.cache.provider;

import android.content.Context;
import android.content.SharedPreferences;

import com.weather_bak.cache.serializer.CityListSerializerImpl;
import com.weather_bak.cache.serializer.Serializer;
import com.weather_bak.model.CityList;

/**
 * Created by roma on 15.06.15.
 */
public class CityListCacheImpl implements Cache<CityList> {

    private Context context;
    private SharedPreferences preferences;
    private Serializer<CityList> serializer = new CityListSerializerImpl();

    private static final String CITY_LIST_CACHE_PREFS_KEY = "com.weather_bak.cache.provider.CityListCacheImpl";
    private static final String CITY_LIST_PREFS_KEY = "cityList";


    public CityListCacheImpl(Context context) {
        this.context = context;
        this.preferences = context.getSharedPreferences(CITY_LIST_CACHE_PREFS_KEY, Context.MODE_PRIVATE);
    }

    @Override
    public String get() {
        return preferences.getString(CITY_LIST_PREFS_KEY, null);
    }

    @Override
    public void put(CityList cityList) {
        preferences.edit().putString(CITY_LIST_PREFS_KEY, serializer.serialize(cityList)).apply();
    }

    @Override
    public void clear() {
        preferences.edit().remove(CITY_LIST_PREFS_KEY).apply();
    }

    @Override
    public boolean isCached() {
        return preferences.getString(CITY_LIST_PREFS_KEY, null) != null;
    }
}
