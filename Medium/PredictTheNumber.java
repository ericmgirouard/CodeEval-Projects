package Medium;
/*
 * The sequence "011212201220200112 ..." is constructed as follows:
first goes 0, and then the following action is repeated: 
existing part is added to the right, but 0 is replaced with 1, 1 with 2, and 2 with 0.
0 -> 01 -> 0112 -> 01121220 -> ...

Write an algorithm that determines what number is on the N-th position in the sequence.

INPUT SAMPLE:

Your program should accept a path to a filename as its first argument. 
Each line in the file contains a number N.

For example:
0
5
101
25684

OUTPUT SAMPLE:

Print out a number that is on the N-th position in the sequence.
0
2
1
0

Constraints
0 <= N <= 3,000,000,000.
 */


/*
 * n is the index of the number (0,1,2) we want to return in the string of ints 0120120102012112012 blah
 * each iteration of this strings generation, the length doubles, since we take the previous string and add its converted self.
 * therefore the number n only requires log2(n) iterations to reach n
 * so simply generating the string requires log(n) iterations, each requiring:
 * 		a scan of the newly added string, of length max n/2
 * 		maxn/2 conversions and lookups
 * so O(n/2log(n))
 * n can be up to 3,000,000,000 so long must be used over primitive int
 */


public class PredictTheNumber {

	public static void main(String[] args) {
		String line = "25684";
		long n = Long.parseLong(line);
		if (n < Integer.MAX_VALUE) {
			
		String s = "0"; //initial string, index 0 contains '0'
		int iterations = (int)Math.ceil(   Math.log(n) / Math.log(2)    );// get log2(n)
		for (int i = 0; i < iterations; i++ ){
			s = append(s); //extend the string until we can find the n'th index
		}
		System.out.println(s.charAt((int) n));
		} else {//case when n is just too damn high
			
			
		}
	}//end main
	

	public static String append(String s) {
		/*
		 * take input string and copy it
		 * scan copied string and convert all 0's to 1's
		 * all 1's to 2's
		 * and all 2's to 0's
		 */
		String add = "";
		for (int i = 0; i < s.length(); i++) {
			add += (  ((s.charAt(i) - 47) %3)   );
		}
		return s + add;
	}
	
}
