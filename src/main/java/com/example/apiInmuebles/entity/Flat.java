package com.example.apiInmuebles.entity;

public class Flat {
    private int id;
    private int flatNum;
    private int flatDoor;
    private int area;
    private int catastralCode;
    private String condition;

    public Flat() {
    }

    public Flat(int id, int flatNum, int flatDoor, int area, int catastralCode, String condition) {
        this.id = id;
        this.flatNum = flatNum;
        this.flatDoor = flatDoor;
        this.area = area;
        this.catastralCode = catastralCode;
        this.condition = condition;
    }

    public int getFlatNum() {
        return flatNum;
    }

    public void setFlatNum(int flatNum) {
        this.flatNum = flatNum;
    }

    public int getFlatDoor() {
        return flatDoor;
    }

    public void setFlatDoor(int flatDoor) {
        this.flatDoor = flatDoor;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getCatastralCode() {
        return catastralCode;
    }

    public void setCatastralCode(int catastralCode) {
        this.catastralCode = catastralCode;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
