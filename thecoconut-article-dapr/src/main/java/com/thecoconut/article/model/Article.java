package com.thecoconut.article.model;

import java.util.List;

public record Article(String articleId,
                     String articleKey,
                      String title,
                      List<ArticleContext> context,
                      String[] images,
                      String articleContent,
                      String[] tags) {}