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
        bogieIds.add("B1");

        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        // ✅ UC4 (LinkedList)
        LinkedList<String> train = new LinkedList<>();
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        train.add(2, "Pantry");
        train.removeFirst();
        train.removeLast();

        System.out.println("\nFinal Train Consist:");
        System.out.println(train);

        // ✅ UC5
        LinkedHashSet<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); // duplicate

        System.out.println("\nTrain Formation (LinkedHashSet):");
        System.out.println(formation);

        // 🔥 ================= UC6 =================

        // Create HashMap
        HashMap<String, Integer> capacityMap = new HashMap<>();

        // Add bogie → capacity
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 24);

        // Display map
        System.out.println("\nBogie Capacity Mapping:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(
                entry.getKey() + " -> Capacity: " + entry.getValue()
            );
        }
    }
}