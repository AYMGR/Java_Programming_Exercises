package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * *4.13 (Vowel or consonant?) Write a program that prompts the user to enter a letter and check
 * whether the letter is a vowel or consonant. For a nonletter input, display invalid input. Here is
 * a sample run:Enter a letter: B B is a consonant Enter a letter: a a is a vowel Enter a letter: #
 * # is an invalid input
 */
public class VowelOrConsonant {

  public static void main(String[] args) {
    // Create a Scanner object to read input from the user.
    Scanner input = new Scanner(System.in);

    // Prompts the user to enter a letter
    System.out.print("Enter a letter: ");

    // Read the input using nextLine() method 
    String letter = input.nextLine();

    // Check if the input is a single letter and if it is a letter using length() and isLetter()
    if (letter.length() != 1 || !Character.isLetter(letter.charAt(0))) {
      System.out.println("Invalid input. Please enter a letter.");
    } else {
      char ch = letter.toLowerCase().charAt(0);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        System.out.println("The letter " + letter + " is a vowel.");
      } else {
        System.out.println("The letter " + letter + " is a consonant.");
      }
    }
  }
}
