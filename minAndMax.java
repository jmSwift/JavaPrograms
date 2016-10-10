import java.util.*;

public class minAndMax
{
	public static Scanner input = new Scanner(System.in);
	
	public static int myMax(int x, int y)
	{
		
		
		if( x > y)
			return x;
		else
			return y;
	
		
	}
	
	public static int myMin(int x, int y)
	{
	
	
		if(x <y)
			return x;
		else	
			return y;
		
	
	}
	
	public static void main(String[] args)
	{
		System.out.print("Enter two numbers and I will find your max: ");
		int firstNum = input.nextInt();
		int secondNum = input.nextInt();
		
		System.out.println("The larger number is: " + myMax(firstNum, secondNum));
		
		System.out.println("The smaller number is: " + myMin(firstNum, secondNum));
		

	}
	
}