class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class UC14 {

    public static void main(String[] args) {

        try {
            // Valid bogies
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 48);
            PassengerBogie b3 = new PassengerBogie("First Class", 36);

            System.out.println("Valid Bogies Created Successfully:");
            System.out.println(b1.getType() + " -> " + b1.getCapacity());
            System.out.println(b2.getType() + " -> " + b2.getCapacity());
            System.out.println(b3.getType() + " -> " + b3.getCapacity());

            System.out.println("\nTrying invalid bogie creation...");

            // Invalid bogie (this will throw exception)
            PassengerBogie b4 = new PassengerBogie("General", 0);

        } catch (InvalidCapacityException e) {
            System.out.println("\nException Occurred: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}