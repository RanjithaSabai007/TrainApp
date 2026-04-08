import java.util.HashMap;
import java.util.Map;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Iterate and display bogie capacities
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    ", Capacity: " + entry.getValue());
        }
    }
}