package com.coffee.lovers.api;

public interface GenericApi <T>{
    T save(T t);
    T update(T t);
    void delete(String key);
    T get(String key);
}
