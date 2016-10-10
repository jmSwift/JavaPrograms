import java.util.*;
import java.io.*;

public class MyString
{
	public static MyArrayList myWords = new MyArrayList();
	public static int SIZE = 0;
	public static String[] word_list = new String[10];
	
	 public String remove(int index)
	 {
        if(index < SIZE)
		{
            String obj = word_list[index];
            word_list[index] = null;
            int tmp = index;
            while(tmp < SIZE)
			{
                word_list[tmp] = word_list[tmp+1];
                word_list[tmp+1] = null;
                tmp++;
            }
            SIZE--;
            return obj;
        } else 
			{
            throw new ArrayIndexOutOfBoundsException();
			}
         
    }
     
    public int size(){
        return SIZE;
    }
     
	 public String get(int index){
        if(index < SIZE){
            return word_list[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
	

	public static void scrambleWord()//, String correct_word)
	{
		//String []word_list = new String[SIZE];
		
		for(int i = 0; i < SIZE; i++)
			word_list[i] = myWords.get(i);
		
		for(int i = 0; i < SIZE; i++)
			System.out.print(word_list[i] + "\t");
		
		
		System.out.print(
		char temp_word[] = misspelled_word.toCharArray();
		char temp;
		
		int randomCharacter; 
		int randomCharacter2;
		int counter = 0;
		int temp_value = myWords(counter).length();
		
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
	
		return String.valueOf(temp_word));
		
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		String temp = "";
		
		System.out.println("How many words? ");
		int num_words = userInput.nextInt();
		
		System.out.println("Enter the words: ");
		do{
			temp = userInput.next();
			myWords.add(temp);
			SIZE++;
			}while(SIZE < num_words);
			
		scrambleWord();
		
		//for(int i = 0; i < myWords.length; i++)
			
	
	
	}
	
}


