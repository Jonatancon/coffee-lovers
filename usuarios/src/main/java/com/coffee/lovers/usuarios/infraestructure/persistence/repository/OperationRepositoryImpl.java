package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.Operation;
import com.coffee.lovers.usuarios.domain.repository.OperationRepository;
import com.coffee.lovers.usuarios.infraestructure.persistence.dao.OperationDao;
import com.coffee.lovers.usuarios.infraestructure.persistence.mapper.OperationMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@AllArgsConstructor
@Repository
public class OperationRepositoryImpl implements OperationRepository {
    private final OperationDao dao;
    private final OperationMapper mapper;

    @Override
    public Optional<Operation> save(Operation operation) {
        return Optional.of(
                dao.save(mapper.operationToOperationEntity(operation))
        ).map(mapper::operationEntityToOperation);
    }

    @Override
    public Optional<Operation> update(Operation operation) {
        return save(operation);
    }

    @Override
    public boolean delete(String key) {
        dao.findById(Integer.parseInt(key)).ifPresent(dao::delete);

        return dao.existsById(Integer.parseInt(key));
    }

    @Override
    public Optional<Operation> get(String key) {
        return dao.findById(Integer.parseInt(key)).map(mapper::operationEntityToOperation);
    }

    @Override
    public Stream<Operation> getAll() {
        return dao.findAll().stream().map(mapper::operationEntityToOperation);
    }
}
