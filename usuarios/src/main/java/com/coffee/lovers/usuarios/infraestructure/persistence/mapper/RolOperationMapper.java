package com.coffee.lovers.usuarios.infraestructure.persistence.mapper;

import com.coffee.lovers.usuarios.domain.model.RolOperation;
import com.coffee.lovers.usuarios.infraestructure.persistence.entity.RolOperationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RolOperationMapper {
    RolOperation roloperationEntityToRolOperation(RolOperationEntity rolOperationEntity);
    RolOperationEntity rolOperationToRolOperationEntity(RolOperation rolOperation);
}
