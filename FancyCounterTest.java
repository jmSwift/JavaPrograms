import java.util.Scanner;

public class FancyCounterTest
{
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
		{
			FancyCounter counter = new FancyCounter();
			int number;
			
			System.out.println("Enter a sequence of integers followed by a space: ");
			number = input.nextInt();
			while(number != 0)
				{
				counter.incrementCounter();
				number = input.nextInt();
				
				}
				
			
			number = counter.getCounter();
			
			System.out.println("There were " + number + " non-zero numbers in the sequence");
			
			BalancedString str = new BalancedString("(jose)");
			
			boolean isBalanced = str.balanced();
			
			System.out.println(isBalanced);
			
			System.out.println(counter.getCounter());
			
		
		}
}