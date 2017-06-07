package Easy;

public class Lowercase {

	public static void main(String[] args) {
		String line = "HEllO WorlD";
		String result = "";
		for (int i = 0; i < line.length(); i++) {
			char a = line.charAt(i);
			if (a < 91 && a > 64) {
				a += 32;
				result += a;
			} //end if for an uppercase char
			else {
				result += a; //add already lowercase char
			}
		}//end if: string is generated in lowercase
		System.out.println(result);
	}//end main

}
