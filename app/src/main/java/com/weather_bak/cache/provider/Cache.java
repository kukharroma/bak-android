package com.weather_bak.cache.provider;

/**
 * Created by roma on 15.06.15.
 */
public interface Cache<T> {
    T get();
    void put(T t);
    void clear();
    boolean isCached();
}
