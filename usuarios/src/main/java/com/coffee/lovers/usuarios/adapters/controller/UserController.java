package com.coffee.lovers.usuarios.adapters.controller;

import com.coffee.lovers.model.request.Request;
import com.coffee.lovers.model.response.Response;
import com.coffee.lovers.usuarios.adapters.message.MessagesOk;
import com.coffee.lovers.usuarios.domain.api.UserApiPort;
import com.coffee.lovers.usuarios.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "user")
@RequiredArgsConstructor
public class UserController {
    private final UserApiPort userPort;
    private final MessagesOk messagesOk;

    @PostMapping
    public ResponseEntity<Response<User>> saveUser(@RequestBody Request<User> request) {
        return ResponseEntity.created(
                URI.create(buildResponse(
                        userPort.save(request.models().get(0)),
                        HttpStatus.CREATED
                ).models().get(0).getIdentification())
        ).build();
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Response<User>> getUser(@PathVariable String id) {
        return ResponseEntity.ok(
                buildResponse(
                        userPort.get(id),
                        HttpStatus.OK
                )
        );
    }

    @PutMapping
    public ResponseEntity<Response<User>> updateUser(@RequestBody Request<User> request){
        return ResponseEntity.created(
                URI.create(buildResponse(
                        userPort.update(request.models().get(0)),
                        HttpStatus.OK
                ).models().get(0).getIdentification())
        ).build();
    }


    private Response<User> buildResponse(User user, HttpStatus status){
        List<User> userList = new ArrayList<>();
        userList.add(user);
        return new Response<>(userList, messagesOk.getSuccess(), status.toString());
    }

}
