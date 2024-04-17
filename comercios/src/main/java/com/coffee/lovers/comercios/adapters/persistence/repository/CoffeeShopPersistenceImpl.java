package com.coffee.lovers.comercios.adapters.persistence.repository;

import com.coffee.lovers.comercios.adapters.persistence.dao.CoffeeShopDao;
import com.coffee.lovers.comercios.adapters.persistence.mapper.CoffeeShopMapper;
import com.coffee.lovers.comercios.domain.model.CoffeeShop;
import com.coffee.lovers.comercios.domain.persistence.CoffeeShopPersistence;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CoffeeShopPersistenceImpl implements CoffeeShopPersistence {
    private final CoffeeShopMapper mapper;
    private final CoffeeShopDao dao;
    @Override
    public Optional<CoffeeShop> save(CoffeeShop coffeeShop) {
        return Optional.of(
                dao.save(
                        mapper.toCoffeeShopEntity(coffeeShop)
                )
        ).map(mapper::toCoffeeShop);
    }

    @Override
    public Optional<CoffeeShop> update(CoffeeShop coffeeShop) {
        return Optional.of(
                dao.save(
                        mapper.toCoffeeShopEntity(coffeeShop)
                )
        ).map(mapper::toCoffeeShop);
    }

    @Override
    public void delete(String key) {
        dao.deleteById(Integer.parseInt(key));
    }

    @Override
    public Optional<CoffeeShop> get(String key) {
        return dao.findById(Integer.parseInt(key))
                .map(mapper::toCoffeeShop);
    }
}
