package Easy;
/*
 * Eric Girouard
 * CodeEval Easy Hidden Digits
 * Step 1: strip punctuation from string
 * Step 2: strip uppercase from String
 * Step 3: read through string and convert it to hidden digits
 */
public class HiddenDigits {

	public static void main(String[] args) {
		String line = "";
		line = line.replaceAll("\\p{Punct}+","");
		line = line.replaceAll("\\p{Upper}","");
		line = line.replaceAll("[k-z]","");
		//only left with a-j and 0-9
		//System.out.println(line);
		int len = line.length();
		String result = "";
		for (int i = 0; i < len; i++) {
			char current = line.charAt(i);
			if (Character.isLetter(current)) {
				result += "" + (current-97);
			}//end if
			else {//therefore this is a number (digit)
				result += current;
			}//end else
		}//end loop: string is done and result has been printed
		if (!result.equals("")) System.out.println(result);
		else System.out.println("NONE");
	}//end main

}
