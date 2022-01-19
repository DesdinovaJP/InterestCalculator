/*InterestCalculatorApp
@JpCavalcante
03/01/22
*/

import java.util.Scanner;

public class InterestCalculatorApp
{
	public static void main (String args[])
	{
		//Declare variables
		int choice;
		double interest, max;

		//Create Object
		InterestCalculator myI = new InterestCalculator();
		Scanner calc = new Scanner(System.in);

		//Input
		//decided to make a menu to be faster and easier
		System.out.println("Please enter a number 1 - 6");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Please enter 1 for six months term with NO access to money");
		System.out.println("Please enter 2 for six months term WITH access to money");
		System.out.println("Please enter 3 for twelve months term with NO access to money");
		System.out.println("Please enter 4 for twelve months term WITH access to money");
		System.out.println("Please enter 5 for eighteen months term with NO access to money");
		System.out.println("Please enter 6 for eighteen months term WITH access to money");
		System.out.println("--------------------------------------------------------------");

		//save the choice and send to instantiable
		choice = calc.nextInt();
		myI.setChoice(choice);

		//I decided to give the user the option of how many customers to insert
		System.out.println("How many customers you want to check?");
		//used size as parameter so the array can be any size
		int size = calc.nextInt();
		double depositAmount [] = new double [size];

		//loop to go through the amount stored in array
		for (int i = 0; i < size; i++)
		{
			System.out.println("Please enter the customer's amount " +(i + 1));
			depositAmount[i] = calc.nextDouble();
		}

		//send the amounts to the instantiable
		myI.setDepositAmount(depositAmount);


		//Process
		myI.compute();
		myI.calculateHighest();

		//Output
		max = myI.getMax();
		System.out.println("The highest interest to be paid is: " + max);

	}
}