import java.util.*;

public class NestedLoops
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int numStudents, numGrades;
		
		int grade;
		
		int sum = 0;
		
		double average;
		
		// prompt users for number of students and number of grades
		
		System.out.print("Enter the number of students: ");
		numStudents = input.nextInt();
		
		System.out.print("Enter the number of grades: ");
		numGrades = input.nextInt();
		
		System.out.println();
		
		for(int i = 1; i <= numStudents; i++)
			{
				sum = 0;
				System.out.println("Grades for student " + i);
				
				for(int j = 1; j <= numGrades; j++)
					{
						System.out.print(" " + j + ":");
						grade = input.nextInt();
						sum += grade;
					}
			
			average = (double)sum/numGrades;
			System.out.print(" Average: " + average);
			System.out.println();
			}
			
	}
}