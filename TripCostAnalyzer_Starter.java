/*
Exercise 1 — Trip Cost & Fuel Analyzer (Student Starter with TODOs)
Focus: variables, primitive types, operators, input, if/else, formatted output

Compile/Run:
  javac TripCostAnalyzer_Starter.java
  java TripCostAnalyzer_Starter
*/

import java.util.Scanner;

public class TripCostAnalyzer_Starter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // TODO 1: Create at least one named constant (final)
        // Example: final double MIN_POSITIVE = 0.0001;

        System.out.println("=== Trip Cost & Fuel Analyzer ===");

        // TODO 2: Read inputs (double, double, double, int)
        System.out.print("Distance (miles): ");
        double distance = 0.0; // TODO: input.nextDouble()

        System.out.print("Fuel efficiency (mpg): ");
        double mpg = 0.0; // TODO: input.nextDouble()

        System.out.print("Gas price per gallon ($): ");
        double pricePerGallon = 0.0; // TODO: input.nextDouble()

        System.out.print("Passengers (whole number): ");
        int passengers = 0; // TODO: input.nextInt()

        // TODO 3: Validate inputs using if/else:
        // - distance > 0
        // - mpg > 0
        // - pricePerGallon >= 0
        // - passengers >= 0
        // If invalid, print a clear message and exit (return).

        // TODO 4: Compute gallonsNeeded, totalCost, costPerMile
        double gallonsNeeded = 0.0;  // distance / mpg
        double totalCost = 0.0;      // gallonsNeeded * pricePerGallon
        double costPerMile = 0.0;    // totalCost / distance

        // TODO 5: If passengers > 0, compute costPerPassenger = totalCost / passengers
        double costPerPassenger = 0.0;

        // TODO 6: Print results using printf (2 decimals)
        System.out.println("\n--- Results ---");
        // System.out.printf("Gallons needed: %.2f%n", gallonsNeeded);

        // TODO 7: Add comments explaining why you chose your data types and formulas.

        input.close();
    }
}
