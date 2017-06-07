package Easy;

public class SumOfDigits {

	public static void main(String[] args) {
		String line = "5800";
		int sum = 0;
    	for (int i = 0; i < line.length(); i++) {
        	sum += (line.charAt(i)-48);
        }
      System.out.println(sum);
	}

}
