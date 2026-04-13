import java.util.*;
import java.util.stream.*;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return "Bogie Type: " + type + ", Capacity: " + capacity;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 65));

        System.out.println("Bogies:");
        bogies.forEach(System.out::println);

        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity: " + totalCapacity);
    }
}