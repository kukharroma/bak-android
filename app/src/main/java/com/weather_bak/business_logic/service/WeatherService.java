package com.weather_bak.business_logic.service;

import com.weather_bak.model.City;
import com.weather_bak.model.DayWeather;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roma on 16.06.15.
 */
public class WeatherService {

    private static final int TEMPERATURE_KOEF = 0;
    private static final int WINDSPEED_KOEF = 1;
    private static final int PRECIPITATION_KOEF = 2;
    private static final int CLOUDINESS_KOEF = 3;

    double sumFourTeenDays = 0;
    double sumLastOneYear = 0;
    double sumLastTwoYear = 0;
    double sumLastThreeYear = 0;

    double averageFourTeenDays = 0;
    double averageLastOneYear = 0;
    double averageLastTwoYear = 0;
    double averageLastThreeYear = 0;

    double koefFourTeenDays = 0;
    double koefLastOneYear = 0;
    double koefLastTwoYear = 0;
    double koefLastThreeYear = 0;

    private List<DayWeather> futureWeather = new ArrayList<>();


    public List<DayWeather> forecastWeather(City city) {
        double tempKoef = getKoef(city, TEMPERATURE_KOEF);
        double windSpeedKoef = getKoef(city, WINDSPEED_KOEF);
        double precipitationKoef = Math.abs(getKoef(city, PRECIPITATION_KOEF));
        double cloudinessKoef = Math.abs(getKoef(city, CLOUDINESS_KOEF));


        if (tempKoef > 0) {
            DayWeather dayWeather1 = new DayWeather();
            dayWeather1.setData("26.05.15");
            dayWeather1.setTemperature(city.getLastFourteenDays().get(13).getTemperature() + tempKoef);
            dayWeather1.setWindSpeed(city.getLastFourteenDays().get(13).getWindSpeed() + windSpeedKoef);
            dayWeather1.setPrecipitation(city.getLastFourteenDays().get(13).getPrecipitation() - precipitationKoef);
            dayWeather1.setCloudiness(city.getLastFourteenDays().get(13).getCloudiness() - cloudinessKoef);

            DayWeather dayWeather2 = new DayWeather();
            dayWeather2.setData("27.05.15");
            dayWeather2.setTemperature(dayWeather1.getTemperature() + tempKoef);
            dayWeather2.setWindSpeed(dayWeather1.getWindSpeed() + windSpeedKoef);
            dayWeather2.setPrecipitation(dayWeather1.getPrecipitation() - precipitationKoef);
            dayWeather2.setCloudiness(dayWeather1.getCloudiness() - cloudinessKoef);

            DayWeather dayWeather3 = new DayWeather();
            dayWeather3.setData("28.05.15");
            dayWeather3.setTemperature(dayWeather2.getTemperature() + tempKoef);
            dayWeather3.setWindSpeed(dayWeather2.getWindSpeed() + windSpeedKoef);
            dayWeather3.setPrecipitation(dayWeather2.getPrecipitation() - precipitationKoef);
            dayWeather3.setCloudiness(dayWeather2.getCloudiness() - cloudinessKoef);

            futureWeather.add(dayWeather1);
            futureWeather.add(dayWeather2);
            futureWeather.add(dayWeather3);
            return futureWeather;
        } else {

            if (windSpeedKoef < 0) {
                DayWeather dayWeather1 = new DayWeather();
                dayWeather1.setData("26.05.15");
                dayWeather1.setTemperature(city.getLastFourteenDays().get(13).getTemperature() + tempKoef);
                dayWeather1.setWindSpeed(city.getLastFourteenDays().get(13).getWindSpeed() + windSpeedKoef);
                dayWeather1.setPrecipitation(city.getLastFourteenDays().get(13).getPrecipitation() + precipitationKoef);
                dayWeather1.setCloudiness(city.getLastFourteenDays().get(13).getCloudiness() + cloudinessKoef);

                DayWeather dayWeather2 = new DayWeather();
                dayWeather2.setData("27.05.15");
                dayWeather2.setTemperature(dayWeather1.getTemperature() + tempKoef);
                dayWeather2.setWindSpeed(dayWeather1.getWindSpeed() + windSpeedKoef);
                dayWeather2.setPrecipitation(dayWeather1.getPrecipitation() + precipitationKoef);
                dayWeather2.setCloudiness(dayWeather1.getCloudiness() + cloudinessKoef);

                DayWeather dayWeather3 = new DayWeather();
                dayWeather3.setData("28.05.15");
                dayWeather3.setTemperature(dayWeather2.getTemperature() + tempKoef);
                dayWeather3.setWindSpeed(dayWeather2.getWindSpeed() + windSpeedKoef);
                dayWeather3.setPrecipitation(dayWeather2.getPrecipitation() + precipitationKoef);
                dayWeather3.setCloudiness(dayWeather2.getCloudiness() + cloudinessKoef);

                futureWeather.add(dayWeather1);
                futureWeather.add(dayWeather2);
                futureWeather.add(dayWeather3);
                return futureWeather;
            } else {
                DayWeather dayWeather1 = new DayWeather();
                dayWeather1.setData("26.05.15");
                dayWeather1.setTemperature(city.getLastFourteenDays().get(13).getTemperature() + tempKoef);
                dayWeather1.setWindSpeed(city.getLastFourteenDays().get(13).getWindSpeed() + windSpeedKoef);
                dayWeather1.setPrecipitation(city.getLastFourteenDays().get(13).getPrecipitation() + precipitationKoef);
                dayWeather1.setCloudiness(city.getLastFourteenDays().get(13).getCloudiness() - cloudinessKoef);

                DayWeather dayWeather2 = new DayWeather();
                dayWeather2.setData("27.05.15");
                dayWeather2.setTemperature(dayWeather1.getTemperature() + tempKoef);
                dayWeather2.setWindSpeed(dayWeather1.getWindSpeed() + windSpeedKoef);
                dayWeather2.setPrecipitation(dayWeather1.getPrecipitation() + precipitationKoef);
                dayWeather2.setCloudiness(dayWeather1.getCloudiness() - cloudinessKoef);

                DayWeather dayWeather3 = new DayWeather();
                dayWeather3.setData("28.05.15");
                dayWeather3.setTemperature(dayWeather2.getTemperature() + tempKoef);
                dayWeather3.setWindSpeed(dayWeather2.getWindSpeed() + windSpeedKoef);
                dayWeather3.setPrecipitation(dayWeather2.getPrecipitation() + precipitationKoef);
                dayWeather3.setCloudiness(dayWeather2.getCloudiness() - cloudinessKoef);

                futureWeather.add(dayWeather1);
                futureWeather.add(dayWeather2);
                futureWeather.add(dayWeather3);
                return futureWeather;
            }
        }
    }


