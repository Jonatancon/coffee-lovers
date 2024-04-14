package com.coffee.lovers.usuarios.application.configuration;

import com.coffee.lovers.usuarios.adapters.message.MessagesError;
import com.coffee.lovers.usuarios.domain.persistence.UserPersistencePort;
import com.coffee.lovers.usuarios.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class UserServiceBean {

    @Bean
    public UserService getUserService(UserPersistencePort persistencePort, MessagesError messagesError){
        return new UserService(persistencePort, messagesError);
    }
}
