/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
package com.mycompany.assignment2;

import java.util.ArrayList;

/**
 * Manages all wildlife rescue cases.
 */
public class RescueManager implements RescueOperations {

    // List used to store all rescue cases
    private ArrayList<RescueCase> rescueCases;

    // Constructor
    public RescueManager() {
        rescueCases = new ArrayList<>();
    }

    // Add a new rescue case
    @Override
    public void addRescueCase(RescueCase rescueCase) {

        // Check that the rescue case ID is not already used
        if (searchRescueCase(rescueCase.getRescueCaseId()) != null) {
            System.out.println("Rescue Case ID already exists.");
            return;
        }

        rescueCases.add(rescueCase);
        System.out.println("Rescue case added successfully.");
    }

    // Search for a rescue case using its ID
    @Override
    public RescueCase searchRescueCase(String rescueCaseId) {

        for (RescueCase rescueCase : rescueCases) {

            if (rescueCase.getRescueCaseId().equalsIgnoreCase(rescueCaseId)) {
                return rescueCase;
            }
        }

        return null;
    }

    // Update the status of a rescue case
    @Override
    public void updateRescueStatus(String rescueCaseId, String newStatus) {

        RescueCase rescueCase = searchRescueCase(rescueCaseId);

        if (rescueCase != null) {
            rescueCase.updateStatus(newStatus);
            System.out.println("Rescue status updated successfully.");
        } else {
            System.out.println("Rescue case not found.");
        }
    }

    // Display all rescue cases
    @Override
    public void displayAllRescueCases() {

        if (rescueCases.isEmpty()) {
            System.out.println("No rescue cases available.");
            return;
        }

        for (RescueCase rescueCase : rescueCases) {

            System.out.println("-----------------------------------");
            System.out.println("Rescue Case ID: " + rescueCase.getRescueCaseId());
            System.out.println("Animal Name: " + rescueCase.getAnimalName());
            System.out.println("Species: " + rescueCase.getSpecies());
            System.out.println("Rescue Type: " + rescueCase.getRescueType());
            System.out.println("Location: " + rescueCase.getRescueLocation());
            System.out.println("Assigned Ranger: " + rescueCase.getAssignedRanger());
            System.out.println("Rescue Days: " + rescueCase.getNumberOfRescueDays());
            System.out.println("Daily Care Cost: R" + String.format("%.2f", rescueCase.getDailyCareCost()));
            System.out.println("Status: " + rescueCase.getCurrentRescueStatus());
            System.out.println("Priority: " + rescueCase.determineRescuePriority());
            System.out.println("Total Rescue Cost: R"
                    + String.format("%.2f", rescueCase.calculateTotalRescueCost()));
        }

        System.out.println("-----------------------------------");
    }

    // Calculate the total cost of all rescue cases
    @Override
    public double calculateTotalRescueCost() {

        double totalCost = 0.0;

        for (RescueCase rescueCase : rescueCases) {
            totalCost = totalCost + rescueCase.calculateTotalRescueCost();
        }

        return totalCost;
    }
}