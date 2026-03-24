import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // ✅ Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ✅ Initialize empty bogie list (UC1 requirement)
        List<String> bogies = new ArrayList<>();

        // ✅ Display initial bogie count
        System.out.println("Initial Bogie Count: " + bogies.size());
    }
}