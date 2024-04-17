package com.coffee.lovers.comercios.domain.persistence;

import com.coffee.lovers.comercios.domain.model.CoffeeStation;
import com.coffee.lovers.repository.GenericRepository;

import java.util.List;

public interface CoffeeStationPersistence extends GenericRepository<CoffeeStation> {
    List<CoffeeStation> getAllByCoffeeShopId(String coffeeShop);
}
