package com.coffee.lovers.empleados.application.configuration;

import com.coffee.lovers.empleados.adapters.message.MessagesError;
import com.coffee.lovers.empleados.domain.persistence.EmployedPersistencePort;
import com.coffee.lovers.empleados.domain.service.EmployedService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class EmployedServiceBean {
    @Bean
    public EmployedService getEmployedService(EmployedPersistencePort persistence, MessagesError messagesError) {
        return new EmployedService(persistence, messagesError);
    }
}
