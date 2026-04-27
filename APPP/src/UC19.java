import java.util.Arrays;

public class UC19 {

    public static void main(String[] args) {

        // Step 1: Sorted bogie IDs (required for binary search)
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        String searchKey = "BG309";

        System.out.println("Searching for Bogie ID: " + searchKey);

        // Step 2: Binary Search initialization
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Step 3: Binary Search loop
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                System.out.println("Bogie Found at index: " + mid);
                found = true;
                break;
            } else if (comparison > 0) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        // Step 4: Result
        if (found) {
            System.out.println("Search Result: SUCCESS - Bogie exists");
        } else {
            System.out.println("Search Result: FAILURE - Bogie not found");
        }
    }
}