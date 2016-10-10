import java.util.*;

public class threePoints
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x1, x2, y1, y2, z1, z2;
		
		System.out.print("Enter x1: ");
		x1 = input.nextInt();
		
		System.out.print("Enter x2: ");
		x2 = input.nextInt();
		
		System.out.print("Enter y1: ");
		y1 = input.nextInt();
		
		System.out.print("Enter y2: ");
		y2 = input.nextInt();
		
		System.out.print("Enter z1: ");
		z1 = input.nextInt();
		
		System.out.print("Enter z2: ");
		z2 = input.nextInt();
		
		double distance = Math.sqrt(Math.pow((x1-x2),2.0) + Math.pow((y1-y2),2.0) + Math.pow((z1-z2),2.0));
		
		System.out.print("The distance between the points " + "(" + x1 + "," + y1 + "," + z1 + ")" + " and " + "(" + x2 + "," + y2 + "," + z2 + ")" + " is ");
		System.out.println(distance);
		
	}
}
		
		
		