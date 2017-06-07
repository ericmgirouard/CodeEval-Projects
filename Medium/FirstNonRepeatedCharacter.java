package Medium;
/*
 * Write a program which finds the first non-repeated character in a string.
INPUT SAMPLE:
The first argument is a path to a file. The file contains strings.
For example:
yellow
tooth

OUTPUT SAMPLE:
Print to stdout the first non-repeated character, one per line.
For example:
y
h
 */
import java.util.HashMap;
import java.util.Arrays;
public class FirstNonRepeatedCharacter {
/*
 * scan through input string,
 * add the current character to a hashmap as (char, index) 
 * if that char already exists, remove it from map and continue
 * once done, pull out values as an array and sort
 * print line.charAt(first index of that sorted array)
 */
	public static void main(String[] args) {
		String line = "tooth";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (map.containsKey(c)) map.remove(c);
			else map.put(c, i);
		}
		Integer[] values = (Integer[])(  map.values().toArray(  new Integer[map.values().size()]  )  ); //Integer array pof values (indexes) of unique chars
		Arrays.sort(values);
		System.out.println(line.charAt(values[0]));
	}

}
