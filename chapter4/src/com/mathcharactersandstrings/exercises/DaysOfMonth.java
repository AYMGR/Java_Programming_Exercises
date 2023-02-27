package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * *4.17 (Days of a month) Write a program that prompts the user to enter the year and the first
 * three letters of a month name (with the first letter in uppercase) and displays the number of
 * days in the month. If the input for month is incorrect, display a message as presented in the
 * following sample runs: Enter a year: 2001 Enter a month: Jan Jan 2001 has 31 days
 */
public class DaysOfMonth {

  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the year
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    // Prompt the user to enter a month name
    System.out.print("Enter a month(e.g. Jan): ");
    String month = input.next();

    // Determine the number of days in the month
    int days = 0;
    switch (month) {
      case "Jan":
      case "Mar":
      case "May":
      case "Jul":
      case "Aug":
      case "Oct":
      case "Dec":
        days = 31;
        break;
      case "Apr":
      case "Jun":
      case "Sep":
      case "Nov":
        days = 30;
        break;
      case "Feb":
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
          days = 29;
        } else {
          days = 28;
        }
        break;
      default:
        System.out.println(month + "is not a correct month name");
        System.exit(0);
    }
    // Display the result
    System.out.println(month + " " + year + " has " + days + " days");

  }

}
