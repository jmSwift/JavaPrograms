import java.util.*;

public class BillCalculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double sales, taxes, total;
		
		final double TAX_RATE = 0.08;
		final double SHIPPING_FEE = 5.00;
		
		System.out.print("Enter Item price: ");
		sales = input.nextDouble();
		taxes = sales*TAX_RATE;
		total = sales + taxes;
		
		System.out.println("Sale: $" + sales);
		System.out.println("Tax: $" + taxes);
		
		if (sales < 25.00)
		{
			total += SHIPPING_FEE;
			System.out.println("Shipping is $5.00");
		}
		
		System.out.println("Final Cost is $: " + total);
		
	}
	
}