package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * 4.22 (Check substring) Write a program that prompts the user to enter two strings, and reports
 * whether the second string is a substring of the first string. Enter string s1: ABCD Enter string
 * s2: BC BC is a substring of ABCD
 */
public class CheckSubstring {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the first string
    System.out.print("Enter the first string: ");
    String str1 = input.nextLine();

    // Prompt the user to enter the second string
    System.out.print("Enter the second string: ");
    String str2 = input.nextLine();

    // Check if the second string is a substring of the first string
    if (str1.contains(str2)) {
      System.out.println("\"" + str2 + "\" is a substring of \"" + str1 + "\"");
    } else {
      System.out.println("\"" + str2 + "\" is not a substring of \"" + str1 + "\"");
    }
  }
}
