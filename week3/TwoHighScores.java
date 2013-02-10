import javax.swing.JOptionPane;
/**
 * Write a program that: 
 * 	- Prompts the user to enter the number of students 
 * 	- Prompts the user to enter each students name and score
 * 	- Displays the student with the highest score and the student with the second highest score.
 */

public class TwoHighScores
{
	public static void main(String[] args)
	{
		int userInput;
		int count = 0;
		
		String name;
		int score;
		
		String firstName = null;
		int firstScore = 0;
		
		String secondName = null;
		int secondScore = 0;
		
		int numberOfStudents = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of students: "));
		int counter = numberOfStudents;
		
		do {
			name =  JOptionPane.showInputDialog("Enter student's name: ");
			score = Integer.parseInt(JOptionPane.showInputDialog("Enter " + name + "'s score: "));
			
			if (score >= firstScore) {
				secondScore = firstScore;
				secondName  = firstName;
				
				firstScore = score;
				firstName = name;
			} else if (score >= secondScore && score <= firstScore) {
				secondScore = score;
				secondName = name;
			}
			
	 		counter--;
		} while (counter > 0);
		
		if (numberOfStudents == 0) {
			JOptionPane.showMessageDialog(null, "Please restart the application and enter atleast 2 student records.");
			System.exit(0);
		}
		
		StringBuffer message = new StringBuffer();
		if (numberOfStudents >= 1) {
			message.append("Highest\n    Name: ");
			message.append(firstName);
			message.append("\n    Score: ");
			message.append(firstScore);
			message.append("\n");
		}
		
		if (numberOfStudents >= 2) {
			message.append("Second Highest\n    Name: ");
			message.append(secondName);
			message.append("\n    Score: ");
			message.append(secondScore);
			message.append("\n");
		}

		JOptionPane.showMessageDialog(null, message);
	}
}