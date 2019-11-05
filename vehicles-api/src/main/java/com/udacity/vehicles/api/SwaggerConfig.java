package com.udacity.vehicles.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }

    private ApiInfo apiInfo(){
        final ApiInfo apiInfo = new ApiInfo("Vehicle API", "This Api returns inforamtion about a car.",
                                            "1.0", "https://github.com/srikanthnagidi/VehiclesAPI",
                                            new Contact("Srikanth Reddy", "https://github.com/srikanthnagidi/VehiclesAPI", "srikanth.nagidi@gmail.com"),
                                            "License of API", "https://github.com/srikanthnagidi/VehiclesAPI", Collections.emptyList());
        return apiInfo;
    }
}
