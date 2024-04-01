package com.patika;


public class Main {
    public static void main(String[] args) {
        BuildingService service = new BuildingService();

        System.out.println("\n\nTotal price of " + service.getHouseList().size() + " Houses: " + service.getTotalAmountOfHouses() + "TL");
        System.out.println("Total price of " + service.getVillaList().size() + " Villas: " + service.getTotalAmountOfVillas() + "TL");
        System.out.println("Total price of " + service.getSummerHouseList().size() + " Summer Houses: " + service.getTotalAmountOfSummerHouses() + "TL");
        System.out.println("Total price of all buildings: " + (service.getAllPricesOfBuildings()) + "TL");

        System.out.println("Average value of Houses area: " + (service.getAverageOfHouses()) + "m²");
        System.out.println("Average value of Villas area: " + (service.getAverageOfVillas()) + "m²");
        System.out.println("Average value of Summer Houses area: " + (service.getAverageOfSummerHouses()) + "m²");
        System.out.println("Average value of all buildings area: " + (service.getAverageOfAllBuildings()) + "m²");

        int filterRoom = 4;
        int filterLivingRoom = 1;
        System.out.println("Count of " + filterRoom + " room and " + filterLivingRoom + " living room buildings: " +
                service.filterHouses(filterRoom, filterLivingRoom).size());

    }
}