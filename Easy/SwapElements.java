package Easy;

import java.util.Arrays;

public class SwapElements {

	public static void main(String[] args) {
		String line = "1 2 3 4 5 6 7 8 9 : 0-8";
		String[] tokens = line.split(":");
		tokens[0] = tokens[0].trim();
		String[] numbers = tokens[0].split(" ");
		tokens[1] = tokens[1].trim();
		//System.out.println(tokens[0]);
		//System.out.println(tokens[1]);
		String temp = "";
		int index1 = (int)tokens[1].charAt(0)-48;
		int index2 = (int)tokens[1].charAt(2)-48;
		temp = numbers[index2];
		numbers[index2] = numbers[index1];
		numbers[index1] = temp;
		//now put 1 in 9
		StringBuilder str = new StringBuilder(numbers.length);
		for (int i = 0; i < numbers.length; i++) {
			str.append(numbers[i] + " ");
		}
		System.out.println(str.toString().trim());
		

	}

}
