package cn.ycz.myblog.po;

import java.util.Date;

public class User {
    //用户编号
    private Long uid;
    //用户妮称
    private String ualais;
    //用户头像
    private String uimage;
    //邮箱（登陆名）
    private String ulogon;
    //密码
    private String upassswd;
    //性别
    private String usex;
    //真实姓名
    private String uname;
    //皮肤编号
    private String uskin;
    //QQ
    private String uqq;
    //毕业院校
    private String uschool;
    //职位
    private String uwork;
    //手机号
    private String utel;
    //自我介绍
    private String uinfo;
    //注册时间
    private Date udatetime;
    //个人博客
    private String ublog;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUalais() {
        return ualais;
    }

    public void setUalais(String ualais) {
        this.ualais = ualais == null ? null : ualais.trim();
    }

    public String getUimage() {
        return uimage;
    }

    public void setUimage(String uimage) {
        this.uimage = uimage == null ? null : uimage.trim();
    }

    public String getUlogon() {
        return ulogon;
    }

    public void setUlogon(String ulogon) {
        this.ulogon = ulogon == null ? null : ulogon.trim();
    }

    public String getUpassswd() {
        return upassswd;
    }

    public void setUpassswd(String upassswd) {
        this.upassswd = upassswd == null ? null : upassswd.trim();
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex == null ? null : usex.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUskin() {
        return uskin;
    }

    public void setUskin(String uskin) {
        this.uskin = uskin == null ? null : uskin.trim();
    }

    public String getUqq() {
        return uqq;
    }

    public void setUqq(String uqq) {
        this.uqq = uqq == null ? null : uqq.trim();
    }

    public String getUschool() {
        return uschool;
    }

    public void setUschool(String uschool) {
        this.uschool = uschool == null ? null : uschool.trim();
    }

    public String getUwork() {
        return uwork;
    }

    public void setUwork(String uwork) {
        this.uwork = uwork == null ? null : uwork.trim();
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel == null ? null : utel.trim();
    }

    public String getUinfo() {
        return uinfo;
    }

    public void setUinfo(String uinfo) {
        this.uinfo = uinfo == null ? null : uinfo.trim();
    }

    public Date getUdatetime() {
        return udatetime;
    }

    public void setUdatetime(Date udatetime) {
        this.udatetime = udatetime;
    }

    public String getUblog() {
        return ublog;
    }

    public void setUblog(String ublog) {
        this.ublog = ublog == null ? null : ublog.trim();
    }
}