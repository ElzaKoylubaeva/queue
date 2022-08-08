public class Person {
    private final String name;
    private final String lastName;
    private int numberOfTickets;

    public Person(String name, String lastName, int numberOfTickets) {
        this.name = name;
        this.lastName = lastName;
        this.numberOfTickets = numberOfTickets;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}

