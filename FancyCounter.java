import java.util.Scanner;

public class FancyCounter
{
	public static Scanner input = new Scanner(System.in);
	public static int counter;
	
	public FancyCounter()
	{
		counter = 0;
	}
	
	public FancyCounter(int startingNum)
	{
		if(startingNum >=0)
			counter = startingNum;
		else
			{
				do{
				System.out.println("Enter a non-negative number for your initial counter value");
				counter = input.nextInt();
				}while(counter <0);
			}
	}
	
	public static void setToZero()
	{
		counter = 0;
	}
	
	public static void incrementCounter()
	{
		counter++;
	}
	
	public static int getCounter()
	{
		return counter;
	}
	
	//New Methods for the Fancy Counter Class
	
	public static void decrementCounter()
	{
		counter--;
	}

	
}

