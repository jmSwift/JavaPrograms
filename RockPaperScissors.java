import java.util.*;
public class RockPaperScissors
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		final int ROCK = 0, SCISSORS = 1, PAPER = 2;   // constants
		
		int player, computer;
		
		System.out.print("Rock = 0, Scissors = 1, Paper = 2. Please select choose one: ");
		player = input.nextInt();
		computer = (int) (3*Math.random()); // generate a random number from 0,1, 2
		
		System.out.println("The computer chooses " + computer);
		System.out.print("**********************************");
		
		if (player == computer)
			System.out.print("Its a tie");
			
		else 
			if(player == ROCK)
				if (computer == SCISSORS)
					System.out.println("Rock beats scissors , the player wins!");
			else 
				System.out.println("Paper beats rock, the computer wins");
				
		
		else
		if (player == SCISSORS)
			if ( computer == ROCK)
				System.out.println("Rock beats Scissors, the computer wins!");
				
			else
				System.out.println("Scissors cuts paper, the player wins!");
				
		
		else
			
				if (computer == SCISSORS)
					System.out.println(" Scissors cuts paper, the computer wins");
				
				else 
					System.out.println("Paper covers rock, the player wins");
					
	}
}
		
		
		