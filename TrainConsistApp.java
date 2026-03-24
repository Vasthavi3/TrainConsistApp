import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // ✅ UC1
        System.out.println("=== Train Consist Management App ===");

        List<String> bogies = new ArrayList<>();
        System.out.println("Initial Bogie Count: " + bogies.size());

        // 🔥 ================= UC2 =================

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display after adding
        System.out.println("\nBogies after addition:");
        System.out.println(bogies);

        // Remove one bogie
        bogies.remove("AC Chair");

        // Check existence
        if (bogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists");
        } else {
            System.out.println("\nSleeper bogie not found");
        }

        // Final list
        System.out.println("\nFinal Bogie List:");
        System.out.println(bogies);
    }
}