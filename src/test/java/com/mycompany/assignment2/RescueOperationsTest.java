/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

/**
 *
 * @author User
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests for the Wildlife Rescue Operations System.
 */
public class RescueOperationsTest {

    @Test
    public void testRescueCostCalculation() {

        InjuredAnimalRescue rescue = new InjuredAnimalRescue(
                "WR101",
                "Elephant",
                "African Elephant",
                "Kruger National Park",
                "John",
                3,
                500.00,
                "Rescue in Progress",
                "Leg injury",
                2000.00,
                true
        );

        double expectedCost = 8500.00;

        assertEquals(expectedCost, rescue.calculateTotalRescueCost(), 0.01);
    }

@Test
public void testRescuePriorityCalculation() {

    InjuredAnimalRescue rescue = new InjuredAnimalRescue(
            "WR102",
            "Rhino",
            "White Rhino",
            "Hluhluwe",
            "Peter",
            2,
            400.00,
            "Under Observation",
            "Serious leg injury",
            6000.00,
            false
    );

    String expectedPriority = "High";

    assertEquals(expectedPriority, rescue.determineRescuePriority());
}
@Test
public void testRescueStatusUpdate() {

    RescueManager manager = new RescueManager();

    InjuredAnimalRescue rescue = new InjuredAnimalRescue(
            "WR103",
            "Lion",
            "African Lion",
            "Kruger National Park",
            "David",
            2,
            300.00,
            "Rescue in Progress",
            "Leg injury",
            1500.00,
            false
    );

    manager.addRescueCase(rescue);

    manager.updateRescueStatus("WR103", "Under Observation");

    assertEquals("Under Observation", rescue.getCurrentRescueStatus());
}
}