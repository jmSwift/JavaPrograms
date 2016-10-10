import java.util.Scanner;// chaged from java.util.*;
import java.io.File;
import java.io.IOException;


public class calculatedGpa
{
	public static void main(String[] args) throws IOException
	{
		double gpaSum = 0.0, gpa;
		int num_grades = 0, page_length ;
		String line;
		
		File inputFile = new File("coursesTaken.txt");// read from command line processing
		
		if(!inputFile.exists())
		{
			System.out.println("The file coursesTaken.txt was not found");
			System.exit(0);
		}
		
		Scanner input = new Scanner(inputFile);
		
		while(input.hasNext())
		{
			line = input.nextLine();
			page_length = line.length();
			num_grades += 1;
			
			switch(line.charAt(page_length-1))
			{
				case 'A':
					gpaSum += 4.0;
					break;
					
				case 'B':
					gpaSum += 3.0;
					break;
				
				case 'C':
					gpaSum += 2.0;
					break;
				
				case 'D':
					gpaSum += 1.0;
					break;
					
				default:
					gpaSum += 0.0;
					break;
			}
		}
			input.close();
			gpa = gpaSum / num_grades;
			System.out.printf("the gpa is : %.2f", gpa);
	}
}