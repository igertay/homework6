public class Person {

    private String name;
    private String sureName;
    private int tickets;

    public Person(String name, String sureName, int tickets) {
        this.name = name;
        this.sureName = sureName;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
}
