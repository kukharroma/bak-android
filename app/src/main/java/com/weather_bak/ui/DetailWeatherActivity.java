package com.weather_bak.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.weather_bak.R;
import com.weather_bak.presenter.DetailWeatherPresenter;

/**
 * Created by roma on 15.06.15.
 */
public class DetailWeatherActivity extends Activity {

    private DetailWeatherPresenter presenter;

    public static final String POSITION = "position";
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_weather);
        position = getIntent().getIntExtra(POSITION, 0);
        Log.i(this.getClass().getName(), "position = " + position);
        initPresenter();
    }

    private void initPresenter() {
        presenter = new DetailWeatherPresenter(getApplicationContext(), this);
    }
}
