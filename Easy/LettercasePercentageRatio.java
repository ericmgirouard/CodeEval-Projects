package Easy;

public class LettercasePercentageRatio {

	public static void main(String[] args) {
		String line = "UkJ";
		int lower = 0;
		int upper = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) > 96) lower++;
			else upper++;
		}
		System.out.printf("lowercase: %.2f uppercase: %.2f\n", 100*((double)lower/(double)line.length()), 100*((double)upper/(double)line.length()));
	}

}
