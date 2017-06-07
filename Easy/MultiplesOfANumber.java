package Easy;
/*
		 * Given numbers x and n, where n is a power of 2, 
		 * print out the smallest multiple of n which is greater than or equal to x. 
		 * Do not use division or modulo operator.
		 * 13,8
		 * 17,16
		 * 
		 * 16
		 * 32
		 */
public class MultiplesOfANumber {

	
	public static void main(String[] args) {
		String line = "1060,4";
		String[] nums = line.split(",");
		int n = Integer.parseInt(nums[1]);
		int m = Integer.parseInt(nums[0]);
		// determine which power of 2 n is
		int power = 1;
		while (n >> power > 1) power++;
		int div = m >> power;
		if (n* div < m) System.out.println(n * (div+1));
		else System.out.println(n*div);
		
	}
}
