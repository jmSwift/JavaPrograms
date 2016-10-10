import java.util.*;
import java.io.*;

public class transcript
{
	public static void main(String[] args)throws IOException
	{
		File inputFile = new File("grades.txt");
		
		Scanner input = new Scanner(inputFile);
		
		String line = new String();
		
		if(!inputFile.exists())
		{
			System.out.print("File not found! The program is now ending..");
			System.exit(0);
		}
		
		int sum = 0;
		int counter = 0;
		
		while(input.hasNext())
		{
			line = input.nextLine();
			
			if(line.charAt(line.length()-1) == 'A')
				sum += 4;
			
			else if(line.charAt(line.length()-1) == 'B')
				sum += 3;
				
			else if(line.charAt(line.length()-1) == 'C')
				sum += 2;
				
			else 
				sum += 1;
				
			counter++;
				
		}
		inputFile.close();
		
		double gpa = sum / counter;
		
		System.out.println("Your gpa is: " + gpa);
		
		inputFile.close();
		+
		
	}
	
}