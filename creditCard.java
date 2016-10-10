import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class creditCard
{
	public static void main(String[] args)throws IOException
	{
	Scanner input = new Scanner(System.in);	
	
	System.out.println("Enter the file that you wish to open ending with .txt ");
	String filename = input.nextLine();
	File file = new File(filename);
	
	if(!file.exists())
		{
			System.out.println("The file " +filename + " was not found");
			System.exit(0);
		}
	
	Scanner inputFile = new Scanner(file);
	
	
	String bill_name = "",
			str_temp ="";
	double monthly_cost = 0,
		   dbl_temp;
	
	bill_name = inputFile.next();
	monthly_cost = inputFile.nextDouble();
	
	while(inputFile.hasNext())
	{
		str_temp = inputFile.next();
		dbl_temp = inputFile.nextDouble();
		
		if(dbl_temp > monthly_cost)
		{
			bill_name = str_temp;
			monthly_cost = dbl_temp;
		
		}
	
	
	}
	inputFile.close();
	
	System.out.println("Your most expensive monthly purchase was " + bill_name + " for $" + monthly_cost);
	
	
	}
}