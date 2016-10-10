import java.util.*;

public class twoPoints
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int x1 , y1 , x2 , y2;
		
		System.out.print("Please enter your first point x1 followed by y1: ");
		x1 = input.nextInt();
		y1 = input.nextInt();
		
		System.out.print("Please enter your second point x2 followed by y2: ");
		x2 = input.nextInt();
		y2 = input.nextInt();
		
		
		
		double distance = Math.sqrt( Math.pow((x2-x1), 2.0) + Math.pow((y2-y1), 2.0));
		
		
		System.out.println("The distance is: " + distance);
		
	}
}


/* Two runs of the programs

C:\Users\jose\Desktop\JavaPrograms>java twoPoints
Please enter your first point x1 followed by y1: 5 5
Please enter your second point x2 followed by y2: 25 25
The distance is: 28.284271247461902

C:\Users\jose\Desktop\JavaPrograms>java twoPoints
Please enter your first point x1 followed by y1: 5 5
Please enter your second point x2 followed by y2: -5 -5
The distance is: 14.142135623730951

*/



