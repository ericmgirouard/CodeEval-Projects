package Medium;

import java.util.HashSet;

/*
 * Credits: This challenge appeared in the Facebook Hacker Cup 2011.
A double-square number is an integer X which can be expressed as the sum of two perfect squares. 
For example, 10 is a double-square because 10 = 3^2 + 1^2. Your task in this problem is, given X,
 determine the number of ways in which it can be written as the sum of two squares.

For example, 10 can only be written as 3^2 + 1^2 (we don't count 1^2 + 3^2 as being different). 
On the other hand, 25 can be written as 5^2 + 0^2 or as 4^2 + 3^2. 
NOTE: Do NOT attempt a brute force approach. It will not work. The following constraints hold: 
0 <= X <= 2147483647 
1 <= N <= 100
INPUT SAMPLE:
5

10
25
3
0
1
OUTPUT SAMPLE:
1
2
0
1
1
Your program should accept as its first argument a path to a filename.
 You should first read an integer N, the number of test cases.
  The next N lines will contain N values of X.
 */

/*
 * loop from 0 to X
 * take i^2 if i does not exist in the HashSet
 * subtract X-(i^2) = N = n^2
 * if N is also a perfect square: then i^2 + n = X and thats one to our count
 * add both i and n to our HashSet, this way we wont duplicate values later on
 * continue looping until we reach X
 * 
 * for each X:
 * iterate X times: 
 * 			in each iteration: a max of 2 lookups, 1 subtraction, 1 addition, 2 operations, and some HashSet operations (all O(1)) --> O(1)
 * Results in O(X) algorithm
 * 
 */
public class DoubleSquares {

	public static void main(String[] args) {
		String line = "65536";
		int X = Integer.parseInt(line);
		HashSet<Integer> hash = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i <= X; i++) {
			if (hash.contains(i)) continue; //i has already been accounted for
			int N = X-(i*i);
			//if N is a square: add 1 to count and add it to hash
			double n = Math.sqrt(N);
			if (n == (int)n) {   //if N is a perfect square (Example: N = 22: n = 4.6345 (int)n = 4) (N= 25: n = 5.0 (int)n = 5 match)
				count++;
				hash.add((int)n);
				hash.add(i);
			}
		}
		System.out.println(count);	
	}
}
