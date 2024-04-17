package com.coffee.lovers.comercios.domain.service;

import com.coffee.lovers.comercios.adapters.message.MessagesError;
import com.coffee.lovers.comercios.domain.model.CoffeeStation;
import com.coffee.lovers.comercios.domain.persistence.CoffeeStationPersistence;
import com.coffee.lovers.model.exception.Conflict;
import com.coffee.lovers.model.exception.NotFound;
import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;

import java.util.List;

public class CoffeeStationService extends AbstractGenericServiceImpl<CoffeeStation> {
    private final CoffeeStationPersistence persistence;
    private final MessagesError messagesError;

    public CoffeeStationService(CoffeeStationPersistence persistence, MessagesError messagesError) {
        this.persistence = persistence;
        this.messagesError = messagesError;
    }

    @Override
    protected GenericRepository<CoffeeStation> getRepository() {
        return this.persistence;
    }

    @Override
    public CoffeeStation update(CoffeeStation coffeeStation) {
       return getRepository().get(coffeeStation.getId().toString())
               .map(user1 -> getRepository().update(coffeeStation)
                       .orElseThrow(() -> new Conflict(messagesError.getError())))
               .orElseThrow(() -> new NotFound(messagesError.getNotFound()));
    }

    public List<CoffeeStation> getAllByCoffeeShop(String coffeeShop) {
        return persistence.getAllByCoffeeShopId(coffeeShop);
    }
}
