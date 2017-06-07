package Medium;

import java.util.ArrayList;

/*
 * Flavius Josephus was a famous Jewish historian of the first century, 
 * at the time of the destruction of the Second Temple.
 *  According to legend, during the Jewish-Roman war he was trapped in a
 *   cave with a group of soldiers surrounded by Romans.
 *   Preferring death to capture, the Jews decided to form a circle and, 
 *   proceeding around it, to kill every j'th person remaining until no one was left.
 *    Josephus found the safe spot in the circle and thus stayed alive. 
Write a program that returns a list of n people, numbered from 0 to n-1, 
in the order in which they are executed.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. 
Each line in this file contains two comma separated positive integers n and m,
 where n is the number of people and every m'th person will be executed. E.g.
 
10,3
5,2

OUTPUT SAMPLE:

Print out the list of n people (space delimited) in the order in which they will be executed. E.g.

2 5 8 1 6 0 7 4 9 3
1 3 0 4 2

 */
public class FlaviusJosephus {

	public static void main(String[] args) {
		String line = "10,3";
		String[] tokens = line.split(",");
		int n = Integer.parseInt(tokens[0]); //number of people in circle
		int m = Integer.parseInt(tokens[1]); //every mth person is killed off
		
		/*
		 * A "circle" can be represented as an array of size n
		 * and a while loop incremented via: i = ((i+1) % n)
		 * this way when we reach the end of the circle (array) we loop back to 0 (n%n =0)
		 * the rest will be relatively easy to interpret
		 */
		//only stop at an index after finding m "alive" places
		ArrayList<Integer> circle = new ArrayList<Integer>();
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < n; i++) circle.add(i);
		//for (int i : circle) System.out.println(circle.get(i)); //maintaining order
		int killIndex = -1;
		for (int i = 0; i < n; i++) {
			killIndex = (killIndex + m) % circle.size();
			//System.out.println(killIndex);
			//System.out.println(circle.get(killIndex)); //<--hes about to DIE
			str.append(circle.get(killIndex) + " ");
			circle.remove(killIndex); //kill him and remove from list
			killIndex--; //(since we removed an element, we decreased the size. so this adjusts our indexes to match the new size)
		}
		System.out.println(str.toString().trim());
		
	}

	
}



/*
 * int[] circle = new int[n];
		int killIndex = 0;
		for (int i = 1; i < n; i++) {//loop n-1 times (so kill n-1 people
			//find next index to kill by killing mth alive person in list
			int count  =0;
			int index = 0;
			
			while (count < m) {
				//System.out.println("start of loop: count: " + count + " killIndex: "+ killIndex + " index: "+ index);
				if (circle[killIndex] == 0) {
					killIndex = (killIndex + 1) % n;
					count++;
					System.out.println("alive found!!  count: " + count + " killIndex: "+ killIndex);
				}//end if: incremented counters, found an alive person 
				else {killIndex = (killIndex + 1) % n;}//updates if current person is dead, since we skip over them
			}//end while loop: next index found.
			
			//now we murder them!
			circle[killIndex] = 1; //murdered
			System.out.println(killIndex);
		}
 * */
