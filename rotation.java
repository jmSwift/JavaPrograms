import java.util.*;

public class rotation
{
	public static string rotateMe(string getRotated, int numRotations)
	{
		for(int i = 0; i < getRotated.length; i++)
				getRotated[i] = getRotated[i+numRotations];
			
				return getRotated;
	}
	
	public static void main(String[] args)
	{
		File inputFile = new File(input.txt);
		
		Scanner input = new Scanner(inputFile);
		
		while(inputFile.hasNext())
		{
			string str = input.nextLine();
			
			int numb = str.charAt(str.length-1);
			
		}
		
		String rotation = rotateMe(str,numb);
		
		System.out.println("Your rotated string is: " + rotation);
	
	}
}
		
		