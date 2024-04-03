package com.coffee.lovers.repository;

import java.util.Optional;
import java.util.stream.Stream;

public interface GenericRepository <T>{
    Optional<T> save(T t);
    Optional<T> update(T t);
    boolean delete(String key);
    Optional<T> get(String key);
}
