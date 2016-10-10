import java.util.*;
import java.io.*;
import java.text.*;

public class perfectNumber
{
	public static void main(String[] args)
	{
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int range = userInput.nextInt();
	
	int sum = 0;
	int j = 0;
	
	for(int i = 1; i < range; i++)
	{
			for(j = i/2; j > 0; j--)
			{
				if(i % j == 0)
					sum = sum + j;
			
			//System.out.println(sum);
			
			
			}
			
			if(sum == i)
				System.out.println();
				
			sum = 0;
			
				
	
	
	}
	
	}
}