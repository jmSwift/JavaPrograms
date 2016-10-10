import java.lang.StringBuilder;

public class bufferLength
{
	public static void main(String[] args)
	{
		StringBuilder name = new StringBuilder("jose meza");
		name.deleteCharAt(4);
		System.out.println(name.toString());
		
	}
}