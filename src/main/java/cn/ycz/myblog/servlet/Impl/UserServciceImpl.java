package cn.ycz.myblog.servlet.Impl;


import cn.ycz.myblog.mapper.UserMapper;
import cn.ycz.myblog.po.User;
import cn.ycz.myblog.po.UserExample;
import cn.ycz.myblog.servlet.UserService;
import cn.ycz.myblog.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;

@Service
public class UserServciceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Result login(String ulogon, String upasswd) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUlogonEqualTo(ulogon);
        List<User> list = userMapper.selectByExample(example);
        if (list == null || list.isEmpty()){
            return Result.build(400,"用户名或密码错误");
        }
        User user = list.get(0);
        if (!upasswd.equals(user.getUpassswd())){
            return Result.build(400,"用户名或密码错误");
        }
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        attributes.getRequest().getSession().setAttribute("user",user);
        return Result.ok();
    }

    @Override
    public Result regist(User user) {

        userMapper.insert(user);
        return Result.ok("添加成功");
    }

    @Override
    public User findByUid(Long uid) {
        return userMapper.selectByPrimaryKey(uid);
    }
}
