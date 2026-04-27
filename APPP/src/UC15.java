class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String shape;
    String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {

        try {
            System.out.println("\nAssigning cargo: " + cargo + " to " + shape + " bogie");

            // Safety rule: rectangular bogie cannot carry petroleum
            if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe Assignment: Rectangular bogie cannot carry Petroleum");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully");

        } catch (CargoSafetyException e) {
            System.out.println("ERROR: " + e.getMessage());

        } finally {
            System.out.println("Operation completed (cleanup/logging executed)");
        }
    }

    public void display() {
        System.out.println("Bogie Shape: " + shape + " | Cargo: " + (cargo == null ? "None" : cargo));
    }
}

public class UC15 {

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment (will trigger exception)
        b2.assignCargo("Petroleum");

        System.out.println("\nFinal Bogie States:");
        b1.display();
        b2.display();

        System.out.println("\nProgram continues safely...");
    }
}