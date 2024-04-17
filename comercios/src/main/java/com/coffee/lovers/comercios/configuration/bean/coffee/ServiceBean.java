package com.coffee.lovers.comercios.configuration.bean.coffee;

import com.coffee.lovers.comercios.adapters.message.MessagesError;
import com.coffee.lovers.comercios.domain.persistence.CoffeeShopPersistence;
import com.coffee.lovers.comercios.domain.persistence.CoffeeStationPersistence;
import com.coffee.lovers.comercios.domain.persistence.ImageCoffeeShopPersistence;
import com.coffee.lovers.comercios.domain.service.CoffeeShopService;
import com.coffee.lovers.comercios.domain.service.CoffeeStationService;
import com.coffee.lovers.comercios.domain.service.ImageCoffeeShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ServiceBean {
    @Bean
    public CoffeeShopService coffeeShopService(CoffeeShopPersistence persistence, MessagesError messagesError) {
        return new CoffeeShopService(persistence, messagesError);
    }
    @Bean
    public CoffeeStationService coffeeStationService(CoffeeStationPersistence persistence, MessagesError messagesError) {
        return new CoffeeStationService(persistence, messagesError);
    }

    @Bean
    public ImageCoffeeShopService imageCoffeeShopService(ImageCoffeeShopPersistence persistence) {
        return new ImageCoffeeShopService(persistence);
    }
}
