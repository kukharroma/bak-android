package com.weather_bak.business_logic.util;

import com.weather_bak.model.City;
import com.weather_bak.model.CityList;
import com.weather_bak.model.DayWeather;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roma on 15.06.15.
 */
public class WeatherTestUtil {


    public CityList createCityWeather() {
        CityList cityList = new CityList();

        List<City> cities = new ArrayList<>();

        City city1 = new City();
        city1.setName("city 1");
        List<DayWeather> listDayWeather1 = new ArrayList<>();

        for (int k = 0; k < 14; k++) {
            DayWeather weather = new DayWeather();
            weather.setData("25.05.15");
            weather.setTemperature(3.5);
            weather.setWindSpeed(2);
            weather.setPrecipitation(0.2);
            weather.setCloudiness(70);
            listDayWeather1.add(weather);
        }

        city1.setLastFourteenDays(listDayWeather1);
        city1.setLastOneYear(listDayWeather1);
        city1.setLastTwoYear(listDayWeather1);
        city1.setLastThreeYear(listDayWeather1);

        cities.add(city1);


        City city2 = new City();
        city2.setName("city 2");
        List<DayWeather> listDayWeather2 = new ArrayList<>();

        for (int k = 0; k < 14; k++) {
            DayWeather weather = new DayWeather();
            weather.setData("25.05.15");
            weather.setTemperature(3.5);
            weather.setWindSpeed(2);
            weather.setPrecipitation(0.2);
            weather.setCloudiness(70);
            listDayWeather2.add(weather);
        }

        city2.setLastTwoYear(listDayWeather2);
        cities.add(city2);



        City city3 = new City();
        city3.setName("city 3");
        List<DayWeather> listDayWeather3 = new ArrayList<>();

        for (int k = 0; k < 14; k++) {
            DayWeather weather = new DayWeather();
            weather.setData("25.05.15");
            weather.setTemperature(3.5);
            weather.setWindSpeed(2);
            weather.setPrecipitation(0.2);
            weather.setCloudiness(70);
            listDayWeather3.add(weather);
        }

        city3.setLastTwoYear(listDayWeather3);



        cities.add(city3);
        cityList.setCities(cities);

        return cityList;
    }

}
