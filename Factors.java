import java.util.*;

public class Factors
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int first, second, total2= 0, total3 = 0, total4 = 0, totalNone = 0;
		
		
		System.out.print("Please input two positive integers divided by a space: ");
		first = input.nextInt();
		second = input.nextInt();
		
		if(( first%2 == 0) || (first%3 == 0) || (first%4 == 0))
		{
			if ( first%2==0)
				total2 += 1;
				
			if (first%3==0)
				total3 +=1;
				
			if (first%3 == 0)
				total4+= 1;
		
		}
		
		else 
		{
			totalNone += 1;
		}
		
		
		if (( second%2 == 0) || (second%3 == 0) || (second%4 == 0))
		{
			
			if (second%2 == 0)
				total2 += 1;
				
			if (second%3 == 0)
				total3 += 1;
				
			if (second%4 == 0)
				total4 +=1;
			
		}
		
		else 
		{
			totalNone +=1;
		}
		
		System.out.println("Read in: ");
		System.out.println("\t " + first);
		System.out.println("\t " + second);
		
		System.out.println("Multiples of 2: " + total2);
		System.out.println("Multiples of 3: " + total3);
		System.out.println("Multiples of 4: " + total4);
		System.out.println("Not Multiples of 2,3, and 4: " + totalNone);
		
		
	}
	
}