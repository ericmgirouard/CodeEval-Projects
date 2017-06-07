package Easy;

/*
 * Step 1: break string apart into tokens and store them in strings
 * step 2: find index of first char of original string in rotated string, if it exists
 * step 3: create result string by placing element i into position i + (length-index) % length of result string
 * step 4: test to see if original equals result, return true or false
 */
public class StringRotation {

	public static void main(String[] args) {
		String line = "8 ISI89NvCFMyFrR ADiP,P ISI89NvCFMyFrR ADi8";
		String[] tokens = line.split(",");
		String original = tokens[0];
		String rotated = tokens[1];
		System.out.println(original);
		char[] result = new char[original.length()];
		boolean isRotation = false;
		char firstChar = original.charAt(0); //first letter of the original string
		int firstIndex = rotated.indexOf(firstChar);

		//-1 if not found
		if (firstIndex > -1) {
			int k = rotated.length() - firstIndex;
			for (int i = 0; i < original.length(); i++) {
				result[(i + k) % rotated.length()] = rotated.charAt(i);


			}//end for loop: result is generated
			
			String resultString = new String(result);
			System.out.println(resultString);
			//System.out.println(resultString);
			if (original.equals(resultString)) isRotation = true;
		}//end if: and calculations
		System.out.println(isRotation ? "True" : "False");
	}
	

}
