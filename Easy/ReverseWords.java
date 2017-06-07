package Easy;
import java.io.*;
public class ReverseWords {
	
	
	
	public static void main (String[] args) throws IOException {
        File file = new File("C:\\Users\\egirouard\\Downloads\\221baker.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	if (line.equals("")) continue;
            line = line.trim();
          // System.out.println(line); //test line: prints original line for comparison
           //Trim, strip of , and . then tokenise
            line = line.replaceAll("[,.-:]", "");
            String[] words = line.split(" ");
            //^^ array of words in sentence, separated by space
            for (int i = words.length-1; i >= 0; i--){
            	switch (i) {
            	case 0:
            		System.out.print(words[i]); //no trailing spaces
            		break;
            		
            	default:
            		System.out.print(words[i] + " ");
            	}//end switch
            	
            } //end for loop: words have been reverse printed
            System.out.println();//go to next line
        } //end while: all is printed
    } //end main
	
	
	
}
