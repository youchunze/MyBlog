package cn.ycz.myblog.po;

import java.util.Date;

public class Message {
    //消息id，主键
    private Long mid;
    //用户id
    private Long uid;
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

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent == null ? null : mcontent.trim();
    }

    public String getMhttp() {
        return mhttp;
    }

    public void setMhttp(String mhttp) {
        this.mhttp = mhttp == null ? null : mhttp.trim();
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

    @Override
    public String toString() {
        return "Message{" +
                "mid=" + mid +
                ", uid=" + uid +
                ", tid='" + tid + '\'' +
                ", cid='" + cid + '\'' +
                ", mcontent='" + mcontent + '\'' +
                ", mhttp='" + mhttp + '\'' +
                ", mfav=" + mfav +
                ", mreply=" + mreply +
                ", mcopy=" + mcopy +
                ", mdatetime=" + mdatetime +
                '}';
    }
}