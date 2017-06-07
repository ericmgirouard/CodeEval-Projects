package Medium;
/*
 * 9 0 6 | 15 14 9
	5 | 8
13 4 15 1 15 5 | 1 4 15 14 8 2
The lists are separated with a pipe char, numbers are separated with a space char. 
The number of elements in lists are in range [1, 10]. 
The number of elements is the same in both lists. 
Each element is a number in range [0, 99].

135 0 54
40
13 16 225 14 120 10
 */
public class MultiplyLists {

	public static void main(String[] args) {
		String line = "13 4 15 1 15 5 | 1 4 15 14 8 2";
		String[] lists = line.split("\\|");
		String[] list1Str = lists[0].split(" ");
		String[] list2Str = lists[1].trim().split(" "); //trim to remove the obnoxious leading zero
		line = "";
		for (int i = 0; i < list1Str.length; i++) {
			line += (Integer.parseInt(list1Str[i]) * Integer.parseInt(list2Str[i])) + " ";
		}
		System.out.println(line.trim());
	}

}
