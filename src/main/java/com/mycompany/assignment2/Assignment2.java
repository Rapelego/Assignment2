package com.mycompany.assignment2;

import java.util.Scanner;

/**
 * Main class for the Wildlife Rescue Operations System.
 */
public class Assignment2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create the rescue manager
        RescueManager manager = new RescueManager();

        int choice = 0;

        // Display the main menu until the user chooses Exit
        while (choice != 6) {

            System.out.println();
            System.out.println("======================================");
            System.out.println("   WILDLIFE RESCUE OPERATIONS SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Rescue Case");
            System.out.println("2. Search Rescue Case");
            System.out.println("3. Update Rescue Status");
            System.out.println("4. Display All Rescue Cases");
            System.out.println("5. Display Total Rescue Cost");
            System.out.println("6. Exit");
            System.out.println("======================================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

    System.out.println();
    System.out.println("========== ADD RESCUE CASE ==========");

    String rescueCaseId;

do {
    System.out.print("Enter Rescue Case ID: ");
    rescueCaseId = scanner.nextLine().trim();

    if (rescueCaseId.isEmpty()) {
        System.out.println("Rescue Case ID cannot be blank.");
    }

} while (rescueCaseId.isEmpty());

    System.out.print("Enter Animal Name: ");
    String animalName = scanner.nextLine();

   String species;

do {
    System.out.print("Enter Species: ");
    species = scanner.nextLine().trim();

    if (species.isEmpty()) {
        System.out.println("Species cannot be blank.");
    }

} while (species.isEmpty());

    String rescueLocation;

do {
    System.out.print("Enter Rescue Location: ");
    rescueLocation = scanner.nextLine().trim();

    if (rescueLocation.isEmpty()) {
        System.out.println("Rescue Location cannot be blank.");
    }

} while (rescueLocation.isEmpty());

    String assignedRanger;

do {
    System.out.print("Enter Assigned Ranger: ");
    assignedRanger = scanner.nextLine().trim();

    if (assignedRanger.isEmpty()) {
        System.out.println("Assigned Ranger cannot be blank.");
    }

} while (assignedRanger.isEmpty());

    System.out.print("Enter Number of Rescue Days: ");
    int numberOfRescueDays = scanner.nextInt();

    System.out.print("Enter Daily Care Cost: R");
    double dailyCareCost = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Enter Current Rescue Status: ");
    String currentRescueStatus = scanner.nextLine();

    System.out.println();
System.out.println("Select Rescue Type:");
System.out.println("1. Injured Animal Rescue");
System.out.println("2. Orphaned Animal Rescue");
System.out.println("3. Endangered Species Rescue");

System.out.print("Enter rescue type: ");
int rescueType = scanner.nextInt();
scanner.nextLine();

switch (rescueType) {

    case 1:

        System.out.println();
        System.out.println("----- Injured Animal Information -----");

        System.out.print("Enter Injury Description: ");
        String injuryDescription = scanner.nextLine();

        System.out.print("Enter Veterinary Treatment Cost: R");
        double veterinaryTreatmentCost = scanner.nextDouble();

        System.out.print("Is Surgery Required? (yes/no): ");
        String surgeryAnswer = scanner.next();
        scanner.nextLine();

        boolean surgeryRequired = surgeryAnswer.equalsIgnoreCase("yes");

        // Create an injured animal rescue object
        InjuredAnimalRescue injuredRescue = new InjuredAnimalRescue(
                rescueCaseId,
                animalName,
                species,
                rescueLocation,
                assignedRanger,
                numberOfRescueDays,
                dailyCareCost,
                currentRescueStatus,
                injuryDescription,
                veterinaryTreatmentCost,
                surgeryRequired
        );

        // Add the rescue case to the manager
        manager.addRescueCase(injuredRescue);

        break;

    case 2:

        System.out.println();
        System.out.println("----- Orphaned Animal Information -----");

        System.out.print("Enter Estimated Age: ");
        int estimatedAge = scanner.nextInt();

        System.out.print("Enter Feeding Cost: R");
        double feedingCost = scanner.nextDouble();

        System.out.print("Is Foster Care Required? (yes/no): ");
        String fosterAnswer = scanner.next();
        scanner.nextLine();

        boolean fosterCareRequired = fosterAnswer.equalsIgnoreCase("yes");

        // Create an orphaned animal rescue object
        OrphanedAnimalRescue orphanedRescue = new OrphanedAnimalRescue(
                rescueCaseId,
                animalName,
                species,
                rescueLocation,
                assignedRanger,
                numberOfRescueDays,
                dailyCareCost,
                currentRescueStatus,
                estimatedAge,
                feedingCost,
                fosterCareRequired
        );

        // Add the rescue case to the manager
        manager.addRescueCase(orphanedRescue);

        break;

    case 3:

        System.out.println();
        System.out.println("----- Endangered Species Information -----");

        System.out.print("Enter Conservation Classification: ");
        String conservationClassification = scanner.nextLine();

        System.out.print("Enter Security Cost: R");
        double securityCost = scanner.nextDouble();

        System.out.print("Is a Specialist Team Required? (yes/no): ");
        String specialistAnswer = scanner.next();
        scanner.nextLine();

        boolean specialistTeamRequired = specialistAnswer.equalsIgnoreCase("yes");

        // Create an endangered animal rescue object
        EndangeredAnimalRescue endangeredRescue = new EndangeredAnimalRescue(
                rescueCaseId,
                animalName,
                species,
                rescueLocation,
                assignedRanger,
                numberOfRescueDays,
                dailyCareCost,
                currentRescueStatus,
                conservationClassification,
                securityCost,
                specialistTeamRequired
        );

        // Add the rescue case to the manager
        manager.addRescueCase(endangeredRescue);

        break;

    default:
        System.out.println("Invalid rescue type.");
        break;
}

                case 2:

    System.out.println();
    System.out.println("========== SEARCH RESCUE CASE ==========");

    System.out.print("Enter Rescue Case ID to search: ");
    String searchId = scanner.nextLine().trim();

    RescueCase foundCase = manager.searchRescueCase(searchId);

    if (foundCase != null) {

        System.out.println();
        System.out.println("Rescue case found.");
        System.out.println("-----------------------------------");
        System.out.println("Rescue Case ID: " + foundCase.getRescueCaseId());
        System.out.println("Animal Name: " + foundCase.getAnimalName());
        System.out.println("Species: " + foundCase.getSpecies());
        System.out.println("Rescue Type: " + foundCase.getRescueType());
        System.out.println("Rescue Location: " + foundCase.getRescueLocation());
        System.out.println("Assigned Ranger: " + foundCase.getAssignedRanger());
        System.out.println("Rescue Days: " + foundCase.getNumberOfRescueDays());
        System.out.println("Current Status: " + foundCase.getCurrentRescueStatus());
        System.out.println("Priority: " + foundCase.determineRescuePriority());
        System.out.println("Total Rescue Cost: R"
                + String.format("%.2f", foundCase.calculateTotalRescueCost()));
        System.out.println("-----------------------------------");

    } else {

        System.out.println("Rescue case not found.");
    }

    break;

                case 3:

    System.out.println();
    System.out.println("========== UPDATE RESCUE STATUS ==========");

    System.out.print("Enter Rescue Case ID: ");
    String updateId = scanner.nextLine().trim();

    RescueCase caseToUpdate = manager.searchRescueCase(updateId);

    if (caseToUpdate != null) {

        System.out.println("Current Status: "
                + caseToUpdate.getCurrentRescueStatus());

        System.out.print("Enter New Rescue Status: ");
        String newStatus = scanner.nextLine().trim();

        manager.updateRescueStatus(updateId, newStatus);

        System.out.println("New Status: "
                + caseToUpdate.getCurrentRescueStatus());

    } else {

        System.out.println("Rescue case not found.");
    }

    break;

                case 4:

    System.out.println();
    System.out.println("========== ALL RESCUE CASES ==========");

    manager.displayAllRescueCases();

    break;

                case 5:
                    System.out.println("Display Total Rescue Cost selected.");
                    break;

                case 6:
                    System.out.println("Thank you for using the Wildlife Rescue Operations System.");
                    break;

                default:
                    System.out.println("Invalid menu choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}