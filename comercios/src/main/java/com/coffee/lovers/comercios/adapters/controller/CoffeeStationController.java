package com.coffee.lovers.comercios.adapters.controller;

import com.coffee.lovers.util.BuildResponse;
import com.coffee.lovers.comercios.adapters.message.MessagesOk;
import com.coffee.lovers.comercios.domain.api.CoffeeStationApiPort;
import com.coffee.lovers.comercios.domain.model.CoffeeStation;
import com.coffee.lovers.model.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "coffee-station")
@RequiredArgsConstructor
public class CoffeeStationController {
    private final CoffeeStationApiPort port;
    private final MessagesOk messagesOk;

    @GetMapping(path = "{id}")
    public ResponseEntity<Response<CoffeeStation>> getCoffeeStation(@PathVariable String id) {
        return ResponseEntity.ok(
                BuildResponse.buildResponse(
                        messagesOk.getSuccess(),
                        HttpStatus.OK.toString(),
                        List.of(port.get(id))
                )
        );
    }

    @PostMapping
    public ResponseEntity<Response<CoffeeStation>> createCoffeeStation(@RequestBody CoffeeStation coffeeStation) {
        return ResponseEntity.created(
                URI.create(
                        BuildResponse.buildResponse(
                                messagesOk.getSuccess(),
                                HttpStatus.CREATED.toString(),
                                List.of(port.save(coffeeStation))
                                ).models().get(0).getId().toString()
                )
        ).build();
    }

    @PutMapping
    public ResponseEntity<Response<CoffeeStation>> updateCoffeeStation(@RequestBody CoffeeStation coffeeStation) {
        return ResponseEntity.ok(
                BuildResponse.buildResponse(
                        messagesOk.getSuccess(),
                        HttpStatus.OK.toString(),
                        List.of(port.update(coffeeStation))
                )
        );
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<String> deleteCoffeeStation(@PathVariable String id) {
        port.delete(id);
        return ResponseEntity.ok(messagesOk.getSuccess());
    }

    @GetMapping(path = "stations/{id}")
    public ResponseEntity<Response<CoffeeStation>> getAllCoffeeStations(@PathVariable String id) {
        return ResponseEntity.ok(
                BuildResponse.buildResponse(
                        messagesOk.getSuccess(),
                        HttpStatus.OK.toString(),
                        port.getCoffeeStationsByCoffeeShop(id)
                )
        );
    }

}
