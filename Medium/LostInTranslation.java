package Medium;

public class LostInTranslation {

	public static void main(String[] args) {
		char[] code = new char[]{'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		/*for input string: grab the char
		 * 		find its alphabet index: take its ascii value and subtract 97 (a = 0)
		 * 		then grab code[index] and add that to the new string to decode
		 * tc rbkso rbyr ejp mysljylc kd kxveddknmc re jsicpdrysi
		 */
		String line = "tc rbkso rbyr ejp mysljylc kd dsgswgrew re jsicpdrysi";
		String decode = "";
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (c > 90) {
				int index = (int)c-97;
				decode += code[index];
			}
			else decode+= c; //this means c is a space character
		}
		System.out.println(decode);
	}

	
}