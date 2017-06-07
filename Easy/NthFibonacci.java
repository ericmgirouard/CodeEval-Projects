package Easy;

public class NthFibonacci {

	public static void main(String[] args) {
		String line = "42";
		int n = Integer.parseInt(line);
		System.out.println(fib(n));
		System.out.println(Integer.MAX_VALUE);
	}//end main
	
	public static int fib(int n) {
		if (n == 0) return 0;
		else if (n == 1) return 1;
		return (  fib(n-1) + fib(n-2)  );
	}

}
