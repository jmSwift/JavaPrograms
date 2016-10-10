public class stringMisc
{
	public static void main(String[] args)
	{
		String s1 = "hello world";
		char[] charArray = new char[5];
	
		System.out.println(s1);
		
		System.out.println("s1 length" + s1.length());
		
		for(int count = s1.length()-1; count >=0 ; count--)
			System.out.println(s1.charAt(count));
			
		s1.getChars(0,2,charArray,0);
		System.out.print("The character array is " );
		
		for(char character : charArray)
			System.out.println(character);
			
			
	}
	
}