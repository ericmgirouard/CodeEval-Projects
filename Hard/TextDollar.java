package Hard;

import java.util.ArrayList;

/*
 * Credits: This challenge has been authored by Terence Rudkin 

 You are given a positive integer number.
 This represents the sales made that day in your department store.
  The payables department however, needs this printed out in english.
   NOTE: The correct spelling of 40 is Forty. (NOT Fourty)

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename.
The input file contains several lines. Each line is one test case.
 Each line contains a positive integer. E.g.
 3
10
21
466
1234

OUTPUT SAMPLE:

For each set of input produce a single line of output which is the
english textual representation of that integer.
The output should be unspaced and in Camelcase.
Always assume plural quantities. 
You can also assume that the numbers are < 1000000000 (1 billion).
In case of ambiguities e.g. 2200 could be
TwoThousandTwoHundredDollars or TwentyTwoHundredDollars,
always choose the representation with the larger base 
i.e. TwoThousandTwoHundredDollars. For the examples shown above, the answer would be:
ThreeDollars
TenDollars
TwentyOneDollars
FourHundredSixtySixDollars
OneThousandTwoHundredThirtyFourDollars
*/
/*
 * Analysis:
 * For each number n with d digits: d iterations
 * 		each iteration with 2 computations, then a max of 6 comparisons, then a print and 1 more computation
 * 		plus each iteration computes the number of digits, which is O(d) computations
 * 		so overall O(d)
 */
public class TextDollar {
	public static final String[] bases =  {"","", "Hundred","Thousand","","Hundred","Million", "", "Hundred","Billion"};
	public static final String[] digits = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	public static final String[] tens = {"Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	public static final String[] teens = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	
	public static void main(String[] args) {
		String line = "456789";
		int n = Integer.parseInt(line);
		int factor = line.length()-1; //grabs the current "place" of the digit to print
		int base = (int)Math.pow((double)10, (double)factor); //10^3 = 1000 
		ArrayList<Integer> parts = new ArrayList<Integer>(); //stores individual parts
		
		//break up number into sections of three (commas)
		int next = 0;
		int mult = 1;
		while (n > 0) {
			for (int i = 0; i < 3; i++) {
				next += (n % 10) * mult;
				n /= 10;
				mult *= 10;
			}
			parts.add(next);
			next = 0;
			mult = 1;
		}
		for (int i = 0; i < 3; i++) System.out.println(parts.get(i) + " " + i);
		//System.out.println(parts.size());
		/*
		 * work through arraylist backwards
		 * print number and then print its part word (hundred, hundred thousand, million etc)
		 */
		int size = parts.size();
		base = (int)Math.pow((double)10, (double)((size*size)));
		System.out.println(base);
		for (int i = size-1; i >= 0; i--) {
			//print this section:
			int num = parts.get(i);
			
		}
		
	}
	
	
		//counts the number of zeroes in a number (really just the number of digits - 1)
	public static int digits(int n) {
		int z = 0;
		while (n >= 10) {
			n /=10;
			z++;
		}
		return z;
	}
	
	
	public static int printNumber(int n, int base, int factor) {
		//find out which number to print
		/*
		 * case 1: n is a single digit, factor = 0
		 * 			just print the number at digits[n]
		 * 
		 * case 2: n is between a digit and a 100. 
		 * 			i.e. 23, 35,200, 89,894,000
		 * 			must print out the tens[n/base]
		 * 			This happens when factor is in (1,4,7,10,13,16,19) after that we cant use int
		 * 
		 * Case 3: n is any other number. we can simply print its single digit and corresponding base number
		 * 			ex: n = 234,658. 
		 * 			print single digit: digits[n/base] = "Two"
		 * 			print corresponding base: bases[factor] = "HundredThousand"
		 */
		
		//Case when n is a single digit (ex: 5)
		if (factor == 0) {
			System.out.print(digits[n]); 
			return n % base;
		}
		
		//case when n is a ten,twenty,thirty number (Ex: 23,000)
		else if (factor == 1 || factor == 4 ||factor == 7 ||factor == 10 || factor == 13) {
			if (n/base == 1) {
				int tempN = n % base;
				int tempDigit = tempN/(base/10);
				System.out.print(teens[tempDigit] + bases[factor-1]);	
				return ( (n % base) % (base/10) ); //cut off 2 digits from front
				
			}
			else {
				System.out.print(tens[(n/base)-1] + "" + bases[factor-1]); 
				return n % base;
			}
			
		}
		
		//literally any other case
		else {
			System.out.print(digits[n/base] + "" + bases[factor]); 
			}
			return n % base;
		}
		
	}
		
