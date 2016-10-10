import java.util.*;
import java.io.*;

public class JUMBLE
{

	public static void scrambleWord(String misspelled_word)//, String correct_word)
	{
		char temp_word[] = misspelled_word.toCharArray();
		char temp;
		
		int randomCharacter; 
		int randomCharacter2;
		
		for(int i = 0; i < (5*Math.random()+0); i++)// for 5 swaps
		{   
			do
			{
			randomCharacter = (int)((temp_word.length)*Math.random()+0);
			randomCharacter2 = (int)((temp_word.length)*Math.random()+0);
			
			}while(randomCharacter == randomCharacter2);
			
			temp = temp_word[randomCharacter];
			
			temp_word[randomCharacter] = temp_word[randomCharacter2];
			
			temp_word[randomCharacter2] = temp;
		}
	
		System.out.println("The new scrambled word is : " + String.valueOf(temp_word));
		
	}

	public static void main(String[] args)
	{
	
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.println("Enter your Scrambled word: ");
		String scrambled_word = userInput.nextLine();
		
		//System.out.println("Enter the correct spelling of the word: ");
		//String correct_spelling = userInput.nextLine();
		
		scrambleWord(scrambled_word);
		
	}
	
}