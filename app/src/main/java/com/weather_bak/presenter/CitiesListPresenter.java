package com.weather_bak.presenter;

import android.content.Context;

import com.weather_bak.cache.provider.CityListCacheImpl;
import com.weather_bak.model.City;
import com.weather_bak.model.CityList;
import com.weather_bak.ui.CitiesListActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roma on 15.06.15.
 */
public class CitiesListPresenter {

    private Context context;
    private CitiesListActivity view;
    private CityListCacheImpl cache;

    public CitiesListPresenter(Context context, CitiesListActivity view) {
        this.context = context;
        this.view = view;
        this.cache = new CityListCacheImpl(context);
    }

    public CityList getCityList() {
        return cache.get();
    }

    public List<String> getCitiesName() {
        List<String> citiesName = new ArrayList<>();
        for (City city : cache.get().getCities()) {
            citiesName.add(city.getName());
        }
        return citiesName;
    }
}
