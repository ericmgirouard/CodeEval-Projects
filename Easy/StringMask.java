package Easy;

public class StringMask {

	public static void main(String[] args) {
		String line = "jemsbkwvllggets 011010001101011";
		String[] sides = line.split(" ");
		String word = sides[0];
		String mask = sides[1];
		line = "";
		for (int i = 0; i < word.length(); i++) {
			if (mask.charAt(i) == '1') {
				char a = word.charAt(i);
				a -= 32;
				//System.out.println("converting " + word.charAt(i) + " to: " + (a));
				line += (a); //-32 converts any lowercase to uppercase
			}//end if
			else line += word.charAt(i);
		}//end for loop: done processing word
		System.out.printf("%s\n", line);
	}//end main

}
