import java.util.*;

public class GradeConversion
{
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			
			int score;
			char grade;
			
			System.out.print("Please enter the numerical score that you wish to convert: ");
			score = input.nextInt();
			
			System.out.print("The score of " + score + " makes ");
			
		
			if( score >= 97)
				System.out.print("Your grade as A+");
				
			else if(score >= 93)
				System.out.print("Your grade a A");
				
			else if(score >= 90)
				System.out.print("Your grade a A-");
				
			else if(score >= 87)
				System.out.print("Your grade an B+");
			
			else if(score >= 83)
				System.out.print("Your grade a B");
				
			else if(score >= 80)
				System.out.print("Your grade a B-");
			
			else if(score >= 77)
				System.out.print("Your grade a C+");
				
			else if(score >= 73)
				System.out.print("Your grade a C");
			
			else if(score >= 70)
				System.out.print("Your grade a C-");
				
			else if(score >= 60)
				System.out.print("Your grade a D");
				
			else	
				System.out.print("Your grade a F");
				
			

				
		}

}	
			
			
			
			
			
			
			
			
			
			
			
			
			