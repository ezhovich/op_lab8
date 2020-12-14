public class Boat extends Vehicle {
    private int numofsails;

    Boat(String brand, String model, int topspeed, int year, int cost, int numofsails) {
        super(brand, model, topspeed, year, cost);
        this.numofsails = numofsails;
    }

    public int getNumofsails() {
        return numofsails;
    }

    public void setNumofsails(int numofsails) {
        this.numofsails = numofsails;
    }
}
