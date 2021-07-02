public class Bike implements Vehicle {
    private String brand;
    private String model;
    private BikeType type;


    @Override
    public String brand() {
        return brand;
    }

    @Override
    public String model() {
        return model;
    }

    public Bike(BikeType type, String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public BikeType getType() {
        return type;
    }
}
