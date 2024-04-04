package com.coffee.lovers.usuarios.infraestructure.persistence.mapper;

import com.coffee.lovers.usuarios.domain.model.TypeAccount;
import com.coffee.lovers.usuarios.infraestructure.persistence.entity.TypeAccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TypeAccountMapper {
    TypeAccount typeAccountEntityToTypeAccount(TypeAccountEntity typeAccountEntity);
    TypeAccountEntity typeAccountToTypeAccountEntity(TypeAccount typeAccount);
}
