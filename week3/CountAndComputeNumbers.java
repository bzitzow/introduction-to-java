import javax.swing.JOptionPane;
/**
 * Write a program that:
 * 	- Reads an unspecified number of integers
 * 	- Determines how many positive and negative integers have been read
 * 	- computes the total and average of the input value (not counting 0). 
 * 
 * Your program ends with the input 0. 
 * 
 * Display the average as a floating point number.
 */

public class CountAndComputeNumbers
{
	public static void main(String[] args)
	{
		int userInput;
		int numberOfIntegers = 0;
		int numberOfPositiveIntegers = 0;
		int numberOfNegativeIntegers = 0;
		int total = 0;
		float average;
		
		do {
			userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter an Integer:"));
			numberOfIntegers++;
			
			if (userInput > 0) {
				numberOfPositiveIntegers++;
			} else if (userInput < 0) {
				numberOfNegativeIntegers++;
			}
			
			total += userInput;
		} while (userInput != 0);
		
		// Reduce numberOfIntegers by 1 to eliminate the user input of 0 in average calculation
		average = (total / (numberOfIntegers -1));
		
		JOptionPane.showMessageDialog(null, 
				"Number of Positive Integers: " + numberOfPositiveIntegers + "\n" + 
				"Number of Negative Integers: " + numberOfNegativeIntegers + "\n" + 
				"Total of input: " + total + "\n" + 
				"Average of input: " + average + "\n"
				);
	}
}