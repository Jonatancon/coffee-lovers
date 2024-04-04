package com.coffee.lovers.usuarios.infraestructure.persistence.mapper;

import com.coffee.lovers.usuarios.domain.model.Account;
import com.coffee.lovers.usuarios.infraestructure.persistence.entity.AccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    Account accountEntityToAccount(AccountEntity accountEntity);
    @Mapping(target = "id", ignore = true)
    AccountEntity accountToAccountEntity(Account account);

}
