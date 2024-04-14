package com.coffee.lovers.usuarios.adapters.persistence.mapper;

import com.coffee.lovers.usuarios.adapters.persistence.entity.ImageEntity;
import com.coffee.lovers.usuarios.domain.model.ImageUser;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ImageMapper {
    ImageUser imageEntityToImageUser(ImageEntity imageEntity);
    ImageEntity imageUserToImageEntity(ImageUser imageUser);
}
