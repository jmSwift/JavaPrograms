public class startEnd
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		
		
		if(s1.endsWith("lo"))
			System.out.println(s1 + " ends with lo");
		
		if(s1.endsWith("ed"))
			System.out.println(s1 + " ends with ed");
		else
			System.out.println(s1 + " does not end with \"ed\"");
			
		if(s1.startsWith("he"))
			System.out.println(s1 + " starts with he");
			
		if(s1.startsWith("llo", 2))
			System.out.print(s1 + " starts with llo at index 2");
			
	}
}