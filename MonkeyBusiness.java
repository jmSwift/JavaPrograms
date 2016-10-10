import java.util.*;

public class MonkeyBusiness
{
	// generates random letters until the program produces the name "LEAR" or count <= 2,000,000
	
	public static Scanner input = new Scanner(System.in);
	
	final int MAXIMUM = 2000000;
	final String GOAL = "LEAR";
	
	String letters = "";  // empty string with no characters
	Random num = new Random(); // instantiate a random object
	
	for(int i = 1; i <= GOAL.length(); i++)            // for i <=4    initial String
	{
		int x = num.nextInt(26);   // alphabet position 0-25
		letters = letters + (char)(x + 'A');
	}
	
	int count = GOAL.length();
	
	while(!letters.equals(GOAL) && count <= MAXIMUM) // while letters not equal to goal and not equal to count
	{
		letters = letters.substring(1);
		int x = num.nextInt(26);
		letters = letters + (char) (x + 'A');
		count ++;
	}
	
	if(letters.equals(GOAL))
		System.out.print("It took " + count + " random Strings to generate LEAR ");
	
	else
		System.out.println("whew , I give up");
}