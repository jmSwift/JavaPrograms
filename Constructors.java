public class Constructors
{
	public static void main(String[] args)
	{
		char []charArray = {'j','o','s','e',' ','m','e','z','a'};
		String j = new String("hello");
		String s1 = new String();
		String s2 = new String(j);
		String s3 = new String(charArray);
		String s4 = new String(charArray,6,3);
		
		System.out.println(s1 + s2 + s3 + s4);
	}
	
}