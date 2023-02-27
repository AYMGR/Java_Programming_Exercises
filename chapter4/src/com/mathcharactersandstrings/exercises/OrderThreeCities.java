package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * *4.24 (Order three cities) Write a program that prompts the user to enter three cities and
 * displays them in ascending order. Here is a sample run:Enter the first city: Chicago Enter the
 * second city: Los Angeles Enter the third city: Atlanta The three cities in alphabetical order are
 * Atlanta Chicago Los Angeles
 */
public class OrderThreeCities {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompts the user to enter three cities
    System.out.print("Enter the first city: ");
    String city1 = input.nextLine();

    System.out.print("Enter the second city: ");
    String city2 = input.nextLine();

    System.out.print("Enter the third city: ");
    String city3 = input.nextLine();

    // Compare the cities and display in ascending order
    if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0) {
      System.out.print("The three cities in alphabetical order are: ");
      System.out.print(city1 + " ");

      if (city2.compareTo(city3) < 0) {
        System.out.println(city2 + " ");
        System.out.println(city3);
      } else {
        System.out.println(city3 + "");
        System.out.println(city2);
      }

    } else if (city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0) {
      System.out.print("The three cities in alphabetical order are: ");
      System.out.println(city2 + "");

      if (city1.compareTo(city3) < 0) {
        System.out.print(city1 + " ");
        System.out.print(city3);
      } else {
        System.out.print(city3 + "");
        System.out.println(city1);
      }
    } else {
      System.out.print("The three cities in alphabetical order are: ");
      System.out.print(city3 + " ");

      if (city1.compareTo(city2) < 0) {
        System.out.print(city1 + " ");
        System.out.print(city2);
      } else {
        System.out.print(city2 + " ");
        System.out.print(city1);
      }

    }
  }

}
