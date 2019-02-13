
import java.util.Scanner;

class  CompoundValue
{
	public static void main(String[] args) 
	{
		String startAgain;
		do
		{
			int monthlyDeposit, annualInterestRate;
			double monthlyInterestRate, monthlyBalance=0;
			

		
			Scanner input;
			input = new Scanner(System.in);

			System.out.print("Enter monthly deposit amount: ");

			monthlyDeposit=input.nextInt();

			System.out.print("Enter annual interest rate: ");

			annualInterestRate=input.nextInt();

			monthlyInterestRate=((annualInterestRate/100.0)/12.0);

			
			for (int i=1;i<=6;i++ )
			{
				monthlyBalance=(monthlyDeposit+monthlyBalance)*(1+monthlyInterestRate);
				System.out.printf("Month "+i+": balance= %.3f \n",monthlyBalance);
			}

			System.out.print("Do you want to enter another set of values: ");
			startAgain=input.next();
			

		}
		while (startAgain.equals("yes"));
		
	}
}
