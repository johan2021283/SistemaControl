package com.example.SistemaDeControl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SistemaDeControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeControlApplication.class, args);
	}


	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.SistemaDeControl"))
				.build()
				.apiInfo(apiDetails());


	}

	private ApiInfo apiDetails(){
		return new ApiInfoBuilder()
				.title("Sistema de Control para estudiantes")
				.contact(new Contact("johan","no-url","myemail"))
				.description("Ventana de Swagger para realizar las siguientes pruebas")
				.build();
	}
}
