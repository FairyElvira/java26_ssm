package com.zhiyou100.entity;

import java.io.Serializable;

public class MyFile implements Serializable{
    private Integer fid;

    private String furl;

    private Integer fsize;

    private String fmd5;

    @Override
    public String toString() {
        return "MyFile{" +
                "fid=" + fid +
                ", furl='" + furl + '\'' +
                ", fsize=" + fsize +
                ", fmd5='" + fmd5 + '\'' +
                '}';
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFurl() {
        return furl;
    }

    public void setFurl(String furl) {
        this.furl = furl == null ? null : furl.trim();
    }

    public Integer getFsize() {
        return fsize;
    }

    public void setFsize(Integer fsize) {
        this.fsize = fsize;
    }

    public String getFmd5() {
        return fmd5;
    }

    public void setFmd5(String fmd5) {
        this.fmd5 = fmd5 == null ? null : fmd5.trim();
    }
}