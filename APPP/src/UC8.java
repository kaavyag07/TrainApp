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

public class UC8 {

    public static void main(String[] args) {

        // Step 1: Create list of bogies (same as UC7)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 48));
        bogies.add(new Bogie("First Class", 36));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("AC 3 Tier", 64));

        // Step 2: Convert list to stream and filter
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):");
        System.out.println("--------------------------------");

        for (Bogie b : filteredBogies) {
            System.out.println("Bogie: " + b.getName()
                    + " -> Capacity: " + b.getCapacity());
        }

        System.out.println("\nFiltering completed successfully.");
    }
}