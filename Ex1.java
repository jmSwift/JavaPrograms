import java.util.*;
import java.io.*;
import java.text.*;

public class Ex1
{
	public static void main(String [] args)
	{
		DecimalFormat formatdec = new DecimalFormat("0.00");
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the weight of the package: ");
		double weight = userInput.nextDouble();
		
		System.out.println();
		
		System.out.print("Enter the shipping price per pound: $");
		double shipping = userInput.nextDouble();
		
		System.out.println("The shipping charge is: $" + formatdec.format(weight*shipping));
		
	
	}

	
}