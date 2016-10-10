import java.util.*;

public class sumArray2
{
	public static Scanner input = new Scanner(System.in);
	
	public static void readSum(double [][]y)
	{
	for(int i = 0; i <y.length;i++)
		for(int j = 0; j < y[i].length;j++)
		{
			System.out.print("Please enter the value for row " + i + " column " + j + ": ");
			y[i][j] = input.nextDouble();
		}
		
	}
	
	public static double addSum(double [][]z)
	{
	double sum = 0;
	for(int i = 0; i < z.length; i++)
		for(int j = 0;j < z[i].length; j++)
			sum += z[i][j];
			
	return sum;
	
	
	
	
	}
	public static void main(String[] args)
	{
	
	System.out.print("Please enter the amount of rows for your 2D array: ");
	int rows = input.nextInt();
	
	System.out.print("Please enter the amount of columns for your 2D array: ");
	int columns = input.nextInt();
	
	double newArray[][] = new double[rows][columns];
	
	readSum(newArray);
	
	double sum = addSum(newArray);
	
	System.out.println("The array you entered is as follows: ");
	
		for(int i = 0 ; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
				System.out.print(newArray[i][j] + " ");
			System.out.println();
		}
	System.out.print("Your sum is " + sum);
	
	}
	
}
	