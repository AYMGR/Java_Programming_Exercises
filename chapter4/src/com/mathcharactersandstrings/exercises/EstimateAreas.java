package com.mathcharactersandstrings.exercises;

/**
 * *4.3 (Geography: estimate areas) Use the GPS locations for Atlanta, Georgia; Orlando, Florida;
 * Savannah, Georgia; and Charlotte, North Carolina in the figure in Section 4.1 to compute the
 * estimated area enclosed by these four cities. (Hint: Use the formula in Programming Exercise 4.2
 * to compute the distance between two cities. Divide the polygon into two triangles and use the
 * formula in Programming Exercise 2.19 to compute the area of a triangle.)
 */
public class EstimateAreas {

  public static void main(String[] args) {
    // Get the cities latitude and longitude
    double x_Atlanta = 35.2270869;
    double y_Atlanta = -80.8431267;
    double x_Orlando = 28.5383355;
    double y_Orlando = -81.3792365;
    double x_Savannah = 32.0835407;
    double y_Savannah = -81.0998342;
    double x_Charlotte = 35.2270869;
    double y_Charlotte = -80.8431267;

    // Convert the degrees into radians
    x_Atlanta = Math.toRadians(x_Atlanta);
    y_Atlanta = Math.toRadians(y_Atlanta);
    x_Orlando = Math.toRadians(x_Orlando);
    y_Orlando = Math.toRadians(y_Orlando);
    x_Savannah = Math.toRadians(x_Savannah);
    y_Savannah = Math.toRadians(y_Savannah);
    x_Charlotte = Math.toRadians(x_Charlotte);
    y_Charlotte = Math.toRadians(y_Charlotte);

    // Compute the great circle distance between Atlanta and Orlando
    double radius = 6371.01; // average radius of the earth in kilometers
    double d1 = radius * Math.acos(
        Math.sin(x_Atlanta) * Math.sin(x_Orlando) + Math.cos(x_Atlanta) * Math.cos(x_Orlando)
            * Math.cos(y_Atlanta - y_Orlando));
    // Compute the great circle distance between Orlando and Charlotte
    double d2 = radius * Math.acos(
        Math.sin(x_Orlando) * Math.sin(x_Charlotte) + Math.cos(x_Orlando) * Math.cos(
            x_Charlotte) * Math.cos(y_Orlando - y_Charlotte));

    // Compute the great circle distance between Orlando and Savannah
    double d3 = radius * Math.acos(
        Math.sin(x_Orlando) * Math.sin(x_Savannah) + Math.cos(x_Orlando) * Math.cos(
            x_Savannah) * Math.cos(y_Orlando - y_Savannah));

    // Compute the great circle distance between Charlotte and Savannah
    double d4 = radius * Math.acos(
        Math.sin(x_Charlotte) * Math.sin(x_Savannah) + Math.cos(x_Charlotte) * Math.cos(
            x_Savannah) * Math.cos(y_Charlotte - y_Savannah));

    // Compute the great circle distance between Charlotte and Atlanta
    double d5 = radius * Math.acos(
        Math.sin(x_Charlotte) * Math.sin(x_Atlanta) + Math.cos(x_Charlotte) * Math.cos(
            x_Atlanta) * Math.cos(y_Charlotte - y_Atlanta));

    // Divide the quadrilateral row into two triangles
    // Calculate the area of two triangles
    double s1 = (d1 + d2 + d5) / 2;
    double area1 = Math.sqrt(s1 * (s1 - d1) * (s1 - d2) * (s1 - d5));
    double s2 = (d2 + d3 + d4) / 2;
    double area2 = Math.sqrt(s2 * (s2 - d2) * (s2 - d3) * (s2 - d4));

    // Display the estimated area enclosed by these four cities
    System.out.println("the estimated area enclosed by these four cities is " + (area1 + area2));

  }

}
