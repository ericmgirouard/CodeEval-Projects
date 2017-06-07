package Easy;

public class rightMostChar {

	public static void main(String[] args) {
		String line = "Hello CodeEval,E";
		String[] tokens = line.split(",");
		System.out.println(tokens[0].lastIndexOf(tokens[1].charAt(0)));

	}

}
