package com.weather_bak.business_logic.util;

import com.weather_bak.model.City;
import com.weather_bak.model.CityList;
import com.weather_bak.model.DayWeather;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by roma on 15.06.15.
 */
public class WeatherTestUtil {


    public CityList createCityWeather() {
        CityList cityList = new CityList();

        List<City> cities = new ArrayList<>();

        City city1 = new City();
        city1.setName("Kyiv");


        List<DayWeather> listDayWeather1 = new ArrayList<>();
        for (int k = 0; k < 14; k++) {
            DayWeather weather = new DayWeather();
            weather.setData((k + 1) + ".05.15");
            weather.setTemperature(cutDouble(randDouble(15.0, 28.0), 1));
            weather.setWindSpeed(cutDouble(randDouble(1.0, 5.0), 1));
            weather.setPrecipitation(cutDouble(randDouble(0.0, 0.3), 1));
            weather.setCloudiness(randInt(20, 95));
            listDayWeather1.add(weather);
        }
        city1.setLastFourteenDays(listDayWeather1);


        List<DayWeather> listDayWeather2 = new ArrayList<>();
        for (int k = 0; k < 14; k++) {
            DayWeather weather = new DayWeather();
            weather.setData((k + 1) + ".05.14");
            weather.setTemperature(cutDouble(randDouble(15.0, 28.0), 1));
            weather.setWindSpeed(cutDouble(randDouble(1.0, 5.0), 1));
            weather.setPrecipitation(cutDouble(randDouble(0.0, 0.3), 1));
            weather.setCloudiness(randInt(20, 95));
            listDayWeather2.add(weather);
        }
        city1.setLastOneYear(listDayWeather2);


        List<DayWeather> listDayWeather3 = new ArrayList<>();
        for (int k = 0; k < 14; k++) {
            DayWeather weather = new DayWeather();
            weather.setData((k + 1) + ".05.13");
            weather.setTemperature(cutDouble(randDouble(15.0, 28.0), 1));
            weather.setWindSpeed(cutDouble(randDouble(1.0, 5.0), 1));
            weather.setPrecipitation(cutDouble(randDouble(0.0, 0.3), 1));
            weather.setCloudiness(randInt(20, 95));
            listDayWeather3.add(weather);
        }
        city1.setLastTwoYear(listDayWeather3);

        List<DayWeather> listDayWeather4 = new ArrayList<>();
        for (int k = 0; k < 14; k++) {
            DayWeather weather = new DayWeather();
            weather.setData((k + 1) + ".05.13");
            weather.setTemperature(cutDouble(randDouble(15.0, 28.0), 1));
            weather.setWindSpeed(cutDouble(randDouble(1.0, 5.0), 1));
            weather.setPrecipitation(cutDouble(randDouble(0.0, 0.3), 1));
            weather.setCloudiness(randInt(20, 95));
            listDayWeather4.add(weather);
        }
        city1.setLastThreeYear(listDayWeather4);

        cities.add(city1);


        City city2 = new City();
        city2.setName("Lviv");
        listDayWeather2 = new ArrayList<>();

        for (int k = 0; k < 14; k++) {
            DayWeather weather = new DayWeather();
            weather.setData((k + 1) + ".05.15");
            weather.setTemperature(cutDouble(randDouble(15.0, 28.0), 1));
            weather.setWindSpeed(cutDouble(randDouble(1.0, 5.0), 1));
            weather.setPrecipitation(cutDouble(randDouble(0.0, 0.3), 1));
            weather.setCloudiness(randInt(20, 95));
            listDayWeather2.add(weather);
        }

        city2.setLastTwoYear(listDayWeather2);
        cities.add(city2);


        City city3 = new City();
        city3.setName("city 3");
         listDayWeather3 = new ArrayList<>();

        for (int k = 0; k < 14; k++) {
            DayWeather weather = new DayWeather();
            weather.setData("25.05.15");
            weather.setData((k + 1) + ".05.15");
            weather.setTemperature(cutDouble(randDouble(15.0, 28.0), 1));
            weather.setWindSpeed(cutDouble(randDouble(1.0, 5.0), 1));
            weather.setPrecipitation(cutDouble(randDouble(0.0, 0.3), 1));
            weather.setCloudiness(randInt(20, 95));
            listDayWeather3.add(weather);
        }

        city3.setLastTwoYear(listDayWeather3);


        cities.add(city3);
        cityList.setCities(cities);

        return cityList;
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static double randDouble(double rangeMin, double rangeMax) {
        Random r = new Random();
        return rangeMin + (rangeMax - rangeMin) * r.nextDouble();
    }

    private double cutDouble(double r, int decimalPlaces) {
        BigDecimal bd = new BigDecimal(r);
        bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }


}
