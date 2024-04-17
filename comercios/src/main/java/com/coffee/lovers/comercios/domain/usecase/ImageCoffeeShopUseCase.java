package com.coffee.lovers.comercios.domain.usecase;

import com.coffee.lovers.comercios.domain.api.ImageCoffeeShopApiPort;
import com.coffee.lovers.comercios.domain.model.ImageCoffeeShop;
import com.coffee.lovers.comercios.domain.service.ImageCoffeeShopService;

import java.util.List;

public class ImageCoffeeShopUseCase implements ImageCoffeeShopApiPort {
    private final ImageCoffeeShopService service;

    public ImageCoffeeShopUseCase(ImageCoffeeShopService service) {
        this.service = service;
    }

    @Override
    public ImageCoffeeShop save(ImageCoffeeShop imageCoffeeShop) {
        return service.save(imageCoffeeShop);
    }

    @Override
    public ImageCoffeeShop update(ImageCoffeeShop imageCoffeeShop) {
        return service.update(imageCoffeeShop);
    }

    @Override
    public void delete(String key) {
        service.delete(key);
    }

    @Override
    public ImageCoffeeShop get(String key) {
        return service.get(key);
    }

    @Override
    public List<ImageCoffeeShop> getAllImageCoffeeShopsByStationId(String stationId) {
        return service.getAllByStationId(stationId);
    }
}
