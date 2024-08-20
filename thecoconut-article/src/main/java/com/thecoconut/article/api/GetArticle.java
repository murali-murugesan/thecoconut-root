package com.thecoconut.article.api;

import com.thecoconut.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("getarticle")
@RequiredArgsConstructor
public class GetArticle implements Function<String,Object> {

    private final ArticleService articleService;

    @Override
    public Object apply(final String articleKey) {
        return articleKey.isBlank()? articleService.getArticles() : articleService.getArticle(articleKey);
    }
}
