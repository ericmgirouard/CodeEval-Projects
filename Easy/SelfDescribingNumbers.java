package Easy;
/*
 * 2020: starting from position 0:
 * position 0: value of 2, there are indeed two 0's in the number
 * position 1: value 0, there are indeed zero 1's in n
 * p 2: value 2. there are two 2's in n
 * p3: value 0 , there are zero 3's in n
 * n is a self describing number
 * 
 * Step1: create a counts array of the digits of n
 * step2: convert counts array into a string and compare it to line?
 */
import java.util.*;
public class SelfDescribingNumbers {

	public static void main(String[] args) {
		String line = "2020";
		int[] counts = new int[10];
		for (int i = 0; i < line.length(); i++) {
			counts[line.charAt(i)-48]++;
		}
		System.out.println( line.equals(Arrays.toString(counts).replaceAll("[^\\d.]","").substring(0, line.length())) ? "1" : "0"  );
	}

}
