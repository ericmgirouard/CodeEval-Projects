package Easy;

public class WordtoDigit {

	public static void main(String[] args) {
		String line = "three;seven;eight;nine;two";
		String[] words = line.split(";");
		line = "";
		for (int i = 0; i < words.length; i++) {
			switch (words[i]) {
			
			case "zero":
				line += "0";
				break;
			case "one": 
				line += "1";
				break;
			case "two":
				line += "2";
				break;
			case "three":
				line += "3";
				break;
			case "four":
				line += "4";
				break;
			case "five": 
				line += "5";
				break;
			case "six":
				line += "6";
				break;
			case "seven":
				line += "7";
				break;
			case "eight":
				line += "8";
				break;
			case "nine": 
				line += "9";
				break;	
			}//end switch
		}//end for loop: result generated.
		System.out.println(line.trim());

	}

}
