package com.patika;

import com.patika.models.Building;
import com.patika.models.House;
import com.patika.models.SummerHouse;
import com.patika.models.Villa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BuildingService {

    private final List<Building> houseList = new ArrayList<>();
    private final List<Building> villaList = new ArrayList<>();
    private final List<Building> summerHouseList = new ArrayList<>();

    private BigDecimal totalPriceOfHouses;
    private BigDecimal totalPriceOfVillas;
    private BigDecimal totalPriceOfSummerHouses;

    private double sumOfHouseArea;
    private double sumOfVillaArea;
    private double sumOfSummerHouseArea;

    public BuildingService() {
        init();
    }

    private void init() {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            Building house = new House();
            house.setCost(new BigDecimal((random.nextInt(500) * 1000) + 500000));
            house.setRoomCount(random.nextInt(3) + 1);
            house.setLivingRoomCount(1);
            house.setArea((house.getRoomCount() * (random.nextInt(35) + 20)) + (house.getLivingRoomCount() * (random.nextInt(50) + 20)));
            houseList.add(house);

            Building villa = new Villa();
            villa.setCost(new BigDecimal((random.nextInt(2000) * 1000) + 1000000));
            villa.setRoomCount(random.nextInt(6) + 4);
            villa.setLivingRoomCount(random.nextInt(2) + 1);
            villa.setArea((villa.getRoomCount() * (random.nextInt(35) + 20)) + (villa.getLivingRoomCount() * (random.nextInt(50) + 20)));
            villaList.add(villa);

            Building summerHouse = new SummerHouse();
            summerHouse.setCost(new BigDecimal((random.nextInt(2000) * 1000) + 1000000));
            summerHouse.setRoomCount(random.nextInt(6) + 4);
            summerHouse.setLivingRoomCount(random.nextInt(2) + 1);
            summerHouse.setArea((summerHouse.getRoomCount() * (random.nextInt(35) + 20)) + (summerHouse.getLivingRoomCount() * (random.nextInt(50) + 20)));
            summerHouseList.add(summerHouse);
        }
    }

    public BigDecimal getTotalAmountOfHouses() {
        totalPriceOfHouses = BigDecimal.valueOf(houseList.stream()
                .mapToLong(house -> house.getCost().longValue())
                .sum());
        return totalPriceOfHouses;
    }

    public BigDecimal getTotalAmountOfVillas() {
        totalPriceOfVillas = BigDecimal.valueOf(villaList.stream()
                .mapToLong(villa -> villa.getCost().longValue())
                .sum());
        return totalPriceOfVillas;
    }

    public BigDecimal getTotalAmountOfSummerHouses() {
        totalPriceOfSummerHouses = BigDecimal.valueOf(summerHouseList.stream()
                .mapToLong(summerHouse -> summerHouse.getCost().longValue())
                .sum());
        return totalPriceOfSummerHouses;
    }

    public BigDecimal getAllPricesOfBuildings() {
        return BigDecimal.valueOf(totalPriceOfHouses.longValue()
                + totalPriceOfSummerHouses.longValue()
                + totalPriceOfVillas.longValue());
    }

    public double getAverageOfHouses() {
        sumOfHouseArea = houseList.stream()
                .mapToDouble(Building::getArea)
                .sum();
        return sumOfHouseArea / houseList.size();
    }

    public double getAverageOfVillas() {
        sumOfVillaArea = villaList.stream()
                .mapToDouble(Building::getArea)
                .sum();
        return sumOfVillaArea / villaList.size();
    }

    public double getAverageOfSummerHouses() {
        sumOfSummerHouseArea = summerHouseList.stream()
                .mapToDouble(Building::getArea)
                .sum();
        return sumOfSummerHouseArea / summerHouseList.size();
    }

    public double getAverageOfAllBuildings() {
        return (sumOfHouseArea + sumOfVillaArea + sumOfSummerHouseArea) / (houseList.size() + villaList.size() + summerHouseList.size());
    }

    public List<Building> filterHouses(int roomCount, int livingRoomCount) {
        List<Building> allBuildings = new ArrayList<>();
        allBuildings.addAll(houseList);
        allBuildings.addAll(villaList);
        allBuildings.addAll(summerHouseList);

        return allBuildings.stream()
                .filter(house -> house.getRoomCount() == roomCount)
                .filter(house -> house.getLivingRoomCount() == livingRoomCount)
                .toList();
    }

    public List<Building> getHouseList() {
        return houseList;
    }

    public List<Building> getVillaList() {
        return villaList;
    }

    public List<Building> getSummerHouseList() {
        return summerHouseList;
    }
}
