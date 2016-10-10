import java.util.*;

public class randomStrings
{
	public static void main(String[] args)
	{
		String [] strArray = new String[25];
		Random randy = new Random();

		for(int i = 0; i < 25; i++)
		{
			
			strArray[i] = " ";
			for(int j = 0; j < 4; j++)
				strArray[i] += (char)(randy.nextInt(25)+65);//casting a character for the ascii numbers 65 - 90
			
			System.out.println(strArray[i].toUpperCase()); // print the string in uppercase
		}
		
		
	}
}