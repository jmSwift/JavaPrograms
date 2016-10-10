import java.util.*;

public class SuperDie
{
	public static int die_value;
	public static int num_of_sides;
	
	public SuperDie()
	{
		num_of_sides = 6;
	}
	
	public SuperDie(int sides)
	{
		num_of_sides = sides;
	}
	
	
	public static int rollDie()
	{
		die_value = (int)(num_of_sides*Math.random()+1);
	
		return die_value;
	}
	
	public static int NumberOfSides()
	{
		return num_of_sides;
	}

	
	public static void changeNumberOfSides(int newSides)
	{
		num_of_sides = newSides;
	}
	
	public static void printNumberOfSides()
	{
		System.out.println("The number of sides in this dice are: " + num_of_sides);
	}
	
	
	public static void main(String[] args)
	{
		SuperDie newDie = new SuperDie(6);
		
		newDie.printNumberOfSides();
		
		int value_of_roll = newDie.rollDie();
		
		System.out.println("The value of the roll is: " + value_of_roll);
		
		newDie.changeNumberOfSides(9);
		
		int number_sides = NumberOfSides();
		
		System.out.println("This die has " + number_sides + " number of sides");
		newDie.printNumberOfSides();
		

	}

		
}
