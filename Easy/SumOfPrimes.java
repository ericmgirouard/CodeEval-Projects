package Easy;

public class SumOfPrimes {

	public static void main(String[] args) {
		/*
		 * Step 1: loop forever
		 * Step 2: keep a count of the number of primes found
		 * Step 3: check if a given number is prime: if it is, add it to sum and increment primeCount
		 * Stop once primeCount reaches 1000
		 */
		int primeCount = 0;
		int current = 0;
		int sum = 1;
		while (primeCount < 1000) {
			if (isPrime(current)) {
				primeCount++;
				sum += current;
			}
			current++;
		}//end while: done calculations
		System.out.println(sum);
	}
	
	
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

}
