import java.util.*;

public class newFactorial
{
	public static Scanner input = new Scanner(System.in);
	
	public static int factorial(int num)
	{
		int totalProduct = 1;
		
		for(int i = 1; i <=num; i++)
			totalProduct *= i;
			
		return totalProduct;
	
	
	
	}
	
	public static void main(String[] args)
	{
	
	System.out.print("Please enter an integer: ");
	int number = input.nextInt();
	
	int endResult = factorial(number);
	
	System.out.print("The total product is: " + endResult);
	
	
	
	}
}