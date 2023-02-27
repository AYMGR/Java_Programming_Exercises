package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * *4.14 (Convert letter grade to number) Write a program that prompts the user to enter a letter
 * grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2, 1, or 0. For other
 * input, display invalid grade. Here is a sample run: Enter a letter grade: B The numeric value for
 * grade B is 3Enter a letter grade: T T is an invalid grade
 */
public class ConvertLetterGradeToNumber {

  public static void main(String[] args) {
    // Create a Scanner object to read input from the user.
    Scanner input = new Scanner(System.in);

    // Prompts the user to enter a letter grade A, B, C, D, or F
    System.out.print("Enter a letter grade: ");

    // Read the input using nextLine() method
    String grade = input.next();

    switch (grade.toUpperCase()) {
      case "A":
        System.out.println("The numeric value for grade A is 4");
        break;
      case "B":
        System.out.println("The numeric value for grade B is 3");
        break;
      case "C":
        System.out.println("The numeric value for grade C is 2");
        break;
      case "D":
        System.out.println("The numeric value for grade D is 1");
        break;
      case "F":
        System.out.println("The numeric value for grade F is 0");
        break;
      default:
        System.out.println("Invalid grade");
        break;
    }
  }
}
