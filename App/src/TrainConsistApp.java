import java.util.ArrayList;
import java.util.List;

/* =====================================================
MAIN CLASS - TrainConsistApp
===================================================== */

public class TrainConsistApp {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===\n");

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues (future use cases will add bogies)
    }
}
