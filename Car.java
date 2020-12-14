public class Car extends Vehicle {
    private int numofpassangers;

    Car(String brand, String model, int topSpeed, int year, int cost, int numofpassangers) {
        super(brand, model, topSpeed, year, cost);
        this.numofpassangers = numofpassangers;
    }

    public int getNumofpassangers() {
        return numofpassangers;
    }

    public void setNumofpassangers(int numofpassangers) {
        this.numofpassangers = numofpassangers;
    }
}
