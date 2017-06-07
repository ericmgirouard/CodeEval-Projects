package Easy;
/*
 * You are given a sorted list of numbers with duplicates. Print out the sorted list with duplicates removed.
INPUT SAMPLE:
File containing a list of sorted integers, comma delimited, one per line. E.g. 
1,1,1,2,2,3,3,4,4
2,3,4,5,5

OUTPUT SAMPLE:
Print out the sorted list with duplicates removed, one per line. 
E.g.
1,2,3,4
2,3,4,5
 */

/*
 * scan through ints one at a time,
 * place into Hashmap to form uniqueness
 * remove values of hashmap
 * sort values
 * print
 * 
 * 
 */
import java.util.*;
public class UniqueElements {

	public static void main(String[] args) {
		String line =  "7,7,8,9,10,11,11,11,12,12,13,14,14,15,16";
		String[] tokens = line.split(",");
		HashMap<String, Integer> hash = new HashMap<String, Integer>(line.length());
		for (int i = 0; i < tokens.length; i++) {
			hash.put(tokens[i],1); //number is the key, guarantees key uniqueness
		}
		//create character array from hashmap keys (unique numbers)
		String[] uniqueList = (String[])hash.keySet().toArray(new String[hash.keySet().size()]); 
		int[] nums = new int[uniqueList.length];
		for (int i= 0; i < uniqueList.length; i++) {
			nums[i] = Integer.parseInt(uniqueList[i]);
		} 
		Arrays.sort(nums);
		for (int i= 0; i < uniqueList.length; i++) {
			if (i == uniqueList.length-1) System.out.print(nums[i]+"\n");
			else System.out.print(nums[i]+ ",");
		} //done printing result
	}//end main

}
