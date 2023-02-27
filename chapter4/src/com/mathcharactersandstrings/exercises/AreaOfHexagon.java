package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * 4.4 (Geometry: area of a hexagon) The area of a hexagon can be computed using the following
 * formula (s is the length of a side): Enter point 1 (latitude and longitude) in degrees: 39.55
 * −116.25 Enter point 2 (latitude and longitude) in degrees: 41.5 87.37 The distance between the
 * two points is 10691.79183231593 km Area = 6 * s2 4 * tan(p) 6 Write a program that prompts the
 * user to enter the side of a hexagon and displays its area. Here is a sample run:Enter the side:
 * 5.5 The area of the hexagon is 78.59
 */
public class AreaOfHexagon {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the side of hexagon
    System.out.print("Enter the side: ");
    double s = input.nextDouble();

    // Compute the area of hexagon
    final double PI = 3.1415926535;
    double area = (6 * s * s) / (4 * Math.tan(PI / 6));

    // Display the result
    System.out.println("The area of the hexagon is " + (int) (area * 100) / 100.0);
  }

}
