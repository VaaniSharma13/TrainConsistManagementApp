public static void main(String[] args) {

    // Welcome message
    System.out.println("=== Train Consist Management App ===\n");

    // Create HashMap for bogie-capacity mapping
    Map<String, Integer> bogieCapacity = new HashMap<>();

    // Insert bogie capacities
    bogieCapacity.put("Sleeper", 72);
    bogieCapacity.put("AC Chair", 60);
    bogieCapacity.put("First Class", 40);

    // Display capacity details
    System.out.println("Bogie Capacity Details:");

    for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
        System.out.println("Bogie: " + entry.getKey() +
                ", Capacity: " + entry.getValue());
    }
}