package Medium;
/*
 * Write a program which reads a file and prints to stdout the specified number of the longest lines 
 * that are sorted based on their length in descending order.
INPUT SAMPLE:
2
Hello World
CodeEval
Quick Fox
A
San Francisco
Your program should accept a path to a file as its first argument.
 The file contains multiple lines. The first line indicates the number of lines you should output, 
 the other lines are of different length and are presented randomly. 
 You may assume that the input file is formatted correctly and the number in the first line is a valid positive integer.

For example:

OUTPUT SAMPLE:
San Francisco
Hello World
Print out the longest lines limited by specified number and sorted by their length in descending order.

For example:
 */
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LongestLines {

	public static void main(String[] args) throws IOException{
		String fileLocation = "C:\\Users\\egirouard\\Desktop\\Code Source\\longestwords.txt"; //test file
		BufferedReader buffer = new BufferedReader(new FileReader(new File(fileLocation)));//change to args[0] for CodeEval testing
		String line;
		String[] words = new String[Integer.parseInt(buffer.readLine())]; //first line will ALWAYS be a number, as given by challenge rules
		Arrays.fill(words, "");
		int shortestIndex = 0; //records index of the shortest string in the words array
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			line = line.replaceAll("\\n", "");
			if(line.length() > words[shortestIndex].length()) words[shortestIndex] = line;
			//now find the shortest Index
			shortestIndex = findLeast(words);
		}//end while
		buffer.close();
		/*
		 * Since we must print out the words in order of length, it was more efficient to sort them at the end
		 * instead of inserting them in order, since the words might change over time
		 * Sort "words" by comparing lengths to determine difference
		 */
		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
	            return o2.length()-o1.length();
	        }
		});
		
		//print the sorted lines
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

	public static int findLeast(String[] words) {
		int least = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() < least) {
				index = i;
				least = words[i].length();
			}
		}
		return index;
	}

}
