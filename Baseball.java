import java.util.*; // to use scanner

public class Baseball
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); // declare the Scanner
	
		int walks,singles, doubles, triples, homeruns, hitByPitch, atBats, sacrifice_flies;
		
		double OBAS, doubleAtBats, OnBaseAverage, SluggingPercentage;
		
		System.out.println("Please enter the amount of at bats:");
		atBats = input.nextInt();
		
		System.out.println("Please enter the amount of walks:");
		walks = input.nextInt();
		
		System.out.println("Please enter the amount of singles:");
		singles = input.nextInt();
		
		System.out.println("Please enter the amount of doubles:");
		doubles = input.nextInt();
		
		System.out.println("Please enter the amount of triples:");
		triples = input.nextInt();
		
		System.out.println("Please enter the amount of homeruns:");
		homeruns = input.nextInt();
		
		hitByPitch = sacrifice_flies = 0;// assign 0 to these values
		
		doubleAtBats = atBats;
		
		OnBaseAverage = (atBats+ walks+ hitByPitch)/(atBats+ walks+ hitByPitch + sacrifice_flies);
		
		SluggingPercentage=  ((singles + (2*doubles) + (3*triples) + (4*homeruns))/doubleAtBats);
		
		OBAS = OnBaseAverage+ SluggingPercentage;
		
		System.out.println("Your on Batting Average Slugging Percentage is:" + OBAS);
		
		
		
	}
	
}