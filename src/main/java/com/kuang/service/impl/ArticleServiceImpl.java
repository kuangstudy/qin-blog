package com.kuang.service.impl;

import com.kuang.mapper.ArticleMapper;
import com.kuang.pojo.Article;
import com.kuang.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.dc.pr.PRError;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> queryAllArticles() {
        return articleMapper.queryAllArticles();
    }

    @Override
    public Article queryArticleById(int id) {
        return articleMapper.queryArticleById(id);
    }

    @Override
    public int addArticle(Article article) {
        return articleMapper.addArticle(article);
    }

    @Override
    public int delArticle(int id) {
        return articleMapper.delArticle(id);
    }
}
