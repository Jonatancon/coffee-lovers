package com.coffee.lovers.comercios.domain.service;

import com.coffee.lovers.comercios.domain.model.ImageCoffeeShop;
import com.coffee.lovers.comercios.domain.persistence.ImageCoffeeShopPersistence;
import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;

import java.util.List;

public class ImageCoffeeShopService extends AbstractGenericServiceImpl<ImageCoffeeShop> {
    private final ImageCoffeeShopPersistence persistence;

    public ImageCoffeeShopService(ImageCoffeeShopPersistence persistence) {
        this.persistence = persistence;
    }

    @Override
    protected GenericRepository<ImageCoffeeShop> getRepository() {
        return this.persistence;
    }

    public List<ImageCoffeeShop> getAllByStationId(String stationId) {
        return persistence.getAllByIdStation(stationId);
    }
}
