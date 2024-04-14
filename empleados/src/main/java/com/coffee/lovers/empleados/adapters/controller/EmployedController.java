package com.coffee.lovers.empleados.adapters.controller;

import com.coffee.lovers.empleados.adapters.message.MessagesOk;
import com.coffee.lovers.empleados.domain.api.EmployedApiPort;
import com.coffee.lovers.empleados.domain.model.Employed;
import com.coffee.lovers.model.request.Request;
import com.coffee.lovers.model.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "employed")
@RequiredArgsConstructor
public class EmployedController {
    private final EmployedApiPort port;
    private final MessagesOk messagesOk;

    @PostMapping
    public ResponseEntity<Response<Employed>> saveUser(@RequestBody Request<Employed> request) {
        return ResponseEntity.created(
                URI.create(buildResponse(
                        port.save(request.models().get(0)),
                        HttpStatus.CREATED
                ).models().get(0).getIdentification())
        ).build();
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Response<Employed>> getUser(@PathVariable String id) {
        return ResponseEntity.ok(
                buildResponse(
                        port.get(id),
                        HttpStatus.OK
                )
        );
    }

    @PutMapping
    public ResponseEntity<Response<Employed>> updateUser(@RequestBody Request<Employed> request){
        return ResponseEntity.created(
                URI.create(buildResponse(
                        port.update(request.models().get(0)),
                        HttpStatus.OK
                ).models().get(0).getIdentification())
        ).build();
    }


    private Response<Employed> buildResponse(Employed employed, HttpStatus status){
        List<Employed> userList = new ArrayList<>();
        userList.add(employed);
        return new Response<>(userList, messagesOk.getSuccess(), status.toString());
    }
}
