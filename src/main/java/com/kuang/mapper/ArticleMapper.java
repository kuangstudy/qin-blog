package com.kuang.mapper;

import com.kuang.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ArticleMapper {

    //查询全部文章
    public List<Article> queryAllArticles();

    //通过id查询文章
    public Article queryArticleById(int id);
    //修改文章

    //增加文章
    public int addArticle(Article article);

    //删除文章
    public int delArticle(int id);
}
