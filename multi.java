
import java.util.*;

public class multi
{
	public static Scanner input = new Scanner(System.in);
	
	public static void readMulti(int [][]x, int rows, int cols)
	{
		for(int i = 0; i < rows; i++)
			for(int j = 0; j < cols; j++)
			{
				System.out.print("Enter a number for row " + i + " col " + j + ": ");
				x[i][j] = input.nextInt();
			}
			System.out.println();
	
	
	}
	
	public static int addMulti(int [][]y, int rows, int cols)
	{
	int sum = 0;
	
	for(int i = 0; i < rows; i++)
		for(int j = 0; j < cols; j++)
				sum+= y[i][j];
	
	
	return sum;
	
	}
	
	public static void main(String[] args)
	{
		System.out.print("Please enter the number of rows for the array: ");
		int rows = input.nextInt();
		
		System.out.print("PLease enter the number of columns for the array: ");
		int cols = input.nextInt();
		
		int [][]newArray = new int[rows][cols];
		
		readMulti(newArray,rows,cols);
		
		int sum = addMulti(newArray,rows,cols);
		
		System.out.println("Your sum is " + sum);
		
		//print out the array
			
			for(int i = 0; i < rows; i++)
			{
			
				for(int j = 0; j < cols; j++)
				{
						System.out.print(newArray[i][j] + " ");
				}
				System.out.println();
				
			}
		
	
	
	}
	
	
}