package com.coffee.lovers.authserver.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "auth Api",
                version = "1.0.0",
                description = "this is auth Api"
        )
)
public class OpenApiConfig {
}
