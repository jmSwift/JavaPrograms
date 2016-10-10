import java.util.*;

public class CirclesIntersect
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int radius1, x1, y1, radius2, x2, y2;
		
		//input for Circle 1
		System.out.print("Please enter the radius for circle 1: ");
		radius1 = input.nextInt();
		
		System.out.print("Please enter the x-coordinate for circle 1: ");
		x1 = input.nextInt();
		
		System.out.print("Please enter the y-coordinate for circle 1: ");
		y1 = input.nextInt();
		
		
		// input for Circle 2
		System.out.print("Please enter the radius for circle 2: ");
		radius2 = input.nextInt();
		
		System.out.print("Please enter the x-coordinate for circle 2: ");
		x2 = input.nextInt();
		
		System.out.print("Please enter the y-coordinate for circle 2: ");
		y2 = input.nextInt();
		
		
		double distance = Math.sqrt(Math.pow((x1-x2),2.0) + Math.pow((y1-y2),2.0));
		
		if (distance > (radius1+radius2))
			{
				System.out.print("Circles are too far apart, they do not intersect.");
			}	

		else if( distance < (radius1-radius2))
			{	
				System.out.println("One of these circles is inside the other, they do not intersect.");
			}
		else
		{
			System.out.print("These circles intersect");
		}
	}
}

