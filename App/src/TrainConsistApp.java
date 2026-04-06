public static void main(String[] args) {

    // Welcome message
    System.out.println("=== Train Consist Management App ===\n");

    // Create LinkedHashSet for train formation
    LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

    // Add bogies
    trainFormation.add("Engine");
    trainFormation.add("Sleeper");
    trainFormation.add("Cargo");
    trainFormation.add("Guard");

    // Attempt to add duplicate
    trainFormation.add("Sleeper"); // duplicate (will be ignored)

    // Display final formation
    System.out.println("Train Formation (Insertion Order Preserved):");
    System.out.println(trainFormation);
}
