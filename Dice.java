import java.util.*;

public class Dice
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int bet;
		int wager;
		int die1, die2;
		int sum;
		
		System.out.print("Enter your bet\n (1)Over 7\n (2)Under 7 \n (3)Exactly 7\n: ");
		bet = input.nextInt();
		
		System.out.print("Enter your wager (whole number): ");
		wager = input.nextInt();
		
		//Roll the dice
		die1 = (int)(6*Math.random()+1);
		die2 = (int)(6*Math.random()+1);
		sum = die1 + die2;
		
		System.out.println("The sum of the dice is " + sum);
		
		// check for a win
		
		if ((sum > 7) && (bet == 1) || (sum < 7) && (bet == 2))
			System.out.println("You win $" + wager);
			
		else if((sum == 7) && (bet == 3))
			System.out.println("You win $" + (4*wager));
		
		else	
			System.out.println("You lose!");
			
	}
}