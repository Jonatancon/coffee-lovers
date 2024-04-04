package com.coffee.lovers.usuarios.domain.usecase;

import com.coffee.lovers.usuarios.domain.api.UserPort;
import com.coffee.lovers.usuarios.domain.model.User;
import com.coffee.lovers.usuarios.domain.service.UserService;

public class UserUseCase implements UserPort {
    private final UserService service;

    public UserUseCase(UserService service) {
        this.service = service;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public User get(String key) {
        return null;
    }
}
