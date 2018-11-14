package cn.ycz.myblog.servlet;


import cn.ycz.myblog.po.User;
import cn.ycz.myblog.utils.Result;

public interface UserService {
    Result login(String ulogon, String upasswd);
    Result regist(User user);
    User findByUid(Long uid);
}
