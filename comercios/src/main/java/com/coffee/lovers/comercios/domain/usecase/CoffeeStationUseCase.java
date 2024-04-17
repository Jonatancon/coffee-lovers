package com.coffee.lovers.comercios.domain.usecase;

import com.coffee.lovers.comercios.domain.api.CoffeeStationApiPort;
import com.coffee.lovers.comercios.domain.model.CoffeeStation;
import com.coffee.lovers.comercios.domain.service.CoffeeStationService;

import java.util.List;

public class CoffeeStationUseCase implements CoffeeStationApiPort {
    private final CoffeeStationService service;

    public CoffeeStationUseCase(CoffeeStationService service) {
        this.service = service;
    }

    @Override
    public CoffeeStation save(CoffeeStation coffeeStation) {
        return service.save(coffeeStation);
    }

    @Override
    public CoffeeStation update(CoffeeStation coffeeStation) {
        return service.update(coffeeStation);
    }

    @Override
    public void delete(String key) {
        service.delete(key);
    }

    @Override
    public CoffeeStation get(String key) {
        return service.get(key);
    }

    @Override
    public List<CoffeeStation> getCoffeeStationsByCoffeeShop(String coffeeShop) {
        return service.getAllByCoffeeShop(coffeeShop);
    }
}
