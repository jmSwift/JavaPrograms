
public class Roulette
{
	public static void main(String[] args)
	{
		int spin;
		int[] numbers;
		numbers = new int[38];
		
		for(int i = 0; i < 38; i++)
			numbers[i] = 0;
			
		for(int i = 0;i <= 1000000; i++)
			{
				spin = (int)(38*Math.random());// a random int from 0 - 37
				numbers[spin]++; // if spin is 23, then increment numbers[23] 				
			
			}
			
		System.out.println("Number percent ");
		System.out.println("00 " + 100*(numbers[37]/1000000.0)); // convert to percent
		
		for(int i = 0;i < 37; i++)
			System.out.println(i + " " + 100*(numbers[i]/1000000.0));
			
		System.out.println();
	}
}