package com.coffee.lovers.empleados.adapters.persistence.repository;

import com.coffee.lovers.empleados.adapters.persistence.dao.EmployedDao;
import com.coffee.lovers.empleados.adapters.persistence.mapper.EmployedMapper;
import com.coffee.lovers.empleados.domain.model.Employed;
import com.coffee.lovers.empleados.domain.persistence.EmployedPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class EmployedRepository implements EmployedPersistencePort {
    private final EmployedDao dao;
    private final EmployedMapper mapper;


    @Override
    public Optional<Employed> save(Employed employed) {
        return Optional.of(dao.save(
                mapper.toEmployedEntity(employed)
        ))
                .map(mapper::toEmployed);
    }

    @Override
    public Optional<Employed> update(Employed employed) {
        return Optional.of(dao.save(
                        mapper.toEmployedEntity(employed)
                ))
                .map(mapper::toEmployed);
    }

    @Override
    public void delete(String key) {
        dao.deleteByIdentification(key);
    }

    @Override
    public Optional<Employed> get(String key) {
        return dao.findByIdentification(key)
                .map(mapper::toEmployed);
    }
}
