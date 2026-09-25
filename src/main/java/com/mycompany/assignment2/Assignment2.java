/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment2;

/**
 *
 * @author User
 */

import java.util.Scanner;

/**
 * Main class for the Wildlife Rescue Operations System.
 */
public class Assignment2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create the rescue manager
        RescueManager manager = new RescueManager();

        System.out.println("======================================");
        System.out.println("   WILDLIFE RESCUE OPERATIONS SYSTEM");
        System.out.println("======================================");

        System.out.println("System started successfully.");

        scanner.close();
    }
}
