package Easy;

public class BitPositions {

	public static void main(String[] args) {
		String line = "118678,11,15";
		String[] ints = line.split(",");
		int n =  Integer.parseInt(ints[0]);
		int p1 = Integer.parseInt(ints[1]);
		int p2 = Integer.parseInt(ints[2]);
		int bit1;
		int	bit2;
		System.out.println(Integer.toBinaryString(n));
		System.out.println("first bit to check: " + p1 + " second: " + p2);
		bit1 = (n >> (p1) & 1);
		bit2 = (n >> (p2) & 1);
		if (bit1 == bit2) System.out.println("True");
		else System.out.println("False");
	}

}
