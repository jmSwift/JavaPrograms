import java.util.*;

public class CPI
{
	public static Scanner input = new Scanner(System.in);
	
	// beginning of methods
		public static double getCPI(double number)
		{
			double decimal_part;
			boolean flag = false; 
			
		System.out.print("Enter the number from -20 to 20 with one decimal place: ");
		number = input.nextDouble();
		while(flag == false)
		{
			if ( number < -20.0)
			{
				System.out.print( number + " is too low a number, please re- ");
				
			}
			
			else if( number > 20.0)
			{
				System.out.print(number + " is too high a number, please re- ");
				
			
			}
			
			else 
			{	
				decimal_part = ((int)(number*100)%10);// MULTIPLIES TIMES A 100 AND MODULUS 10 
				if ((decimal_part != 0) || (Math.round(10*number) -(10*number) != 0))
					System.out.println("Number has too great a precision");
				else 
					flag=true;

			}
		}
				
		
		return number; // return value of number if it was initially not in the boundaries
		
		}
		
		public static double inflation(double cpi, double expenses)
		{
			double newCosts;
				if ( cpi < 0)
				{
					newCosts = expenses -((cpi/100)*expenses);
					
				}
			
				else
				{
					newCosts = expenses + ((cpi/100)*expenses);
					
				
				}
			
			return newCosts;
		
		}
	
	public static void main(String[] args)
	{
	
	double lastYearExpenses, parameter = 0, num, nextYearCPI;
	
	num = getCPI(parameter);
	
	System.out.print("Please enter last years annual expenses: ");
	lastYearExpenses = input.nextDouble();

	nextYearCPI = inflation(num, lastYearExpenses);
	
	System.out.println("What you might expect to pay for goods in the following year is : " + nextYearCPI);
	
	
	
	
	
	}
	
	
}