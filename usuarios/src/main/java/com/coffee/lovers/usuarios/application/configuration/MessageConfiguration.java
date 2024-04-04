package com.coffee.lovers.usuarios.application.configuration;

import com.coffee.lovers.usuarios.infraestructure.message.Messages;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {
    @Bean
    public Messages getMessage(MessageSource messageSource) {
        return new Messages(messageSource);
    }
}
