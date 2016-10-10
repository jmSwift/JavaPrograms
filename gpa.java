import java.util.*;
import java.io.*;
import java.text.*;

public class gpa
{
	public static void main (String[] args) throws IOException
	{
		double gpa_sum =0.0, gpa;
		int no_of_grades = 0, page_length;
		
		File inputFile = new File("coursesTaken.txt");
		DecimalFormat formatdec = new DecimalFormat("0.00");
		if(!inputFile.exists())
		{
			System.out.println("Files GPA File.txt not found");
			System.exit(0);
		}
		Scanner input = new Scanner(inputFile);
		String line;
		while (input.hasNext())
		{
			line = input.nextLine();
			page_length = line.length();
			no_of_grades = no_of_grades +1;
			switch (line.charAt(page_length-1))
			{
				case 'A':
						gpa_sum = gpa_sum + 4.0;
						break;
				case 'B':
						gpa_sum = gpa_sum + 3.0;
						break;
				case 'C':
						gpa_sum = gpa_sum + 2.0;
						break;
				case 'D':
						gpa_sum = gpa_sum + 1.0;
						break;
				case 'F':
						gpa_sum = gpa_sum + 0.0;
						break;
			}
		}
		input.close();
		gpa = gpa_sum/no_of_grades;
		System.out.println("The GPA is " + formatdec.format(gpa));
	}
}