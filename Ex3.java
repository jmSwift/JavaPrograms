import java.util.*;
import java.io.*;
import java.text.*;

public class Ex3
{
	public static void main(String []args)
	{
		Scanner userInput = new Scanner(System.in);
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);// taken from dreamincode.net
		
		System.out.print("Enter the price per pound for fruit: $");
		double price = userInput.nextDouble();
		
		System.out.print("Enter the number of desired pounds: ");
		double pounds = userInput.nextDouble();
		
		double totalPrice = price*pounds;
		
		if(pounds > 3 && pounds < 6)
			totalPrice *=.9;
		
		if(pounds > 6)
			totalPrice *= .8;
			
		System.out.print("The total price for the produce is: " + moneyFormat.format(totalPrice) );
		

		
	}
}


