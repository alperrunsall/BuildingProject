package com.patika.models;

import java.math.BigDecimal;

public class Building {

    BigDecimal cost;
    int area;
    int roomCount = 0;
    int livingRoomCount = 0;

    public Building() {
    }

    public Building(BigDecimal cost, int area, int roomCount, int livingRoomCount) {
        this.cost = cost;
        this.area = area;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    public void setLivingRoomCount(int livingRoomCount) {
        this.livingRoomCount = livingRoomCount;
    }
}
