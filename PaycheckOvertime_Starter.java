/*
Exercise 2 — Paycheck & Overtime Calculator (Student Starter with TODOs)
Focus: variables, primitives, operators, type conversion, branching, formatted output

Compile/Run:
  javac PaycheckOvertime_Starter.java
  java PaycheckOvertime_Starter
*/

import java.util.Scanner;

public class PaycheckOvertime_Starter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // TODO 1: Create named constants:
        // final double OVERTIME_MULTIPLIER = 1.5;
        // final double OVERTIME_THRESHOLD = 40.0;

        System.out.println("=== Paycheck & Overtime Calculator ===");

        // TODO 2: Read employee name (String)
        System.out.print("Employee name: ");
        String name = ""; // TODO: input.nextLine()

        // TODO 3: Read hours (double) and hourly rate (double)
        System.out.print("Hours worked: ");
        double hours = 0.0; // TODO: input.nextDouble()

        System.out.print("Hourly rate ($): ");
        double rate = 0.0; // TODO: input.nextDouble()

        // TODO 4: Read retirement percent as int (e.g., 5 means 5%)
        System.out.print("Retirement contribution percent (0–100): ");
        int percent = 0; // TODO: input.nextInt()

        // TODO 5: Read Y/N char for whether to print a detailed stub
        System.out.print("Print detailed pay stub? (Y/N): ");
        char printFlag = 'N'; // TODO: read and normalize to upper-case

        // TODO 6: Validate inputs using if/else:
        // hours >= 0, rate >= 0, percent in [0,100]
        // If invalid, print a clear message and exit (return).

        // TODO 7: Compute regularHours and overtimeHours
        double regularHours = 0.0;
        double overtimeHours = 0.0;

        // TODO 8: Compute grossPay using overtime rules
        double grossPay = 0.0;

        // TODO 9 (Type conversion demo): retirementRate = percent / 100.0
        double retirementRate = 0.0;

        // TODO 10: Compute deduction and net pay
        double retirementDeduction = 0.0;
        double netPay = 0.0;

        // TODO 11: Print results (always print net pay)
        // If printFlag == 'Y', print a detailed pay stub using printf (2 decimals)
        System.out.println("\n--- Pay Results ---");
        // System.out.printf("Net pay: $%.2f%n", netPay);

        // TODO 12: Add comments explaining your formulas and decisions.

        input.close();
    }
}
