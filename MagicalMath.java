import java.util.*;

public class MagicalMath
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int MAGIC_MULTIPLIER1 = 715;
		final int MAGIC_MULTIPLIER2 = 364;
		final int MAGIC_MULTIPLIER3 = 924;
		final int FINAL_DIVISOR = 1001;
		
		int mysteryNumber = 0;
		int remainder;
		
		System.out.println("Think of a number from 1 to 1000");
		
		System.out.print("Divide by 7 and tell me the remainder: ");
		remainder = input.nextInt();
		
		mysteryNumber += remainder * MAGIC_MULTIPLIER1;
		
		System.out.print("Divide by 11 and tell me the remainder: ");
		remainder = input.nextInt();
		
		mysteryNumber += remainder * MAGIC_MULTIPLIER2;
		
		System.out.print("Divide by 13 and tell me the remainder: ");
		remainder = input.nextInt();
		
		mysteryNumber += remainder * MAGIC_MULTIPLIER3;
		
		mysteryNumber %= FINAL_DIVISOR;
		
		System.out.println("Your mystery number is: " + mysteryNumber);
		
	}
	
}