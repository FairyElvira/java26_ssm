package com.zhiyou100.entity;

import java.io.Serializable;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-09 17:28
 */
public class ResponseEntity<T> implements Serializable{

    private Integer status;
    private String message;
    private T data;

    @Override
    public String toString() {
        return "ResponseEntity{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public ResponseEntity(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResponseEntity() {
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
}
