package com.thecoconut.article.repository;
import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.thecoconut.article.model.Article;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CosmosRepository<Article, String>{

    Article findByArticleKey(String articleKey);
}
