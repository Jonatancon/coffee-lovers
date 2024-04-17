package com.coffee.lovers.comercios.domain.usecase;

import com.coffee.lovers.comercios.domain.api.CoffeeShopApiPort;
import com.coffee.lovers.comercios.domain.model.CoffeeShop;
import com.coffee.lovers.comercios.domain.service.CoffeeShopService;

public class CoffeeShopUseCase implements CoffeeShopApiPort {
    private final CoffeeShopService service;

    public CoffeeShopUseCase(CoffeeShopService service) {
        this.service = service;
    }

    @Override
    public CoffeeShop save(CoffeeShop coffeeShop) {
        return service.save(coffeeShop);
    }

    @Override
    public CoffeeShop update(CoffeeShop coffeeShop) {
        return service.update(coffeeShop);
    }

    @Override
    public void delete(String key) {
        service.delete(key);
    }

    @Override
    public CoffeeShop get(String key) {
        return service.get(key);
    }
}
