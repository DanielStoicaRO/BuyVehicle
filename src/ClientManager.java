import java.util.ArrayList;
import java.util.List;

public class ClientManager {
    private List<Person> clients = new ArrayList<>();

    public ClientManager(){
        addKnownClients();
    }
    private void addKnownClients(){
        clients.add(new Person("Daniel", "Alexandru", 1977, 2, 9));
        clients.add(new Person("Babuin", "Cocos", 1982, 4, 14));
        clients.add(new Person("Ramon", "Trombon", 1986, 8, 11));
    }
    public void addClient() {
        clients.add(new Person());
        printClients();
    }
    public Person getClient(int index) {
        return clients.get(index);
    }

    public void printClients() {
        for (Person person : clients) {
            System.out.println(person.getFirstName() + " - " + person.getLastName() + " - "
                    + person.getYear() + " - " + person.getMonth() + " - " + person.getDay());
        }
    }
}
