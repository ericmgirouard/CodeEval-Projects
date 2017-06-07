package Easy;
/*
 * MATRIX ROTATION
CHALLENGE DESCRIPTION:

You are given a 2D N×N matrix. Each element of the matrix is a letter: 
from ‘a’ to ‘z’. Your task is to rotate the matrix 90° clockwise:
a b c        g d a
d e f  =>    h e b
g h i        i f c

INPUT SAMPLE:
The first argument is a file that contains 2D N×N matrices, 
presented in a serialized form (starting from the upper-left element),
 one matrix per line. The elements of a matrix are separated by spaces.
 
a b c d
a b c d e f g h i j k l m n o p
a b c d e f g h i

OUTPUT
c a d b
m i e a n j f b o k g c p l h d
g d a h e b i f c


 */
public class MatrixRotation {

	public static void main(String[] args) {
		String line = "a b c d";
		/*
		 * create a 2d matrix from input
		 * read rows from bottom-up, left to right, and append each char to a string
		 * then create a sd matrix from that
		 * 
		 */
		line = line.replaceAll(" ","");
		char[][] matrix = createMatrix(line);

		line = "";
		for (int j = 0; j < matrix[0].length; j++) {
			for (int i = matrix[0].length-1; i >= 0; i--) {
				line += matrix[i][j] + " ";
			}
		}
		matrix = createMatrix(line);
		System.out.println(line.trim());

	}

	
	//create a 2d matrix from an input string: reads left to right top to bottomn
	public static char[][] createMatrix(String str) {
		char[][] matrix = new char[(int)Math.sqrt(str.length())][(int)Math.sqrt(str.length())];
		int index = 0;
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = str.charAt(index++);
			}
		}
		return matrix;
	}
	
	//Prints a 2D array in matrix form (for testing)
	public static void printMatrix(char[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%2c", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
