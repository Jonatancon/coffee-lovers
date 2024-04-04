package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.Account;
import com.coffee.lovers.usuarios.domain.repository.AccountRepository;
import com.coffee.lovers.usuarios.infraestructure.persistence.dao.AccountDao;
import com.coffee.lovers.usuarios.infraestructure.persistence.entity.AccountEntity;
import com.coffee.lovers.usuarios.infraestructure.persistence.mapper.AccountMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@AllArgsConstructor
@Repository
public class AccountRepositoryImpl implements AccountRepository {
    private final AccountDao dao;
    private final AccountMapper mapper;

    @Override
    public Optional<Account> save(Account account) {
        return Optional.of(
                mapper.accountEntityToAccount(
                        dao.save(mapper.accountToAccountEntity(account))
                )
        );
    }

    @Override
    public Optional<Account> update(Account account) {
        AccountEntity update = mapper.accountToAccountEntity(account);
        Optional<AccountEntity> entity = dao.findByNumberAccount(account.getNumberAccount());

        entity.ifPresent(accountEntity -> update.setId(accountEntity.getId()));

        return Optional.of(
                mapper.accountEntityToAccount(update)
        );
    }

    @Override
    public boolean delete(String key) {
        dao.findByNumberAccount(key).ifPresent(dao::delete);

        return dao.existsByNumberAccount(key);
    }

    @Override
    public Optional<Account> get(String key) {
        return dao.findByNumberAccount(key).map(mapper::accountEntityToAccount);
    }

    @Override
    public Stream<Account> getAllAccountByUser(String identification) {
        return dao.findAllByUser_Identification(identification)
                .map(mapper::accountEntityToAccount);
    }
}
