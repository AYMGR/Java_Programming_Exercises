package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * 4.19 (Business: check ISBN-10) Rewrite Programming Exercise 3.9 by entering the ISBN number as a
 * string.
 */
public class CheckISBN {

  public static void main(String[] args) {
    // Create a Scanner object to read input from the user.
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the first 9 digits of an ISBN number as a string.
    System.out.print("Enter the first 9 digits of an ISBN as a string: ");
    String isbn = input.nextLine();

    // Calculate the 10th digit of the ISBN number
    int d10 = (10 - ((Character.getNumericValue(isbn.charAt(0)) * 1 +
        Character.getNumericValue(isbn.charAt(1)) * 2 +
        Character.getNumericValue(isbn.charAt(2)) * 3 +
        Character.getNumericValue(isbn.charAt(3)) * 4 +
        Character.getNumericValue(isbn.charAt(4)) * 5 +
        Character.getNumericValue(isbn.charAt(5)) * 6 +
        Character.getNumericValue(isbn.charAt(6)) * 7 +
        Character.getNumericValue(isbn.charAt(7)) * 8 +
        Character.getNumericValue(isbn.charAt(8)) * 9) % 11)) % 10;

    // Check whether the ISBN number is valid
    if (d10 == Character.getNumericValue(isbn.charAt(9))) {
      System.out.println(isbn + d10 + " is a valid ISBN number");
    } else {
      System.out.println(isbn + d10 + " is not a valid ISBN number");
    }

  }

}
