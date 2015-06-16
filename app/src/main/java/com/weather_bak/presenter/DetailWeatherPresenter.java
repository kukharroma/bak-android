package com.weather_bak.presenter;

import android.content.Context;

import com.weather_bak.cache.provider.CityListCacheImpl;
import com.weather_bak.model.City;
import com.weather_bak.ui.DetailWeatherActivity;

/**
 * Created by roma on 15.06.15.
 */
public class DetailWeatherPresenter {

    private Context context;
    private DetailWeatherActivity view;
    private CityListCacheImpl cache;

    public DetailWeatherPresenter(Context context, DetailWeatherActivity view) {
        this.context = context;
        this.view = view;
        this.cache = new CityListCacheImpl(context);
    }

    public City getAllWeatherInCity(int position) {
        return this.cache.get().getCities().get(position);
    }
}
