package Medium;

import java.awt.Point;

/*
 * You have coordinates of four points on a plane. Check whether they make a square.
 */
public class FindASquare {

	public static void main(String[] args) {
		String line = "(4,6), (5,5), (5,6), (4,5)";
		line = line.replaceAll("[(),]", " ");
		line = line.trim();
		String[] tokens = line.split("\\s+");
		//for (int i = 0; i < tokens.length; i++) System.out.println(tokens[i]);
		Point p1 = new Point(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
		Point p2 = new Point(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
		Point p3 = new Point(Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]));
		Point p4 = new Point(Integer.parseInt(tokens[6]), Integer.parseInt(tokens[7]));
		boolean square = true;
		//Is a square if all but two distances are equal
		double[] distances = new double[6];
		int index = 0;
		distances[index++] = dist(p1,p2);
		distances[index++] = dist(p1,p3);
		distances[index++] = dist(p1,p4);
		distances[index++] = dist(p2,p3);
		distances[index++] = dist(p2,p4);
		distances[index++] = dist(p3,p4);
		//for (int i = 0; i < 6; i++) System.out.println(distances[i]);
		double d1 = distances[0];
		double d2 = -1;
		
		for (int i = 1; i < 6; i++) {
			if (distances[i] != d1 && d2 == -1.0) d2 = distances[i]; 
			if (distances[i] != d1 && distances[i] != d2) {
				square = false;
				break;
			}
		}
		System.out.println(square);
	}

	public static double dist(Point p1, Point p2) {
		//sqrt(   (x1-x2)^2 + (y1-y2)^2  )
		return Math.sqrt(  Math.pow((p1.getX() - p2.getX()),2)   +   Math.pow((p1.getY() - p2.getY()),2)  );
		
	}
}
