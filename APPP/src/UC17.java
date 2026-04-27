import java.util.Arrays;

public class UC17 {

    public static void main(String[] args) {

        // Step 1: Bogie type names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 2: Sort using built-in Java method
        Arrays.sort(bogieNames);

        // Step 3: Display sorted result
        System.out.println("\nSorted Bogie Names (Alphabetical Order):");
        System.out.println(Arrays.toString(bogieNames));
    }
}