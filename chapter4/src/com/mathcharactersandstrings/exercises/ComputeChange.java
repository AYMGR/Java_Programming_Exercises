package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * *4.26 (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange. java, to fix
 * the possible loss of accuracy when converting a float value to an int value. Read the input as a
 * string such as "11.56". Your program should extract the dollar amount before the decimal point,
 * and the cents after the decimal amount using the indexOf and substring methods.
 */
public class ComputeChange {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an amount, for example 11.56: ");
    String amount = input.nextLine();

    // Extract the dollar and cent amounts using the substring() and indexOf() methods
    int dollarAmount = Integer.parseInt(amount.substring(0, amount.indexOf('.')));

    // Convert the cent amount to an int using Math.round()
    int centAmount = Math.round(Float.parseFloat(amount.substring(amount.indexOf('.') + 1)));

    int remainingAmount = centAmount;

    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    int numberOfPennies = remainingAmount;

    System.out.println("Your amount " + amount + " consists of");
    System.out.println("    " + dollarAmount + " dollars");
    System.out.println("    " + numberOfQuarters + " quarters ");
    System.out.println("    " + numberOfDimes + " dimes");
    System.out.println("    " + numberOfNickels + " nickels");
    System.out.println("    " + numberOfPennies + " pennies");
  }


}

