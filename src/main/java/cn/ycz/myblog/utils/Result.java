package cn.ycz.myblog.utils;

public class Result {
    //定义响应状态
    private Integer status;
    //定义响应消息
    private String msg;
    //定义响应的数据
    private Object data;

    public Result() {
    }

    public Result(Object data) {
        this.status = 200;
        this.msg = "ok";
        this.data = data;
    }

    public Result(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static Result build(Integer status, String msg, Object data){
        return new Result(status,msg,data);
    }
    public static Result build(Integer status, String msg){
        return new Result(status,msg);
    }

    public static Result ok(Object data){
        return new Result(data);
    }

    public static Result ok(){
        return new Result(null);
    }
    public Result(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Integer getStatus() {

        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
