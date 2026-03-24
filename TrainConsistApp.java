import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        // ✅ UC1
        System.out.println("=== Train Consist Management App ===");
        List<String> bogies = new ArrayList<>();
        System.out.println("Initial Bogie Count: " + bogies.size());

        // ✅ UC2
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("\nBogies after addition:");
        System.out.println(bogies);

        bogies.remove("AC Chair");

        if (bogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists");
        }

        System.out.println("\nFinal Bogie List:");
        System.out.println(bogies);

        // 🔥 ================= UC3 =================

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (with duplicates)
        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");
        bogieIds.add("B1"); // duplicate
        bogieIds.add("B2"); // duplicate

        // Display unique bogies
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);
    }
}