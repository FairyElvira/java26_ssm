package com.zhiyou100.entity;

import java.io.Serializable;

public class User implements Serializable{
    private Integer uid;

    private String uname;

    private String upwd;

    private String usex;

    private Integer ustatus;

    private String uremark;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", usex='" + usex + '\'' +
                ", ustatus='" + ustatus + '\'' +
                ", uremark='" + uremark + '\'' +
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
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex == null ? null : usex.trim();
    }

    public Integer getUstatus() {
        return ustatus;
    }

    public void setUstatus(Integer ustatus) {
        this.ustatus = ustatus ;
    }

    public String getUremark() {
        return uremark;
    }

    public void setUremark(String uremark) {
        this.uremark = uremark == null ? null : uremark.trim();
    }
}