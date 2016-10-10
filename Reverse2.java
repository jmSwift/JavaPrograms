import java.util.Scanner;

public class Reverse2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your favorite movie title: ");
		String favMovie = input.nextLine();
		
		System.out.println("Your favorite movie is : " + favMovie);
		
		System.out.print("Enter your first name, middle name and last name: ");
		String firstName = input.next();
		String middleName = input.next();
		String lastName = input.next();
		
		System.out.println("Your full name is : " + firstName + " " + middleName + " " + lastName);
		
	
	}
}