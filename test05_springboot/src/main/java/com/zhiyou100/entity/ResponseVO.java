package com.zhiyou100.entity;

/**
 * @program: java26_ssm
 * @description: 创建一个ResponseVO类来防装响应的数据
 * @author: 作者
 * @create: 2020-10-20 16:23
 */
public class ResponseVO<T> {

    private Integer status;
    private String  message;
    private T  data;

    public ResponseVO(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResponseVO() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVO{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
