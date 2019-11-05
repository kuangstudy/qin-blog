package com.kuang.service;

import com.kuang.pojo.Article;

import java.util.List;

public interface ArticleService {

    //查询全部文章
    public List<Article> queryAllArticles();
    //通过id查询文章
    public Article queryArticleById(int id);
    //增加文章
    public int addArticle(Article article);
    //删除文章
    public int delArticle(int id);

}
