package com.thecoconut.article.service;

import com.thecoconut.article.model.Article;
import com.thecoconut.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public Article getArticle(final String articleKey){
        return articleRepository.findByArticleKey(articleKey);
    }

    public List<Article> getArticles(){
        return StreamSupport
                .stream(articleRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public void saveArticle(Article article){
        articleRepository.save(article);
    }
}
