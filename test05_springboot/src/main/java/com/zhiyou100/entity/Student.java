package com.zhiyou100.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @program: java26_ssm
 * @description:
 * @author: 作者
 * @create: 2020-10-20 11:05
 */
@Component
@ConfigurationProperties(prefix = "student")
public class Student implements Serializable {
    private Integer sid;
    private String sname;
    private int sage;
    private List<String> enjoy;
    private Map<String,String> parentName;
    private Dog  dog;

    public Student(Integer sid, String sname, int sage, List<String> enjoy, Map<String, String> parentName, Dog dog) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.enjoy = enjoy;
        this.parentName = parentName;
        this.dog = dog;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", enjoy=" + enjoy +
                ", parentName=" + parentName +
                ", dog=" + dog +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public List<String> getEnjoy() {
        return enjoy;
    }

    public void setEnjoy(List<String> enjoy) {
        this.enjoy = enjoy;
    }

    public Map<String, String> getParentName() {
        return parentName;
    }

    public void setParentName(Map<String, String> parentName) {
        this.parentName = parentName;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
