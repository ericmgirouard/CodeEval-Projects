package Easy;
import java.util.*;
import java.io.*;

/*
 * Find Intersection of sets:
 * create result (intersection) hashSet
 * convert larger set into new hashSet
 * Scan through smaller set:
 * 		if current element exists in Set2hashSet, add it to new ResulthashSet. 
 * Convert keys of ResultHash to String array
 * print elements of string array
 * (or learn hashSet iterator)
 */
public class SetIntersection {

	public static void main (String[] args) throws IOException {
		long myStart = System.currentTimeMillis();
        File file = new File("C:\\Users\\egirouard\\Desktop\\intersection.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
    	String[] tokens = line.split(";");
    	//System.out.println(line + " line");
		String[] set1 = tokens[0].split(",");
		String[] set2 = tokens[1].split(",");
		boolean set1IsLarger = (set1.length > set2.length); //true if set1 is larger
		HashSet<String> resultHash = new HashSet<>();
		HashSet<String> setHash = new HashSet<String>(  (set1IsLarger ? Arrays.asList(set1) : Arrays.asList(set2))   );
		
		if (set1IsLarger) {
			for (int i = 0; i < set2.length; i++) {
				if (setHash.contains(set2[i])) resultHash.add(set2[i]);
			}
		}
		
		else { 
			for (int i = 0; i < set1.length; i++) {
				if (setHash.contains(set1[i])) resultHash.add(set1[i]); //if element is also in set1 add it to intersection
			}
		}

		if (!resultHash.isEmpty()) {
			Iterator<String> iter = resultHash.iterator();
			String result  = ""; //use line to save memory
			while (iter.hasNext()) {
				result += iter.next() + ",";	
			}
			System.out.println(result.substring(0,result.length()-1));
		} else System.out.println("NULL Match Set"); //if intersection is null print \n	
        }//end while loop
        System.out.println(System.currentTimeMillis()-myStart);

        
        
    }
}
