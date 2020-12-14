public abstract class Vehicle {
    private String brand;
    private String model;
    private int topSpeed;
    private int year;
    private int cost;

    public Vehicle(String brand, String model, int topSpeed, int year, int cost) {
        this.brand = brand;
        this.model = model;
        this.topSpeed = topSpeed;
        this.year = year;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

