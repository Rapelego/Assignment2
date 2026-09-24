package com.mycompany.assignment2;

/**
 * Represents a rescue case involving an orphaned animal.
 */
public class OrphanedAnimalRescue extends RescueCase {

    // Additional information for an orphaned animal
    private int estimatedAge;
    private double feedingCost;
    private boolean fosterCareRequired;

    // Constructor
    public OrphanedAnimalRescue(String rescueCaseId, String animalName,
            String species, String rescueLocation, String assignedRanger,
            int numberOfRescueDays, double dailyCareCost,
            String currentRescueStatus, int estimatedAge,
            double feedingCost, boolean fosterCareRequired) {

        super(rescueCaseId, animalName, species, rescueLocation,
                assignedRanger, numberOfRescueDays, dailyCareCost,
                currentRescueStatus);

        this.estimatedAge = estimatedAge;
        this.feedingCost = feedingCost;
        this.fosterCareRequired = fosterCareRequired;
    }

    // Getters and setters
    public int getEstimatedAge() {
        return estimatedAge;
    }

    public void setEstimatedAge(int estimatedAge) {
        this.estimatedAge = estimatedAge;
    }

    public double getFeedingCost() {
        return feedingCost;
    }

    public void setFeedingCost(double feedingCost) {
        this.feedingCost = feedingCost;
    }

    public boolean isFosterCareRequired() {
        return fosterCareRequired;
    }

    public void setFosterCareRequired(boolean fosterCareRequired) {
        this.fosterCareRequired = fosterCareRequired;
    }

    // Calculate the total rescue cost
    @Override
    public double calculateTotalRescueCost() {

        double totalCost = (getNumberOfRescueDays() * getDailyCareCost())
                + feedingCost;

        if (fosterCareRequired) {
            totalCost = totalCost + 2500.00;
        }

        return totalCost;
    }

    // Determine rescue priority
    @Override
    public String determineRescuePriority() {

        if (fosterCareRequired && estimatedAge <= 1) {
            return "High";
        } else if (estimatedAge <= 3) {
            return "Medium";
        } else {
            return "Low";
        }
    }

    // Return the rescue type
    @Override
    public String getRescueType() {
        return "Orphaned Animal Rescue";
    }
}