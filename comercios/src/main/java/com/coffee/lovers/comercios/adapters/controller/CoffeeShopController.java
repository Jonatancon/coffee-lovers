package com.coffee.lovers.comercios.adapters.controller;

import com.coffee.lovers.util.BuildResponse;
import com.coffee.lovers.comercios.adapters.message.MessagesOk;
import com.coffee.lovers.comercios.domain.api.CoffeeShopApiPort;
import com.coffee.lovers.comercios.domain.model.CoffeeShop;
import com.coffee.lovers.model.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "coffee-shop")
@RequiredArgsConstructor
public class CoffeeShopController {
    private final CoffeeShopApiPort port;
    private final MessagesOk messagesOk;

    @GetMapping(path = "{id}")
    public ResponseEntity<Response<CoffeeShop>> getCoffeeShop(@PathVariable("id") String id) {
        return ResponseEntity.ok(
                BuildResponse.buildResponse(
                        messagesOk.getSuccess(),
                        HttpStatus.OK.toString(),
                        List.of(port.get(id))
                )
        );
    }

    @PostMapping
    public ResponseEntity<Response<CoffeeShop>> createCoffeeShop(@RequestBody CoffeeShop coffeeShop) {
        return ResponseEntity.created(
                URI.create(
                        BuildResponse.buildResponse(messagesOk.getSuccess(),
                                HttpStatus.CREATED.toString(),
                                List.of(port.save(coffeeShop))
                        ).models().get(0).getId().toString()
                )
        ).build();
    }
}
