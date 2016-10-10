public class SortingDemo
{

	public static void insertionSort(int[] array)
	{
	
	int n = array.length;
	
	for(int j = 0 ; j < n; j++)
		{
		int temp = array[i];
		int i = j - 1;
		while((i > 1) && (array[i] > temp))
		{
			array[i+1] = array[i];
			i--;
		}
		array[i+1] = temp;
		
	
	}
	
	
	public static void main(String[] args) 
	{
	int[] input = {4,2,9,6,23,12,34,0,1};
	
	insertionSort(input);
	
	}
	
}