package Easy;
import java.io.*;
public class TimeToEat {
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] tokens = line.split(" ");
            
            //bubblesort DESC
            for (int i = 0; i < tokens.length-1; i ++) {
            	
            	for (int j = 1; j < tokens.length -i; j++) {
            		//if tokens[j-1] < tokens[j]: Swap them
            		if (compare(tokens[j-1], tokens[j])) {
            			//swap
            			String temp = tokens[j-1];
            			tokens[j-1] = tokens[j];
            			tokens[j] = temp;
            			
            		}//end if
            		
            	}//end inner j loop
            	
            }//end outer i loop
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < tokens.length; i++) {
            	result.append(tokens[i]+ " ");
            }
            System.out.println( result.toString().trim());  //convert builder to string, remove trailing spaces, and print
        }//end while: all generation is done
        buffer.close();
    }//end main
	
	//true:  str1 is less than str2
	//false: str1 is greater than str2
	public static boolean compare(String str1, String str2) {
	//compares two times in format HH:MM:SS	
		String[] a = str1.split(":");
		String[] b = str2.split(":");
		int[] x = new int[3];
		int[] y = new int[3];
		int i = 0;
		//convert into arrays of ints (for comparison)
		
		for (String str:a) {
			x[i] = Integer.parseInt(str);
			i++;
		}
		i = 0;
		for (String str:b) {
			y[i] = Integer.parseInt(str);
			i++;
		}
		i = 0;
		while (true) {
			if (x[i] < y[i]) return true;
			if (x[i] > y[i]) return false;
			i++;
		} //end while loop
		
	}//end Compare
}
