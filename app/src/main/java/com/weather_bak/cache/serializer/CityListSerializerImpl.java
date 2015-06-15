package com.weather_bak.cache.serializer;

import com.google.gson.Gson;
import com.weather_bak.model.CityList;

/**
 * Created by roma on 15.06.15.
 */
public class CityListSerializerImpl implements Serializer<CityList> {

    private Gson gson = new Gson();

    @Override
    public String serialize(CityList cityList) {
        return gson.toJson(cityList);
    }

    @Override
    public CityList deserialize(String json) {
        return gson.fromJson(json, CityList.class);
    }
}
