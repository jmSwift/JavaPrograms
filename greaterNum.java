
public class greaterNum
{

	public static int largesetNum(int x, int y, int z)
	{
		if((x > y) && ( x > z))
			return x;
			
		else if((y > x) && ( y > z))
			return y;
		
	return z;
	
	
	
	}
	
	public static void main(String[] args)
	{
	
	
	
	System.out.print("the laregst number was: " + largesetNum(5,50,26));
	
	}
	
}