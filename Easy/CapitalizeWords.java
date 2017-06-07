package Easy;
/*
 * capitalize each word in the string (should it need to be)
 * tokenize words
 * scan through word array, determine if first char should be capitalized, 
 * if so, capitalize it and print, if not, print
 */
public class CapitalizeWords {

	public static void main(String[] args) {
		String line = "hello world";
		String[] words = line.split(" ");
		for (int i = 0; i < words.length; i++) {
			char c = words[i].charAt(0);
			if (c > 96 && c < 123) {
				String cap = words[i].substring(1, words[i].length());
				cap = (char)(c-32) + cap;
				System.out.print(cap);
			} 
			else System.out.print("words[i]");
			if (i < words.length-1) System.out.print(" ");
		}//end for loop

	}

}
