package com.coffee.lovers.usuarios.infraestructure.persistence.mapper;

import com.coffee.lovers.usuarios.domain.model.FinancialInstitution;
import com.coffee.lovers.usuarios.infraestructure.persistence.entity.FinancialInstitutionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FinancialInstitutionMapper {
    FinancialInstitution financialInstitutionEntityTOFinancialInstitution(FinancialInstitutionEntity financialInstitutionEntity);
    @Mapping(target = "id", ignore = true)
    FinancialInstitutionEntity financialInstitutionToFinancialInstitutionEntity(FinancialInstitution financialInstitution);
}
