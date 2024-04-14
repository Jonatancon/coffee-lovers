package com.coffee.lovers.usuarios.domain.usecase;

import com.coffee.lovers.usuarios.domain.api.UserApiPort;
import com.coffee.lovers.usuarios.domain.model.User;
import com.coffee.lovers.usuarios.domain.service.UserService;

import java.util.Optional;

public class UserUseCase implements UserApiPort{
    private final UserService service;

    public UserUseCase(UserService service) {
        this.service = service;
    }


    @Override
    public User save(User user) {
        return service.save(user);
    }

    @Override
    public User update(User user) {
        return service.update(user);
    }

    @Override
    public void delete(String key) {
        service.delete(key);
    }

    @Override
    public User get(String key) {
        return service.get(key);
    }
}
