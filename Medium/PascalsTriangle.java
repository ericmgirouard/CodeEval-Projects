package Medium;

import java.util.ArrayList;

public class PascalsTriangle {

	public static void main(String[] args) {
		String line = "6"; //the depth of the triangle
		int depth = Integer.parseInt(line);
		/*
		 * start by hardcoding level 1
		 * then, for every additional requested level:
		 * 	call a method that creates a new arraylist with a size of +1 of the old Level
		 * 	initialize each entry to 1 for indexing purposes and to set the ends as 1
		 * 	then iterate through the "center" of the current level
		 * 	level(i) = old(level(i-1) + oldLevel(i)
		 * 	repeat
		 */
		//hard-code level 1
		StringBuilder str = new StringBuilder();
		ArrayList<Integer> level = new ArrayList<Integer>(1);
		level.add(1);
		//create additional levels:
		str.append(level.get(0) + " "); //hard-code level 1 print
		for (int i = 2; i <= depth; i++) { //create next levels
			level = nextLevel(level);
			for (int p = 0; p < level.size(); p++) str.append(level.get(p) + " "); //for printing
		}
		System.out.println(str.toString().trim());
	}
	
	
	
	public static ArrayList<Integer> nextLevel(ArrayList<Integer> oldLevel) {
		//create list for next level:
		ArrayList<Integer> level = new ArrayList<Integer>();
		//for indexing purposes: add 1 to every spoit in the row
		for (int i = 0; i < oldLevel.size()+1; i++) level.add(i,1);
		//iterate through the "center" of the new level
		for (int i = 1; i < oldLevel.size(); i++) {
			level.set(   i,   ((oldLevel.get(i-1)) + oldLevel.get(i))   );
		}
		return level;
	}

	
	
}
