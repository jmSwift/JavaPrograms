//wrongggggggggg



import java.util.*;
public class tollFree
{
	public static void main(String[] args)
	{
	
	Scanner input = new Scanner(System.in);
	int first_Three, second_Three, last_Four;
	
	long phoneNumber;
	
	

	

	
	System.out.println("Please enter a 10 digit phone number and I will check to see if it is Toll Free or not: ");
	phoneNumber = input.nextLong();
	
	first_Three = (int) (phoneNumber/10000000);
	second_Three = (int) ((phoneNumber/10000) % 1000);
	last_Four = (int) (phoneNumber%10000);
	
		switch(first_Three)
		{
			case 866:
			case 888:
			case 877:
			case 800:
				System.out.print(" the number that you wish to dial is toll free");
				break;
				
			default:
				System.out.print(" the number that you are trying to dial is not toll free!");
		
		}
	
	
	}
}

