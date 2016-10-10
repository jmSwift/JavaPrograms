public class Swap
{
	public static void swap(int[] x, int i, int j)
	{
		int temp = x[i];
		x[i] = x[j];
		x[j] = temp;
		
	}
	
	public static void main(String[] args)
	{
		int[] list = {1,3,5,7,9};
		System.out.print("Before: ");
		for(int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	
	
		swap(list, 2, 4);// swap list[2] and list[4]
		
		System.out.println();
		System.out.print("After: ");
		for(int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		
	}
	
}
		