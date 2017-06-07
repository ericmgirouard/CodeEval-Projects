package Medium;
/*
 * There are two strings: A and B. 
 * Print 1 if string B occurs at the end of string A. Otherwise, 
 * print 0.

INPUT SAMPLE:

The first argument is a path to the input filename containing 
two comma-delimited strings, one per line. 
Ignore all empty lines in the input file.

For example:

Hello World,World
Hello CodeEval,CodeEval
San Francisco,San Jose

OUTPUT SAMPLE:
Print 1 if the second string occurs at the
 end of the first string. Otherwise, print 0.

For example:
1
1
0

 */
public class TrailingString {

	public static void main(String[] args) {
		String line = "San Francisco,San Jose";
		String[] words =line.split(",");
		int len0 = words[0].length();
		int len1 = words[1].length();
		if (len1 > len0) System.out.println(0);
		else System.out.println( (words[0].substring(  len0-len1, len0)).equals(words[1]) ? 1 : 0);
		//^^^^ prints 1 if the second string is equal to the trail of string 1, or 0 if not

	}

}
