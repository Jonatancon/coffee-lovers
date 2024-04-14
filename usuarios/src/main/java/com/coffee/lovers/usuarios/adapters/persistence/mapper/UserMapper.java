package com.coffee.lovers.usuarios.adapters.persistence.mapper;


import com.coffee.lovers.usuarios.adapters.persistence.entity.UserEntity;
import com.coffee.lovers.usuarios.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ImageMapper.class})
public interface UserMapper {
    @Mappings({
            @Mapping(target = "imageUser.id", source = "image.id"),
            @Mapping(target = "imageUser.url", source = "image.url")
    })
    User userEntityToUser(UserEntity userEntity);
    @Mappings({
            @Mapping(target = "image.id", source = "imageUser.id"),
            @Mapping(target = "image.url", source = "imageUser.url")
    })
    UserEntity userToUserEntity(User user);
}
