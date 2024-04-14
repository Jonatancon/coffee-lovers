package com.coffee.lovers.empleados.application.configuration;

import com.coffee.lovers.empleados.domain.service.EmployedService;
import com.coffee.lovers.empleados.domain.usecase.EmployedUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class EmployedUseCaseBean {
    @Bean
    public EmployedUseCase employedUseCase(EmployedService service) {
        return new EmployedUseCase(service);
    }
}
