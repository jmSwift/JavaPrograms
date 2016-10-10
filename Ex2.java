import java.util.*;
import java.io.*;
import java.text.*;

public class Ex2
{
	public static void main(String []args)
	{

		Scanner userInput = new Scanner(System.in);
		DecimalFormat formatdec = new DecimalFormat("0.00");
		
		System.out.print("Enter the radius of the sphere: ");
		double radius = userInput.nextDouble();
		
		System.out.print("The surface area of the sphere is " + formatdec.format(4*Math.PI*radius*radius) +"\n");
		
		System.out.print("The volume of the sphere is " + formatdec.format((4.0/3) * Math.PI * Math.pow(radius,3.0)) );
		
		
	}
	
}

