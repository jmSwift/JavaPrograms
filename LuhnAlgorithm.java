import java.util.*;

public class LuhnAlgorithm
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int MAX_DIGITS = 16;
		long number,
			sum = 0,
			digit;
			
		System.out.print("Enter credit card number: ");
		number = input.nextLong();
		
		for(int i = 1; i <= MAX_DIGITS; i++)
		{
			digit = number%10;// gives the very right digit of the credit card
			if(i%2 == 0) // every other digit , when i = 2, 4 , 6 etc...
			{
				digit *= 2;
				if(digit >9)
					digit-=9; // subtract 9 if the product is larger than 9
			}
			sum+=digit;
			number /= 10;
		}
		
		if(sum%10 != 0) // checks the right most digit of sum
			System.out.println("Invalid number");
		
		else
			System.out.println("Credit card number is valid");
			
	}
	
}