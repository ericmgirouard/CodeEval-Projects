package Medium;
/*
 * Write a program which removes specific characters from a string.

INPUT SAMPLE:

The first argument is a path to a file. 
The file contains the source strings and the characters that need to be scrubbed.
 Each source string and characters you need to scrub are delimited by comma.

For example:
how are you, abc
hello world, def

OUTPUT SAMPLE:

Print to stdout the scrubbed strings, one per line. 
Ensure that there are no trailing empty spaces on each line you print.

For example:
how re you
hllo worl
 */
public class RemoveCharacters {

	public static void main(String[] args) {
		String line = "hello world, def";
		String[] tokens = line.split(","); //split string apart
		tokens[1]= tokens[1].trim(); //remove leading white space 
		for (int i = 0; i < tokens[1].length(); i++) {
			char c = tokens[1].charAt(i);
			tokens[0] = tokens[0].replaceAll(c + "", ""); //hack way to convert char to string
			
		}
		System.out.println(tokens[0]);
		// tokens[0] already has trailing white spaces cut off, no need to do an additonal trim
	}

}
