package com.dwh.entity;

import java.io.Serializable;

public class Dormitory implements Serializable {
    private int id;
    private int building_id;
    private String name;
    private int type;
    private int available;
    private int telephone;
    private String buildingName;

    public Dormitory(int id, int building_id, String name, int type, int available, int telephone, String buildingName) {
        this.id = id;
        this.building_id = building_id;
        this.name = name;
        this.type = type;
        this.available = available;
        this.telephone = telephone;
        this.buildingName = buildingName;
    }

    public Dormitory() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "id=" + id +
                ", building_id=" + building_id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", available=" + available +
                ", telephone=" + telephone +
                ", buildingName='" + buildingName + '\'' +
                '}';
    }
}
