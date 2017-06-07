package Medium;
/*
 * You are given 3 coins of value 1, 3 and 5. 
 * You are also given a total which you have to arrive at.
 *  Find the minimum number of coins to arrive at it.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename.
 Each line in this file contains a positive integer number which
 represents the total you have to arrive at. E.g.
11
20

3
4

Algorithm Analysis:
max iterations is the answer: so it will iterate to the number of coins: O(numCoins)
does a max of 2 comparisons per iteration, and 1 increment/1 decrement: O(numCoins*O(1))
numCoins will at MOST be n. so AT WORST O(N). 
and decreases as n gets larger to O(N/5) which is O(N)

 */
public class MinimumCoins {

	public static void main(String[] args) {
		String line = "92";
		int n = Integer.parseInt(line);
		int numCoins = 0;
		while (n > 0) {
			if (n >= 5) {
				numCoins++;
				n -= 5; //5 coin
			}
			else if (n >=3 ) {
				numCoins++;
				n -= 3; //3 coin
			}
			else {
				numCoins++;
				n--; //1 coin
			}
		}//end while loop: number determined
		System.out.println(numCoins);
	}

}
