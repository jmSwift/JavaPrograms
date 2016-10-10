import java.util.*;

public class Interest
{
	public static void main(String[] args)
	{
		Scanner input;
		
		double value;
		double amount;
		double rate;
		double years;
		final int DAYS = 360; // constant will always remaimn 360
		
		input = new Scanner(System.in);
		
		System.out.print("Initial Amount: ");
		amount = input.nextDouble();
		
		System.out.print("Interest rate: ");
		rate = input.nextDouble();
		
		System.out.print("Time in years: ");
		years = input.nextDouble();
		
		value = amount*Math.pow(1+rate/DAYS,DAYS*years);
		
		System.out.println("Present values $" + value);
		
	}
}
		