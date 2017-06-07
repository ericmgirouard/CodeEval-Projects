package Medium;
/*
 * The goal of this challenge is to design a cash register program. You will be given two float numbers.
 *  The first is the purchase price (PP) of the item. 
 * The second is the cash (CH) given by the customer.
 *  Your register currently has the following bills/coins within it:

'PENNY': .01,
'NICKEL': .05,
'DIME': .10,
'QUARTER': .25,
'HALF DOLLAR': .50,
'ONE': 1.00,
'TWO': 2.00,
'FIVE': 5.00,
'TEN': 10.00,
'TWENTY': 20.00,
'FIFTY': 50.00,
'ONE HUNDRED': 100.00
The aim of the program is to calculate the change that has to be returned to the customer.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. 
The input file contains several lines. Each line is one test case. 
Each line contains two numbers which are separated by a semicolon. 
The first is the Purchase price (PP) and the second is the cash(CH) given by the customer. eg.
15.94;16.00
17;16
35;35
45;50


For each set of input produce a single line of output which is the change to be returned to the customer.
 In case the CH < PP, print out ERROR. If CH == PP, print out ZERO. 
 For all other cases print the amount that needs to be returned, 
in terms of the currency values provided. 
The output should be sorted in highest-to-lowest order (DIME,NICKEL,PENNY). eg.

NICKEL,PENNY
ERROR
ZERO
FIVE


RUNTIME EVALUATION:
most change that can be given is 1 of each denomination:
100 + 50 + 20 + 10 + 5 + 2 + 1 + .5 + .25 + .1 + .5 + .01 + .01 +  .01 + .01 = 188.94
loops 15 times
makes 1, 2, 3, 4, 5 ,6 ,7,8,9,10,11,12,12,12,12= 114 comparisons in WORST case
as well as one fo revery iteration: = 129 compares

however code looks really ugly :(

 */
public class CashRegister {
	
	
	private static final int[] values = new int[]{
            10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
	
    private static final String[] strings = new String[]{
            "ONE HUNDRED", "FIFTY", "TWENTY", "TEN", "FIVE", "TWO", "ONE",
            "HALF DOLLAR", "QUARTER", "DIME", "NICKEL", "PENNY"};
    
	public static void main(String[] args) {
		String line = "296.17;297.0";
		String[] tokens = line.split(";");
		long PP = (long)(Double.valueOf(tokens[0])*100);   //purchase price of item(s)
		long CH = (long)(Double.valueOf(tokens[1])*100);   //cash given to chasier
		int lastIndex = 0; //records the previous denomination chosen. therefore the next one cannot be less than this: saves iterations
		if (CH < PP) System.out.println("ERROR"); //if not enough cash was given
		else if (CH == PP) System.out.println("ZERO"); //if cashier was given exact change
		else { //compute change
			long change = CH - PP;
			line = "";
			//find the highest denomination and continue until there is no change left to be made
			a: while (change > 0) {
				for (int i = lastIndex; i < values.length; i++) {
					System.out.print(i + " ");
					if (change >= values[i]) {
						line += strings[i] + ",";
						change -= values[i];
						lastIndex = i;
						System.out.println();
						continue a;//continue while loop and not for loop
					}	
				} 
			
			}				
			System.out.println(line.substring(0,line.length()-1));
		}//end else: change determined
	}//end main
}
