import java.util.*;

public class DoWhile
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int size;
		
		do
		{
			System.out.print("How many numbers would you like to add? ");
			size = input.nextInt();
		}while(size<=0);
		
		System.out.println("Enter the " + size + " numbers");
		int sum = 0;
		int count = 0;
		
		while(count < size)
		{
			sum += input.nextInt();
			count++;
		}
		
		System.out.println("The total sum is " + sum);
		
	}
	
}