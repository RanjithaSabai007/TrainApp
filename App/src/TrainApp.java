import java.util.LinkedList;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> consist = new LinkedList<>();

        // Add bogies
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        // Insert Pantry Car at position 2 (index 1-based -> index 1? No: position 2 means index 1 or 2 depending)
        // Assuming position 2 (0-based index 2)
        consist.add(2, "Pantry Car");

        // Remove first and last bogie
        consist.removeFirst();
        consist.removeLast();

        // Display final consist
        System.out.println("Final Train Consist: " + consist);
    }
}