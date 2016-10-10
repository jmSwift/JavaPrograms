import java.util.*;

public class PrisonersDilemna
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean prisoner1Confesses = true, 
				prisoner2Confesses = true;
		int response;
		
		System.out.println("For each prisoner enter 1 for confession and 0 otherwise");
		System.out.print("Prisoner1: ");
		response = input.nextInt();
		if (response == 0)
			prisoner1Confesses = false;
			
		System.out.print("Prisoner2: ");
		response = input.nextInt();
		if(response == 0)
			prisoner2Confesses = false;
			
		
		if(prisoner1Confesses && prisoner2Confesses)
			System.out.println("both confessed. Each get 5 years");
			
		else if ( prisoner1Confesses && !prisoner2Confesses)
			System.out.println(" prisoner 1 goes free and prisoner gets 10 years");
			
		else if ( !prisoner1Confesses && prisoner2Confesses)
			System.out.println("prisoner 1 gets 10 years and prisoner 2 gets set free ");
			
		else 
			System.out.print("Neither confesses and both get 10 years");
			
	}
		
}