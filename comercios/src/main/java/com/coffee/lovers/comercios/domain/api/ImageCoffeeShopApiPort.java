package com.coffee.lovers.comercios.domain.api;

import com.coffee.lovers.api.GenericApi;
import com.coffee.lovers.comercios.domain.model.ImageCoffeeShop;

import java.util.List;

public interface ImageCoffeeShopApiPort extends GenericApi<ImageCoffeeShop> {
    List<ImageCoffeeShop> getAllImageCoffeeShopsByStationId(String stationId);
}
