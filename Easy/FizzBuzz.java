package Easy;
import java.io.*;
public class FizzBuzz {
	
	
	public static void main (String[] args) throws Throwable {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String[] tokens = line.split(" ");
            int x = Integer.parseInt(tokens[0]);
            int y = Integer.parseInt(tokens[1]);
            int n = Integer.parseInt(tokens[2]);
            StringBuilder str = new StringBuilder();
            for (int i = 1; i <= n; i++) {
            	int divisor =  divisor(x,y,i);
            	
            	switch (divisor) {
            	
            	case 3: 
            		str.append("FB"  + " ");
            		break;
            	case 2:
            		str.append("B" + " ");
            		break;
            	case 1: 
            		str.append("F" + " ");
            		break;
            	default:
            		str.append(i + " ");
            	} //end switch
            }//end for loop: line has finished the round
          //convert str to a string and trim trailing space(s)
        	line = str.toString();
        	line = line.trim();
        	System.out.println(line);
        } //end while: output done
        
        
    } //end Main
	
	
	
	public static int divisor(int x, int y, int z) {
		//1: divisible by x, Fizz
		//2: divisible by Y. Buzz
		//3: divisible by X and Y, Fizz Buzz
		//0: not divisible by x or y
		//x: input x into program fizz divisor
		//y: second input, buzz divisor
		//z: current number in game cycle
		if (z % (x*y) == 0 ) return 3;
		if (z % y == 0) return 2;
		if (z % x == 0) return 1;
		else return 0;
	}//end divisor
	
	
}
