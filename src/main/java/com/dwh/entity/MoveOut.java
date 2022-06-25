package com.dwh.entity;

import java.io.Serializable;

public class MoveOut implements Serializable {
    private int id;
    private int student_id;
    private int dormitory_id;
    private String dormitoryName;
    private String studentName;
    private String reason;
    private String create_date;

    public MoveOut(int id, int student_id, int dormitory_id, String dormitoryName, String studentName, String reason, String create_date) {
        this.id = id;
        this.student_id = student_id;
        this.dormitory_id = dormitory_id;
        this.dormitoryName = dormitoryName;
        this.studentName = studentName;
        this.reason = reason;
        this.create_date = create_date;
    }

    public MoveOut() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getDormitory_id() {
        return dormitory_id;
    }

    public void setDormitory_id(int dormitory_id) {
        this.dormitory_id = dormitory_id;
    }

    public String getDormitoryName() {
        return dormitoryName;
    }

    public void setDormitoryName(String dormitoryName) {
        this.dormitoryName = dormitoryName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "MoveOut{" +
                "id=" + id +
                ", student_id=" + student_id +
                ", dormitory_id=" + dormitory_id +
                ", dormitoryName='" + dormitoryName + '\'' +
                ", studentName='" + studentName + '\'' +
                ", reason='" + reason + '\'' +
                ", create_date='" + create_date + '\'' +
                '}';
    }
}
