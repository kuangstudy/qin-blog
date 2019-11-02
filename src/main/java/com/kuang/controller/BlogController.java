package com.kuang.controller;

import com.alibaba.fastjson.JSONObject;
import com.kuang.utils.EditormdFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @GetMapping("/toBlogIndex")
    public String toBlogIndex(){
        return "views/blog/index";
    }

    @GetMapping("/toArticle")
    public String toArticle(){
        return "views/blog/article";
    }

    @GetMapping("/toPostArticle")
    public String toPostArticle(){
        return "views/blog/postblog";
    }

    //文件上传回调() editormd
    @RequestMapping("/file/upload")
    @ResponseBody
    public static JSONObject fileUpload(@RequestParam(value = "editormd-image-file", required = true) MultipartFile file, HttpServletRequest request) throws IOException {
        return EditormdFileUpload.fileUpload(file,request);
    }


}
