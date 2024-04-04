package com.coffee.lovers.usuarios.infraestructure.persistence.repository;


import com.coffee.lovers.usuarios.domain.model.FinancialInstitution;
import com.coffee.lovers.usuarios.domain.repository.FinancialInstitutionRepository;
import com.coffee.lovers.usuarios.infraestructure.persistence.dao.FinancialInstitutionDao;
import com.coffee.lovers.usuarios.infraestructure.persistence.entity.FinancialInstitutionEntity;
import com.coffee.lovers.usuarios.infraestructure.persistence.mapper.FinancialInstitutionMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@AllArgsConstructor
@Repository
public class FinancialInstitutionRepositoryImpl implements FinancialInstitutionRepository {

    private final FinancialInstitutionDao dao;
    private final FinancialInstitutionMapper mapper;
    @Override
    public Optional<FinancialInstitution> save(FinancialInstitution financialInstitution) {
        return Optional.of(
                dao.save(mapper.financialInstitutionToFinancialInstitutionEntity(financialInstitution))
        ).map(mapper::financialInstitutionEntityTOFinancialInstitution);
    }

    @Override
    public Optional<FinancialInstitution> update(FinancialInstitution financialInstitution) {
        Optional<FinancialInstitutionEntity> entity = dao.findByName(financialInstitution.getName());
        entity.ifPresent(financialInstitutionEntity -> financialInstitution.setName(financialInstitutionEntity.getName()));

        return entity.map(dao::save).map(mapper::financialInstitutionEntityTOFinancialInstitution);
    }

    @Override
    public boolean delete(String key) {
        dao.findByName(key).ifPresent(dao::delete);

        return dao.existsByName(key);
    }

    @Override
    public Optional<FinancialInstitution> get(String key) {
        return dao.findByName(key).map(mapper::financialInstitutionEntityTOFinancialInstitution);
    }
}
