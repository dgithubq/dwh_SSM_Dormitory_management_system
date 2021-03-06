package com.dwh.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String number;
    private String name;
    private String gender;
    private int dormitory_id;
    private int oldDormitoryId;
    private String dormitoryName;
    private String state;
    private String create_date;


    public Student(int id, String number, String name, String gender, int dormitory_id, int oldDormitoryId, String dormitoryName, String state, String create_date) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.gender = gender;
        this.dormitory_id = dormitory_id;
        this.oldDormitoryId = oldDormitoryId;
        this.dormitoryName = dormitoryName;
        this.state = state;
        this.create_date = create_date;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDormitory_id() {
        return dormitory_id;
    }

    public void setDormitory_id(int dormitory_id) {
        this.dormitory_id = dormitory_id;
    }

    public int getOldDormitoryId() {
        return oldDormitoryId;
    }

    public void setOldDormitoryId(int oldDormitoryId) {
        this.oldDormitoryId = oldDormitoryId;
    }

    public String getDormitoryName() {
        return dormitoryName;
    }

    public void setDormitoryName(String dormitoryName) {
        this.dormitoryName = dormitoryName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dormitory_id=" + dormitory_id +
                ", oldDormitoryId=" + oldDormitoryId +
                ", dormitoryName='" + dormitoryName + '\'' +
                ", state='" + state + '\'' +
                ", create_date='" + create_date + '\'' +
                '}';
    }
}
