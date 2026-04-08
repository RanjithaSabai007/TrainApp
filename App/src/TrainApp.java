import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;   // Rectangular / Cylindrical
    String cargo;  // Coal / Petroleum / Grain etc.

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Grain"));

        // Safety validation using stream
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Display result
        System.out.println("Goods Bogies:");
        for (GoodsBogie b : goodsBogies) {
            System.out.println(b);
        }

        System.out.println("Safety Compliance: " + (isSafe ? "SAFE" : "UNSAFE"));
    }
}