public class StringCompare
{
	public static void main(String[] args)
	{
		String s1 = new String("a");
		String s2 = new String("b");
		String s3 = "happy birtday";
		String s4 = "Happy Birthday";
		
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
		
	
	
	
		if(s1.equals("hello"))
			System.out.println("true");
		
		if(s1.compareTo(s2) < 0)
			System.out.println("s1 is less than s2");
		else
			System.out.println("s1 is greater than s2");
			
			
			
	
	}
	
	
}