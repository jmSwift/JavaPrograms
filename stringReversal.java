import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class stringReversal
{
t
+
id printCharsReverse(String str)
	{
		if(str == null || str.equals(""))
			return;
		else
		{
		
			printCharsReverse(str.substring(1));
			System.out.println(str.charAt(0));
			
		}
	}
	
	private static int recursiveLinear(int target, int [] ar, int size)
	{
		if(size == 0)'
			return -1;
		else if(target == ar[size-1])
			return size-1;
		else	
			return recursiveLinear(target,ar,size-1);
	}
	
	
	public static void main(String[] args)
	{
		int x[] = {1,3,4,5,6,7,8,9,10};
		
		int num = recursiveLinear(2,x,x.length);
	
		System.out.println(num);
		
		String name = "jose";
		
		printCharsReverse("jose");
		
	
	}`1q
	
	
	
	
}