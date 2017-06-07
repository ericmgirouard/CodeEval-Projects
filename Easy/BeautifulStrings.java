package Easy;

import java.util.Arrays;
import java.io.*;
public class BeautifulStrings {

	public static void main (String[] args) throws IOException {
        File file = new File("C:\\Users\\egirouard\\Desktop\\beauty.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            //System.out.println(line);
            line = line.replaceAll("\\p{Punct}+","");
            line = line.replaceAll("\\p{Digit}+","");
		line = line.replace(" ", "");
		line = line.toLowerCase();
		//System.out.println(line);
		
		//a = 97
		//z = 112
		/*
		 * Step 1: Create int[] to mirror alphabet counts: T=  negligable
		 * Step 2: scan characters of string and add counts to int[] T = len(string) = N
		 * Step 3: Sort int[] T = NlogN
		 * Step 4: Scan int[] until a zero value is reached, Max T = N
		 * 			summing 26*int[0] + 25*int[1].....until zero is reached
		 * Step 5: return that sum as the max beauty of that string T = C
		 * 
		 * 
		 * Max Runtime = O(N) where N is the number of distinct characters in the string
		 * Do this for every test case within a while loop for the file
		 */
		//step 1
		int[]  counts = new int[26]; 
		char[] chars = line.toCharArray();
		//step 2
		for (int i = 0; i < chars.length; i++) {
		    if (Character.isLetter(chars[i])) {
 			counts[ (chars[i]-97)]++;
		}
		}
		//step 3
		Arrays.sort(counts);
		//step 4
		int beauty = 0;
		int index = counts.length-1;
		while (index >= 0 && counts[index] >  0  ) {
			
			beauty += counts[index]*(index+1);
			//System.out.println("index is: " + index + " the count is: " + counts[index] + " factor = " + (index + 1) + " the sum so far is: "+ beauty);
			index--;
			
		}
		//step 5
		System.out.println(beauty);
        }
    }

}
