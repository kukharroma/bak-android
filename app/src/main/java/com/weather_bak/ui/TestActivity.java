package com.weather_bak.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

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
//        cache.setString("{\n" +
//                "  \"cities\": [\n" +
//                "    {\n" +
//                "      \"lastFourteenDays\": [\n" +
//                "        {\n" +
//                "          \"data\": \"1.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 10,\n" +
//                "          \"windSpeed\": 6\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"2.05.15\",\n" +
//                "          \"cloudiness\": 45,\n" +
//                "          \"precipitation\": 0.1,\n" +
//                "          \"temperature\": 12,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"3.05.15\",\n" +
//                "          \"cloudiness\": 50,\n" +
//                "          \"precipitation\": 0,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3.5\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"4.05.15\",\n" +
//                "          \"cloudiness\": 35,\n" +
//                "          \"precipitation\": 0,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 2.5\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"5.05.15\",\n" +
//                "          \"cloudiness\": 50,\n" +
//                "          \"precipitation\": 0,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 5\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"6.05.15\",\n" +
//                "          \"cloudiness\": 40,\n" +
//                "          \"precipitation\": 0,\n" +
//                "          \"temperature\": 16,\n" +
//                "          \"windSpeed\": 3.5\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"7.05.15\",\n" +
//                "          \"cloudiness\": 25,\n" +
//                "          \"precipitation\": 0,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 1.5\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"8.05.15\",\n" +
//                "          \"cloudiness\": 45,\n" +
//                "          \"precipitation\": 0,\n" +
//                "          \"temperature\": 20,\n" +
//                "          \"windSpeed\": 1\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"9.05.15\",\n" +
//                "          \"cloudiness\": 35,\n" +
//                "          \"precipitation\": 0,\n" +
//                "          \"temperature\": 21,\n" +
//                "          \"windSpeed\": 1\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"10.05.15\",\n" +
//                "          \"cloudiness\": 30,\n" +
//                "          \"precipitation\": 0,\n" +
//                "          \"temperature\": 22,\n" +
//                "          \"windSpeed\": 1\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"11.05.15\",\n" +
//                "          \"cloudiness\": 50,\n" +
//                "          \"precipitation\": 0,\n" +
//                "          \"temperature\": 20,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"12.05.15\",\n" +
//                "          \"cloudiness\": 60,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 12,\n" +
//                "          \"windSpeed\": 6\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"13.05.15\",\n" +
//                "          \"cloudiness\": 65,\n" +
//                "          \"precipitation\": 0.1,\n" +
//                "          \"temperature\": 10,\n" +
//                "          \"windSpeed\": 8\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"14.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0,\n" +
//                "          \"temperature\": 10,\n" +
//                "          \"windSpeed\": 6\n" +
//                "        }\n" +
//                "      ],\n" +
//                "      \"lastOneYear\": [\n" +
//                "        {\n" +
//                "          \"data\": \"1.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"2.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"3.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"4.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"5.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"6.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"7.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"8.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"9.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"10.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"11.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"12.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"13.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"14.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        }\n" +
//                "      ],\n" +
//                "      \"lastThreeYear\": [\n" +
//                "        {\n" +
//                "          \"data\": \"1.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"2.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"3.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"4.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"5.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"6.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"7.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"8.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"9.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"10.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"11.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"12.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"13.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"14.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        }\n" +
//                "      ],\n" +
//                "      \"lastTwoYear\": [\n" +
//                "        {\n" +
//                "          \"data\": \"1.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"2.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"3.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"4.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"5.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"6.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"7.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"8.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"9.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"10.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"11.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"12.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"13.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"14.05.15\",\n" +
//                "          \"cloudiness\": 70,\n" +
//                "          \"precipitation\": 0.2,\n" +
//                "          \"temperature\": 15,\n" +
//                "          \"windSpeed\": 3\n" +
//                "        }\n" +
//                "      ],\n" +
//                "      \"name\": \"city 1\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"lastTwoYear\": [\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        }\n" +
//                "      ],\n" +
//                "      \"name\": \"city 2\"\n" +
//                "    },\n" +
//                "    {\n" +
//                "      \"lastTwoYear\": [\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"data\": \"25.05.15\",\n" +
//                "          \"cloudiness\": 0.7220096548596434,\n" +
//                "          \"precipitation\": 0.7308781907032909,\n" +
//                "          \"temperature\": 0.7315052631087257,\n" +
//                "          \"windSpeed\": 0.7299823878824023\n" +
//                "        }\n" +
//                "      ],\n" +
//                "      \"name\": \"city 3\"\n" +
//                "    }\n" +
//                "  ]\n" +
//                "}");
    }
}
