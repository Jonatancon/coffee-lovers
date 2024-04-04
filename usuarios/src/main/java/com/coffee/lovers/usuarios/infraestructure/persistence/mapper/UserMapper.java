package com.coffee.lovers.usuarios.infraestructure.persistence.mapper;

import com.coffee.lovers.usuarios.domain.model.User;
import com.coffee.lovers.usuarios.infraestructure.persistence.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper{
    User userEntityToUser(UserEntity userEntity);
    @Mapping(target = "id", ignore = true)
    UserEntity userToUserEntity(User user);
}
