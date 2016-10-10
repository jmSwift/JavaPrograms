import java.util.*;

public class modifiedAverage
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int no_of_grades = 0, grade, low_grade = 100, rounded_average, tenths_place;
		double average = 0.0, grade_sum = 0.0;
		
		do
		{
			System.out.print("Enter the number of grades. must be atleast 2: ");
			no_of_grades = input.nextInt();
			
		}while( no_of_grades < 2);
		
		for(int i = 1; i < no_of_grades; i++)
		{
			System.out.print("Enter the grade " + i + " as an integer: ");
			grade = input.nextInt();
			if((grade < 0) && ( grade > 100))
			{
				System.out.print("You entered an illegal grade " +i + "\nRe");
				--i; // or u can use i-= 1 so that they will re-enter that grade
			}
			else
			{
				grade_sum += grade;
				if(grade < low_grade)
					low_grade = grade;
			}
		}

		average = (grade_sum- low_grade)/(no_of_grades-1);
		rounded_average = (int)average;
		tenths_place = ((int)(average*10))%10;
		if(tenths_place >=5)
		{
			++rounded_average;
		}
		
		System.out.println("The average of the top " + (no_of_grades-1) + " is " + average);
		System.out.println("The rounded average is " + rounded_average);
		
				
	}
	
	
}
			