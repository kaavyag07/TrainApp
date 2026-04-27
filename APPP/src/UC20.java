public class UC20 {

    public static void main(String[] args) {

        // Step 1: Bogie IDs (try empty array to test exception)
        String[] bogieIds = {};

        String searchKey = "BG101";

        try {

            // Step 2: Fail-fast validation
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available. Search operation not allowed.");
            }

            System.out.println("Searching for: " + searchKey);

            // Step 3: Linear search (safe to proceed only if data exists)
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchKey)) {
                    found = true;
                    break;
                }
            }

            // Step 4: Result
            if (found) {
                System.out.println("Search Result: SUCCESS - Bogie Found");
            } else {
                System.out.println("Search Result: FAILURE - Bogie Not Found");
            }

        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}