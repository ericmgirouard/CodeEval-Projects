package Easy;

public class HiddenWriter {

	public static void main(String[] args) {
		Runtime prog = Runtime.getRuntime();
		long memory = prog.totalMemory();
		long start = System.currentTimeMillis();
		
		String line = "osSE5Gu0Vi8WRq93UvkYZCjaOKeNJfTyH6tzDQbxFm4M1ndXIPh27wBA rLclpg| 3 35 27 62 51 27 46 57 26 10 46 63 57 45 15 43 53";
		
		String[] tokens = line.split("\\|");
		String[] spots = tokens[1].trim().split(" ");
		int[] places  = new int[spots.length];
		for (int i = 0; i < spots.length; i++) {
			try {
				places[i] = Integer.parseInt(spots[i]);
			} catch (NumberFormatException nfe) {}//if not a number
		}//end for, array is generated
		char[] message = tokens[0].toCharArray();
		line = "";
		for (int i = 0; i < places.length; i++) {
			line += message[places[i]-1];
		}
		System.out.println(line);
	}//end main

}
