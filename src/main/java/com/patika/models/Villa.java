package com.patika.models;

import java.math.BigDecimal;

public class Villa extends Building {
    public Villa() {
    }

    public Villa(BigDecimal cost, int area, int roomCount, int livingRoomCount) {
        super(cost,area,roomCount,livingRoomCount);
    }
}
