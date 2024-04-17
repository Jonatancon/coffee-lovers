package com.coffee.lovers.authserver.configuration;

import com.coffee.lovers.authserver.adapters.message.MessagesError;
import com.coffee.lovers.authserver.adapters.message.MessagesOk;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MessageConfiguration {
    @Bean
    public MessagesOk getMessageOk(MessageSource messageSource) {
        return new MessagesOk(messageSource);
    }
    @Bean
    public MessagesError getMessageError(MessageSource messageSource) {
        return new MessagesError(messageSource);
    }
}
