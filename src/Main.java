import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Person> heroes = generateClients();
        Queue<Person> carousel = new LinkedList<>(heroes);
        System.out.println("Карусель, карусель,\nКто успел, тот и сел!\n");
        while (!carousel.isEmpty()) {
            Person person = carousel.poll();
            int tickets = person.getTickets();
            tickets = tickets - 1;
            person.setTickets(tickets);
            System.out.println(person.getName() + " " + person.getSureName() + " успел и прокатился на карусели. Билетов осталось: " + tickets);
            if (tickets > 0) {
                carousel.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Артур", "Дент", 4));
        list.add(new Person("Энтони", "Локвуд", 2));
        list.add(new Person("Дункан", "Айдахо", 1));
        list.add(new Person("Джонатан", "Стрендж", 3));
        list.add(new Person("Федман", "Кассад", 4));
        return list;
    }
}