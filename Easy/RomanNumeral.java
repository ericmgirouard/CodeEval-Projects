package Easy;

/*
 * I, V, X, L, C, D, and M represent the decimal values 1, 5, 10, 50, 100, 500 and 1000 respectively. 
 * 
 * 1-3, 10-30, 100-300, 1000-3000
 * currentNum % 1000 <= 3
 */
public class RomanNumeral {

	public static void main(String[] args) {
		String line = "3992";
		int len = line.length();
		int factor = (int)Math.pow(10, len-1);
		for (int i = 0; i < len; i++) {
			System.out.print(convertToRoman((line.charAt(i) - 48)*factor));
			factor /= 10;
		}
		System.out.println();
	}//end main

	public static String convertToRoman(int n) {
		String roman = "";
		if (n > 999) {
			for (int i = 0; i < n/1000; i++) {
				roman += "M";
			} return roman; }//end greater than 1000 case
		
		 if (n > 499) {
			if (n == 900) return "CM";
			roman += "D";
			for (int i = 0; i < (n/100)-5; i++) {
				roman += "C";
			} return roman; }//end 500-800 case
		
		 if (n > 99) {
			 if (n == 400) return "CD";
			 for (int i = 0; i < n/100; i++) {
				 roman += "C";
			 } return roman; }//end 100-400 case
		 
		 if (n > 49)  {
			 if (n == 90) return "XC";
			 roman += "L";
			 for (int i = 0; i < (n/10)-5; i++) {
				 roman += "X";
			 } return roman;  }//end 50-90 case
		 
		 if (n > 9) {
			 if (n == 40) return "XL";
			 for (int i = 0; i < n/10; i ++) {
				 roman += "X";
			 } return roman; }//end 10-40 case
		 
		 if (n > 4) {
			 if (n == 9) return "IX";
			 roman += "V";
			 for (int i = 0; i < n-5; i ++) {
				 roman += "I";
			 } return roman; }//end 5-9 case
		 
		 if (n == 4) return "IV"; //4 case
		 
		 for (int i = 0; i < n; i ++) {
			 roman += "I";
		 } return roman;
		 //end 1-3 case
	}//end convertToRoman
	
	
	
}//end class
