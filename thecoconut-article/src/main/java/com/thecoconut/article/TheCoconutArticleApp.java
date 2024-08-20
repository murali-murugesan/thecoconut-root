package com.thecoconut.article;

import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import com.thecoconut.article.api.CreateArticle;
import com.thecoconut.article.api.GetArticle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

@SpringBootApplication
@EnableCosmosRepositories
public class TheCoconutArticleApp {

    @Autowired
    private CreateArticle createarticle;

    @Autowired
    private GetArticle article;

    @Bean
    public Supplier<String> metadata() {
        return () -> "This is a spring cloud function built to serve the website thecoconut.com.au";
    }

    public static void main(String[] args) {
        SpringApplication.run(TheCoconutArticleApp.class, args);
    }
}
