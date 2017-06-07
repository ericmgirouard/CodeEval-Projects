package Easy;
/*
 * A happy number is defined by the following process. 
 * Starting with any positive integer, replace the number by the sum of the squares of its digits,
 *  and repeat the process until the number equals 1 (where it will stay), 
 *  or it loops endlessly in a cycle which does not include 1. 
 * Those numbers for which this process ends in 1 are happy numbers, while those that do not end in 1 are unhappy numbers.
 */
import java.util.*;
public class LuckyNumbers {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String line = "22";
		int n = Integer.parseInt(line);
		//take sum of square of digits
		int sum = 0;
		boolean loop = false;
		HashMap map = new HashMap<Integer, Integer>(); //store values weve already seen (key, count)
		while (n !=1) {
			//loop through the digits of n and sum their squares:
			sum = 0;
			
			while (n > 0) { //sum the squares of the digits of n 
				sum += Math.pow(n%10,2); //right most digit ^2
				n /=10;//move to the left 1
				//System.out.println(sum);
			}
			
			n = sum;
			//if this number already exists we are looping and should break;
			if ( map.containsKey(n)) {
				loop = true;
				break;
			}
			map.put(n, 1);
		}
		System.out.println(loop ? 0 : n); //if the inout times out, print 0, if it didnt, print th eresult
	}

}
