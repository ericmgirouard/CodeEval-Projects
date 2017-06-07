package Easy;
import java.io.*;
public class RollerCoaster {
	
	
	
	public static void main (String[] args) throws Throwable {
        File file = new File("C:\\Users\\egirouard\\Downloads\\221baker.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int x = 1;
        int len = 0;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            len = line.length();
            for (int i = 0; i < len; i++) {
            	char c = line.charAt(i);
            	if (Character.isLetter(c))  {
            		switch (x) {
            			case 1:
            				System.out.print(Character.toUpperCase(c));
            				x = (x + 1) % 2;
            				break;
            			case 0:
            				System.out.print(Character.toLowerCase(c));
            				x = (x + 1) % 2;
            				break;
            		} 
            		
            	}  else {
        			System.out.print(c);
        		   }
            	
            }//end for loop
            System.out.println();
        }//end while, done reading
        
    }//end main
        
}//end class

