package com.selections.test;

import java.util.Scanner;

/**
 * **3.29 (Geometry: two circles) Write a program that prompts the user to enter the center
 * coordinates and radii of two circles and determines whether the second circle is inside the first
 * or overlaps with the first, as shown in Figure 3.10. (Hint: cir- cle2 is inside circle1 if the
 * distance between the two centers 6 = r1 − r2 and circle2 overlaps circle1 if the distance between
 * the two centers 6 = r1 + r2. Test your program to cover all cases.) Here are the sample runs:
 * Enter circle1’s center x-, y-coordinates, and radius: 0.5 5.1 13 Enter circle2’s center x-,
 * y-coordinates, and radius: 1 1.7 4.5 circle2 is inside circle1Enter circle1’s center x-,
 * y-coordinates, and radius: 3.4 5.7 5.5 Enter circle2’s center x-, y-coordinates, and radius: 6.7
 * 3.5 3 circle2 overlaps circle1Enter circle1’s center x-, y-coordinates, and radius: 3.4 5.5 1
 * Enter circle2’s center x-, y-coordinates, and radius: 5.5 7.2 1 circle2 does not overlap circle1
 */
public class CirclesOverlap {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the center coordinates and radius of circle 1
    System.out.print("Enter circle1’s center x-, y-coordinates, and radius: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double r1 = input.nextDouble();

    // Prompt the user to enter the center coordinates and radius of circle 2
    System.out.print("Enter circle2’s center x-, y-coordinates, and radius: ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double r2 = input.nextDouble();

    // Calculate the distance between the two centers
    double distanceBetweenTwoCenters = Math.pow(((x2 - x1) * ((x2 - x1)) + ((y2 - y1) * (y2 - y1))),
        0.5);

    // Determine whether circle2 is inside circle1 or overlaps with circle1
    if (distanceBetweenTwoCenters <= Math.abs(r1 - r2)) {
      System.out.println("circle2 is inside circle1");
    } else if (distanceBetweenTwoCenters <= (r1 + r2)) {
      System.out.println("circle2 overlaps circle1");
    } else {
      System.out.println("circle2 does not overlap circle1");
    }

  }

}
