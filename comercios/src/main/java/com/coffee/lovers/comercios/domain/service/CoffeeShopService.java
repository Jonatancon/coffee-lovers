package com.coffee.lovers.comercios.domain.service;

import com.coffee.lovers.comercios.adapters.message.MessagesError;
import com.coffee.lovers.comercios.domain.model.CoffeeShop;
import com.coffee.lovers.comercios.domain.persistence.CoffeeShopPersistence;
import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;

public class CoffeeShopService extends AbstractGenericServiceImpl<CoffeeShop> {
    private final CoffeeShopPersistence persistence;
    private final MessagesError messagesError;

    public CoffeeShopService(CoffeeShopPersistence persistence, MessagesError messagesError) {
        this.persistence = persistence;
        this.messagesError = messagesError;
    }

    @Override
    protected GenericRepository<CoffeeShop> getRepository() {
        return persistence;
    }
}
