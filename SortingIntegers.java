import java.util.*;

public class SortingIntegers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		int highest, mid, lowest;
		
		System.out.print("Please enter 3 integers, each one followed by spaces : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		
		
		if (( num1> num2 ) && ( num1 > num3))
		{ highest = num1;
			if ( num2> num3)
				{ 	mid = num2;
					lowest = num3;
				}
		
			else
				{
					mid = num3;
					lowest = num2;
					
				}
		}
		
		else if (( num2 > num1) && (num2 > num3))
		{ highest  = num2;
			if ( num1 > num3)
				{	mid = num1;
					lowest = num3;
				}
			else 
				{ 
					mid = num3;
					lowest = num1;
				}
		}
		
		
		
		else 
			{
				highest = num3;
				
				if ( num2 > num1)
					{ 
					mid = num2;
					lowest = num1;
					}
				 
				 else 
					{ mid = num1;
					lowest = num2;
					}
			}
				
				
				
				
		System.out.print("Your numbers from lowest to highest are: " + lowest + " " + mid + " " + highest);
		
		
	
		
		
		
	}
	
}