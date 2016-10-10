import java.util.*;

public class RunnersCalculator
{

	// METHODS  Before main
	public static double CaloriesBurned(double weight, double distance)
	{
	
	double calories = .653*weight*distance;
	return calories;
	
	}
	
	
	
	
	//Begin main
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double myWeight, myDistance, myCalories;
		
		System.out.print("Please enter your weight: ");
		myWeight = input.nextDouble();
		
		System.out.print("Please enter your distance: ");
		myDistance = input.nextDouble();
		
		myCalories = CaloriesBurned(myWeight,myDistance);
		System.out.println("You burned " + myCalories + " calories ");
		
	}
	
}