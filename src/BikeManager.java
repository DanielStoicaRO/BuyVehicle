import java.util.ArrayList;
import java.util.List;

public class BikeManager {

    List<Bike> bikes = new ArrayList<>();

    public BikeManager() {
        addBikeInStock();
    }

    public void addBikeInStock() {
        bikes.add(new Bike(BikeType.CUBE, "sport", "23"));
        bikes.add(new Bike(BikeType.DELTA, "city", "24"));
        bikes.add(new Bike(BikeType.PEGAS, "crossing", "24"));
    }

    public Bike get(int index) {
        return bikes.get(index);
    }

    public void print() {
        int index = 0;
        for (Bike element : bikes) {
            System.out.println("Bike No: " + index + " " + element.getType() + " " +
                    element.getBrand() + " " + element.getModel());
            index++;

        }
    }

    public void remove(int index) {
        bikes.remove(index);
    }
}
