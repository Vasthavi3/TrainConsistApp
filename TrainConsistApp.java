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

        // ✅ UC3
        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");
        bogieIds.add("B1"); // duplicate

        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        // 🔥 ================= UC4 =================

        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train:");
        System.out.println(train);

        // Insert Pantry Car at index 2
        train.add(2, "Pantry");

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Final consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}