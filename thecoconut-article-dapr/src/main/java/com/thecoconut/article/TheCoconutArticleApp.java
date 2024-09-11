package com.thecoconut.article;


import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;
import io.dapr.serializer.DefaultObjectSerializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

@SpringBootApplication
public class TheCoconutArticleApp {

    // @Autowired
    // private CreateArticle createarticle;

    // @Autowired
    // private GetArticle article;

    @Bean
    public Supplier<String> metadata() {
        return () -> "This is a spring cloud function API, built to serve the website thecoconut.com.au";
    }

    @Bean
    public DaprClient daprClient() {
        return new DaprClientBuilder()
                //.withObjectSerializer(new DefaultObjectSerializer())
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(TheCoconutArticleApp.class, args);
    }
}
