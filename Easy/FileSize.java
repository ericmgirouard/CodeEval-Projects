package Easy;
import java.io.*;
import java.util.*;
/*
 *  a byte is 8 bits.
 *  1 char is equal to a byte
 *  so count the chars in a document\
 *  chars = newlines, digits, characters, letters etc
 */
public class FileSize {

	 public static void main (String[] args) throws Throwable {
		 long byteCount = 0;
	        File file = new File("C:\\Users\\egirouard\\Downloads\\221baker.txt");
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        int line;
	        while ((line = buffer.read()) != -1) {
	           byteCount++;
	        }
	        System.out.println(byteCount);
	    }

}
