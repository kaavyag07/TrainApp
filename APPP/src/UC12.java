import java.util.*;

class GoodsBogie {
    String type;   // e.g., Cylindrical, Open, Box
    String cargo;  // e.g., Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}

public class UC12 {

    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Step 2: Safety validation using Stream allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical")
                                || b.getCargo().equals("Petroleum")
                );

        // Step 3: Display result
        System.out.println("Safety Compliance Check:");
        System.out.println("------------------------");

        if (isSafe) {
            System.out.println("Train is SAFE for operation");
        } else {
            System.out.println("Train is UNSAFE - Safety violation detected");
        }

        System.out.println("\nValidation completed successfully.");
    }
}