package com.mathcharactersandstrings.exercises;

/**
 * * 4.6 (Random points on a circle) Write a program that generates three random points on a circle
 * centered at (0, 0) with radius 40 and displays three angles in a triangle formed by these three
 * points, as shown in Figure 4.4a. Display the angles in degrees. (Hint: Generate a random angle a
 * in radians between 0 and 2p, as shown in Figure 4.4b and the point determined by this angle is
 * rxcos (a), rxsin (a).) x 5 r 3 cos(a) and y 5 r 3 sin(a)
 */
public class ComputeAngles {

  public static void main(String[] args) {
    // Generates three random points on a circle centered at (0, 0) with radius 40

    // Generate a random angle a in radians between 0 and 2PI
    final double PI = 3.1415926535;

    double r = 40.0;
    // Get random point1 on a circle
    double a1 = (Math.random() * 2 * PI);
    double x1 = r * Math.cos(a1), y1 = r * Math.sin(a1);

    // Get random point2 on a circle
    double a2 = (Math.random() * 2 * PI);
    double x2 = r * Math.cos(a2), y2 = r * Math.sin(a2);

    // Get random point3 on a circle
    double a3 = (Math.random() * 2 * PI);
    double x3 = r * Math.cos(a3), y3 = r * Math.sin(a3);

    // Compute the three sides
    double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
    double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
    double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

    // Compute three angles
    double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
    double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
    double C = Math.toDegrees((Math.acos(c * c - b * b - a * a) / (-2 * a * b)));

    // Display results
    System.out.println("three angles in a triangle formed by these three points are: "
        + Math.round(A * 100) / 100.0 + " " + Math.round(B * 100) / 100.0 + " "
        + Math.round(C * 100) / 100.0);
  }

}
