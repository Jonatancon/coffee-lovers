package com.coffee.lovers.service;

import java.util.Optional;
import java.util.stream.Stream;

public interface GenericService <T> {
    T save(T t);
    T update(T t);
    void delete(String key);
    T get(String key);
}
