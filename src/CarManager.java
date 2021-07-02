import java.util.ArrayList;
import java.util.List;

public class CarManager {

    List<Car> cars = new ArrayList<>();

    public CarManager() {
        addCarsInStock();
    }

    public void addCarsInStock() {
        cars.add(new Car(CarType.DACIA, "Nova", "1400L"));
        cars.add(new Car(CarType.LADA, "Niva", "2000L"));
        cars.add(new Car(CarType.RENAULT, "Meggane", "1600L"));
    }

    public Car getCar(int index) {
        return cars.get(index);
    }

    public void print() {
        int index = 0;
        for (Car element : cars) {
            System.out.println("Car No: " + index + " type: " + element.getType()
                    + " " + element.getModel() + " " + element.getBrand());
            index++;
        }
    }

    public void removeCar(int index) {
        cars.remove(index);
    }
}
