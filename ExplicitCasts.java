public class ExplicitCasts
{
	public static void main(String[] args)
	{
		int wholeNumber;
		double decimalNumber = 37.2;
		wholeNumber = (int)decimalNumber;
		
		double pi = 3.14;
		int newPi;
		
		newPi = (int)pi; // Explicit casts 3.14 to an int which then becomes 3
		
		System.out.println("newPi is " + newPi);
		
		
		
		System.out.println("wholeNumber is " + wholeNumber);
		System.out.println("decimalNumber is " + decimalNumber);
		
	}
}
