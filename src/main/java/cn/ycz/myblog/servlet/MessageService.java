package cn.ycz.myblog.servlet;

import cn.ycz.myblog.po.Content;
import cn.ycz.myblog.po.Message;
import cn.ycz.myblog.utils.Result;

import java.util.List;

public interface MessageService {
    Result craetMsg(Message message);
    List<Content> findAllByUid(Long uid);
    Result deleteMsg(Long mid);
}
