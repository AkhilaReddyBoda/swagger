package com.ga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SpringBootApplication
@SecurityScheme(name = "greenapex", scheme = "basic", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
//@OpenAPIDefinition(info = @Info(title = "user API", version = "2.0", description = "user Information"))

public class SwaggerJwtAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerJwtAuthApplication.class, args);
	}

}
