import java.lang.StringBuilder;

public class StringBuilder
{
	public static void main(String []args)
	{
		String info = "";
		
		info += "my name is jose ";
		info += " ";
		info += "last name is meza";
		
		StringBuilder sb = new StringBuilder("");// you can initialize string here
		sb.append("My name is jose ");
		sb.append(" ");
		sb.append("last name is meza");
		
		System.out.println(sb.toString());
		
	
	}
	
}