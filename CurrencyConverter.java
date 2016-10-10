import java.util.*;

public class CurrencyConverter
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		final double DOLLARS_PER_EURO = 1.31;
		int transactionType;
		
		double euros, dollars;
		
		System.out.print("Enter 1 to convert from dollars to euors and 2 from euros to dollars: ");
		transactionType = input.nextInt();
		
		if (transactionType == 1)
		{
			System.out.print("Number of dollars: ");
			dollars = input.nextDouble();
			euros = dollars/DOLLARS_PER_EURO;
			System.out.println(" Number of euros: " + euros);
		}
		
		
		else 
		
		{
		System.out.print("Number of euros: ");
		euros = input.nextDouble();
		dollars = euros*DOLLARS_PER_EURO;
		System.out.println("Number of euros: " + dollars);
		
		
		
		}
	}
	
}
