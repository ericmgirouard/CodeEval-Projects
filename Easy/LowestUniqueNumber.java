package Easy;

public class LowestUniqueNumber {

	public static void main(String[] args) {
		String line = "2 9 6 4 2 5 8 3 6 6 5 1 2 4 3 9 9 8 4";
		String[] str = line.split(" ");
		int[] nums = new int[str.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(str[i]);
			//System.out.println(nums[i]);
		} //int array generated
		int[] counts = new int[9];
		for (int i = 0; i < nums.length; i++) {
			counts[nums[i]-1]++;
		}
		
		line = line.replace(" ","");
		
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + ": " + counts[i] + " (" + (i+1) + ")");
		}
		
		
		/*
		 * loop through counds indexes:
		 * once we find an index with count = 1:
		 * 		a = the char value of the index digit + 1 (+1 so we get the player number)
		 * now playerindex = the index of the first occurance of a (the number with lowest count) 
		 * 
		 * ERROR: this prints the winning number not the winning players position
		 */
		//now pick the lowest unique count
		int playerIndex = 0;
		for (int i = 0; i < 9; i++) {
			if (counts[i] == 1 ) {
				char a = (char)(i+1+48);  
				//System.out.println(i + " " + " first 1 count is with number: " + a);
				playerIndex = line.indexOf(a);
				//System.out.println(line.charAt(playerIndex));
				break;
			}
				
		}
		System.out.println(playerIndex+1);
		//System.out.println(line);

	}

}
