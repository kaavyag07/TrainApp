import java.util.HashMap;
import java.util.Map;

public class UC6 {

    public static void main(String[] args) {

        // Step 1: Create HashMap to store bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Step 2: Insert bogies with their capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 48);
        bogieCapacity.put("First Class", 36);
        bogieCapacity.put("General", 90);
        bogieCapacity.put("AC 3 Tier", 64);

        // Step 3: Display bogie-capacity mapping
        System.out.println("Bogie Capacity Mapping:");
        System.out.println("------------------------");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey()
                    + " -> Capacity: " + entry.getValue());
        }

        // Program continues (as per requirement)
        System.out.println("\nMapping completed successfully.");
    }
}