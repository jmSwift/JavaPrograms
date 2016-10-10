import java.util.*;

public class Stocks
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double salePrice, commission;
		
		System.out.print("Please enter the sale price of the stock: "):
		salePrice = input.nextDouble();
		
		if (salePrice > 100000.00)
			commission = ( 150 + ((salePrice - 99999.99)*.0015  ));
			
		else if ( salePrice >= 100000)
			commission = ( 75 + (( salePrice - 9999.99)* .0025));
			
		else if ( salePrice >= 1000)
			commission = ( 30 + (( salePrice - 999.99)* .005));
			
		else if ( salePrice >= 100)
			commission = ( 20 + (( salePrice- 99.99)*.001));
			
		else 
			commission = 20;
			
		
		System.out.println("Your commission is $" + commission);
		
	}
	
}