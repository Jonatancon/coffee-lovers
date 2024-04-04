package com.coffee.lovers.usuarios.infraestructure.persistence.mapper;

import com.coffee.lovers.usuarios.domain.model.Rol;
import com.coffee.lovers.usuarios.infraestructure.persistence.entity.RolEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RolMapper {
    Rol rolEntityToRol(RolEntity rolEntity);
    RolEntity rolToRolEntity(Rol rol);
}
