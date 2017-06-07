package Medium;
/*
 * A sequence of n > 0 integers is called a jolly jumper if 
 * the absolute values of the differences between successive elements take on all possible values 1 through n - 1. eg. 
1 4 2 3 
is a jolly jumper, because the absolute differences are 3, 2, and 1, respectively. 
The definition implies that any sequence of a single integer is a jolly jumper.
 Write a program to determine whether each of a number of sequences is a jolly jumper. 
 */
import java.util.*;
public class JollyJumpers {

	public static void main(String[] args) {
		String line = "4 1 4 2 3";
		//System.out.println(line);
		if (line.length() == 1) System.out.println("Jolly");
		else {
			String[] tokens = line.split(" ");
			HashSet<Integer> set = new HashSet<Integer>();
			int n = Integer.parseInt(tokens[0]); //number of input numbers
			int[] nums = new int[n];
			for (int i = 0; i < nums.length; i++) nums[i] = (int)(Integer.parseInt(tokens[i+1]));
			for (int i = 0; i < nums.length-1; i++) {
				System.out.println("i: " + nums[i] + " i+1: " + nums[i+1]);
				set.add(Math.abs(nums[i]- nums[i+1]));
				System.out.println("Adding: " + (nums[i]- nums[i+1]));	
			}
			boolean jolly = true;
			for (int i = 1; i < n; i++) {
				if(!set.contains(i)) {
					jolly = false;
					break;
				}
			}
			System.out.println(jolly ? "Jolly" : "Not Jolly");
		}
	}

}

/*
 * System.out.println("n: " + n + " size: "+ set.size() + " nums.length: " + nums.length);
			Iterator<Integer> iter = set.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
			}
 * 
 */
