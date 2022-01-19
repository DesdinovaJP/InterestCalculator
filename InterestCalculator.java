/*InterestCalculator
@JpCavalcante
03/01/22
*/

public class InterestCalculator
{
	//Declare variables
	private int choice;
	private double depositAmount [];
	private double interest [];
	private double max;

	//Constructor
	public InterestCalculator()
	{

	}

	//Calculate-compute method
	public void compute()
	{	//initializing the interest variable to be the same length of depositAmount array
		interest = new double[depositAmount.length];

		//loop to save the values in the array and pass through the switch cases
		for (int i = 0; i < depositAmount.length; i++)
		{
			//variable to simplify the code, using only 1 calculation in the end
			double choiceAmount;
			switch (choice)
			{
				case 1:
				{	choiceAmount = 0.0005;
					break;
				}

				case 2:
				{
					choiceAmount = 0.0002;
					break;
				}

				case 3:
				{
					choiceAmount = 0.002;
					break;
				}

				case 4:
				{
					choiceAmount = 0.0015;
					break;
				}

				case 5:
				{
					choiceAmount = 0.004;
					break;
				}

				case 6:
				{
					choiceAmount = 0.002;
					break;
				}

				default:
				{
					choiceAmount = 0;
					break;
				}
			}
			// calculation after the switch so it doenst need to be repeated in all cases
			interest[i] = depositAmount[i] * choiceAmount;
		}

	}
	// method to calculate the highest rate from the input of the user
	public void calculateHighest ()
	{	//initialize the variable to start at index 0
		max = interest[0];
		//loop to go through all of them indexes in our array
		for(int i = 1; i < interest.length; i++)
		{	//if to check if the max is greater than any indexes in our array
			if(max < interest[i])
			{
				max = interest[i];
			}

		}

	}

	//Setters and getters
	public void setChoice (int choice)
	{
		this.choice = choice;
	}

	public void setDepositAmount (double depositAmount[])
	{
		this.depositAmount = depositAmount;
	}

	public double [] getInterest ()
	{
		return interest;
	}

	public double getMax ()
	{
		return max;
	}

}