import java.util.ArrayList;
import java.util.List;

class TrainAppUC2 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC2 ===");

        // Initialize ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("Passenger bogies after addition: " + passengerBogies);

        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Check if Sleeper bogie exists
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper bogie exist? " + hasSleeper);

        // Display final state of bogies
        System.out.println("Final passenger bogies: " + passengerBogies);
    }
}