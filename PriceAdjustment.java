
// not working



import java.util.*;

public class PriceAdjustment
{

	
	
	public static int bumpMe(int price, int increase, boolean upDown)
	{
	int updatedPrice;
	
	double temp;
	
	System.out.print("Please enter the price in dollars : $");
	temp = input.nextdouble();
	
	updatedPrice = (int)(Math.round(temp));
	
		if (temp > updatedPrice)
			{
				upDown = true;
			}
		
		else
			{
				upDown = false;
			}
			
	return updatedPrice;
	
	}
	
	public static void main(String[] args)
	{
	
	Scanner input = new Scanner(System.in);
	int price;
	int newPrice;
	int increase;
	boolean upDown;
	
	
	
	
	newPrice = bumpMe(price, increase, upDown);
	
	System.out.print("Your new price is: " + newPrice);
	
	
	
	}
	
	
}