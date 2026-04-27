public class UC16 {

    public static void main(String[] args) {

        // Step 1: Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Capacities:");
        printArray(capacities);

        // Step 2: Bubble Sort logic
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Step 3: Sorted output
        System.out.println("\nSorted Capacities (Bubble Sort):");
        printArray(capacities);
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}