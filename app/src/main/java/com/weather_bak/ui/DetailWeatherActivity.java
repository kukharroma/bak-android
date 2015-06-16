package com.weather_bak.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.weather_bak.R;
import com.weather_bak.business_logic.service.WeatherService;
import com.weather_bak.model.DayWeather;
import com.weather_bak.presenter.DetailWeatherPresenter;
import com.weather_bak.ui.widget.WeatherTable;

import java.util.List;

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
        initPresenter();
        initComponents();
        fillLastWeeksTable();
        fillLastYearTable();
        fillLastTwoYearTable();
        fillLastThreeYearTable();
        fillFutureTable();
    }

    private void initPresenter() {
        presenter = new DetailWeatherPresenter(getApplicationContext(), this);
    }

    private void initComponents() {
        wtFutureWeather = (WeatherTable) findViewById(R.id.tl_future_weather);
        wtLastWeeks = (WeatherTable) findViewById(R.id.tl_last_14_days);
        wtLastYear = (WeatherTable) findViewById(R.id.tl_last_year);
        wtLastTwoYears = (WeatherTable) findViewById(R.id.tl_last_two_years);
        wtLastThreeYears = (WeatherTable) findViewById(R.id.tl_last_three_years);
    }


    private void fillLastWeeksTable() {
        fillWeatherTable(wtLastWeeks, presenter.getAllWeatherInCity(position).getLastTwoYear());
    }

    private void fillLastYearTable() {
        fillWeatherTable(wtLastYear, presenter.getAllWeatherInCity(position).getLastOneYear());
    }

    private void fillLastTwoYearTable() {
        fillWeatherTable(wtLastTwoYears, presenter.getAllWeatherInCity(position).getLastTwoYear());
    }

    private void fillLastThreeYearTable() {
        fillWeatherTable(wtLastThreeYears, presenter.getAllWeatherInCity(position).getLastThreeYear());
    }

    private void fillFutureTable() {
        WeatherService weatherService = new WeatherService();
        List<DayWeather> dayWeathers = weatherService.forecastWeather(presenter.getAllWeatherInCity(position));
        fillWeatherTable(wtFutureWeather, dayWeathers);
    }

    private void fillWeatherTable(WeatherTable weatherTable, List<DayWeather> dayWeathers) {
        for (int k = 0; k < dayWeathers.size(); k++) {
            TextView tvDate = new TextView(getApplicationContext(), null,  R.style.tvStyle);
            tvDate.setText(dayWeathers.get(k).getData());
            weatherTable.getTrDate().addView(tvDate, (k + 1));

            TextView tvTemperature = new TextView(getApplicationContext(), null,  R.style.tvStyle);
            tvTemperature.setText("" + dayWeathers.get(k).getTemperature());
            weatherTable.getTrTemperature().addView(tvTemperature, (k + 1));

            TextView tvWindSpeed = new TextView(getApplicationContext(), null,  R.style.tvStyle);
            tvWindSpeed.setText("" + dayWeathers.get(k).getWindSpeed());
            weatherTable.getTrWindSpeed().addView(tvWindSpeed, (k + 1));

            TextView tvPrecipitation = new TextView(getApplicationContext(), null, R.style.tvStyle);
            tvPrecipitation.setText("" + dayWeathers.get(k).getPrecipitation());
            weatherTable.getTrPrecipitation().addView(tvPrecipitation, (k + 1));

            TextView tvCloudiness = new TextView(getApplicationContext(), null,  R.style.tvStyle);
            tvCloudiness.setText("" + dayWeathers.get(k).getCloudiness());
            weatherTable.getTrCloudiness().addView(tvCloudiness);
        }
    }

}
