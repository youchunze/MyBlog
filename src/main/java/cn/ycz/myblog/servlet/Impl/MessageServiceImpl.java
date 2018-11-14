package cn.ycz.myblog.servlet.Impl;

import cn.ycz.myblog.mapper.MessageMapper;
import cn.ycz.myblog.mapper.UserMapper;
import cn.ycz.myblog.po.Content;
import cn.ycz.myblog.po.Message;
import cn.ycz.myblog.po.MessageExample;
import cn.ycz.myblog.po.User;
import cn.ycz.myblog.servlet.MessageService;
import cn.ycz.myblog.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public Result craetMsg(Message message) {
        messageMapper.insert(message);
        return Result.ok("发布成功");
    }

    @Override
    public List<Content> findAllByUid(Long uid) {
        MessageExample example = new MessageExample();
        MessageExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        List<Message> list = messageMapper.selectByExample(example);
        List<Content> result = new ArrayList<>();
        for(Message message : list){
            Content content = new Content();
            content.setMid(message.getMid());
            content.setTid(message.getTid());
            content.setCid(message.getCid());
            content.setMhttp(message.getMhttp());
            content.setMfav(message.getMfav());
            content.setMreply(message.getMreply());
            content.setMcopy(message.getMcopy());
            content.setMdatetime(message.getMdatetime());
            content.setMcontent(message.getMcontent());
            User user =  userMapper.selectByPrimaryKey(message.getUid());
            content.setUid(user.getUid());
            content.setUalais(user.getUalais());
            content.setUimage(user.getUimage());
            result.add(content);
        }
        return result;
    }

    @Override
    public Result deleteMsg(Long mid) {
        try {
            messageMapper.deleteByPrimaryKey(mid);
            return Result.ok("删除成功");
        }catch (Exception e){
            return Result.build(500,"删除出错，请重试");
        }
    }
}
