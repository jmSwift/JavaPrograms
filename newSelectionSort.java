import java.util.*;

public class newSelectionSort
{
	public static Scanner input = new Scanner(System.in);
	
	public static void selectionSort(int []x, int size)
	{
	int swap, temp = 0;
		
		for(int i = 0; i < size; i++)
		{
			swap = min(x,i, size);
			
			temp = x[i];
			x[i] = x[swap];
			x[swap] = temp;
	
		}
	
	}
	
	
	public static int min(int []y, int start,int size)
	{
	
	int minValue = y[start];
	int minIndex = start;
		for(int i = start; i < size; i++)
			{
			if (y[i] < minValue)
				{
					minValue = y[i];
					minIndex = i;
				}
			
			}
			
			return minValue;
			
	}		
			
	public static void main(String[] args)	
	{		
	
	System.out.print("Please enter the size of the array: ");
	int size = input.nextInt();
	
	int []newArray = new int[size];
	System.out.print("Enter the " + size + " integers: ");
	for(int i = 0; i < size; i++)
		newArray[i] = input.nextInt();
		
	selectionSort(newArray, size);
	
	for (int i = 0; i < size; i++)
		System.out.print(newArray[i] + " ");
		
		
	
	}
	
}