package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.TypeAccount;
import com.coffee.lovers.usuarios.domain.repository.TypeAccountRepository;
import com.coffee.lovers.usuarios.infraestructure.persistence.dao.TypeAccountDao;
import com.coffee.lovers.usuarios.infraestructure.persistence.mapper.TypeAccountMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@AllArgsConstructor
@Repository
public class TypeAccountRepositoryImpl implements TypeAccountRepository {
    private final TypeAccountDao dao;
    private final TypeAccountMapper mapper;

    @Override
    public Optional<TypeAccount> save(TypeAccount typeAccount) {
        return Optional.of(
                dao.save(mapper.typeAccountToTypeAccountEntity(typeAccount))
        ).map(mapper::typeAccountEntityToTypeAccount);
    }

    @Override
    public Optional<TypeAccount> update(TypeAccount typeAccount) {
        return save(typeAccount);
    }

    @Override
    public boolean delete(String key) {
        dao.findById(Integer.parseInt(key)).ifPresent(dao::delete);
        return dao.existsById(Integer.parseInt(key));
    }

    @Override
    public Optional<TypeAccount> get(String key) {
        return dao.findById(Integer.parseInt(key)).map(mapper::typeAccountEntityToTypeAccount);
    }

    @Override
    public Stream<TypeAccount> getAll() {
        return dao.findAll().stream().map(mapper::typeAccountEntityToTypeAccount);
    }
}
