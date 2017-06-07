package Medium;
/*
 * There are N unlocked rooms located in a row along the corridor.

A security guard, who starts the beat at the beginning of the corridor,
 passes by and closes the lock of every second door (2nd, 4th, 6th…).
Then he returns to the beginning of the corridor, and passes by again 
changing the state of every third door (3rd, 6th, 9th…) to the opposite state 
— if the door is closed, security guard opens it; if the door is open, he closes it.

One iteration consists of two beats (when the security guard closes each second door, 
and changes the state of each third door to the opposite state). The iteration repeats M-1 times.

During the last iteration, the security guard just changes the state 
of the last door in a row (closes it, if the door is open or opens it,
 if the door is closed).

Your task is to determine how many doors have been left unlocked.

Your program accepts a filename as its first argument.

Each line of input contains 2 integers separated by space. 
The first integer represents number of doors (N), the second 
— number of iterations (M).
 */
public class Locks {

	public static void main(String[] args) {
		String line = "100 100";
		String[] tokens = line.split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		/*
		 * loop through M times:
		 * 		start with a byte door array all set to 0 (unlocked)
		 * 		loop twice, first time locking every 2nd door, then switching the state of every 3rd door
		 * 	count number of unlocked doors
		 */
		//M *= 2;
		int[] doors = new int[N]; 
		while (M > 0) { //loop is executed M-1 times
			//lock every 2nd door starting at 2:
			for (int i = 0; i < N; i+=2) doors[i] = 1; //lock every second door
			for (int i = 0; i < N; i+=3) doors[i] = ((doors[i] + 1) % 2); //if 0: becomes 1  if 1: becomes 0   (switches state of locks)
			for (int i = 0; i < N; i+=2) doors[i] = 1; //lock every second door
			for (int i = 0; i < N; i+=3) doors[i] = ((doors[i] + 1) % 2); //if 0: becomes 1  if 1: becomes 0   (switches state of locks)
			M--;
		}
		doors[N-1] = ((doors[N-1] + 1) % 2); //on last iteration: change state of last door only
		int unlocked = 0;
		for (int i = 0; i < N; i++) unlocked += (doors[i] == 0) ? 1 : 0; //increment if door is unlocked
		System.out.println(unlocked);
	}

}
