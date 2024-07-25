package creationalDesignPatterns.builder;

public class House {
    private int bricks;
    private int area;

    private boolean garage;

    private boolean swimmingPool;

    public int getBricks() {
        return bricks;
    }

    public int getArea() {
        return area;
    }

    House(HouseBuilder houseBuilder){
        this.bricks= houseBuilder.bricks;
        this.area= houseBuilder.area;
        this.garage= houseBuilder.garage;
        this.swimmingPool= houseBuilder.swimmingPool;
    }

    public static class HouseBuilder{
        private int bricks;
        private int area;

        private boolean garage;

        private boolean swimmingPool;

        public HouseBuilder(int bricks, int area) {
            this.bricks = bricks;
            this.area = area;
        }

        public int setBricks() {
            return bricks;
        }

        public int setArea() {
            return area;
        }

        public HouseBuilder setGarage(boolean garageRequired){
            this.garage=garageRequired;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean swimmingPoolRequired){
            this.swimmingPool=swimmingPoolRequired;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House [bricks=" + bricks + ", area=" + area + ", garage=" + garage + ", swimmingPool=" + swimmingPool + "]";
    }
}
