import java.util.Scanner;
import java.util.StringTokenizer;


public class TokenTest
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = scanner.nextLine();
		
		String[] tokens = sentence.split(" ");
		System.out.println(tokens.length);
		
		for(String token : tokens)
			System.out.println(token);
	}
	
}