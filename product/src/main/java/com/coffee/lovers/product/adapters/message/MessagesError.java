package com.coffee.lovers.product.adapters.message;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class MessagesError {
    private final MessageSource messageSource;


    public  String getError(){
        return messageSource.getMessage("description.generic.error", null, Locale.getDefault());
    }
    public  String getNotFound(){
        return messageSource.getMessage("description.generic.notfound", null, Locale.getDefault());
    }
}
