public class Car implements Vehicle {
    private String brand;
    private String model;
    private CarType type;

    @Override
    public String brand() {
        return null;
    }

    @Override
    public String model() {
        return null;
    }

    public Car(CarType type, String brand, String model) {
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

    public CarType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type=" + type +
                '}';
    }
}
