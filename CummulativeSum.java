import java.util.*;

public class CummulativeSum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int sum = 0,
			number,
			count = 0;
			
		System.out.print("Enter a positive integer to add all numbers from 0 - through the integer: ");
		number = input.nextInt();
		
		while (count <= number)
		{
			sum += count;
			count++;
		}
		
		System.out.println("The running sum is " + sum);
	}
}