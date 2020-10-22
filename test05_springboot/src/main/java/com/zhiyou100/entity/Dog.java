package com.zhiyou100.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: java26_ssm
 * @description: 狗的实体类
 * @author: 作者
 * @create: 2020-10-20 11:03
 */
public class Dog implements Serializable {
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;
    private Integer dage;
    private String dname;
    private String dsex;

    public Dog(Integer dage, String dname, String dsex,Date date) {
        this.dage = dage;
        this.dname = dname;
        this.dsex = dsex;
        this.date = date;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dage=" + dage +
                ", dname='" + dname + '\'' +
                ", dsex='" + dsex + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public Integer getDage() {
        return dage;
    }

    public void setDage(Integer dage) {
        this.dage = dage;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDsex() {
        return dsex;
    }

    public void setDsex(String dsex) {
        this.dsex = dsex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
