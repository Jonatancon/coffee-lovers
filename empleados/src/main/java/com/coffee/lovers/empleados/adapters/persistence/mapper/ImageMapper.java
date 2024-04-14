package com.coffee.lovers.empleados.adapters.persistence.mapper;

import com.coffee.lovers.empleados.adapters.persistence.entity.ImageEntity;
import com.coffee.lovers.empleados.domain.model.Image;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ImageMapper {

    Image toImage(ImageEntity imageEntity);
    @InheritInverseConfiguration
    ImageEntity toImageEntity(Image image);
}
