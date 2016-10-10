import java.util.*;

public class celToFah
{
	public static Scanner input = new Scanner(System.in);
	
	public static int cToF(int x)
	{
	
		int fahrenheit = (int)(Math.round((9.0/5.0)*x)) + 32;
		
		return fahrenheit;
	
	
	}
	
	public static void main(String[] args)
	{
		System.out.print("Please enter your degrees in celsius and I will convert it to fahrenheit: ");
		int celsius = input.nextInt();
		
		System.out.println("The degrees you entered got converted to : " + cToF(celsius) + " fahrenheit");
		
		
	
	}
}