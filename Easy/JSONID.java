package Easy;

public class JSONID {

	public static void main(String[] args) {
		String line = "{\"menu\": {\"header\": \"menu\", \"items\": [{\"id\": 70, \"label\": \"Label 70\"}, {\"id\": 85, \"label\": \"Label 85\"}, {\"id\": 93, \"label\": \"Label 93\"}, {\"id\": 2}]}}";
		line = line.replaceAll("[{}\":,\\]\\[.]", " ");
		String[] tokens = line.split(" ");
		int sum = 0;
		for (int i = 0; i < tokens.length; i++)  if (tokens[i].equals("label")) sum += Integer.parseInt(tokens[i-3]); 
		System.out.println(sum);
	}//end main

}
