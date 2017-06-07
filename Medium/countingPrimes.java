package Medium;

/*
 * Given two integers N and M, count the number of prime numbers between N and M (both inclusive)
INPUT SAMPLE:
Your program should accept as its first argument a path to a filename.
 Each line in this file contains two comma separated positive integers. E.g
 2,10
20,30
OUTPUT SAMPLE:
Print out the number of primes between N and M (both inclusive).
4
2

 */
public class countingPrimes {

	public static void main(String[] args) {
		/* 
		 * File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
		 * 
		 */
		String line = "20,31";
		String[] tokens = line.split(",");
		int n = Integer.parseInt(tokens[0]);
		int m = Integer.parseInt(tokens[1]);
		int primes = 0;
		if (n == 2) {
			n++;
			primes++;
		}//only one 2 comparison instead of 1 for each iteration
		while (n <= m) {
			if (prime(n++)) {
				primes++;
				n++;
			}
		}
		System.out.println(primes);

	}
	
	//checks if a number n is prime, returns 1 if true and 0 if false
	public static boolean prime(int n) {
		//is n a multiple of 2?
	    if (n % 2 == 0) return false;
	    //if it isnt, check odd numbers
	    for (int i = 3; i * i <= n; i += 2) {
	        if(n % i == 0)
	            return false;
	    }
	    return true; //n is prime
	}


}
