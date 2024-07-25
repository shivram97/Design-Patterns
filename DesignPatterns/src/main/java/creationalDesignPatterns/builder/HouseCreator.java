package creationalDesignPatterns.builder;

public class HouseCreator {
    public static void main(String[] args) {
        House house = new House.HouseBuilder(13,34).setGarage(true).setSwimmingPool(false).build();
        System.out.println(house.toString());



    }
}
