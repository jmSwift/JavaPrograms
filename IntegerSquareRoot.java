import java.util.*;

public class IntegerSquareRoot
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a non-negative number: ");
		int num = input.nextInt();
		int count = 0; // counts the numbe of odds
		
		for(int sum = 0, odd = 1; (sum+odd) <= num; sum+= odd, odd+=2) // if sum+odd is less than or equal to numb, sum = sum + odd &&& odd = odd + 2 , count goes up by1
			count++;
		
		System.out.println("The integer square root of " + num + " is " + count);
	}
}