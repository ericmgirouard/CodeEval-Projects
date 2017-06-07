package Medium;
/*PRIME NUMBERS
CHALLENGE DESCRIPTION:

Print out the prime numbers less than a given number N. 
For bonus points your solution should run in N*(log(N)) time or better. 
You may assume that N is always a positive integer.
INPUT SAMPLE:
Your program should accept as its first argument a path to a filename. 
Each line in this file is one test case. Each test case will contain an integer n < 4,294,967,295.
(must use long, not int)
//find and print the primes less than n in O(NLog(N)) time
 * O(NLog(N)) implies that if we check every number from 1->N, each check for prime must ne O(LOG(N)) in time.
 * that times N iterations gives us our goal
 * not possible, best algorithm is o(log(n)^6) and gets harder with highers n
 * reduce iterations
*/
public class PrimeNumbers {

	public static void main(String[] args) {
		String line = "50000";
		long n = 0;
		try { n = Long.parseLong(line);
		} catch(NumberFormatException nfe) {}
		//find and print the primes less than n in O(NLog(N)) time
		line = "";
		if (n > 2) line += "2,"; //2 is prime and a weird number
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) continue;
			if (prime(i)) line += i + ",";	//if prime, add to string, otherwise dont 
		}
		System.out.println( (line.length() != 0) ? line.substring(0,line.length()-1) : ""   ); //if empty, print blank, otherwise cut off trailing comma
	}
	
	//checks if a number n is prime, returns 1 if true and 0 if false
		public static boolean prime(long n) {
			//is n a multiple of 2?
			if (n == 1) return false;
		    if (n % 2 == 0) return false;
		    //if it isnt, check odd numbers
		    for (int i = 3; i * i <= n; i += 2) {
		        if(n % i == 0)
		            return false;
		    }
		    return true; //n is prime
		}

}
