package com.weather_bak.presenter;

import android.content.Context;

import com.weather_bak.ui.DetailWeatherActivity;

/**
 * Created by roma on 15.06.15.
 */
public class DetailWeatherPresenter {

    private Context context;
    private DetailWeatherActivity view;


    public DetailWeatherPresenter(Context context, DetailWeatherActivity view) {
        this.context = context;
        this.view = view;
    }

    public void getAllWeatherInCity(int position) {

    }
}
