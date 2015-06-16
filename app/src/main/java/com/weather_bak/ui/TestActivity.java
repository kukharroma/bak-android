package com.weather_bak.ui;

import android.app.Activity;
import android.os.Bundle;

import com.weather_bak.R;
import com.weather_bak.business_logic.util.WeatherTestUtil;
import com.weather_bak.cache.provider.CityListCacheImpl;

/**
 * Created by roma on 16.06.15.
 */
public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        CityListCacheImpl cache = new CityListCacheImpl(getApplicationContext());
        WeatherTestUtil util = new WeatherTestUtil();
        cache.put(util.createCityWeather());
    }
}
