package com.weather_bak.cache.provider;

/**
 * Created by roma on 15.06.15.
 */
public interface Cache<T> {
    String get();
    void put(T t);
    void clear();
    boolean isCached();
}
