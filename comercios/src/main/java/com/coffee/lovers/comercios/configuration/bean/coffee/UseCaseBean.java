package com.coffee.lovers.comercios.configuration.bean.coffee;

import com.coffee.lovers.comercios.domain.service.CoffeeShopService;
import com.coffee.lovers.comercios.domain.service.CoffeeStationService;
import com.coffee.lovers.comercios.domain.service.ImageCoffeeShopService;
import com.coffee.lovers.comercios.domain.usecase.CoffeeShopUseCase;
import com.coffee.lovers.comercios.domain.usecase.CoffeeStationUseCase;
import com.coffee.lovers.comercios.domain.usecase.ImageCoffeeShopUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class UseCaseBean {
    @Bean
    public CoffeeShopUseCase coffeeShopUseCase(CoffeeShopService service) {
        return new CoffeeShopUseCase(service);
    }

    @Bean
    public CoffeeStationUseCase coffeeStationUseCase(CoffeeStationService service) {
        return new CoffeeStationUseCase(service);
    }

    @Bean
    public ImageCoffeeShopUseCase imageCoffeeShopUseCase(ImageCoffeeShopService service) {
        return new ImageCoffeeShopUseCase(service);
    }
}
