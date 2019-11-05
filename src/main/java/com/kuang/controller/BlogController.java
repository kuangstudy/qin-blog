package com.kuang.controller;

import com.alibaba.fastjson.JSONObject;
import com.kuang.pojo.Article;
import com.kuang.pojo.Tag;
import com.kuang.service.ArticleService;
import com.kuang.service.TagService;
import com.kuang.utils.EditormdFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private TagService tagService;

    @GetMapping("/blog/toBlogIndex")
    public String toBlogIndex(Model model){
        List<Article> articles = articleService.queryAllArticles();
        model.addAttribute("articles",articles);
        List<Tag> tags = tagService.queryTags();
        model.addAttribute("tags",tags);
        return "views/blog/index";
    }

    @GetMapping("/blog/toArticle/{id}")
    public String toArticle(@PathVariable int id,Model model){
        Article article = articleService.queryArticleById(id);
        model.addAttribute("article",article);
        List<Tag> tags = tagService.queryTags();
        model.addAttribute("tags",tags);
        return "views/blog/article";
    }

    @GetMapping("/blog/toPostArticle")
    public String toPostArticle(Model model, HttpSession session){

        //做判断，从session中取出用户信息，如果用户不存在，则无法写博客！否则500
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser==null){
            model.addAttribute("msg","请先登录才能发博客");
            return "views/system/login";
        }else {
            List<Tag> tags = tagService.queryTags();
            model.addAttribute("tags",tags);
            return "views/blog/postblog";
        }
    }

    //文件上传回调() editormd
    @RequestMapping("/blog/file/upload")
    @ResponseBody
    public static JSONObject fileUpload(@RequestParam(value = "editormd-image-file", required = true) MultipartFile file, HttpServletRequest request) throws IOException {
        return EditormdFileUpload.fileUpload(file,request);
    }


    //添加一个博客
    @RequestMapping("/blog/addArticle")
    public String addArticle(Article article){
        System.out.println("addArticle=>"+article);
        article.setCreateTime(new Date());
        articleService.addArticle(article);

        return "redirect:/blog/toBlogIndex";
    }

    @RequestMapping("/blog/del/{id}")
    public String delArticle(@PathVariable int id) {
        articleService.delArticle(id);
        return "redirect:/blog/toBlogIndex";
    }
}
