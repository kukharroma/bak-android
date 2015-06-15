package com.weather_bak.model;

import java.util.List;

/**
 * Created by roma on 15.06.15.
 */
public class City {
    private String name;
    private List<DayWeather> lastThreeYear;
    private List<DayWeather> lastTwoYear;
    private List<DayWeather> lastOneYear;
    private List<DayWeather> lastFourteenDays;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DayWeather> getLastThreeYear() {
        return lastThreeYear;
    }

    public void setLastThreeYear(List<DayWeather> lastThreeYear) {
        this.lastThreeYear = lastThreeYear;
    }

    public List<DayWeather> getLastTwoYear() {
        return lastTwoYear;
    }

    public void setLastTwoYear(List<DayWeather> lastTwoYear) {
        this.lastTwoYear = lastTwoYear;
    }

    public List<DayWeather> getLastOneYear() {
        return lastOneYear;
    }

    public void setLastOneYear(List<DayWeather> lastOneYear) {
        this.lastOneYear = lastOneYear;
    }

    public List<DayWeather> getLastFourteenDays() {
        return lastFourteenDays;
    }

    public void setLastFourteenDays(List<DayWeather> lastFourteenDays) {
        this.lastFourteenDays = lastFourteenDays;
    }
}
