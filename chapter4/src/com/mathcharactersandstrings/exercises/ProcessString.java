package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * 4.20 (Process a string) Write a program that prompts the user to enter a string and displays its
 * length and its first character.
 */
public class ProcessString {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompts the user to enter a string
    System.out.print("enter a string: ");
    String str = input.next();

    // Displays its length
    int strLength = str.length();

    // Display first character
    char ch = (char) (str.charAt(0));

    System.out.println("length is " + strLength + ", " + "first character is " + ch);

  }

}
