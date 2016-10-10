import java.util.*;

public class SquareRoot
{
	public static void main(String[] args)
	{
		Scanner input;
		double distanceToEyes;
		double distanceToHorizon;
		int answer = 1;
		input = new Scanner(System.in);
		
		do
		{
			System.out.print("Distance from the ground to your eyes in feet: ");
			distanceToEyes = input.nextDouble();
			distanceToHorizon = 1.23* Math.sqrt(distanceToEyes); // = the square root of distance to eyes times 1.23*
			System.out.println("The distance to the horizon is " + distanceToHorizon + "mi");
			System.out.print("Again? Enter 1 for yes; any other number to exit");
			answer = input.nextInt();
		}while( answer == 1);
		
	}
}