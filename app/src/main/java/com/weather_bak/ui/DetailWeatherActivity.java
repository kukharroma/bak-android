package com.weather_bak.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.weather_bak.R;
import com.weather_bak.presenter.DetailWeatherPresenter;
import com.weather_bak.ui.widget.WeatherTable;

/**
 * Created by roma on 15.06.15.
 */
public class DetailWeatherActivity extends Activity {

    private DetailWeatherPresenter presenter;

    private int position;
    private static final int DEFAULT_POSITION = 0;
    public static final String POSITION = "position";


    private WeatherTable wtLastWeeks;
    private WeatherTable wtLastYear;
    private WeatherTable wtLastTwoYears;
    private WeatherTable wtLastThreeYears;
    private WeatherTable wtFutureWeather;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_weather);
        position = getIntent().getIntExtra(POSITION, DEFAULT_POSITION);
        Log.i(this.getClass().getName(), "position = " + position);
        initPresenter();
    }

    private void initPresenter() {
        presenter = new DetailWeatherPresenter(getApplicationContext(), this);
    }

    private void initComponents() {

    }
}
