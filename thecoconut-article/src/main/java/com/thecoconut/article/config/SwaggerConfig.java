package com.thecoconut.article.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("TheCoconut API Specification")
                        .description("""
                                OpenAPI specification generated from the actual backend API built using <u>Spring Cloud Function</u> for a serverless architecture<br/>
                                <b>Try Out</b> option on this specification is blocked.""")
                        .version(appVersion)
                        .license(new License()
                                .name("TheCoconut")
                                .url("https://thecoconut.com.au")));
    }
}
