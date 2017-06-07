package Easy;

public class NModM {
	public static void main(String[] args) {
		Runtime program = Runtime.getRuntime();
		long memory = program.totalMemory();
		String line = "2,3";
		String[] numbers = line.split(",");
		int n = Integer.parseInt(numbers[0]);
		int m = Integer.parseInt(numbers[1]);
		System.out.println(n-(m*(n/m)));
		System.out.println(((double)memory-program.freeMemory())/1000/1000 + " MB");
	}
}
