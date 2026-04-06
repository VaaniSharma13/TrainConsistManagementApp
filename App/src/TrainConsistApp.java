public static void main(String[] args) {

    // Welcome message
    System.out.println("=== Train Consist Management App ===\n");

    // Create LinkedList for train consist
    LinkedList<String> trainConsist = new LinkedList<>();

    // Add bogies
    trainConsist.add("Engine");
    trainConsist.add("Sleeper");
    trainConsist.add("AC");
    trainConsist.add("Cargo");
    trainConsist.add("Guard");

    // Display initial consist
    System.out.println("Initial Train Consist:");
    System.out.println(trainConsist);

    // Insert Pantry Car at position 2
    trainConsist.add(2, "Pantry");

    System.out.println("\nAfter adding Pantry Car at position 2:");
    System.out.println(trainConsist);

    // Remove first and last bogie
    trainConsist.removeFirst();
    trainConsist.removeLast();

    System.out.println("\nAfter removing first and last bogie:");
    System.out.println(trainConsist);
}