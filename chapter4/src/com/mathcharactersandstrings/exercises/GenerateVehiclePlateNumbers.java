package com.mathcharactersandstrings.exercises;

/**
 * *4.25 (Generate vehicle plate numbers) Assume that a vehicle plate number consists of three
 * uppercase letters followed by four digits. Write a program to generate a plate number
 */
public class GenerateVehiclePlateNumbers {

  public static void main(String[] args) {
    // Generate random Uppercase A-Z
    char letter1 = (char) (Math.random() * 26 + 'A');
    char letter2 = (char) (Math.random() * 26 + 'A');
    char letter3 = (char) (Math.random() * 26 + 'A');

    // Generate random digits 0-9
    char digit1 = (char) (Math.random() * 10 + '0');
    char digit2 = (char) (Math.random() * 10 + '0');
    char digit3 = (char) (Math.random() * 10 + '0');
    char digit4 = (char) (Math.random() * 10 + '0');

    // Generate a plate number
    String plateNumber = "" + digit1 + digit2 + digit3 + digit4 + letter1 + letter2 + letter3;

    // Display
    System.out.println(plateNumber);
  }

}
