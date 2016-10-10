import java.util.*;

public class javaGuesser
{
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
			System.out.println(); // spacing 
			System.out.print(" $ java guesser");
			System.out.println();
			
			System.out.print("Welcome to the guesser game where you attempt to guess\n" + 
							 "the secret number in as few a turns as possible. For\n" +
							 "each turn I will tell you if you are too low, too high,\n" +
							 "or if you guessed the secret number. I will also - tell you\n" +
							 "the number of turns you took.\n" );
							 
			System.out.println();
	
			int random = (int) (100*Math.random() + 1);
			int counter = 1;
			int guess;
			do
			{
			
			System.out.print("Enter guess: ");
			guess = input.nextInt();
		
				if(counter == 10 && guess != random)// skip space after 10th guess
					System.out.println();
					
				if(guess < random)
					System.out.println("Your guess is too low. ");
					
				else if(guess > random)
					System.out.println("Your guess is too high. ");
				
				else 
				{
					System.out.print("Congratulations, turns required to find the secret number: " + counter );
					
				}
				
				counter++;
				
				
			}while(guess != random && counter <= 10);
				
				
				
			
			
			if( guess != random)
				System.out.print("The secret code was: " + random);
				
		
	
	
	}
	
}