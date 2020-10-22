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
    private Integer id;
    private String name;
    private Float salary;

    public Worker(Integer id, String name, Float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Worker() {
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
