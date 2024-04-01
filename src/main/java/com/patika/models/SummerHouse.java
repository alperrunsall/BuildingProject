package com.patika.models;

import java.math.BigDecimal;

public class SummerHouse extends Building {

    public SummerHouse() {
    }

    public SummerHouse(BigDecimal cost, int area, int roomCount, int livingRoomCount) {
        super(cost,area,roomCount,livingRoomCount);
    }
}
