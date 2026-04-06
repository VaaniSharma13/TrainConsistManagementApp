public static void main(String[] args) {

    System.out.println("=== Train Consist Management App ===\n");

    // Create HashSet for unique bogie IDs
    Set<String> bogieIds = new HashSet<>();

    // Add bogie IDs (including duplicates intentionally)
    bogieIds.add("BG101");
    bogieIds.add("BG102");
    bogieIds.add("BG103");
    bogieIds.add("BG101"); // duplicate
    bogieIds.add("BG102"); // duplicate

    // Display final set
    System.out.println("Unique Bogie IDs:");
    System.out.println(bogieIds);
}