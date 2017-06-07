package Easy;
/*
 * Eric Girouard
 * CodeEval Easy Challenge: String and Arrows
 * Once a line of text is obtained;
 * Step 1:  iterate through the string line, from 0 to length-5
 * 			send in substring(i,i+5) to a method to determine if it is an arrow
 * 			repeat
 */
public class StringsAndArrows {

	public static void main(String[] args) {
		String line = "<--<<--<<";
		int arrows = 0;
		for (int i = 0; i < line.length()-4; i++) {
			arrows += isArrow(line.substring(i, i+5));
		}//end for loop: arrow count is determined
		System.out.println(arrows);
	}//end main
	
	
	public static int isArrow(String arrow) {
		//given 5 chars in a string, determine if it makes an arrow
		//'>>-->' or '<--<<'.
		String right = ">>-->";
		String left = "<--<<";
		if (arrow.equals(left) || arrow.equals(right)) return 1;
		else return 0;
	}

}
