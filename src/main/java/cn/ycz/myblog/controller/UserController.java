package cn.ycz.myblog.controller;

import cn.ycz.myblog.po.User;
import cn.ycz.myblog.servlet.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/find/{uid}")
    public User findByUid(@PathVariable("uid") Long uid){
        return userService.findByUid(uid);
    }
}
