package Easy;
import java.io.*;
/*
 * 2000 and was not However, implemented 1998 it until;9 8 3 4 1 5 7 2
   programming first The language;3 2 1
 */
public class Data_Recovery {
	public static void main (String[] args) throws Throwable {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
		   // String line = "2000 and was not However, implemented 1998 it until;9 8 3 4 1 5 7 2";
            String[] halfs  = line.split(";");
            //System.out.println(halfs[0] + "<- 0.....1->" + halfs[1]);
            String[] words  = halfs[0].split(" ");
            String[] places = halfs[1].split(" "); 
            //System.out.println();
            String[] result = new String[words.length];
      
            
            
            //solve it
            for (int i = 0; i < places.length; i ++) {
            	
            	int place = Integer.parseInt(places[i]);
            	//place the word at words[i] into position result[place-1]
            	result[place-1] = words[i];
            }
            	
            //Find if there is a Null space in result, and if so place the last word in words there
            for (int i = 0; i < result.length;i++) {;
            	if (result[i] == null) {
            		result[i] = words[words.length-1];
            	}//end if
            }//end for: last string has been placed: all done
            String print = "";
            for (int i = 0; i < result.length; i++) {
            	print += result[i] + " ";
            }
            print = print.trim();
            System.out.println(print);
        
            
        }//end while: done generating output
    }//end main
}
