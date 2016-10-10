public class stringIndexMethods
{
	public static void main(String[] args)
	{
		String letters = "abcdefghijklmabcdefjklm";
		
		System.out.println(" c is located at index " + letters.indexOf('c'));
		
		System.out.println("last a is located at " + letters.indexOf('a'));
		
		System.out.println("$ is located at " + letters.indexOf('$'));
		
		System.out.println("Last c is located at " + letters.lastIndexOf('c'));
		
		System.out.println("Last a is located at " + letters.lastIndexOf('a'));
		
		System.out.println("Last $ is located at " + letters.lastIndexOf('$'));
		
		System.out.println("def is ocated at index " + letters.indexOf("def"));
		
		System.out.println("last def is located at " + letters.lastIndexOf("def"));
		
	}
}
		