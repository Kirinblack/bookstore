package com.gui.bookstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    private static final String API_TITLE = "Bookstore Manager API";
    private static final String API_DESCRIPTION = "Bookstore Manager Professional API";
    private static final String API_VERSION = "V3.0.0";
    private static final String CONTACT_NAME = "L.Guilherme";
    private static final String CONTACT_GITHUB = "https://github.com/Kirinblack/bookstore/tree/develop";
    private static final String CONTACT_EMAIL = "Luizguilhermeinformat@gmail.com";

    @Bean
    public Docket api() {
        return  new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lguilherme.bookstoragemanager"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title(API_TITLE)
                .description(API_DESCRIPTION)
                .version(API_VERSION)
                .contact(new Contact(CONTACT_NAME,CONTACT_GITHUB,CONTACT_EMAIL))
                .build();
    }
}
