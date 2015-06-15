package com.weather_bak.presenter;

import android.content.Context;

import com.weather_bak.cache.provider.CityListCacheImpl;
import com.weather_bak.model.CityList;
import com.weather_bak.ui.TestActivity;

/**
 * Created by roma on 15.06.15.
 */
public class TestActivityPresenter {

    private Context context;
    private TestActivity view;

    public TestActivityPresenter(Context context, TestActivity view) {
        this.context = context;
        this.view = view;
    }

    public CityList getCityList(){
        CityListCacheImpl cache = new CityListCacheImpl(context);
        return cache.get();
    }
}
