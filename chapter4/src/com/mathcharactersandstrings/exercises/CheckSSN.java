package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * *4.21 (Check SSN) Write a program that prompts the user to enter a Social Security number in the
 * format DDD-DD-DDDD, where D is a digit. Your program should check whether the input is valid.
 * Here are sample runs: Enter a SSN: 232−23−5435 232−23−5435 is a valid social security number
 * Enter a SSN: 23−23−5435 23−23−5435 is an invalid social security number
 */
public class CheckSSN {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a SSN
    System.out.print("Enter a SSN in the format DDD-DD-DDDD: ");
    String ssn = input.nextLine();

    /* Check whether the input is valid
    boolean isValid = true;
    System.out.print("Enter a SSN: ");
    String ssn = input.nextLine();

     */

    // Check if the input matches the format DDD-DD-DDDD
    boolean isValid = ssn.matches("\\d{3}-\\d{2}-\\d{4}");

    // Print the result
    if (isValid) {
      System.out.println(ssn + " is a valid social security number");
    } else {
      System.out.println(ssn + " is an invalid social security number");
    }


  }

}
