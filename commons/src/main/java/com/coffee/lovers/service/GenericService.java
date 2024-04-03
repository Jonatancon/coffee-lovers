package com.coffee.lovers.service;

import java.util.Optional;
import java.util.stream.Stream;

public interface GenericService <T> {
    Optional<T> save(T t);
    Optional<T> update(T t);
    boolean delete(String key);
    Optional<T> get(String key);
}
