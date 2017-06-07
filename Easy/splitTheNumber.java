package Easy;
/*
 * SPLIT THE NUMBER
CHALLENGE DESCRIPTION:

You are given a number N and a pattern. The pattern consists of lowercase latin letters and one operation "+" or "-".
 The challenge is to split the number and evaluate it according to this pattern e.g. 
1232 ab+cd -> a:1, b:2, c:3, d:2 -> 12+32 -> 44

INPUT SAMPLE:
Your program should accept as its first argument a path to a filename.
 Each line of the file is a test case, containing the number and the pattern separated by a single whitespace. E.g.
3413289830 a-bcdefghij
776 a+bc
12345 a+bcde
1232 ab+cd
90602 a+bcde

OUTPUT SAMPLE:
For each test case print out the result of pattern evaluation. E.g.
-413289827
83
2346
44
611

Constraints: 
N is in range [100, 1000000000]

 */
public class splitTheNumber {

	public static void main(String[] args) {
		String line = "90602 a+bcde";
		line = line.trim();
		
		//file/String parsing
		String[] tokens = line.split(" ");
		int op = tokens[1].indexOf('+');
		char oper = op == -1 ? '-' : '+'; //i fop = -1, then + wasnt found, so it is '-'
		if (op == -1) op = tokens[1].indexOf('-');
		String left = tokens[1].substring(0,op);
		String right = tokens[1].substring(op+1, tokens[1].length());
		
		//determine left and right numbers 
		int leftNum = Integer.parseInt(tokens[0].substring(0, (int)(left.charAt( left.length()-1 ))-96) );//0 -> 0 in example 2
		int rightNum = Integer.parseInt(tokens[0].substring(  (int)((right.charAt(0))-97), (int)(right.charAt( right.length()-1 ))-96));
	
		//Print Result
		if (oper == '+') System.out.println(leftNum + rightNum);
		else System.out.println(leftNum - rightNum);

	}

}
