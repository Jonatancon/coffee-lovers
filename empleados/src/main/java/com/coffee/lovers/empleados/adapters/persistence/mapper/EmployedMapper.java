package com.coffee.lovers.empleados.adapters.persistence.mapper;

import com.coffee.lovers.empleados.adapters.persistence.entity.EmployedEntity;
import com.coffee.lovers.empleados.domain.model.Employed;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = ImageMapper.class)
public interface EmployedMapper {

    @Mappings({
            @Mapping(target = "image.id", source = "image.id"),
            @Mapping(target = "image.url", source = "image.url")
    })
    Employed toEmployed(EmployedEntity employedEntity);
    @InheritInverseConfiguration
    EmployedEntity toEmployedEntity(Employed employed);
}
