package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.Rol;
import com.coffee.lovers.usuarios.domain.repository.RolRepository;
import com.coffee.lovers.usuarios.infraestructure.persistence.dao.RolDao;
import com.coffee.lovers.usuarios.infraestructure.persistence.mapper.RolMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@Repository
@AllArgsConstructor
public class RolRepositoryImpl implements RolRepository {
    private final RolDao dao;
    private final RolMapper mapper;

    @Override
    public Optional<Rol> save(Rol rol) {
        return Optional.of(
                dao.save(mapper.rolToRolEntity(rol))
        ).map(mapper::rolEntityToRol);
    }

    @Override
    public Optional<Rol> update(Rol rol) {
        return save(rol);
    }

    @Override
    public boolean delete(String key) {
        dao.findById(Integer.parseInt(key)).ifPresent(dao::delete);
        return dao.existsById(Integer.parseInt(key));
    }

    @Override
    public Optional<Rol> get(String key) {
        return dao.findById(Integer.parseInt(key)).map(mapper::rolEntityToRol);
    }

    @Override
    public Stream<Rol> getAll() {
        return dao.findAll().stream().map(mapper::rolEntityToRol);
    }
}
