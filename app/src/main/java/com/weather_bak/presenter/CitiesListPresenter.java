package com.weather_bak.presenter;

import android.content.Context;

import com.weather_bak.cache.provider.CityListCacheImpl;
import com.weather_bak.model.CityList;
import com.weather_bak.ui.CitiesListActivity;

/**
 * Created by roma on 15.06.15.
 */
public class CitiesListPresenter {

    private Context context;
    private CitiesListActivity view;

    public CitiesListPresenter(Context context, CitiesListActivity view) {
        this.context = context;
        this.view = view;
    }

    public CityList getCityList(){
        CityListCacheImpl cache = new CityListCacheImpl(context);
        return cache.get();
    }

}
