package Easy;

public class SwapCase {

	public static void main(String[] args) {
		Runtime prog = Runtime.getRuntime();
		long memory = prog.totalMemory();
		long start = System.currentTimeMillis();
		String line = "JavaScript language 1.8";
		StringBuilder str = new StringBuilder(line.length());
		char c = 0;
		for(int i = 0; i < line.length(); i++) {
			c = line.charAt(i);
			if (c > 96 && c < 123) {//c is lowercase: convert to uppercase
				c -= 32;
				str.append(Character.toString(c));
			}
			else if (c > 64 && c < 91) { //c is uppercase: convert to lowercase
				c += 32;
				str.append(Character.toString(c));
			} else str.append(Character.toString(c)); //c is any other character
			
		}//new string generated
		System.out.println(str.toString());

		System.out.println((double)System.currentTimeMillis()-start);
		System.out.printf("Memory Used: %.5f bytes", ((double)memory-prog.freeMemory()));
	}

}
