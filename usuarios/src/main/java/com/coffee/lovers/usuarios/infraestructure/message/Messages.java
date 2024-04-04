package com.coffee.lovers.usuarios.infraestructure.message;

import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@AllArgsConstructor
public class Messages {
    private final MessageSource messageSource;
    public  String getSuccess(){
        return messageSource.getMessage("description.generic.success", null, Locale.getDefault());
    }
}
