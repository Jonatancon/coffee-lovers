package com.coffee.lovers.usuarios.application.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "User Api",
                version = "1.0.0",
                description = "this is User Api"
        )
)
public class OpenApiConfig {
}
