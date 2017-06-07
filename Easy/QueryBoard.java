package Easy;
import java.io.*;
import java.util.*;
public class QueryBoard {
	public static final int[][] board = new int[256][256]; //create query board
	
	public static void main(String[] args) throws Throwable{
		File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
		String[] tokens = line.split(" ");
		switch (tokens[0]) {
		case "SetCol": 
			setCol(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
			break;
		case "SetRow":
			setRow(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
			break;
		case "QueryRow":
			QueryRow(Integer.parseInt(tokens[1]));
			break;
		case "QueryCol":
			QueryCol(Integer.parseInt(tokens[1]));
			break;
		default:
        	  break; //  N/A
            
        }//end switch and work
		printBoard();
	}
	}
	
	//all cells in row i will be changed to equal x
	public static void setRow( int i, int x) {
		for (int j = 0; j < board[i].length; j++) {
			board[i][j] = x;
		}
	}
	
	//All Cells in column j will be set to equal x
	public static void setCol( int j, int x) {
		for (int i = 0; i < board[j].length; i++) {
			board[i][j] = x;
		}
	}

	//it means that you should output the sum of values on row "i". 
	public static void QueryRow(int i) {
		int temp = 0;
		for (int k = 0; k < board[i].length; k++) {
			temp += board[i][k];
		}
		System.out.println(temp);
	}
	
	
	//it means that you should output the sum of values on column "j". 
	public static void QueryCol(int j) {
		int temp = 0;
		for (int k = 0; k < board[j].length; k++) {
			temp += board[k][j];
		}
		System.out.println(temp);
	}
	
	//prints the current contents of the Board (256x256)
	public static void printBoard() {
		for (int i = 0; i < board[0].length; i++) {
			for (int j = 0; j < board[0].length;j++) {
				System.out.format("%4d",board[i][j]);
			}
			System.out.println();
		}
	}
	
}
