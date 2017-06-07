package Easy;
import java.util.Arrays;

/*
 * Take in space-delimited string of doubles
 * Sort this string and print (with spaces as delimiters)
 */
public class SimpleSorting {

	public static void main(String[] args) throws Throwable{
		String line = "-37.507 -3.263 40.079 27.99 65.21 -55.552";
		String[] tokens = line.split(" ");
		double[] nums = new double[tokens.length];
		for (int i = 0; i < tokens.length; i++) {
			try {
				nums[i] = Double.parseDouble(tokens[i]);
			} catch (NumberFormatException nfe) {} //not a number
		}//end for loop: int array created and initialized
		Arrays.sort(nums); //quicksort the array of doubles
		for (int i = 0; i < nums.length; i++) {
			if (i == nums.length-1) System.out.printf("%.3f", nums[i]);
			else System.out.printf("%.3f ", nums[i]);
		}
		System.out.println();
	}//end main


}
