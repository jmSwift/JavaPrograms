
public class C2F
{
	public static int cToF(int x)
	{
	
	x = (int)( Math.round((9.0/5.0)*x) + 32);
	return x;
	
	}
	
	public static void main(String[] args)
	{
		
		int fahrenheit;
		
		for(int i = -40; i <=100; i=i+5)
		{
		
			System.out.println("Your degrees in celsius is: " + i + " and your degrees in fahrenheit is: " + cToF(i));
		
		}
		
		
	}
	
	
	
	
}