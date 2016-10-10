public class sorts
{

//selection, insertion bubble
	public static void bubbleSort(int[] array)// o n^2
	{
		int temp;
		for(int i = array.length-1; i > 0; i--)
			for(int j = 0; j < array.length; j++)
				if(array[j] > array[j+1])
				{
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				}
				
		for(int i = 0; i < array.length; i++)
			System.out.print("List " + array[i]);
	
	}
	
	public static void SelectionSort(int []ar)
	{//O(n^2)
		for(int i=0;i<ar.length;i++){
			int index=i;
			for(int j=i;j<ar.length;j++)
			{
				if(ar[j]<ar[index])
				{
					index=j;
					int temp=ar[index];
					ar[index]=ar[i];
					ar[i]=temp;
					
				}
				
			}
			System.out.print(ar[i] + "][");
		}
		
	}
		public static void InsertionSort(int []Arry)
		{
			for(int j=0;j<Arry.length;j++)
			{
				int temp=Arry[j];
				int i=j-1;
				while((i>-1)&&Arry[i]>temp)
				{
					Arry[i+1]=Arry[i];
					i--;
				}
			Arry[i+1]=temp;
			}
			for(int x=0;x<Arry.length;x++)
				{
					System.out.println("insertionSort: "+Arry[x]);
				}
			System.out.println("");
		}
		
	
	public static void main(String[] args)
	{
		int[] x = {1,5,2,6,7,3,4,9,10};
		
		for(int i = 0; i < x.length;i++)
			System.out.print(x + " ");
		
		SelectionSort(x);
	
	
	}








}