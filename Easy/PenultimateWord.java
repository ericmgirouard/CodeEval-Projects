package Easy;

public class PenultimateWord {

	public static void main(String[] args) {
		Runtime prog = Runtime.getRuntime();
		long memory = prog.totalMemory();
		long start = System.currentTimeMillis();
		
		String line = "some line with text";
		String[] tokens = line.split(" ");
		System.out.println(tokens[tokens.length-2]);
		
		
		System.out.println((double)System.currentTimeMillis()-(double)start);
		System.out.printf("Memory Used: %.5f Mbytes", ((double)memory-prog.freeMemory())/1000/1000);
		
		
		
	}

}
