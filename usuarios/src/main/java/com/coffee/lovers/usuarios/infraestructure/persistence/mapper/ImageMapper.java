package com.coffee.lovers.usuarios.infraestructure.persistence.mapper;

import com.coffee.lovers.usuarios.domain.model.Image;
import com.coffee.lovers.usuarios.infraestructure.persistence.entity.ImageEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImageMapper {
    Image imageEntityToImage(ImageEntity imageEntity);
    ImageEntity imageToImageEntity(Image image);
}
