import java.util.*;

public class SpheresIntersect
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int radius1,x1,y1,z1,
			radius2, x2, y2, z2;
			
		System.out.print("Please enter the radius of the first sphere: ");
		radius1 = input.nextInt();
		
		System.out.print("Please enter the x-coordinate for the first sphere: ");
		x1 = input.nextInt();
		
		System.out.print("Please enter the y-coordinate for the first sphere: ");
		y1 = input.nextInt();
		
		System.out.print("Please enter the z-coordinate for the first sphere: ");
		z1 = input.nextInt();
		
		System.out.print("Please enter the radius for the second sphere: ");
		radius2 = input.nextInt();
		
		System.out.print("Please enter the x-coordinate for the second sphere: ");
		x2 = input.nextInt();
		
		System.out.print("Please enter the y-coordinate for the second sphere: ");
		y2 = input.nextInt();
		
		System.out.print("Please enter the z-coordinate for the second sphere: ");
		z2 = input.nextInt();
		
		double distance = Math.sqrt(Math.pow((x1-x2),2.0) + Math.pow((y1-y2),2.0) + Math.pow((y1-y2),2.0));
		
		if(distance > (radius1+radius2))
			{
				System.out.print("The spheres do not intersect, they are too far apart");
			}
			
		else if(distance < (radius1-radius2))
			{
					System.out.print("One of these spheres is inside the other, they do not intersect.");
			}
			
		else
			{
			System.out.print("These spheres intersect");
			}
		
	}
	
}