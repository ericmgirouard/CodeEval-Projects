package Easy;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		Runtime prog = Runtime.getRuntime();
		long memory = prog.totalMemory();
		long start = System.currentTimeMillis();
		
		String line = "153";
		int result = 0;
		int len = line.length();
		for (int i = 0; i < len; i++) {
			result += Math.pow((line.charAt(i)-48), len);
		}
		System.out.println(result == Integer.parseInt(line));
		
		
		System.out.println((double)System.currentTimeMillis()-(double)start);
		System.out.printf("Memory Used: %.5f bytes", ((double)memory-prog.freeMemory()));
	}

}
