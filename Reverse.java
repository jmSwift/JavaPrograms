import java.util.*;

public class Reverse
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = input.next();                       // returns a string
		
		System.out.print(word + " in reverse is ");
		for(int i = word.length()-1;i >= 0; i--)
			System.out.print(word.charAt(i));
		System.out.println();
		
		
		System.out.println("jose" + "antonio" + "meza");
		
	}
}
		