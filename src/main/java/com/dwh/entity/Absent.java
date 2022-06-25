package com.dwh.entity;

import java.io.Serializable;

public class Absent implements Serializable {
    private int id;
    private int building_id;
    private int dormitory_id;
    private int student_id;
    private int dormitory_admin_id;
    private String create_date;
    private String reason;
    private String building_name;
    private String dormitory_name;
    private String student_name;
    private String dormitory_admin_name;


    public Absent(int id, int building_id, int dormitory_id, int student_id, int dormitory_admin_id, String create_date, String reason, String building_name, String dormitory_name, String student_name, String dormitory_admin_name) {
        this.id = id;
        this.building_id = building_id;
        this.dormitory_id = dormitory_id;
        this.student_id = student_id;
        this.dormitory_admin_id = dormitory_admin_id;
        this.create_date = create_date;
        this.reason = reason;
        this.building_name = building_name;
        this.dormitory_name = dormitory_name;
        this.student_name = student_name;
        this.dormitory_admin_name = dormitory_admin_name;
    }

    public Absent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuilding_id() {
        return building_id;
    }

    public void setBuilding_id(int building_id) {
        this.building_id = building_id;
    }

    public int getDormitory_id() {
        return dormitory_id;
    }

    public void setDormitory_id(int dormitory_id) {
        this.dormitory_id = dormitory_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getDormitory_admin_id() {
        return dormitory_admin_id;
    }

    public void setDormitory_admin_id(int dormitory_admin_id) {
        this.dormitory_admin_id = dormitory_admin_id;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name;
    }

    public String getDormitory_name() {
        return dormitory_name;
    }

    public void setDormitory_name(String dormitory_name) {
        this.dormitory_name = dormitory_name;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getDormitory_admin_name() {
        return dormitory_admin_name;
    }

    public void setDormitory_admin_name(String dormitory_admin_name) {
        this.dormitory_admin_name = dormitory_admin_name;
    }

    @Override
    public String toString() {
        return "Absent{" +
                "id=" + id +
                ", building_id=" + building_id +
                ", dormitory_id=" + dormitory_id +
                ", student_id=" + student_id +
                ", dormitory_admin_id=" + dormitory_admin_id +
                ", create_date='" + create_date + '\'' +
                ", reason='" + reason + '\'' +
                ", building_name='" + building_name + '\'' +
                ", dormitory_name='" + dormitory_name + '\'' +
                ", student_name='" + student_name + '\'' +
                ", dormitory_admin_name='" + dormitory_admin_name + '\'' +
                '}';
    }
}
