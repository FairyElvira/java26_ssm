package com.zhiyou.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: java26_ssm
 * @description: 申请记录
 * @author: 作者
 * @create: 2020-10-21 14:13
 */

public class ApplicationRecord implements Serializable {

    //id
    private Integer vid;
    //来访者
    private String visitor;
    //来访者身份证号
    private String visitorid;
    //来访者联系方式
    private String phone;
    //被访者
    private String interviewee;
    //与被访人关系
    private String relationship;
    //来访人数
    private Integer number;
    //预约时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Appointment;
    //访客照片
    private String photo;
    //审批时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date processingtime;
    //拒绝原因
    private String denialreason;

    public ApplicationRecord() {
    }

    @Override
    public String toString() {
        return "ApplicationRecord{" +
                "vid='" + vid + '\'' +
                "visitor='" + visitor + '\'' +
                ", visitorid='" + visitorid + '\'' +
                ", phone='" + phone + '\'' +
                ", interviewee='" + interviewee + '\'' +
                ", relationship='" + relationship + '\'' +
                ", number=" + number +
                ", Appointment=" + Appointment +
                ", photo='" + photo + '\'' +
                ", processingtime=" + processingtime +
                ", denialreason='" + denialreason + '\'' +
                '}';
    }

    public ApplicationRecord(Integer vid,String visitor, String visitorid, String phone, String interviewee, String relationship, Integer number, Date appointment, String photo, Date processingtime, String denialreason) {
        this.vid = vid;
        this.visitor = visitor;
        this.phone = phone;
        this.interviewee = interviewee;
        this.relationship = relationship;
        this.number = number;
        Appointment = appointment;
        this.photo = photo;
        this.processingtime = processingtime;
        this.denialreason = denialreason;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }

    public String getVisitorid() {
        return visitorid;
    }

    public void setVisitorid(String visitorid) {
        this.visitorid = visitorid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInterviewee() {
        return interviewee;
    }

    public void setInterviewee(String interviewee) {
        this.interviewee = interviewee;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getAppointment() {
        return Appointment;
    }

    public String getAppointmentStr() {
        return Appointment.toLocaleString();
    }

    public void setAppointment(Date appointment) {
        Appointment = appointment;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getProcessingtime() {
        return processingtime;
    }
    public String getProcessingtimeStr() {
        return processingtime.toLocaleString();
    }

    public void setProcessingtime(Date processingtime) {
        this.processingtime = processingtime;
    }

    public String getDenialreason() {
        return denialreason;
    }

    public void setDenialreason(String denialreason) {
        this.denialreason = denialreason;
    }
}
