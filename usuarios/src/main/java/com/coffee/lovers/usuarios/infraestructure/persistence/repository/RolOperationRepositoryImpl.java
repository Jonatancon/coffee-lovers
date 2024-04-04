package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.RolOperation;
import com.coffee.lovers.usuarios.domain.repository.RolOperationRepository;
import com.coffee.lovers.usuarios.infraestructure.persistence.dao.RolOperationDao;
import com.coffee.lovers.usuarios.infraestructure.persistence.mapper.RolOperationMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@Repository
@AllArgsConstructor
public class RolOperationRepositoryImpl implements RolOperationRepository {
    private final RolOperationDao dao;
    private final RolOperationMapper mapper;

    @Override
    public Optional<RolOperation> save(RolOperation rolOperation) {
        return Optional.of(
                dao.save(mapper.rolOperationToRolOperationEntity(rolOperation))
        ).map(mapper::roloperationEntityToRolOperation);
    }

    @Override
    public Optional<RolOperation> update(RolOperation rolOperation) {
        return save(rolOperation);
    }

    @Override
    public boolean delete(String key) {
        dao.findById(Integer.parseInt(key)).ifPresent(dao::delete);

        return dao.existsById(Integer.parseInt(key));
    }

    @Override
    public Optional<RolOperation> get(String key) {
        return dao.findById(Integer.parseInt(key)).map(mapper::roloperationEntityToRolOperation);
    }

    @Override
    public Stream<RolOperation> getAll() {
        return dao.findAll().stream().map(mapper::roloperationEntityToRolOperation);
    }
}
