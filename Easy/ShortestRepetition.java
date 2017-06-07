package Easy;

/*
 * Determine smallest period of the string
 * abababababababababababababab is 2 because the string can be made with the string"ab" repeated
 * divide string in half an see if the period is half (check that both substrings are equal)
 * then subtract 1 from the pivot point and keep going
 * record shortest period
 * if reached the end with no periods, period = length of string
 */
public class ShortestRepetition {

	public static void main(String[] args) {
		String line = "aaaaaaaaaaaaaaaaaaaaaaaaaaa";
		int period = line.length();
			int pivot = line.length()/2;
			while (pivot > 0) {
				if (  line.substring(0,pivot).equals(line.substring(pivot,(pivot*2)))  )  period = pivot;
				pivot--;
			}//end while
		System.out.println(period);
	}//end main

}//end class
