package com.coffee.lovers.usuarios.infraestructure.persistence.mapper;

import com.coffee.lovers.usuarios.domain.model.Operation;
import com.coffee.lovers.usuarios.infraestructure.persistence.entity.OperationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OperationMapper {
    Operation operationEntityToOperation(OperationEntity operationEntity);
    OperationEntity operationToOperationEntity(Operation operation);
}
