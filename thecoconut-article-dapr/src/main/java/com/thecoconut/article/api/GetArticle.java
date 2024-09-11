package com.thecoconut.article.api;

import com.thecoconut.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("article")
@RequiredArgsConstructor
public class GetArticle implements Function<String,Object> {

    private final ArticleService articleService;

    @Override
    public Object apply(final String articleKey) {
        try {
            return articleKey.isBlank() ? articleService.getArticles() : articleService.getArticle(articleKey);
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(exception.getMessage());
        }
    }
}
