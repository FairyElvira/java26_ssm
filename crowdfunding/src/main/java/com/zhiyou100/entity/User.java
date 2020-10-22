package com.zhiyou100.entity;

import java.io.Serializable;

/**
 * @program: java26_ssm
 * @description: 用户实体类
 * @author: 作者
 * @create: 2020-10-09 13:18
 */
public class User implements Serializable{

    //    uid INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
    private Integer uid;
    //    uname VARCHAR(20) COMMENT '用户名',
    private String uname;
    //    upwd  VARCHAR(100) COMMENT '密码',
    private String upwd;
    //    uji_fen INT COMMENT '积分',
    private Integer ujiFen;
    //    ushow VARCHAR(200) COMMENT '简介',
    private String ushow;
    //    uphoto VARCHAR(100) COMMENT '照片',
    private String uphoto;
    //    usex CHAR(1) COMMENT '性别',
    private String usex;
    //    ubirthday VARCHAR(100) COMMENT '生日',
    private String ubirthday;
    //    uprovince VARCHAR(10) COMMENT '省份',
    private String uprovince;
    //    ucity VARCHAR(10) COMMENT '城市',
    private String ucity;
    //    udetail_address VARCHAR(100) COMMENT '详细地址',
    private String udetailAddress;
    //    uattestation INT COMMENT '是否认证 0未认证 1已认证',
    private Integer uattestation;
    //    uphone VARCHAR(11) COMMENT '电话号码',
    private String uphone;
    //    ulast_login_time VARCHAR(100) COMMENT '最后一次登陆时间'
    private  String ulastLoginTime;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", ujiFen=" + ujiFen +
                ", ushow='" + ushow + '\'' +
                ", uphoto='" + uphoto + '\'' +
                ", usex='" + usex + '\'' +
                ", ubirthday='" + ubirthday + '\'' +
                ", uprovince='" + uprovince + '\'' +
                ", ucity='" + ucity + '\'' +
                ", udetailAddress='" + udetailAddress + '\'' +
                ", uattestation=" + uattestation +
                ", uphone='" + uphone + '\'' +
                ", ulastLoginTime='" + ulastLoginTime + '\'' +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public Integer getUjiFen() {
        return ujiFen;
    }

    public void setUjiFen(Integer ujiFen) {
        this.ujiFen = ujiFen;
    }

    public String getUshow() {
        return ushow;
    }

    public void setUshow(String ushow) {
        this.ushow = ushow;
    }

    public String getUphoto() {
        return uphoto;
    }

    public void setUphoto(String uphoto) {
        this.uphoto = uphoto;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUbirthday() {
        return ubirthday;
    }

    public void setUbirthday(String ubirthday) {
        this.ubirthday = ubirthday;
    }

    public String getUprovince() {
        return uprovince;
    }

    public void setUprovince(String uprovince) {
        this.uprovince = uprovince;
    }

    public String getUcity() {
        return ucity;
    }

    public void setUcity(String ucity) {
        this.ucity = ucity;
    }

    public String getUdetailAddress() {
        return udetailAddress;
    }

    public void setUdetailAddress(String udetailAddress) {
        this.udetailAddress = udetailAddress;
    }

    public Integer getUattestation() {
        return uattestation;
    }

    public void setUattestation(Integer uattestation) {
        this.uattestation = uattestation;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUlastLoginTime() {
        return ulastLoginTime;
    }

    public void setUlastLoginTime(String ulastLoginTime) {
        this.ulastLoginTime = ulastLoginTime;
    }
}
