

/**
 *
 * @author User
 */
package com.mycompany.assignment2;

/**
 * Represents a rescue case involving an injured animal.
 */
public class InjuredAnimalRescue extends RescueCase {

    // Additional information for an injured animal
    private String injuryDescription;
    private double veterinaryTreatmentCost;
    private boolean surgeryRequired;

    // Constructor
    public InjuredAnimalRescue(String rescueCaseId, String animalName,
            String species, String rescueLocation, String assignedRanger,
            int numberOfRescueDays, double dailyCareCost,
            String currentRescueStatus, String injuryDescription,
            double veterinaryTreatmentCost, boolean surgeryRequired) {

        super(rescueCaseId, animalName, species, rescueLocation,
                assignedRanger, numberOfRescueDays, dailyCareCost,
                currentRescueStatus);

        this.injuryDescription = injuryDescription;
        this.veterinaryTreatmentCost = veterinaryTreatmentCost;
        this.surgeryRequired = surgeryRequired;
    }

    // Getters and setters
    public String getInjuryDescription() {
        return injuryDescription;
    }

    public void setInjuryDescription(String injuryDescription) {
        this.injuryDescription = injuryDescription;
    }

    public double getVeterinaryTreatmentCost() {
        return veterinaryTreatmentCost;
    }

    public void setVeterinaryTreatmentCost(double veterinaryTreatmentCost) {
        this.veterinaryTreatmentCost = veterinaryTreatmentCost;
    }

    public boolean isSurgeryRequired() {
        return surgeryRequired;
    }

    public void setSurgeryRequired(boolean surgeryRequired) {
        this.surgeryRequired = surgeryRequired;
    }

    // Calculate the total rescue cost
    @Override
    public double calculateTotalRescueCost() {

        double totalCost = (getNumberOfRescueDays() * getDailyCareCost())
                + veterinaryTreatmentCost;

        if (surgeryRequired) {
            totalCost = totalCost + 5000.00;
        }

        return totalCost;
    }

    // Determine rescue priority
    @Override
    public String determineRescuePriority() {

        if (surgeryRequired) {
            return "Critical";
        } else if (veterinaryTreatmentCost >= 5000) {
            return "High";
        } else {
            return "Medium";
        }
    }

    // Return the rescue type
    @Override
    public String getRescueType() {
        return "Injured Animal Rescue";
    }
}
