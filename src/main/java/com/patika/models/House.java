package com.patika.models;

import java.math.BigDecimal;

public class House extends Building {
    public House() {
    }

    public House(BigDecimal cost, int area, int roomCount, int livingRoomCount) {
        super(cost,area,roomCount,livingRoomCount);
    }
}
