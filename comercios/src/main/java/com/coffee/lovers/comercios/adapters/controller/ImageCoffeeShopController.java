package com.coffee.lovers.comercios.adapters.controller;

import com.coffee.lovers.comercios.adapters.message.MessagesOk;
import com.coffee.lovers.comercios.domain.api.ImageCoffeeShopApiPort;
import com.coffee.lovers.comercios.domain.model.ImageCoffeeShop;
import com.coffee.lovers.model.response.Response;
import com.coffee.lovers.util.BuildResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "image-coffee")
@RequiredArgsConstructor
public class ImageCoffeeShopController {
    private final MessagesOk messagesOk;
    private final ImageCoffeeShopApiPort port;


    @PostMapping
    public ResponseEntity<Response<ImageCoffeeShop>> createImageCoffeeShop(@RequestBody ImageCoffeeShop imageCoffeeShop) {
        return ResponseEntity.created(
                URI.create(
                        BuildResponse.buildResponse(
                                messagesOk.getSuccess(),
                                HttpStatus.CREATED.toString(),
                                List.of(port.save(imageCoffeeShop))
                        ).models().get(0).getId().toString()
                )
        ).build();
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Response<ImageCoffeeShop>> getAllImageCoffeeShop(@PathVariable String id) {
        return ResponseEntity.ok(
                BuildResponse.buildResponse(
                        messagesOk.getSuccess(),
                        HttpStatus.OK.toString(),
                        port.getAllImageCoffeeShopsByStationId(id)
                )
        );
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Response<ImageCoffeeShop>> deleteImageCoffeeShop(@PathVariable("id") String id) {
        port.delete(id);
        return ResponseEntity.noContent().build();
    }
}
