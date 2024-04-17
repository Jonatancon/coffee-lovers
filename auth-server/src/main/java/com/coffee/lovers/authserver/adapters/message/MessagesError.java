package com.coffee.lovers.authserver.adapters.message;

import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@AllArgsConstructor
public class MessagesError {
    private final MessageSource messageSource;


    public  String getError(){
        return messageSource.getMessage("description.generic.error", null, Locale.getDefault());
    }
    public  String getNotFound(){
        return messageSource.getMessage("description.generic.notfound", null, Locale.getDefault());
    }
}
