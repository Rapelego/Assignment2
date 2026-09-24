/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
package com.mycompany.assignment2;

/**
 * Defines the main operations for managing wildlife rescue cases.
 */
public interface RescueOperations {

    void addRescueCase(RescueCase rescueCase);

    RescueCase searchRescueCase(String rescueCaseId);

    void updateRescueStatus(String rescueCaseId, String newStatus);

    void displayAllRescueCases();

    double calculateTotalRescueCost();
}
