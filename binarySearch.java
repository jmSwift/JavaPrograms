import java.util.Arrays;

public class binarySearch
{

	private static int biSearch(int [] x, int n, int key)
	{
		int low = 0;
		int high = n -1;
		int mid;
		while(high >= low)
		{
			mid = (low + high) / 2;
			if(key == x[mid])
				return mid;
			if(key < x[mid])
				high = mid -1;
			else
			low = mid + 1;
		}

		return -1;
	}

	private static int bSearch(int []x, int key)
	{
		int low = 0;
		int high = x.length -1;
		int mid;
		
		while(high >= low)
		{
			mid = (low + high) /2;
			if(key == x[mid])
				return mid;
			if(key < x[mid])
				high = mid - 1;
			else	
				low = mid + 1;
		}
	
		return -1;
	}
	
	private static int linearSeach(int[]x, int key)
	{
		
		for(int i = 0; i < x.length; i++)
			if(key == x[i])
				return i;
				
		return -1;
	}
	
	private static int recursiveLinear(int target, int [] ar, int size)
	{
		if(size == 0)
			return -1;
		else if(target = ar[size-1])
			return size-1;
		else	
			recursiveLinear(target,ar,size-1);
	}
	
	
	
	
	}
	
	private static int fibonacci(int n)
	{
		if(n <= 1)
			return n;
		else	
			return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
	
	
	private static int factorial(int n)
	{
		int result;
		
		if(n<=1)
			return n;
		else	
			result = factorial(n-1) * n;
			
			return result;
	
	}
	
	private static int factorial2(int n)
	{
		//int result;
		
		if(n<=1)
			return n;
		else	
			return factorial(n-1) * n;
			
	}

	
	
		public static void main(String[] args)
	{
		
		int x[] = { 1, 9, 6, 4, 7 , 8 , 5,5,5, 3, 10};
		
		/*Arrays.sort(x);
		
		for(int i = 0; i < x.length; i++)
			System.out.print(x[i] + " " );
		//System.out.println(biSearch(x,x.length,3));
		
		System.out.println();
		
		System.out.println("index # " + bSearch(x,3));
		
		System.out.println("index # " + linearSeach(x,7));
		
		*/
		
		
		recursiveLinear(0,x,x.length);
		
		
		//System.out.println("factorial of4  is " + factorial(4));
		
		//System.out.println("Factorial of 5 is " + factorial(5));
		
		
	}
}

