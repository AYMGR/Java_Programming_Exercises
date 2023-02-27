package com.mathcharactersandstrings.exercises;

import java.util.Scanner;

/**
 * *4.7 (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point at the 0
 * o’clock position, as shown in Figure 4.4c. Write a program that prompts the user to enter the
 * radius of the bounding circle of a pentagon and displays the coordinates of the five corner
 * points on the pentagon from p1 to p5 in this order. Use console format to display two digits
 * after the decimal point. Here is a sample run:Enter the radius of the bounding circle: 100.52 The
 * coordinates of five points on the pentagon are (95.60, 31.06) (0.00, 100.52) (−95.60, 31.06)
 * (−58.08, −81.32) (59.08, −81.32)
 */
public class CornerPointCoordinates {

  public static void main(String[] args) {
    // Create a Scanner object to read user input
    Scanner input = new Scanner(System.in);

    // Prompt the user for the radius of the pentagon's bounding circle
    System.out.print("Enter the radius of the pentagon: ");
    double radius = input.nextDouble();

    // Calculate the coordinates of the five corner points
    double angle = Math.PI * 2; // angle between adjacent points
    double x1 = radius * Math.cos(Math.toRadians(18));
    double y1 = radius * Math.sin(Math.toRadians(18));
    double x2 = 0;
    double y2 = radius;
    double x3 = radius * Math.cos(Math.toRadians(18 + 72 * 2));
    double y3 = radius * Math.sin(Math.toRadians(18 + 72 * 2));
    double x4 = radius * Math.cos(Math.toRadians(18 + 72 * 3));
    double y4 = radius * Math.sin(Math.toRadians(18 + 72 * 3));
    double x5 = radius * Math.cos(Math.toRadians(18 + 72 * 4));
    double y5 = radius * Math.sin(Math.toRadians(18 + 72 * 4));

    // Display the coordinates of the five corner points
    System.out.printf("The coordinates of the five points are:\n");
    System.out.printf("p1: (%.2f, %.2f)\n", x1, y1);
    System.out.printf("p2: (%.2f, %.2f)\n", x2, y2);
    System.out.printf("p3: (%.2f, %.2f)\n", x3, y3);
    System.out.printf("p4: (%.2f, %.2f)\n", x4, y4);
    System.out.printf("p5: (%.2f, %.2f)\n", x5, y5);
  }

}

