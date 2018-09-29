package com.lingxiao.blog.web;

import com.lingxiao.blog.web.NotFoundException
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
//        int i = 9/0;
        String blog = null;
        if (blog == null){
            throw  new NotFoundException("Blog not exits");
        }
        return "index";
    }
}
