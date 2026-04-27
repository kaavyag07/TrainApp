import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class UC10 {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 48));
        bogies.add(new Bogie("First Class", 36));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("AC 3 Tier", 64));

        // Step 2: Extract capacities and calculate total using reduce
        int totalCapacity = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        // Step 3: Display result
        System.out.println("Total Seating Capacity of Train:");
        System.out.println("--------------------------------");
        System.out.println("Total Seats = " + totalCapacity);

        System.out.println("\nAggregation completed successfully.");
    }
}