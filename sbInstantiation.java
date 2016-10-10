import java.lang.StringBuilder;
public class sbInstantiation
{
	public static void main(String[] args)
	{
		StringBuilder buffer1 = new StringBuilder();
		StringBuilder buffer2 = new StringBuilder(10);
		StringBuilder buffer3 = new StringBuilder("hello");
		
		System.out.println(buffer1);
		System.out.println(buffer2);
		System.out.println(buffer3);
		
	}
}