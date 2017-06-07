package Easy;

public class MultiplicationTables {

	public static void main(String[] args) {
		for (int r = 1; r < 13; r++) {
			for (int c = 1; c < 13; c++) {
				//if (c == 12) System.out.print(r*c);
				System.out.print(String.format("%4d", r*c));
			} //printing columns.
			System.out.println();
		}//printing rows
	}
}
