package cn.ycz.myblog.controller;

import cn.ycz.myblog.po.Content;
import cn.ycz.myblog.po.Message;
import cn.ycz.myblog.servlet.MessageService;
import cn.ycz.myblog.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @PostMapping("/create")
    public Result creatMsg(Message message){
        message.setMdatetime(new Date());
        message.setMfav(0);
        message.setMcopy(0);
        message.setMreply(0);
        System.out.println(message.toString());
        return messageService.craetMsg(message);
    }

    @GetMapping("/find/{uid}")
    public List<Content> findAllMsgByUid(@PathVariable("uid") Long uid){
        return messageService.findAllByUid(uid);
    }

    @DeleteMapping("/delete/{mid}")
    public Result deleteMsg(@PathVariable("mid") Long mid){
        return messageService.deleteMsg(mid);
    }
}
