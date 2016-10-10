import java.util.*;

public class StockSale
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	double stockSale; // represent the stock sale price
	double commission;

	
	System.out.print("Please enter a the stock value price: ");
	stockSale = input.nextDouble();
	
	if(stockSale < 100.00)
		commission = 20.00;
		
	else if (stockSale <= 999.99)
		commission = (20.00 + ((stockSale - 99.99)*.01));
		
	else if (stockSale <= 9999.99)
		commission = (30.00 + ((stockSale - 999.99)*.005));
		
	else if (stockSale  <= 99999.99)
		commission = (75.00 + (( stockSale - 9999.99)*.0025));
		
	else	
		commission = ( 150.00 + ((stockSale - 99999.99)*.0015));
		
	System.out.print("The commission on this stock sale is $" + commission );
	

	}
}



		