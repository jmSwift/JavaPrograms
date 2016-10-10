import java.util.*;

public class PositiveSum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5, pos1, pos2, pos3, pos4, pos5, sum;
		
	
		pos1 = pos2 = pos3 = pos4 = pos5 = 0;
		
		
		
		System.out.print("Please enter 5 integers, each followed by a space: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		num5 = input.nextInt();
		
		
		if (num1 >= 0 )
			pos1 = num1;
			
		if (num2 >= 0)
			pos1 = num2;
			
		if (num3 >= 0)
			pos3 = num3;
			
		if (num4 >= 0)
			pos4 = num4;
			
		if (num5 >=0)
			pos5 = num5;
			
		sum = pos1 + pos2 + pos3 + pos4 + pos5;
		
		System.out.print("Your sum for the positive integers is: " + sum );
		
		
	}
}