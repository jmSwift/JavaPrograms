import java.util.Scanner;

public class charMethods
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character and press enter: ");
		String input = scanner.next();
		char c = input.charAt(0);
		
		c = Character.toUpperCase(c);
		
		
		System.out.println(c);
		
	}
}