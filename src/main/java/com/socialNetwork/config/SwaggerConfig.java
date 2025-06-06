package com.socialNetwork.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Social Network API",
                version = "1.0",
                description = "API Documentation"
        )
)
public class SwaggerConfig {
        // No additional config needed for basic setup
}