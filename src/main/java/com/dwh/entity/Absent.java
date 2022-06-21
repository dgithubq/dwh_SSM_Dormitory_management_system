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

    public Absent(int id, int building_id, int dormitory_id, int student_id, int dormitory_admin_id, String create_date, String reason) {
        this.id = id;
        this.building_id = building_id;
        this.dormitory_id = dormitory_id;
        this.student_id = student_id;
        this.dormitory_admin_id = dormitory_admin_id;
        this.create_date = create_date;
        this.reason = reason;
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
                '}';
    }
}
