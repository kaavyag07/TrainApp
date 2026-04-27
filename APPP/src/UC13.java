import java.util.*;
import java.util.stream.Collectors;

class QuantityMeasurementApp {

    // ----------- BOGIE CLASS -----------
    static class Bogie {
        private String type;
        private int capacity;

        public Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return type + " (" + capacity + ")";
        }
    }

    // ----------- MAIN METHOD -----------
    public static void main(String[] args) {

        // Create dataset (large for benchmarking)
        List<Bogie> bogies = generateBogies(100000);

        // -------- LOOP BASED FILTERING --------
        long loopStart = System.nanoTime();

        List<Bogie> loopResult = filterUsingLoop(bogies);

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // -------- STREAM BASED FILTERING --------
        long streamStart = System.nanoTime();

        List<Bogie> streamResult = filterUsingStream(bogies);

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // -------- OUTPUT --------
        System.out.println("=== PERFORMANCE COMPARISON ===");
        System.out.println("Loop Result Size   : " + loopResult.size());
        System.out.println("Stream Result Size : " + streamResult.size());

        System.out.println("Loop Execution Time   : " + loopTime + " ns");
        System.out.println("Stream Execution Time : " + streamTime + " ns");

        // Verify correctness
        boolean isMatch = loopResult.size() == streamResult.size();
        System.out.println("Results Match: " + isMatch);
    }

    // -------- LOOP FILTERING --------
    public static List<Bogie> filterUsingLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();

        for (Bogie bogie : bogies) {
            if (bogie.getCapacity() > 60) {
                result.add(bogie);
            }
        }
        return result;
    }

    // -------- STREAM FILTERING --------
    public static List<Bogie> filterUsingStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    // -------- DATA GENERATION --------
    public static List<Bogie> generateBogies(int size) {
        List<Bogie> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int capacity = 30 + random.nextInt(100); // 30–129
            list.add(new Bogie("Passenger", capacity));
        }
        return list;
    }
}