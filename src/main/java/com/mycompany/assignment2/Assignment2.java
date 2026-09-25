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

    System.out.print("Enter Rescue Case ID: ");
    String rescueCaseId = scanner.nextLine();

    System.out.print("Enter Animal Name: ");
    String animalName = scanner.nextLine();

    System.out.print("Enter Species: ");
    String species = scanner.nextLine();

    System.out.print("Enter Rescue Location: ");
    String rescueLocation = scanner.nextLine();

    System.out.print("Enter Assigned Ranger: ");
    String assignedRanger = scanner.nextLine();

    System.out.print("Enter Number of Rescue Days: ");
    int numberOfRescueDays = scanner.nextInt();

    System.out.print("Enter Daily Care Cost: R");
    double dailyCareCost = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Enter Current Rescue Status: ");
    String currentRescueStatus = scanner.nextLine();

    System.out.println();
    System.out.println("Common rescue case information captured.");
    break;

                case 2:
                    System.out.println("Search Rescue Case selected.");
                    break;

                case 3:
                    System.out.println("Update Rescue Status selected.");
                    break;

                case 4:
                    System.out.println("Display All Rescue Cases selected.");
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