package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.User;
import com.coffee.lovers.usuarios.domain.repository.UserRepository;
import com.coffee.lovers.usuarios.infraestructure.persistence.dao.UserDao;
import com.coffee.lovers.usuarios.infraestructure.persistence.entity.UserEntity;
import com.coffee.lovers.usuarios.infraestructure.persistence.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@AllArgsConstructor
@Repository
public class UserRepositoryImpl implements UserRepository {
    private final UserDao dao;
    private final UserMapper mapper;

    @Override
    public Optional<User> save(User user) {
        return Optional.of(
                dao.save(mapper.userToUserEntity(user))
        ).map(mapper::userEntityToUser);
    }

    @Override
    public Optional<User> update(User user) {
        UserEntity update = mapper.userToUserEntity(user);
        Optional<UserEntity> entity = dao.findByIdentification(user.getIdentification());
        entity.ifPresent(userEntity -> update.setId(userEntity.getId()));

        return Optional.of(
                dao.save(update)
        ).map(mapper::userEntityToUser);
    }

    @Override
    public boolean delete(String key) {
        dao.findByIdentification(key).ifPresent(dao::delete);

        return dao.findByIdentification(key).isPresent();
    }

    @Override
    public Optional<User> get(String key) {
        return dao.findByIdentification(key).map(mapper::userEntityToUser);
    }
}
