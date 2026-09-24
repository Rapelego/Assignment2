/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

/**
 *
 * @author User
 */

/**
 * Base class for all wildlife rescue cases.
 */
public abstract class RescueCase {

    // Common information for every rescue case
    private String rescueCaseId;
    private String animalName;
    private String species;
    private String rescueLocation;
    private String assignedRanger;
    private int numberOfRescueDays;
    private double dailyCareCost;
    private String currentRescueStatus;

    // Constructor
    public RescueCase(String rescueCaseId, String animalName, String species,
            String rescueLocation, String assignedRanger,
            int numberOfRescueDays, double dailyCareCost,
            String currentRescueStatus) {

        this.rescueCaseId = rescueCaseId;
        this.animalName = animalName;
        this.species = species;
        this.rescueLocation = rescueLocation;
        this.assignedRanger = assignedRanger;
        this.numberOfRescueDays = numberOfRescueDays;
        this.dailyCareCost = dailyCareCost;
        this.currentRescueStatus = currentRescueStatus;
    }

    // Getters and setters

    public String getRescueCaseId() {
        return rescueCaseId;
    }

    public void setRescueCaseId(String rescueCaseId) {
        this.rescueCaseId = rescueCaseId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRescueLocation() {
        return rescueLocation;
    }

    public void setRescueLocation(String rescueLocation) {
        this.rescueLocation = rescueLocation;
    }

    public String getAssignedRanger() {
        return assignedRanger;
    }

    public void setAssignedRanger(String assignedRanger) {
        this.assignedRanger = assignedRanger;
    }

    public int getNumberOfRescueDays() {
        return numberOfRescueDays;
    }

    public void setNumberOfRescueDays(int numberOfRescueDays) {
        this.numberOfRescueDays = numberOfRescueDays;
    }

    public double getDailyCareCost() {
        return dailyCareCost;
    }

    public void setDailyCareCost(double dailyCareCost) {
        this.dailyCareCost = dailyCareCost;
    }

    public String getCurrentRescueStatus() {
        return currentRescueStatus;
    }

    public void setCurrentRescueStatus(String currentRescueStatus) {
        this.currentRescueStatus = currentRescueStatus;
    }

    // Methods that each rescue type must implement
    public abstract double calculateTotalRescueCost();

    public abstract String determineRescuePriority();

    public abstract String getRescueType();

    // Common method to update the rescue status
    public void updateStatus(String newStatus) {
        currentRescueStatus = newStatus;
    }
}
