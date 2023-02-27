package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * *4.11 (Decimal to hex) Write a program that prompts the user to enter an integer be- tween 0 and
 * 15 and displays its corresponding hex number. For an incorrect input number, display invalid
 * input. Here are some sample runs:Enter a decimal value (0 to 15): 11 The hex value is B Enter a
 * decimal value (0 to 15): 5 The hex value is 5 Enter a decimal value (0 to 15): 31 31 is an
 * invalid input
 */
public class DecimalToHex {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter an integer between 0 and 15
    System.out.print("Enter a decimal value (0 to 15): ");
    int decimal = input.nextInt();

    String hex = "";
    if (decimal >= 0 && decimal <= 15) {
      if (decimal < 10) {
        hex = Integer.toString(decimal);
      } else {
        switch (decimal) {
          case 10:
            hex = "A";
            break;
          case 11:
            hex = "B";
            break;
          case 12:
            hex = "C";
            break;
          case 13:
            hex = "D";
            break;
          case 14:
            hex = "E";
            break;
          case 15:
            hex = "F";
            break;
        }
      }
      System.out.println("The hex number for " + decimal + " is " + hex);
    } else {
      System.out.println("Invalid input.");
    }
  }

  // convert decimal to hex
/*    if (decimal < 0 || decimal > 15) {
      System.out.println(decimal + " is an invalid input");
    } else if (decimal >= 0 && decimal <= 15) {
      if (decimal <= 9) {
        System.out.println("The hex value is " + decimal);
      } else if (decimal > 9 && decimal <= 15) {
        switch (decimal) {
          case 10:
            String hex = "A";
            System.out.println("The hex value is " + hex);
            break;
          case 11:
            hex = "B";
            System.out.println("The hex value is " + hex);
            break;
          case 12:
            hex = "C";
            System.out.println("The hex value is " + hex);
            break;
          case 13:
            hex = "D";
            System.out.println("The hex value is " + hex);
            break;
          case 14:
            hex = "E";
            System.out.println("The hex value is " + hex);
            break;
          case 15:
            hex = "F";
            System.out.println("The hex value is " + hex);
            break;
          default:
            break;
        }
      }
    }

 */
}

