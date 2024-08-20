package com.thecoconut.article.model;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

import java.util.List;

@Container(containerName = "thecoconut-articles")
public record Article(@Id String articleId,
                      @PartitionKey  String articleKey,
                      String title,
                      List<ArticleContext> context,
                      String[] images,
                      String articleContent,
                      String[] tags) {}