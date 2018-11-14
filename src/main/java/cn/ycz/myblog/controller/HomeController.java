package cn.ycz.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/","/index"})
    public String index(){
        return "index";
    }

    @RequestMapping(value = {"/list"})
    public String list(){
        return "home/list";
    }
}
