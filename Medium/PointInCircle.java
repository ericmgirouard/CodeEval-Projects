package Medium;

import java.awt.Point;

/*
 * POINT IN CIRCLE
CHALLENGE DESCRIPTION:

Having coordinates of the center of a circle, 
it's radius and coordinates of a point you need to 
define whether this point is located inside of this circle.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. 
Input example is the following
Center: (2.12, -3.48); Radius: 17.22; Point: (16.21, -5)
Center: (5.05, -11); Radius: 21.2; Point: (-31, -45)
Center: (-9.86, 1.95); Radius: 47.28; Point: (6.03, -6.42)

All numbers in input are between -100 and 100

OUTPUT SAMPLE:
Print results in the following way.
true
false
true

 */
public class PointInCircle {
	
	public static void main(String[] args) {
		/* step 1: parse input line for radius, center and point
		 * Step 2: determine if distamnce from center to point is less than radius
		 * 		If so, print true, else print false
		 * simple as that mathematically
		 */
		String line = "Center: (-9.86, 1.95); Radius: 47.28; Point: (6.03, -6.42)";
		line = line.replaceAll("[\\(\\),:]"," ");
		String[] tokens = line.split(";");
		String[] parts = tokens[0].split("\\s+");
		double centerX = Double.parseDouble(parts[1]);
		double centerY = Double.parseDouble(parts[2]);
		parts = tokens[1].split("\\s+");
		double radius = Double.parseDouble(parts[2]); //0 = " " 2 = "Radius:" 3 = Our radius
		parts = tokens[2].trim().split("\\s+");
		double px = Double.parseDouble(parts[1]);
		double py = Double.parseDouble(parts[2]);
		/*
		 * Now that that mess is over....
		 * Determine distance between center and our point of interest
		 * 		if the distance is less than the radius its in the circle
		 */
		double distance = Math.sqrt(   (Math.pow((centerX - px),2)    +   Math.pow( (centerY - py),2)));
		System.out.println( (distance < radius) ? "true" : "false"); //I LOVE the ternary operator a LOT
	}

}
