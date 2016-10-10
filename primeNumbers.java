import java.util.*;
import java.io.*;
import java.text.*;


public class primeNumbers
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a number: " );
		int pNumber = userInput.nextInt();
		
		boolean primeNumber = false;
		int j;
		
		for(int i = 2; i <= pNumber; i++)
		{
			for(j = i; j < pNumber;j++)
			{
				if(j % i == 1)
					primeNumber = true;
				
			}
			if(primeNumber == true)
				System.out.println(j);
			
			primeNumber = false;
			
		}
	
	}
	
	
}
