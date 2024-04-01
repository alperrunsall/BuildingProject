package com.patika;

import java.math.BigDecimal;

public interface Building {
    BigDecimal getCost();

    int getArea();

    int getRoomCount();

    int getLivingRoomCount();

    void setCost(BigDecimal cost);

    void setArea(int area);

    void setRoomCount(int count);

    void setLivingRoomCount(int count);

    void setBathRoomCount(int count);

    void setAgeOfBuilding(int age);


}
