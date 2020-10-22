package com.zhiyou100.entity;

import java.io.Serializable;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-19 19:34
 */
public class Worker implements Serializable {

    /**
     * `w_id` int(11) NOT NULL AUTO_INCREMENT  primary key,
     `w_name` varchar(255) DEFAULT NULL,
     `w_salary` float DEFAULT NULL
     */
    private Integer wid;
    private String wname;
    private Float wsalary;

    public Worker(Integer wid, String wname, Float wsalary) {
        this.wid = wid;
        this.wname = wname;
        this.wsalary = wsalary;
    }

    public Worker() {
    }

    @Override
    public String toString() {
        return "Worker{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                ", wsalary=" + wsalary +
                '}';
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public Float getWsalary() {
        return wsalary;
    }

    public void setWsalary(Float wsalary) {
        this.wsalary = wsalary;
    }
}
