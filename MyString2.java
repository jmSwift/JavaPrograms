import java.util.*;
import java.io.*;

public class MyString2
{
	public static int SIZE = 0;
	
	public static void scrambleWord(String[] wordList)
	{
		
		System.out.println("\nOutput" + "\n" + "Here is a list of possible JUMBLES\n");
		
		for(int i = 0; i < SIZE; i++)
			System.out.print(wordList[i] + "  ");
		System.out.println("\n");
		
		
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < SIZE; j++)
			{
				String temp = wordList[j];
				temp = permute(temp);
				System.out.print(temp + "  ");
				
			}
			System.out.println();
		}
	
	}
	
	public static String permute(String word)
	{
	char temp_word[] = word.toCharArray();
		char temp;
		
		int randomCharacter; 
		int randomCharacter2;
		int counter = 0;
		int temp_value = word.length();
		
		for(int i = 0; i < (2*temp_value); i++)
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
	
		return String.valueOf(temp_word);
	
	}
	
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		//String temp = "";
		
		System.out.println("How many words? ");
		int num_words = userInput.nextInt();
		
		
		String word_list[] = new String[num_words];
		
		System.out.println("Enter the words: ");
		do{
			word_list[SIZE] = userInput.next();
			SIZE++;
			}while(SIZE < word_list.length);
			
			
		scrambleWord(word_list);
	
	}
	
}


