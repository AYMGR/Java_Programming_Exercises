package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * *4.9 (Find the Unicode of a character) Write a program that receives a character and displays its
 * Unicode. Here is a sample run: Enter a character: E The Unicode for the character E is 69
 */
public class DisplayUnicode {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a character
    System.out.print("Enter a character: ");
    char c = input.next().charAt(0);

    // casting char to int to get Unicode value
    int unicode = (int) c;

    // Display the corresponding Unicode
    System.out.println("The Unicode of " + c + " is: " + unicode);

  }

}
