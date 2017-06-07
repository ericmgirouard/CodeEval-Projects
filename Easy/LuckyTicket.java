package Easy;
/*
 * Eric Girouard 20151002
 * We can receive a lucky ticket in a public transport.
 * How to reveal whether the ticket is lucky or not?
 * We call a ticket lucky if the sum of its digits in the first half equals to the sum of digits in the second half.
 * For example, ticket 328940 is a lucky one because 3+2+8=9+4+0. 
 * Write a program that will count the maximum number of lucky tickets depending on the length of the ticket number.
 * In other words, how many lucky combinations can be if a ticket number comprises 4, 6, 8, … digits ?
 */
import java.util.*;
import java.io.*;
public class LuckyTicket {

	public static void main(String[] args) throws Throwable{
		double begin = System.currentTimeMillis();
		/*File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int digits = Integer.parseInt(line);
            */
			int digits = 10;
            int count = 1;
            int iterations = 0;
            int limit = (int)Math.pow((double)10, (double)digits);
            //start at the first lucky number besides 0 for 6 digits: 0 0 1 | 0 0 1
            int start = (int)Math.pow((double)10,(double)(digits/2));
            System.out.println("start: " + start + " and limit: " + limit);
          for (int i = start + 1; i < limit; i++) {
        	  iterations++;
			int current = i;
			int[] number = new int[digits];
			int len = number.length;

			int index = len-1;
			//populate array with values
			while (current > 0) {
				number[index] = current % 10;
				current /= 10;
				index--;
			}
			
			
			if(!sidesEqual(number)) continue; 
			//percentage of "hits" is very small. this way it only runs the sidesEqual method once instead of twice
			/*
			 * Step 2: Test that each side is equal. If they are, and the last digit is 0, proceed normally
			 */
			else if (sidesEqual(number) && number[len-1] == 0) {
				//System.out.println("sides match and last digit 0");
				count++;
			}
			
			/*
			 * Step 2b: If both sides match but the last digit is NOT ZERO,
			 * then the next occurance (if it exists) will be exactly 9 numbers after the current i
			 */
			
			else if (sidesEqual(number)) {
				//System.out.println("Sides match, last digit is not zero");
				count++;
				i += 8; //(8 since 1 will be added at the end of this iteration or for loop)
			}
		}//end for loop

		System.out.println("count: " + count + " and iterations: " + iterations);
       // } //end while	
		System.out.println("runtime in seconds: " + (System.currentTimeMillis()-begin)/1000);
	}//end main method
	
	
	
		public static boolean sidesEqual(int[] number) {
			/*
			 * Numbers will always have an even number of digits
			 * Step 1:  Start with indexes at each end, and work toward the middle
			 * 			Add digits in a half and at the end, compare the sum half's sums
			 */
			short a  = 0;
			int z = number.length-1;
			short leftSum = 0;
			short rightSum = 0;
			
			while(a < z) {
				leftSum += number[a];
				rightSum += number[z];
				a++;
				z--;
			}
			return (leftSum == rightSum);
		}
		

}//end class LuckyTicket
