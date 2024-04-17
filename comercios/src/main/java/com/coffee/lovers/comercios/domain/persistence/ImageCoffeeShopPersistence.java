package com.coffee.lovers.comercios.domain.persistence;

import com.coffee.lovers.comercios.domain.model.ImageCoffeeShop;
import com.coffee.lovers.repository.GenericRepository;

import java.util.List;

public interface ImageCoffeeShopPersistence extends GenericRepository<ImageCoffeeShop> {
    List<ImageCoffeeShop> getAllByIdStation(String stationId);
}
