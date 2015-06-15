package com.weather_bak.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.weather_bak.R;
import com.weather_bak.business_logic.util.WeatherTestUtil;
import com.weather_bak.cache.provider.CityListCacheImpl;
import com.weather_bak.model.CityList;

/**
 * Created by roma on 15.06.15.
 */
public class TestActivity extends Activity {

    private WeatherTestUtil weatherTestUtil = new WeatherTestUtil();
    private CityListCacheImpl cache;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        cache = new CityListCacheImpl(this);
        CityList cityList = weatherTestUtil.createCityWeather();
        cache.put(cityList);

        TextView textView = (TextView) findViewById(R.id.textView5);
        textView.setText("cache = " + cache.get());

    }
}
