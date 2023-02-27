package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * *4.5 (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in which all
 * sides are of the same length and all angles have the same degree (i.e., the polygon is both
 * equilateral and equiangular). The formula for computing the area of a regular polygon is Area = n
 * * s2 4 * tan(p) n Here, s is the length of a side. Write a program that prompts the user to enter
 * the number of sides and their length of a regular polygon and displays its area. Here is a sample
 * run: Enter the number of sides: 5 Enter the side: 6.5 The area of the polygon is
 * 72.69017017488385
 */
public class AreaOfRegularPolygon {

  private static final double PI = 3.1415926535;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the number of sides and their length of a regular polygon
    System.out.print("Enter the number of sides: ");
    double n = input.nextDouble();

    System.out.print("Enter the side: ");
    double s = input.nextDouble();

    // Compute the area of regular polygon
    double area = (n * s * s) / (4 * Math.tan(PI / n));

    // Display
    System.out.println("The area of the polygon is " + area);
  }


}
