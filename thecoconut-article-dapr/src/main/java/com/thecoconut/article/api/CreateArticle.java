package com.thecoconut.article.api;

import com.thecoconut.article.model.Article;
import com.thecoconut.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component("article")
@RequiredArgsConstructor
public class CreateArticle implements Consumer<Article> {

    private final ArticleService articleService;

    @Override
    public void accept(Article article) {
        articleService.saveArticle(article);
    }
}
