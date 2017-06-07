package Easy;
/*
 * Eric Girouard
 * Generate a program to compute the largest prime palindrome less than 1000
 * must take less than 10 seconds and use less than 20mb of memory
 */
import java.util.*;
public class PrimePalindrome {

	public static void main(String[] args) {
		
		//Unit test code for one input (works)
		/*int num = 1008001;
		boolean palindrome = false;
		palindrome = compute(num);
		System.out.println(palindrome);
		 */
		int factor = 1000;
		int maxPalindrome = 1;
		//determine largest prime palindrome
		for (int i = 1; i < factor; i++) {
			//first determine if i is a prime:
			if (isPrime(i)) {
				if (isPalindrome(i)) {
					if (i > maxPalindrome) maxPalindrome = i;
				}//end palindrome if
			}//end prime if
		}//end for loop: largest has been found
		System.out.println(maxPalindrome);
	}

	
	public static boolean isPalindrome(int num) {
		//test if int is a palindrome
		//work toward the middle from both sides of the int
		//convert int into an array of digits:
		ArrayList<Integer> array = new ArrayList<Integer>();
		do {
			array.add(num % 10);
			num/=10;
		} while (num > 0);
		
		int a  = 0;
		int z = array.size()-1;
		
		//loop through the number from both ends, if the pointers cross and still havent returned, then its a palindrome
		while (a < z) {
			if (array.get(a) != array.get(z)) return false;
			a++;
			z--;
		} //end while: looped through the whole array (number)
		return true;
	} //end compute
	
	
	public static boolean isPrime(int n) {
		//check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if it isnt, we only need to check odds up to the sqrt(n)
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}//end isPrime()
	
}//end class
