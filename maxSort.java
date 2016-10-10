import java.util.*;

public class maxSort
{
	public static Scanner input = new Scanner(System.in);
	
	public static void maxSort(int[] x, int size)
	{
		int swap, temp = 0;
		for(int i = (size-1);i >= 0; i--)
		{
				swap = max(x,i); // calls max function with the parameters x and i
			
				temp = x[i];
				x[i] = x[swap];
				x[swap] = x[i];
		}		
	}
	
	public static int max(int[] x, int biggestIndex)
	{
		int maxVal = x[biggestIndex];// getting the max value to the value of the value in the last index
		int maxIndex = biggestIndex; // gets maxIndex to the biggest Index	
		
		for(int i = 0; i < biggestIndex; i++)
			{
				if(x[i]> x[biggestIndex])
				{
					x[biggestIndex] = x[i];// x[biggestIndex] becomes the value of x[i] which is the greatest value
					maxIndex = i; // maxIndex is equal to the i, the subscript with the greatest value
				}
			}
		return maxIndex;
		
	}
	
	
	public static void main(String[] arg)
	{
	
		
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();

		int []newArray = new int[size];
		
		int numberOfEntries = size;
		
		int temp_input;
		
		System.out.println("Enter the " + size + " integers: ");
		
		for(int i = 0; i < size; i++)j
		{
			 temp_input = input.nextInt();// take the input
			if(temp_input == -999)// to check if the last entry was entered
			{
				numberOfEntries = i;
				break; // terminates the for loop
			
			}
			else
			{
				newArray[i]= temp_input;// store the value of input in newArray index i
			
			}
		}
			
			maxSort(newArray,numberOfEntries);
			
			System.out.println("The ordered list is: ");
			for(int i = 0; i < numberOfEntries; i++)
				System.out.print(newArray[i] + " ");
				
		
			
	
			
		
	
	}
}