import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<Person> generateClients() {
        List<Person> people = new ArrayList<>();
        people.add(createPerson("Ann", "Cane", 5));
        people.add(createPerson("Joe", "Mattew", 3));
        people.add(createPerson("Jane", "Ostin", 4));
        people.add(createPerson("Mary", "Beth", 7));
        people.add(createPerson("Joe", "Black", 2));
        people.add(createPerson("Kate", "Anderson", 1));
        return people;
    }

    private static Person createPerson(String name, String lastName, int numberOfTickets) {
        return new Person(name, lastName, numberOfTickets);
    }

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(Main.generateClients());

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println(person.getName() + " " + person.getLastName() + " rode the attraction");
            int remainingTickets = person.getNumberOfTickets() - 1;
            if (remainingTickets != 0) {
                person.setNumberOfTickets(remainingTickets);
                queue.offer(person);
            }
        }
    }
}
