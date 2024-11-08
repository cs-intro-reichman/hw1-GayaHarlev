
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		int hundreds = (int)(number / 100); 
		int tens = (int)((number-(hundreds*100)) / 10 );
		int ones = (int)(number-(hundreds*100)-(tens*10));

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones." );
	}
}
