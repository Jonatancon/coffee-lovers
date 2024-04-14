package com.coffee.lovers.usuarios.adapters.persistence.repository;

import com.coffee.lovers.usuarios.adapters.persistence.dao.UserDao;
import com.coffee.lovers.usuarios.adapters.persistence.mapper.UserMapper;
import com.coffee.lovers.usuarios.domain.model.User;
import com.coffee.lovers.usuarios.domain.persistence.UserPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepository implements UserPersistencePort {
    private final UserDao dao;
    private final UserMapper mapper;

    @Override
    public Optional<User> save(User user) {
        return Optional.of(dao.save(
                mapper.userToUserEntity(user)
        ))
                .map(mapper::userEntityToUser);
    }

    @Override
    public Optional<User> update(User user) {
        return Optional.of(dao.save(
                        mapper.userToUserEntity(user)
                ))
                .map(mapper::userEntityToUser);
    }

    @Override
    public void delete(String key) {
        dao.deleteByIdentification(key);
    }

    @Override
    public Optional<User> get(String key) {
        return dao.findByIdentification(key)
                .map(mapper::userEntityToUser);
    }
}
