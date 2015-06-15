package com.weather_bak.cache.serializer;

/**
 * Created by roma on 15.06.15.
 */
public interface Serializer<T> {

    String serialize(T t);

    T deserialize(String json);
}
