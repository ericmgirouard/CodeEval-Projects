package Medium;
/*
 * There is a wire between two buildings outside of your window.
 *  Bats love to hang there, but they never hang closer than "d" 
 *  centimeters from each other. They also don't hang closer than 6
 *   centimeters from any of the buildings.

Your task is to determine the maximum number of additional bats that
 can fit on the wire assuming they have a zero width.

INPUT SAMPLE:

Your program should accept a file as its first argument.
 Each line of input contains three space separated integers:
  the length of the wire "l", distance "d", and number of bats "n"
   that are already hanging on the wire.

The "n" number of bats is located in any order. 
All numbers are integers. 
You can assume that the bats that are already hanging on the wire
 are at least 6 cm from the buildings and at least "d" centimeters apart from each other.

For example:
22 2 2 9 11
33 5 0
16 3 2 6 10
835 125 1 113
47 5 0

OUTPUT SAMPLE:

For each line of input, print out one integer
 to determine the maximum number of ADDITIONAL bats 
 that can possibly hang on the wire.

For example:
3
5
0
5
8

 */
public class BatsChallenge {

	public static void main(String[] args) {
		String line = "47 5 0";
		String[] tokens = line.split(" ");
		int n = Integer.parseInt(tokens[2]); //number of bats already on the wire
		int l = Integer.parseInt(tokens[0]);//length of the wire
		int d = Integer.parseInt(tokens[1]); //minimumk distance between each bat
		/*
		 * create array of size l. indices from 0 -> l-1
		 * all values = 0. set values = 1 where bats already exist
		 * start at 0:
		 * 		scan to the right and determine if a bat can be placed there.
		 * 			if yes: value = 1: skip foward d-1 (i++ will do the last one) places
		 * 			if no: dont chnage value, continue foward normally
		 * keep a counter of how many bats youve added
		 * Print that counter
		 */
		//System.out.println("d: " + d + " n: " + n + " l: " + l);
		int bats = 0;
		int[] wire = new int[l];
		for (int i = 0; i < n; i++) wire[Integer.parseInt(tokens[3+i])-1] = 1; //add existing bats to wire
		//for (int i = 0; i < wire.length; i++) System.out.println(wire[i] + " i: " + i);
		
		for (int i = 5; i <= l-5; i++) {
			//System.out.println(i);
			boolean canAdd = true;
			//check that the previous d-1 spots are empty (the dth spot can contain another bat)
			for (int k = i; k >= i-d+1 && k >= 5; k--) {
				//System.out.println("k: " + k + " i: " + i);
				if (wire[k] != 0) {
					canAdd = false;
					break;
				}//end if
			}//end check of last d spots
			//check the next d-1 spots for availability of the bat
			for (int k = i; k <= i+d-1 && k < l; k++) {
				//System.out.println("k: " + k + " i: " + i);
				if (wire[k] != 0) {
					canAdd = false;
					break;
				}//end if
			}//end check for next d spots
			if (canAdd) {
				wire[i] = 1;
				bats++; 
				i += d-1; //(skip d spots, the i++ will take care of the last spot)
			}
		}//end i for loop:
System.out.println(bats);
//for (int i = 0; i < wire.length; i++) System.out.println(wire[i] + " i: " + i);
	}

}
