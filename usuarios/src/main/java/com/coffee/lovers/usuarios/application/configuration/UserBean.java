package com.coffee.lovers.usuarios.application.configuration;

import com.coffee.lovers.usuarios.domain.service.UserService;
import com.coffee.lovers.usuarios.domain.usecase.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class UserBean {
    @Bean
    public UserUseCase getUser(UserService service){
        return new UserUseCase(service);
    }
}
