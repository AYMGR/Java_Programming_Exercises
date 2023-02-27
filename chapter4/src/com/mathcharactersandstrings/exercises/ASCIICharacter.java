package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * *4.8 (Find the character of an ASCII code) Write a program that receives an ASCII code (an
 * integer between 0 and 127) and displays its character. Here is a sample run: Enter an ASCII code:
 * 69 The character for ASCII code 69 is E
 */
public class ASCIICharacter {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter an ASCII code
    System.out.print("Enter an ASCII code (an integer between 0 and 127): ");
    int asciiCode = input.nextInt();

    // Display the corresponding character
    char ch = (char) asciiCode;
    System.out.println("The character for ASCII code " + asciiCode + " is " + ch);

  }

}
