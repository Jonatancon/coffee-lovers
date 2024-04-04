package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.Module;
import com.coffee.lovers.usuarios.domain.repository.ModuleRepository;
import com.coffee.lovers.usuarios.infraestructure.persistence.dao.ModuleDao;
import com.coffee.lovers.usuarios.infraestructure.persistence.mapper.ModuleMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@AllArgsConstructor
@Repository
public class ModuleRepositoryImpl implements ModuleRepository {
    private final ModuleDao dao;
    private final ModuleMapper mapper;

    @Override
    public Optional<Module> save(Module module) {
        return Optional.of(
                dao.save(mapper.moduleToModuleEntity(module))
        ).map(mapper::moduleEntityToModule);
    }

    @Override
    public Optional<Module> update(Module module) {
        return save(module);
    }

    @Override
    public boolean delete(String key) {
        dao.findById(Integer.parseInt(key)).ifPresent(dao::delete);

        return dao.existsById(Integer.parseInt(key));
    }

    @Override
    public Optional<Module> get(String key) {
        return dao.findById(Integer.parseInt(key)).map(mapper::moduleEntityToModule);
    }

    @Override
    public Stream<Module> getAll() {
        return dao.findAll().stream().map(mapper::moduleEntityToModule);
    }
}
