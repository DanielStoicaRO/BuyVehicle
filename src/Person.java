import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int year;
    private int month;
    private int day;

    public Person() {
        this.createPerson();
    }

    public Person(String firstName, String lastName, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private void createPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce firstName: ");
        firstName = scanner.next();
        System.out.println("Introduce lastName: ");
        lastName = scanner.next();
        System.out.println("Introduce year: ");
        year = scanner.nextInt();
        System.out.println("Introduce month: ");
        month = scanner.nextInt();
        System.out.println("Introduce day: ");
        day = scanner.nextInt();
        System.out.println("Your new Person it's redy to be added in list");
    }

    @Override
    public String toString() {
        return "Person " +
                "firstName= " + firstName +
                ", lastName= " + lastName +
                ", year= " + year +
                ", month= " + month +
                ", day= " + day;
    }
}
