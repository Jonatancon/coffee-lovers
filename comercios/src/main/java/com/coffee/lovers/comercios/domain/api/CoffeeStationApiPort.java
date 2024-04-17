package com.coffee.lovers.comercios.domain.api;

import com.coffee.lovers.api.GenericApi;
import com.coffee.lovers.comercios.domain.model.CoffeeStation;

import java.util.List;

public interface CoffeeStationApiPort extends GenericApi<CoffeeStation> {
    List<CoffeeStation> getCoffeeStationsByCoffeeShop(String coffeeShop);
}
