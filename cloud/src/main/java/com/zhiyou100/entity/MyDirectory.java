package com.zhiyou100.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class MyDirectory implements Serializable{
    private Integer did;

    private String dname;

    private String dfu;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dcreateTime;

    private Integer uid;

    private Integer dtype;

    private Integer fid;


    @Override
    public String toString() {
        return "MyDirectory{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", dfu='" + dfu + '\'' +
                ", dcreateTime=" + dcreateTime +
                ", uid=" + uid +
                ", dtype=" + dtype +
                ", fid=" + fid +
                '}';
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDfu() {
        return dfu;
    }

    public void setDfu(String dfu) {
        this.dfu = dfu == null ? null : dfu.trim();
    }

    public Date getDcreateTime() {
        return dcreateTime;
    }

    public String getDcreateTimeStr() {
        return dcreateTime.toLocaleString();
    }

    public void setDcreateTime(Date dcreateTime) {
        this.dcreateTime = dcreateTime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getDtype() {
        return dtype;
    }

    public void setDtype(Integer dtype) {
        this.dtype = dtype;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }
}