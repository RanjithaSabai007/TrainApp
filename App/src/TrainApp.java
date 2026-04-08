class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    void assignCargo(String cargo) {
        try {
            // Safety rule: Rectangular cannot carry Petroleum
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be loaded in Rectangular bogie");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + type + " -> " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed for " + type);
        }
    }
}

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Safe assignment
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        // Program continues
        System.out.println("Program continues safely...");
    }
}