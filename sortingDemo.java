public class sortingDemo
{

	public static void insertionSort(int[] array)
	{
	
	int n = array.length;
	
	for(int j = 0 ; j < n; j++)
		{
		int temp = array[j];
		int i = j - 1;
		while((i >- 1) && (array[i] > temp))
		{
			array[i+1] = array[i];
			i--;
		}
		array[i+1] = temp;
		
	
		}
	}
	
	public static void printArray(int[] array)
	{
		for(int i = 0 ; i < array.length; i++)
			System.out.println(array[i]);
			
		System.out.println();
		
	}
	
	public static void selectionSort(int[] array)
	{
		int smallest;
		
		for(int i = 0; i < array.length - 1; i++)
			{
				smallest = i;
				
				for(int index = i + 1; index < array.length; index++)
					if(array[index] < array[smallest])
						smallest = index;
						
				int temp = array[i];
				array[i] = array[smallest];
				array[smallest] = temp;
			}
			
				
	}
	
	
	
	
	public static void main(String[] args) 
	{
	int[] input = {4,2,9,6,23,12,34,0,1};
	
	printArray(input);
	
	//insertionSort(input);
	
	selectionSort(input);
	
	printArray(input);
	
	}
	
}