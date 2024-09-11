package com.thecoconut.article.service;

import com.thecoconut.article.model.Article;
import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;
import io.dapr.client.domain.State;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ArticleService {

    private final DaprClient daprClient;
    private static final String STORE_NAME = "statestore";

    public Article getArticle(final String articleKey){
        Mono<State<Article>> articleState =   daprClient.getState(STORE_NAME, articleKey, Article.class);
        Article article = articleState.block().getValue();
        if(article == null) throw new RuntimeException("Article Not Found");
        return article;
    }

    public List<State<Article>> getArticles(){
        return daprClient.getBulkState(STORE_NAME, Arrays.asList(""), Article.class).block();
    }

    public void saveArticle(Article article){
        daprClient.saveState(STORE_NAME,article.articleKey(), article);
    }
}
