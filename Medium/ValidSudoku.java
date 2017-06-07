package Medium;
/*
 * Sudoku is a number-based logic puzzle. 
 * It typically comprises of a 9*9 grid with digits so that each column, 
 * each row and each of the nine 3*3 sub-grids that compose the grid contains all the digits from 1 to 9. 
 * For this challenge, you will be given an N*N grid populated with numbers from 1 through N 
 * and you have to determine if it is a valid sudoku solution. You may assume that N will be either 4 or 9.
 *  The grid can be divided into square regions of equal size, 
 *  where the size of a region is equal to the square root of a side of the entire grid.
 *  Thus for a 9*9 grid there would be 9 regions of size 3*3 each.
INPUT SAMPLE:
4;1,4,2,3,2,3,1,4,4,2,3,1,3,1,4,2
4;2,1,3,2,3,2,1,4,1,4,2,3,2,3,4,1
OUTPUT SAMPLE:
Print out True/False if the grid is a valid sudoku layout. E.g.
True
False

Your program should accept as its first argument a path to a filename.
 Each line in this file contains the value of N, 
 a semicolon and the sqaure matrix of integers in row major form, comma delimited. E.g...
 
 ANALYSIS:
 1 string, 1 string array or max size ~200 bytes
 1 int[][] max size 81 bytes, 1 boolean and 3 double nested loops each processessing a max of 81 iterations, still efficient
 so this is O(X^2) 
 but the set it so small that it is an efficient algorithm 
 */
public class ValidSudoku {

	public static void main(String[] args) {
		String line = "4;1,4,2,3,2,3,1,4,4,2,3,1,3,1,4,2";
		//File parsing
		String[] tokens = line.split(";");
		int X = Integer.parseInt(tokens[0]);//either 4 or 9 for a 4x4 grid or a 9x9 grid
		tokens[1] = tokens[1].replaceAll(",","");//Input Cleanup
		int[][] grid = new int[X][X];
		boolean valid = true;
		//Create sudoku Grid
		int index = 0;
		for (int i = 0; i < X; i++) {
			for (int j = 0; j < X; j++) {
				grid[i][j] = (int)((tokens[1].charAt(index++))-48);
			}
		}
		//print(grid);
		valid = check(0,X,0,X,grid,1, X);
		if (valid) valid = check(0,X,0,X,grid,0,X);
		int x = (int)Math.sqrt(X); //either 2 or 3
		if (x == 2) {//4x4 grid
		if (valid) valid = check(0, x-1, 0, x-1, grid, 1,X); //check upper left box
		if (valid) valid = check(0, x-1, x, X, grid, 1,X);
		if (valid) valid = check(x, X, 0, x-1, grid, 1,X);
		if (valid) valid = check(x, X, x, X, grid, 1,X);
		} else {//9x9 grid
			if (valid) valid = check(0, x, 0, x, grid, 1,X); //box 1 from top left to right
			if (valid) valid = check(0, x, x, 2 * x, grid, 1,X); //box 2
			if (valid) valid = check(0, x, 2 * x, X, grid, 1,X); //box 3.
			
			if (valid) valid = check(x, 2 * x, 0, x, grid, 1,X); //box 4
			if (valid) valid = check(x, 2 * x, x, 2 * x, grid, 1,X); //box 5
			if (valid) valid = check(x, 2 * x, 2 * x, X, grid, 1,X); //box 6.
			
			if (valid) valid = check(2 * x, X, 0, x, grid, 1,X); //box 7
			if (valid) valid = check(2 * x, X, x, 2 * x, grid, 1,X); //box 8
			if (valid) valid = check(2 * x, X, 2 * x, X, grid, 1,X); //box 9
			
		}
		System.out.println(valid? "True" : "False");
	}//end main
	
	
	//scan through grid to check for validity
	public static boolean check(int iStart, int iEnd, int jStart, int jEnd, int[][] grid, int check, int size) {
		boolean valid = true;
		//the row check case (i,j)
		if (check == 1) {
				for (int i = iStart; i < iEnd && valid; i++) {
					int[] counts = new int[size];
					for (int j = jStart; j < jEnd; j++) {
						//System.out.println("Checking spot  " + i + "," + j + "  value =" + grid[j][i] + "   count: " + counts[grid[j][i]-1] + " " + (grid[j][i]-1));
						counts[(grid[i][j])-1]++;
						
						if (counts[grid[i][j]-1] > 1) {
							valid = false;
							break;
						}
					}//end j loop
				}//end i loop
				return valid;
	//column check case (j,i)
	} else {
		for (int i = iStart; i < iEnd && valid; i++) {
			int[] counts = new int[size];
			for (int j = jStart; j < jEnd; j++) {
				//System.out.println("Checking spot  " + i + "," + j + "  value =" + grid[j][i] + "   count: " + counts[grid[j][i]-1] + " " + (grid[j][i]-1));
				counts[(grid[j][i]-1)]++;
				
				if (counts[grid[j][i]-1] > 1) {
					valid = false;
					break;
				}
			}//end j loop
		}//end i loop
		return valid;
	}
	}
	
	
	public static void print(int[][] grid) {
		for (int i = 0; i < grid[0].length; i++) {
			for (int j= 0; j < grid[0].length; j++) {
				System.out.printf("%-3d",grid[i][j]);
			}
			System.out.println();
		}
	}

}
