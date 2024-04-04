package com.coffee.lovers.usuarios.infraestructure.persistence.dao;

import com.coffee.lovers.usuarios.infraestructure.persistence.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.stream.Stream;

public interface AccountDao extends JpaRepository<AccountEntity, Integer> {
    Optional<AccountEntity> findByNumberAccount(String numberAccount);
    boolean existsByNumberAccount(String numberAccount);
    Stream<AccountEntity> findAllByUser_Identification(String userIdentification);
}
