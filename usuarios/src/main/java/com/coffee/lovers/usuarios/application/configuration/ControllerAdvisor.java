package com.coffee.lovers.usuarios.application.configuration;

import com.coffee.lovers.model.ExceptionResponse;
import com.coffee.lovers.model.exception.NotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ControllerAdvice
@RequiredArgsConstructor
public class ControllerAdvisor {

    @ExceptionHandler(NotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ExceptionResponse handleNotFound(NotFound notFound){
        return new ExceptionResponse(notFound.getMessage(), HttpStatus.NOT_FOUND.toString(), LocalDateTime.now());
    }

}
