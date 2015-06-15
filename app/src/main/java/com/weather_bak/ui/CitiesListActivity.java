package com.weather_bak.ui;

import android.app.Activity;
import android.os.Bundle;

import com.weather_bak.R;
import com.weather_bak.model.City;
import com.weather_bak.presenter.CitiesListPresenter;

import java.util.List;

/**
 * Created by roma on 15.06.15.
 */
public class CitiesListActivity extends Activity {

    private CitiesListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_list);
        presenter = new CitiesListPresenter(getApplicationContext(), this);
        List<City> cities = presenter.getCityList().getCities();

    }
}
