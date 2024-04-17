package com.coffee.lovers.comercios.adapters.message;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class MessagesOk {
    private final MessageSource messageSource;

    public  String getSuccess(){
        return messageSource.getMessage("description.generic.success", null, Locale.getDefault());
    }
}
