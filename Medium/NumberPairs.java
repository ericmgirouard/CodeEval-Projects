package Medium;
/*
 * loop through input and place numbers into hashset (for fast indexing)
 * scan through data again, checking for i if X-i exists in set
 * if it does, add the pair to a hashmap
 * once done, sort the keys in the hashmap, and print Key,Value pairs to console
 * Print NULL if there were no pairs (hashmap.size() == 0)
 */
import java.util.*;
public class NumberPairs {
	
	public static void main(String[] agrs) {
		String line = "2,4,5,6,11;20";
		//create variables and data structures
		String[] tokens = line.split(";"); //file parsing
		String[] nums = tokens[0].split(","); //more file parsing
		HashSet<Integer> set = new HashSet<Integer>(tokens[0].length());//stores the inout numbers for fast indexing
		for(int i = 0; i < nums.length; i++) set.add(Integer.parseInt(nums[i])); //add all numbers in set to hashSet
		HashMap<Integer, Integer> results = new HashMap<Integer,Integer>(); //create result HashMap for unique entries
		int X = Integer.parseInt(tokens[1]); 
		
		//determine pairs and add them to result Map
		for (int i  = 0; i < nums.length; i++) {
			int n = Integer.parseInt(nums[i]);
			//if true: Add the key:value pair to hash map
			if (set.contains(X-n)) {
				results.put(n, X-n);
				//and remove the reuslt from our set to eliminate duplicates
				set.remove(n);
			}
		}
		
		//Sort keys in ascending order and add results to StringBuilder
		StringBuilder str = new StringBuilder();
		Set<Integer> keys = results.keySet();//return key set from results
		int[] arrayOfKeys = new int[keys.size()];
		int index = 0;
		for(Integer i : keys) {
			arrayOfKeys[index++] = i;
		} //convert keySet to an array for sorting
		Arrays.sort(arrayOfKeys);
		//now build up the resulting string builder with key value pairs:
		for (int i = 0; i < arrayOfKeys.length; i++) {
			str.append(arrayOfKeys[i] + "," + results.get(arrayOfKeys[i]));
			if (!(i == arrayOfKeys.length-1)) str.append(";");//append semicolon unless its the last key to be added
		}
		//Print Result or "NULL" if no pairs
		System.out.println(str.length() == 0 ? "NULL" : str.toString()); 	
	}//end main
}
