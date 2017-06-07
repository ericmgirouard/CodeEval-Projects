package Easy;

public class HextoDecimal {

	public static void main(String[] args) {
		Runtime prog = Runtime.getRuntime();
		long memory = prog.totalMemory();
		long start = System.currentTimeMillis();
		String line = "7a";
		int index = 0;
		int result = 0;
		while (index < line.length()) {
			char c = line.charAt(line.length()-1-index);
			//System.out.println("Current char is " + c);
			if (c > 60) {
				result += Math.pow(16, index) * (c-87);
				index++;
			} else {
				result += Math.pow(16, index) * (c-48);
				index++;
			}
		}//done converting
		System.out.println(result);
		System.out.println(start);
		System.out.println((long)System.currentTimeMillis());
		System.out.printf("Memory Used: %.5f bytes", ((double)memory-prog.freeMemory()));
	

	}

}
