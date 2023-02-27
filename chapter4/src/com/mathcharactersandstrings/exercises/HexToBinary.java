package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * 4.12 (Hex to binary) Write a program that prompts the user to enter a hex digit and displays its
 * corresponding binary number in four digits. For example, hex digit 7 is 0111 in binary. Hex
 * digits can be entered either in uppercase or lowercase. For an incorrect input, display invalid
 * input. Here is a sample run: Enter a hex digit: B The binary value is 1011 Enter a hex digit: G G
 * is an invalid input
 */
public class HexToBinary {

  public static void main(String[] args) {
    // Use a Scanner to read the user's input,
    Scanner input = new Scanner(System.in);

    // Prompts the user to enter a hex digit
    // Converts the hex digit to uppercase using the toUpperCase() method
    System.out.print("Enter a hex digit: ");
    String hexDigit = input.next().toUpperCase();
    String binary = "";

    // Use a switch statement to determine the corresponding binary representation
    switch (hexDigit) {
      case "0":
        binary = "0000";
        break;
      case "1":
        binary = "0001";
        break;
      case "2":
        binary = "0010";
        break;
      case "3":
        binary = "0011";
        break;
      case "4":
        binary = "0100";
        break;
      case "5":
        binary = "0101";
        break;
      case "6":
        binary = "0110";
        break;
      case "7":
        binary = "0111";
        break;
      case "8":
        binary = "1000";
        break;
      case "9":
        binary = "1001";
        break;
      case "A":
        binary = "1010";
        break;
      case "B":
        binary = "1011";
        break;
      case "C":
        binary = "1100";
        break;
      case "D":
        binary = "1101";
        break;
      case "E":
        binary = "1110";
        break;
      case "F":
        binary = "1111";
        break;
      default:
        System.out.println("Invalid input");
        break;
    }

    // Display the result
    System.out.println("The binary representation of " + hexDigit + " is " + binary);

  }

}
