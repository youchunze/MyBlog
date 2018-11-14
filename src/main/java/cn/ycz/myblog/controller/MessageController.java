package cn.ycz.myblog.controller;

import cn.ycz.myblog.po.Content;
import cn.ycz.myblog.po.Message;
import cn.ycz.myblog.servlet.MessageService;
import cn.ycz.myblog.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @PostMapping("/create")
    public Result creatmsg(Message message){
        return messageService.craetMsg(message);
    }

    @GetMapping("/find/{uid}")
    public List<Content> findllByUid(@PathVariable("uid") Long uid){
        return messageService.findAllByUid(uid);
    }
}
