package com.mycompany.assignment2;

/**
 * Represents a rescue case involving an endangered animal.
 */
public class EndangeredAnimalRescue extends RescueCase {

    // Additional information for an endangered animal
    private String conservationClassification;
    private double securityCost;
    private boolean specialistTeamRequired;

    // Constructor
    public EndangeredAnimalRescue(String rescueCaseId, String animalName,
            String species, String rescueLocation, String assignedRanger,
            int numberOfRescueDays, double dailyCareCost,
            String currentRescueStatus, String conservationClassification,
            double securityCost, boolean specialistTeamRequired) {

        super(rescueCaseId, animalName, species, rescueLocation,
                assignedRanger, numberOfRescueDays, dailyCareCost,
                currentRescueStatus);

        this.conservationClassification = conservationClassification;
        this.securityCost = securityCost;
        this.specialistTeamRequired = specialistTeamRequired;
    }

    // Getters and setters
    public String getConservationClassification() {
        return conservationClassification;
    }

    public void setConservationClassification(String conservationClassification) {
        this.conservationClassification = conservationClassification;
    }

    public double getSecurityCost() {
        return securityCost;
    }

    public void setSecurityCost(double securityCost) {
        this.securityCost = securityCost;
    }

    public boolean isSpecialistTeamRequired() {
        return specialistTeamRequired;
    }

    public void setSpecialistTeamRequired(boolean specialistTeamRequired) {
        this.specialistTeamRequired = specialistTeamRequired;
    }

    // Calculate the total rescue cost
    @Override
    public double calculateTotalRescueCost() {

        double totalCost = (getNumberOfRescueDays() * getDailyCareCost())
                + securityCost;

        if (specialistTeamRequired) {
            totalCost = totalCost + 8000.00;
        }

        return totalCost;
    }

    // Determine rescue priority
    @Override
    public String determineRescuePriority() {

        if (specialistTeamRequired
                && conservationClassification.equalsIgnoreCase("Critically Endangered")) {
            return "Critical";
        } else if (conservationClassification.equalsIgnoreCase("Critically Endangered")
                || conservationClassification.equalsIgnoreCase("Endangered")) {
            return "High";
        } else {
            return "Medium";
        }
    }

    // Return the rescue type
    @Override
    public String getRescueType() {
        return "Endangered Species Rescue";
    }
}