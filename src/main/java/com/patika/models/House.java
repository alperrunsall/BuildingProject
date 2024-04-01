package com.patika.models;

import com.patika.Building;

import java.math.BigDecimal;

public class House implements Building {
    private BigDecimal cost;
    private int area;
    private int roomCount = 0;
    private int livingRoomCount = 0;
    private int bathRoomCount = 0;
    private int ageOfBuilding = 0;

    @Override
    public BigDecimal getCost() {
        return cost;
    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int getRoomCount() {
        return roomCount;
    }

    @Override
    public int getLivingRoomCount() {
        return livingRoomCount;
    }
    @Override
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public void setRoomCount(int count) {
        this.roomCount = count;
    }

    @Override
    public void setLivingRoomCount(int count) {
        this.livingRoomCount = count;
    }

    @Override
    public void setBathRoomCount(int count) {
        this.bathRoomCount = count;
    }

    @Override
    public void setAgeOfBuilding(int age) {
        this.ageOfBuilding = age;
    }
}
