import java.util.Scanner;

public class ComputeChange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(
			"Enter an amount, for example, 11.56: "
			);
		double amount = input.nextDouble();
		
		// In pennies
		int remainingAmount = (int) (amount * 100);

		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25; 	

		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;

		System.out.println("Your amount " + amount + " consists of: ");		
		System.out.println("\t" + numberOfOneDollars + " dollars");		
		System.out.println("\t" + numberOfQuarters + " quarters");		
		System.out.println("\t" + numberOfDimes + " dimes");
		System.out.println("\t" + numberOfNickels + " nickels");
		System.out.println("\t" + numberOfPennies + " pennies");
	}
}