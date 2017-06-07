package Easy;
/*
 * You have received a text encoded with Morse code and want to decode it.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename.
 Input example is the following:
.- ...- ..--- .-- .... .. . -.-. -..-  ....- .....
-... .... ...--

Each letter is separated by space char, each word is separated by 2 space chars.

OUTPUT SAMPLE:

Print out decoded words. E.g.
AV2WHIECX 45
BH3
Your program has to support letters and digits only.
 */
public class MorseCode {
	public static final String[] morse = {".-", "-...", "-.-." ,"-.." ,"." ,"..-." ,"--." ,"...." ,"..", ".---" ,"-.-", ".-.." ,
			"--" ,"-.", "---" ,".--." ,"--.-" ,".-." ,"..." ,"-", "..-", "...-" ,".--" ,"-..-", "-.--", "--..",   
			"-----" ,".----", "..---" ,"...--", "....-" ,".....", "-....", "--..." ,"---.." ,"----."};
	//a = 0, z = 25, 0 = 26, 9 = 36
	public static void main(String[] args) {
		String line = ".- ...- ..--- .-- .... .. . -.-. -..-  ....- .....";
		String[] chars = line.split(" ");
		for (int i = 0; i < chars.length; i++) System.out.println(chars[i]);
		

	}

}
