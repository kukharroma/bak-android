package com.weather_bak.business_logic.service;

import com.weather_bak.model.City;
import com.weather_bak.model.DayWeather;

import java.math.BigDecimal;
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
            dayWeather1.setData("15.05.15");
            dayWeather1.setTemperature(cutDouble((city.getLastFourteenDays().get(13).getTemperature() + tempKoef), 1));
            dayWeather1.setWindSpeed(cutDouble((city.getLastFourteenDays().get(13).getWindSpeed() + windSpeedKoef), 1));
            dayWeather1.setPrecipitation(cutDouble((city.getLastFourteenDays().get(13).getPrecipitation() - precipitationKoef), 1));
            dayWeather1.setCloudiness(cutDouble((city.getLastFourteenDays().get(13).getCloudiness() - cloudinessKoef), 1));

            DayWeather dayWeather2 = new DayWeather();
            dayWeather2.setData("16.05.15");
            dayWeather2.setTemperature(cutDouble((dayWeather1.getTemperature() + tempKoef), 1));
            dayWeather2.setWindSpeed(cutDouble((dayWeather1.getWindSpeed() + windSpeedKoef), 1));
            dayWeather2.setPrecipitation(cutDouble((dayWeather1.getPrecipitation() - precipitationKoef), 1));
            dayWeather2.setCloudiness(cutDouble((dayWeather1.getCloudiness() - cloudinessKoef), 1));

            DayWeather dayWeather3 = new DayWeather();
            dayWeather3.setData("17.05.15");
            dayWeather3.setTemperature(cutDouble((dayWeather2.getTemperature() + tempKoef), 1));
            dayWeather3.setWindSpeed(cutDouble((dayWeather2.getWindSpeed() + windSpeedKoef), 1));
            dayWeather3.setPrecipitation(cutDouble((dayWeather2.getPrecipitation() - precipitationKoef), 1));
            dayWeather3.setCloudiness(cutDouble((dayWeather2.getCloudiness() - cloudinessKoef), 1));

            futureWeather.add(dayWeather1);
            futureWeather.add(dayWeather2);
            futureWeather.add(dayWeather3);
            return futureWeather;
        } else {

            if (windSpeedKoef < 0) {
                DayWeather dayWeather1 = new DayWeather();
                dayWeather1.setData("15.05.15");
                dayWeather1.setTemperature(cutDouble((city.getLastFourteenDays().get(13).getTemperature() + tempKoef), 1));
                dayWeather1.setWindSpeed(cutDouble((city.getLastFourteenDays().get(13).getWindSpeed() + windSpeedKoef), 1));
                dayWeather1.setPrecipitation(cutDouble((city.getLastFourteenDays().get(13).getPrecipitation() + precipitationKoef), 1));
                dayWeather1.setCloudiness(cutDouble((city.getLastFourteenDays().get(13).getCloudiness() + cloudinessKoef), 1));

                DayWeather dayWeather2 = new DayWeather();
                dayWeather2.setData("16.05.15");
                dayWeather2.setTemperature(cutDouble((dayWeather1.getTemperature() + tempKoef), 1));
                dayWeather2.setWindSpeed(cutDouble((dayWeather1.getWindSpeed() + windSpeedKoef), 1));
                dayWeather2.setPrecipitation(cutDouble((dayWeather1.getPrecipitation() + precipitationKoef), 1));
                dayWeather2.setCloudiness(cutDouble((dayWeather1.getCloudiness() + cloudinessKoef), 1));

                DayWeather dayWeather3 = new DayWeather();
                dayWeather3.setData("17.05.15");
                dayWeather3.setTemperature(cutDouble((dayWeather2.getTemperature() + tempKoef), 1));
                dayWeather3.setWindSpeed(cutDouble((dayWeather2.getWindSpeed() + windSpeedKoef), 1));
                dayWeather3.setPrecipitation(cutDouble((dayWeather2.getPrecipitation() + precipitationKoef), 1));
                dayWeather3.setCloudiness(cutDouble((dayWeather2.getCloudiness() + cloudinessKoef), 1));

                futureWeather.add(dayWeather1);
                futureWeather.add(dayWeather2);
                futureWeather.add(dayWeather3);
                return futureWeather;
            } else {
                DayWeather dayWeather1 = new DayWeather();
                dayWeather1.setData("15.05.15");
                dayWeather1.setTemperature(cutDouble((city.getLastFourteenDays().get(13).getTemperature() + tempKoef), 1));
                dayWeather1.setWindSpeed(cutDouble((city.getLastFourteenDays().get(13).getWindSpeed() + windSpeedKoef), 1));
                dayWeather1.setPrecipitation(cutDouble((city.getLastFourteenDays().get(13).getPrecipitation() + precipitationKoef), 1));
                dayWeather1.setCloudiness(cutDouble((city.getLastFourteenDays().get(13).getCloudiness() - cloudinessKoef), 1));

                DayWeather dayWeather2 = new DayWeather();
                dayWeather2.setData("16.05.15");
                dayWeather2.setTemperature(cutDouble((dayWeather1.getTemperature() + tempKoef), 1));
                dayWeather2.setWindSpeed(cutDouble((dayWeather1.getWindSpeed() + windSpeedKoef), 1));
                dayWeather2.setPrecipitation(cutDouble((dayWeather1.getPrecipitation() + precipitationKoef), 1));
                dayWeather2.setCloudiness(cutDouble((dayWeather1.getCloudiness() - cloudinessKoef), 1));

                DayWeather dayWeather3 = new DayWeather();
                dayWeather3.setData("17.05.15");
                dayWeather3.setTemperature(cutDouble((dayWeather2.getTemperature() + tempKoef), 1));
                dayWeather3.setWindSpeed(cutDouble((dayWeather2.getWindSpeed() + windSpeedKoef), 1));
                dayWeather3.setPrecipitation(cutDouble((dayWeather2.getPrecipitation() + precipitationKoef), 1));
                dayWeather3.setCloudiness(cutDouble((dayWeather2.getCloudiness() - cloudinessKoef), 1));

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

        sumFourTeenDays = 0;
        sumLastOneYear = 0;
        sumLastTwoYear = 0;
        sumLastThreeYear = 0;

        for (DayWeather weather : city.getLastFourteenDays()) {
            sumFourTeenDays = sumFourTeenDays+weather.getTemperature();
        }
        averageFourTeenDays = sumFourTeenDays / city.getLastFourteenDays().size();
        koefFourTeenDays = (city.getLastFourteenDays().get(13).getTemperature() - city.getLastFourteenDays().get(0).getTemperature()) / averageFourTeenDays;


        for (DayWeather weather : city.getLastOneYear()) {
            sumLastOneYear =sumLastOneYear +weather.getTemperature();
        }
        averageLastOneYear = sumLastOneYear / city.getLastOneYear().size();
        koefLastOneYear = (city.getLastOneYear().get(13).getTemperature() - city.getLastOneYear().get(0).getTemperature()) / averageLastOneYear;


        for (DayWeather weather : city.getLastTwoYear()) {
            sumLastTwoYear = sumLastTwoYear+weather.getTemperature();
        }
        averageLastTwoYear = sumLastTwoYear / city.getLastTwoYear().size();
        koefLastTwoYear = (city.getLastTwoYear().get(13).getTemperature() - city.getLastTwoYear().get(0).getTemperature()) / averageLastTwoYear;

        for (DayWeather weather : city.getLastThreeYear()) {
            sumLastThreeYear = sumLastThreeYear+weather.getTemperature();
        }
        averageLastThreeYear = sumLastThreeYear / city.getLastThreeYear().size();
        koefLastThreeYear = (city.getLastThreeYear().get(13).getTemperature() - city.getLastThreeYear().get(0).getTemperature()) / averageLastThreeYear;


        return (koefFourTeenDays + koefLastOneYear + koefLastTwoYear + koefLastThreeYear) / 4;
    }

    private double getWindSpeedKoef(City city) {
        sumFourTeenDays = 0;
        sumLastOneYear = 0;
        sumLastTwoYear = 0;
        sumLastThreeYear = 0;

        for (DayWeather weather : city.getLastFourteenDays()) {
            sumFourTeenDays =sumFourTeenDays +weather.getWindSpeed();
        }
        averageFourTeenDays = sumFourTeenDays / city.getLastFourteenDays().size();
        koefFourTeenDays = (city.getLastFourteenDays().get(13).getWindSpeed() - city.getLastFourteenDays().get(0).getWindSpeed()) / averageFourTeenDays;


        for (DayWeather weather : city.getLastOneYear()) {
            sumLastOneYear =sumLastOneYear +weather.getWindSpeed();
        }
        averageLastOneYear = sumLastOneYear / city.getLastOneYear().size();
        koefLastOneYear = (city.getLastOneYear().get(13).getWindSpeed() - city.getLastOneYear().get(0).getWindSpeed()) / averageLastOneYear;


        for (DayWeather weather : city.getLastTwoYear()) {
            sumLastTwoYear =sumLastTwoYear +weather.getWindSpeed();
        }
        averageLastTwoYear = sumLastTwoYear / city.getLastTwoYear().size();
        koefLastTwoYear = (city.getLastTwoYear().get(13).getWindSpeed() - city.getLastTwoYear().get(0).getWindSpeed()) / averageLastTwoYear;

        for (DayWeather weather : city.getLastThreeYear()) {
            sumLastThreeYear =sumLastThreeYear +weather.getWindSpeed();
        }
        averageLastThreeYear = sumLastThreeYear / city.getLastThreeYear().size();
        koefLastThreeYear = (city.getLastThreeYear().get(13).getWindSpeed() - city.getLastThreeYear().get(0).getWindSpeed()) / averageLastThreeYear;


        return (koefFourTeenDays + koefLastOneYear + koefLastTwoYear + koefLastThreeYear) / 4;
    }

    private double getPrecipitationKoef(City city) {
        sumFourTeenDays = 0;
        sumLastOneYear = 0;
        sumLastTwoYear = 0;
        sumLastThreeYear = 0;

        for (DayWeather weather : city.getLastFourteenDays()) {
            sumFourTeenDays = sumFourTeenDays + weather.getPrecipitation();
        }
        averageFourTeenDays = sumFourTeenDays / city.getLastFourteenDays().size();
        koefFourTeenDays = (city.getLastFourteenDays().get(13).getPrecipitation() - city.getLastFourteenDays().get(0).getPrecipitation()) / averageFourTeenDays;


        for (DayWeather weather : city.getLastOneYear()) {
            sumLastOneYear = sumLastOneYear + weather.getPrecipitation();
        }
        averageLastOneYear = sumLastOneYear / city.getLastOneYear().size();
        koefLastOneYear = (city.getLastOneYear().get(13).getPrecipitation() - city.getLastOneYear().get(0).getPrecipitation()) / averageLastOneYear;


        for (DayWeather weather : city.getLastTwoYear()) {
            sumLastTwoYear = sumLastTwoYear+weather.getPrecipitation();
        }
        averageLastTwoYear = sumLastTwoYear / city.getLastTwoYear().size();
        koefLastTwoYear = (city.getLastTwoYear().get(13).getPrecipitation() - city.getLastTwoYear().get(0).getPrecipitation()) / averageLastTwoYear;

        for (DayWeather weather : city.getLastThreeYear()) {
            sumLastThreeYear = sumLastThreeYear+weather.getPrecipitation();
        }
        averageLastThreeYear = sumLastThreeYear / city.getLastThreeYear().size();
        koefLastThreeYear = (city.getLastThreeYear().get(13).getPrecipitation() - city.getLastThreeYear().get(0).getPrecipitation()) / averageLastThreeYear;


        return (koefFourTeenDays + koefLastOneYear + koefLastTwoYear + koefLastThreeYear) / 4;
    }

    private double getCloudinessKoef(City city) {
        sumFourTeenDays = 0;
        sumLastOneYear = 0;
        sumLastTwoYear = 0;
        sumLastThreeYear = 0;

        for (DayWeather weather : city.getLastFourteenDays()) {
            sumFourTeenDays = sumFourTeenDays+weather.getCloudiness();
        }
        averageFourTeenDays = sumFourTeenDays / city.getLastFourteenDays().size();
        koefFourTeenDays = (city.getLastFourteenDays().get(13).getCloudiness() - city.getLastFourteenDays().get(0).getCloudiness()) / averageFourTeenDays;


        for (DayWeather weather : city.getLastOneYear()) {
            sumLastOneYear =sumLastOneYear +weather.getCloudiness();
        }
        averageLastOneYear = sumLastOneYear / city.getLastOneYear().size();
        koefLastOneYear = (city.getLastOneYear().get(13).getCloudiness() - city.getLastOneYear().get(0).getCloudiness()) / averageLastOneYear;


        for (DayWeather weather : city.getLastTwoYear()) {
            sumLastTwoYear =sumLastTwoYear +weather.getCloudiness();
        }
        averageLastTwoYear = sumLastTwoYear / city.getLastTwoYear().size();
        koefLastTwoYear = (city.getLastTwoYear().get(13).getCloudiness() - city.getLastTwoYear().get(0).getCloudiness()) / averageLastTwoYear;

        for (DayWeather weather : city.getLastThreeYear()) {
            sumLastThreeYear =sumLastThreeYear +weather.getCloudiness();
        }
        averageLastThreeYear = sumLastThreeYear / city.getLastThreeYear().size();
        koefLastThreeYear = (city.getLastThreeYear().get(13).getCloudiness() - city.getLastThreeYear().get(0).getCloudiness()) / averageLastThreeYear;


        return (koefFourTeenDays + koefLastOneYear + koefLastTwoYear + koefLastThreeYear) / 4;
    }


    private double cutDouble(double r, int decimalPlaces) {
        BigDecimal bd = new BigDecimal(r);
        bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }
}