    private double getKoef(City city, int NUMBER_OF_KOEF) {
        switch (NUMBER_OF_KOEF) {
            case TEMPERATURE_KOEF:
                return getTempKoef(city);
            case WINDSPEED_KOEF:
                return getWindSpeedKoef(city);
            case PRECIPITATION_KOEF:
                return getPrecipitationKoef(city);
            case CLOUDINESS_KOEF:
                return getCloudinessKoef(city);
            default:
                return 0;
        }
    }

    private double getTempKoef(City city) {

        for (DayWeather weather : city.getLastFourteenDays()) {
            sumFourTeenDays = +weather.getTemperature();
        }
        averageFourTeenDays = sumFourTeenDays / city.getLastFourteenDays().size();
        koefFourTeenDays = (city.getLastFourteenDays().get(13).getTemperature() - city.getLastFourteenDays().get(0).getTemperature()) / averageFourTeenDays;


        for (DayWeather weather : city.getLastOneYear()) {
            sumLastOneYear = +weather.getTemperature();
        }
        averageLastOneYear = sumLastOneYear / city.getLastOneYear().size();
        koefLastOneYear = (city.getLastOneYear().get(13).getTemperature() - city.getLastOneYear().get(0).getTemperature()) / averageLastOneYear;


        for (DayWeather weather : city.getLastTwoYear()) {
            sumLastTwoYear = +weather.getTemperature();
        }
        averageLastTwoYear = sumLastTwoYear / city.getLastTwoYear().size();
        koefLastTwoYear = (city.getLastTwoYear().get(13).getTemperature() - city.getLastTwoYear().get(0).getTemperature()) / averageLastTwoYear;

        for (DayWeather weather : city.getLastThreeYear()) {
            sumLastThreeYear = +weather.getTemperature();
        }
        averageLastThreeYear = sumLastThreeYear / city.getLastThreeYear().size();
        koefLastThreeYear = (city.getLastThreeYear().get(13).getTemperature() - city.getLastThreeYear().get(0).getTemperature()) / averageLastThreeYear;


        return (koefFourTeenDays + koefLastOneYear + koefLastTwoYear + koefLastThreeYear) / 4;
    }

    private double getWindSpeedKoef(City city) {
        return 0;
    }

    private double getPrecipitationKoef(City city) {
        return 0;
    }

    private double getCloudinessKoef(City city) {
        return 0;
    }
}
