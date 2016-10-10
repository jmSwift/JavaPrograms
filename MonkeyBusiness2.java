import java.util.Random;

public class MonkeyBusiness2
{
	public static void main(String[] args)
	{
		final int MAXIMUM = 2000000;
		final String GOAL = "LEAR";
		String letters = "";
		Random num = new Random();
		
		for(int i = 1; i <= GOAL.length(); i++)
		{
			int x = num.nextInt(26);
			letters += (char)(x + 'A');
		}
		
		int count = GOAL.length();
		
		while(!letters.equals(GOAL) && count <= MAXIMUM)
		{
			letters = letters.substring(1);	
			int x = num.nextInt(26);
			letters = letters + (char)(x + 'A');
			count++;
		}
		if(letters.equals(GOAL))
			System.out.println("it took " + count + " letters to generate LEAR");
		else
			System.out.println("Whew I gave up");
		
	}
}
		
		