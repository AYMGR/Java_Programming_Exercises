package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * *4.18 (Student major and status) Write a program that prompts the user to enter two characters
 * and displays the major and status represented in the characters. The first character indicates
 * the major and the second is a number character 1, 2, 3, or 4, which indicates whether a student
 * is a freshman, sophomore, junior, or senior. Suppose that the following characters are used to
 * denote the majors: M: Mathematics C: Computer Science I: Information Technology Here are sample
 * runs: Enter two characters: M1 Mathematics Freshman Enter two characters: C3 Computer Science
 * Junior Enter two characters: T3 Invalid input
 */
public class StudentMajorAndStatus {

  public static void main(String[] args) {
    // Create a Scanner object to read input from the user.
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two characters
    System.out.print("Enter two characters: ");
    String str = input.nextLine();

    // Extract the major and status from the input
    char major = str.toUpperCase().charAt(0);
    char status = str.charAt(1);

    // Determine the major name
    String majorName;
    switch (major) {
      case 'M':
        majorName = "Mathematics";
        break;
      case 'C':
        majorName = "Computer Science";
        break;
      case 'I':
        majorName = "Information Technology";
        break;
      default:
        System.out.println("Invalid input");
        return;
    }

    // Determine the status name
    String statusName;
    switch (status) {
      case '1':
        statusName = "Freshman";
        break;
      case '2':
        statusName = "Sophomore";
        break;
      case '3':
        statusName = "Junior";
        break;
      case '4':
        statusName = "Senior";
        break;
      default:
        System.out.println("Invalid input");
        return;
    }

    // Display the major and status
    System.out.println(majorName + " " + statusName);

  }

}

