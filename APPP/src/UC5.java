import java.util.LinkedHashSet;
import java.util.Set;

class TrainAppUC5 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC5 ===");

        // Initialize LinkedHashSet to preserve order and uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies (duplicates added intentionally)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper"); // duplicate

        // Display final formation
        System.out.println("Final train formation: " + trainFormation);
    }
}