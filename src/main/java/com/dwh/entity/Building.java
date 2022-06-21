package com.dwh.entity;

import java.io.Serializable;

public class Building implements Serializable {
    private int id;
    private String name;
    private String introduction;
    private int admin_id;

    public Building(int id, String name, String introduction, int admin_id) {
        this.id = id;
        this.name = name;
        this.introduction = introduction;
        this.admin_id = admin_id;
    }

    public Building() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", introduction='" + introduction + '\'' +
                ", admin_id=" + admin_id +
                '}';
    }
}
