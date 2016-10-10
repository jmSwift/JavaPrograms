import java.io.*;
import java.util.*;
import java.text.*;

public class caloriesConsumed
{
	
	
	public static void main(String[] args) throws IOException
	{
	File inputFile = new File("consumption.txt");
	
	Scanner input = new Scanner(inputFile);
	
	String name , max_cals_name = "";
	
	int hamburgers,hotdogs,num_of_people = 0, calories , max_cals = 0, total_cals = 0, average_cals = 0,highestCalories = 0;
	
	
		while(input.hasNext())
		{
		name = input.next();
			
		num_of_people +=1;
		
		hamburgers = input.nextInt();
		
		hotdogs = input.nextInt()
		
		calories = 190 * hotdogs + 220 * hamburgers;
		
		if( calories > highestCalories)
			{
				max_cals_name = name;
				max_cals = calories;
			}
			
		total_cals += calories;
		average_cals =  total_cals / num_of_people;
		
		}
		
		System.out.println(" the person who consumed the most calories was " + max_cals_name + "they consumed " + max_cals + " calories");
			
			System.out.println("The average of calories consumed was " + average_cals);
			
		
	}
}
