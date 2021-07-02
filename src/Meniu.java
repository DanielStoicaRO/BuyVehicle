import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Meniu {

    private ClientManager clientManager = new ClientManager();
    private CarManager carManager = new CarManager();
    private BikeManager bikeManager = new BikeManager();
    private Scanner scanner = new Scanner(System.in);

    public Meniu() {
        showMainMenu();
    }

    private void showMainMenu() {
        int option = 0;
        System.out.println("Welcome to vehicle meniu: " +
                "\nPlease select your option:" +
                "\n1. Add a client" +
                "\n2. List of Products" +
                "\n3. Client buy a product - subMeniu" +
                "\n0. Exit");
        try {
            option = scanner.nextInt();
        } catch (MissingFormatArgumentException e) {
            System.out.println("Please introduce a valid number!");
            option = scanner.nextInt();
        }
        System.out.println("Waiting for imput: ");
        switch (option) {
            case 1:
                System.out.println("Introduce person: ");
                clientManager.addClient();
                break;
            case 2:
                carManager.print();
                bikeManager.print();
                break;
            case 3:
                showBuyMenu();
                break;
            default:
                System.out.println("TheOption is not valid");
        }
        showMainMenu();
    }

    private void showBuyMenu(){
        System.out.println("\"Please select: \\n1.Client \\n2.Car \\n3.BIKE \\n 0.Exit to MainMenu \" ");
        int option = scanner.nextInt();
        Person client;
        Car car;
        Bike bike;

        while (option !=0){
            switch (option){
                case 1:
                    System.out.println("Please select client number: ");
                    int index = scanner.nextInt();
                    client = clientManager.getClient(index);
                    System.out.println("Client selected: " + index);
                    break;
                case 2:
                    System.out.println("Please selected Car number: ");
                    index = scanner.nextInt();
                    car = carManager.getCar(index);
                    System.out.println("Car selected: " + car);

                    carManager.removeCar(index);
                    carManager.print();
                    break;
                case 3:
                    System.out.println(" Please select Bike number: ");
                    index = scanner.nextInt();
                    bike = bikeManager.get(index);
                    System.out.println("Bike selected: " + bike);

                    bikeManager.remove(index);
                    bikeManager.print();
                    break;
            }
            System.out.println("Select another options!");
            option = scanner.nextInt();
        }
        showMainMenu();
    }
}
