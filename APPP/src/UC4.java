import java.util.LinkedList;
import java.util.List;

class TrainAppUC4 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC4 ===");

        // Initialize a LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert Pantry Car at position 2 (indexing starts from 0)
        trainConsist.add(2, "Pantry Car");

        // Remove first and last bogies
        trainConsist.removeFirst(); // removes Engine
        trainConsist.removeLast();  // removes Guard

        // Display final ordered train consist
        System.out.println("Final ordered train consist: " + trainConsist);
    }
}