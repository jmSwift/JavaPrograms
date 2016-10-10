import java.util.*;

public class ceasarCipher
{
	public static Scanner input = new Scanner(System.in);
	
	public static String encrypt(String msg, int shift)
	{
		String encryptedMessage = new String(); // creates an empty string 
		msg = msg.toUpperCase();
		for(int i = 0; i < msg.length(); i++)
		{
			char ch = msg.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
			{
				int oldPosition = ch - 'A';
				int newPosition = (oldPosition + shift) % 26;
				encryptedMessage = encryptedMessage + (char)(newPosition + 'A');

			}
			
		}
		
		return encryptedMessage;
	
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your message on one line: ");
		String newMessage = input.nextLine(); // takes the next line
		
		System.out.print("Enter an int from 0-25: ");
		int shift = input.nextInt();
		
		System.out.print("The encryped message is " + encrypt(newMessage,shift));
		
	}
	
	
	
}