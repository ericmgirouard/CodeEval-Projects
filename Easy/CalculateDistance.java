package Easy;
import java.io.*;
public class CalculateDistance {

	 public static void main (String[] args) throws Throwable {
	       // File file = new File(args[0]);
	        //BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line = "(47, 43) (-25, -11)";
	        //while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            line = line.replaceAll("[(),]","");
	            distance(line);
	        }
	    //}

	 public static void distance(String line) {
		 String[] nums = line.split(" ");
		 double distance = Math.sqrt(((Math.pow(   ( Integer.parseInt(nums[0]) - Integer.parseInt(nums[2]) ), 2)) + (Math.pow(   ( Integer.parseInt(nums[1]) - Integer.parseInt(nums[3]) ), 2))));
		 System.out.println((int)distance);
	 }

}
