package com.coffee.lovers.comercios.adapters.persistence.repository;

import com.coffee.lovers.comercios.adapters.message.MessagesError;
import com.coffee.lovers.comercios.adapters.persistence.dao.CoffeeShopDao;
import com.coffee.lovers.comercios.adapters.persistence.dao.CoffeeStationDao;
import com.coffee.lovers.comercios.adapters.persistence.entity.CoffeeShopEntity;
import com.coffee.lovers.comercios.adapters.persistence.entity.CoffeeStationEntity;
import com.coffee.lovers.comercios.adapters.persistence.mapper.CoffeeStationMapper;
import com.coffee.lovers.comercios.domain.model.CoffeeStation;
import com.coffee.lovers.comercios.domain.persistence.CoffeeStationPersistence;
import com.coffee.lovers.model.exception.NotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class CoffeeStationPersistenceImpl implements CoffeeStationPersistence {
    private final CoffeeStationDao dao;
    private final CoffeeStationMapper mapper;
    private final CoffeeShopDao shopDao;
    private final MessagesError messagesError;

    @Override
    public Optional<CoffeeStation> save(CoffeeStation coffeeStation) {
        CoffeeShopEntity shop = shopDao.findById(Integer.parseInt(coffeeStation.getCoffeeShopId()))
                .orElseThrow(() -> new NotFound(messagesError.getNotFound()));

        CoffeeStationEntity entity =  mapper.toCoffeeStationEntity(coffeeStation);
        entity.setCoffeeShop(shop);

        return Optional
                .of(dao.save(entity))
                .map(mapper::toCoffeeStation);
    }

    @Override
    public Optional<CoffeeStation> update(CoffeeStation coffeeStation) {
        CoffeeShopEntity shop = shopDao.findById(Integer.parseInt(coffeeStation.getCoffeeShopId()))
                .orElseThrow(() -> new NotFound(messagesError.getNotFound()));

        CoffeeStationEntity entity =  mapper.toCoffeeStationEntity(coffeeStation);
        entity.setCoffeeShop(shop);

        return Optional
                .of(dao.save(entity))
                .map(mapper::toCoffeeStation);
    }

    @Override
    public void delete(String key) {
        dao.deleteById(Integer.parseInt(key));
    }

    @Override
    public Optional<CoffeeStation> get(String key) {
        return dao.findById(Integer.parseInt(key))
                .map(entity -> {
                    CoffeeStation coffeeStation = mapper.toCoffeeStation(entity);
                    coffeeStation.setCoffeeShopId(entity.getCoffeeShop().getId().toString());
                    return coffeeStation;
                });
    }

    @Override
    public List<CoffeeStation> getAllByCoffeeShopId(String coffeeShop) {
        return dao.findAllByCoffeeShopId(Integer.parseInt(coffeeShop))
                .map(mapper::toCoffeeStation)
                .toList();
    }
}
