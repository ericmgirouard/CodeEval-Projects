package Easy;

public class LongestWord {

	public static void main(String[] args) {
		String line = "some line with text";
		String[] words = line.split(" ");
		int longest = 0;
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > longest) {
				index  = i;
				longest = words[i].length();
			}
		}//end for
		System.out.println(words[index]);
	}

}
