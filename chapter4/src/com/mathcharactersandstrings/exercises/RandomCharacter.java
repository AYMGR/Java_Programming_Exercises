package com.mathcharactersandstrings.exercises;

/**
 * 4.16 (Random character) Write a program that displays a random uppercase letter using the
 * Math.random() method.
 */
public class RandomCharacter {

  public static void main(String[] args) {
    char letter = (char) (Math.random() * 26 + 'A');
    System.out.println("Random uppercase letter: " + letter);


    /*
    // Generate a random number between 0 and 25 (inclusive)
    int randomNumber = (int) (Math.random() * 26);

    // Convert the random number to a character code for an uppercase letter
    char randomUppercaseLetter = (char)('A' + randomNumber);

    // Display the random uppercase letter
    System.out.println("Random Uppercase Letter is: " + randomUppercaseLetter);

     */
  }
}
