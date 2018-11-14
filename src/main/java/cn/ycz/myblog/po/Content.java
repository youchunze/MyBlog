package cn.ycz.myblog.po;

import java.util.Date;

public class Content{
    //消息id，主键
    private Long mid;
    //话题id?
    private String tid;
    //转发编号
    private String cid;
    //内容
    private String mcontent;
    //链接
    private String mhttp;
    //收藏次数
    private Integer mfav;
    //评论次数
    private Integer mreply;
    //转发次数
    private Integer mcopy;
    //发表时间
    private Date mdatetime;
    //用户编号

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    private Long uid;
    //用户妮称
    private String ualais;
    //用户头像
    private String uimage;
    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
    }

    public String getMhttp() {
        return mhttp;
    }

    public void setMhttp(String mhttp) {
        this.mhttp = mhttp;
    }

    public Integer getMfav() {
        return mfav;
    }

    public void setMfav(Integer mfav) {
        this.mfav = mfav;
    }

    public Integer getMreply() {
        return mreply;
    }

    public void setMreply(Integer mreply) {
        this.mreply = mreply;
    }

    public Integer getMcopy() {
        return mcopy;
    }

    public void setMcopy(Integer mcopy) {
        this.mcopy = mcopy;
    }

    public Date getMdatetime() {
        return mdatetime;
    }

    public void setMdatetime(Date mdatetime) {
        this.mdatetime = mdatetime;
    }

    public String getUalais() {
        return ualais;
    }

    public void setUalais(String ualais) {
        this.ualais = ualais;
    }

    public String getUimage() {
        return uimage;
    }

    public void setUimage(String uimage) {
        this.uimage = uimage;
    }

    @Override
    public String toString() {
        return "Content{" +
                "mid=" + mid +
                ", tid='" + tid + '\'' +
                ", cid='" + cid + '\'' +
                ", mcontent='" + mcontent + '\'' +
                ", mhttp='" + mhttp + '\'' +
                ", mfav=" + mfav +
                ", mreply=" + mreply +
                ", mcopy=" + mcopy +
                ", mdatetime=" + mdatetime +
                ", ualais='" + ualais + '\'' +
                ", uimage='" + uimage + '\'' +
                '}';
    }
}
