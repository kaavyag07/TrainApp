import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UC11 {

    public static void main(String[] args) {

        // Sample inputs (you can change these or take user input later)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Step 1: Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Step 2: Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // Step 3: Create matchers
        Matcher trainMatcher = trainRegex.matcher(trainId);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        // Step 4: Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("Train ID is VALID: " + trainId);
        } else {
            System.out.println("Train ID is INVALID: " + trainId);
        }

        // Step 5: Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID: " + cargoCode);
        } else {
            System.out.println("Cargo Code is INVALID: " + cargoCode);
        }

        System.out.println("\nValidation completed successfully.");
    }
}