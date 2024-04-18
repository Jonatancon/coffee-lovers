package com.coffee.lovers.authserver.domain.persistence;

import com.coffee.lovers.authserver.domain.model.Auth;

import java.util.Optional;

public interface AuthPersistence {
    Optional<Auth> dataUser(Auth credential);
    Optional<Auth> dataEmployed(Auth credential);
    Optional<Auth> dataCoffeeShop(Auth credential);
}
