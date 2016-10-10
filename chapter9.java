import java.util.*;

public class chapter9
{
	public static void main(String[] args)
	{
		Random random = new Random();
		
		int dice_roll = random.nextInt(6)+1;
		
		System.out.println(dice_roll);
		
	}
}