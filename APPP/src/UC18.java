public class UC18 {

    public static void main(String[] args) {

        // Step 1: Array of bogie IDs (unsorted)
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // Step 2: Search key (you can change this)
        String searchKey = "BG309";

        System.out.println("Searching for Bogie ID: " + searchKey);

        // Step 3: Linear Search
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                System.out.println("Bogie Found at index: " + i);
                found = true;
                break; // early termination
            }
        }

        // Step 4: Result output
        if (found) {
            System.out.println("Search Result: SUCCESS - Bogie exists");
        } else {
            System.out.println("Search Result: FAILURE - Bogie not found");
        }
    }
}