package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * *4.23 (Financial application: payroll) Write a program that reads the following infor- mation and
 * prints a payroll statement: Employee’s name (e.g., Smith) Number of hours worked in a week (e.g.,
 * 10) Hourly pay rate (e.g., 9.75) Federal tax withholding rate (e.g., 20%) State tax withholding
 * rate (e.g., 9%) A sample run is as follows: Enter employee’s name: Smith Enter number of hours
 * worked in a week: 10 Enter hourly pay rate: 9.75 Enter federal tax withholding rate: 0.20 Enter
 * state tax withholding rate: 0.09 Employee Name: Smith Hours Worked: 10.0 Pay Rate: $9.75 Gross
 * Pay: $97.50 Deductions: Federal Withholding (20.0%): $19.50 State Withholding (9.0%): $8.77 Total
 * Deduction: $28.27 Net Pay: $69.22
 */
public class Payroll {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt user to  enter employee's name
    System.out.print("Employee Name: ");
    String name = input.nextLine();

    // Enter hour's worked
    System.out.print("Enter number of hours worked in a week: ");
    double hoursWorked = input.nextDouble();

    // Enter hourly pay rate
    System.out.print("Enter hourly pay rate: ");
    double payRate = input.nextDouble();

    // Enter federal tax withholding rate
    System.out.print("Enter federal tax withholding rate: ");
    double federalTax = input.nextDouble();

    // Enter state tax withholding rate
    System.out.print("Enter state tax withholding rate: ");
    double stateTax = input.nextDouble();

    System.out.println("Employee Name: " + name);
    System.out.println("Hours Worked: " + hoursWorked);
    System.out.println("Pay Rate: " + payRate);
    double grossPay = hoursWorked * payRate;
    System.out.println("Gross Pay: " + grossPay);
    double federalWithholding = grossPay * 0.2;
    double stateWithholding = grossPay * 0.09;
    double totalDeduction = federalWithholding + stateWithholding;
    double netPay = grossPay - totalDeduction;
    System.out.println(
        "Deductions: \n" + "\tFederal Withholding (20.0%): " + "$" + federalWithholding
            + "\n" + "\tState Withholding (9.0%): " + "$" + stateWithholding + "\n"
            + "\tTotal Deduction: " + "$" + totalDeduction);
    System.out.println("Net Pay: " + netPay);

  }

}
