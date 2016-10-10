public class Hw3
{
	public static int [] sorted(int []array_a, int []array_b)
	{
		int []array_c = new int[array_a.length+array_b.length];
		
		int count = 0,
			i = 0,
			j = 0;
		
		int sentinel_a = 0,
			sentinel_b = 0;
			
			do{
				if(array_a[i] < array_b[j])
					{
						array_c[count++] = array_a[i++];
						//i++;
					}
				else
					{
						array_c[count++] = array_b[j++];
						//j++;
					}
					
				if(i == array_a.length)
				{
					sentinel_a = 999;
					break;
				}
				
				if(j == array_b.length)
				{
					sentinel_b = 999;
					break;
				}
				
				
					
			}while(count < (array_c.length-1));
			
			while(sentinel_a == 999 && j < array_b.length)
			{
				array_c[count++] = array_b[j++];
			}
			
			while(sentinel_b == 999 && i < array_b.length)
			{
				array_c[count++] = array_a[i++];
			}
			
		
		return array_c;
		
	
	}
	
	public static void towersOfHanoi(int numDisks, String sourcePeg, String destPeg, String tempPeg)
	{
	
	if(numDisks == 1)
	{
		System.out.println("Disk 1 from" + sourcePeg + "------> " + destPeg);
		return;
	}
	
		
	towersOfHanoi(numDisks-1,sourcePeg,tempPeg,destPeg);
	
	System.out.println("disk " + numDisks + " from " + sourcePeg + "------> " + destPeg);
	
	towersOfHanoi(numDisks-1,tempPeg,destPeg,sourcePeg);
	
	
	}
	
	public static int[] arrayReversal(int []array, int start, int end)
	{
		if(start >= end)
		{
			return array;
		}
		else	
		{
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			
			return arrayReversal(array,++start,--end);
		}
		
	}
	
	
	public static int[] maxSort(int []array, int end)
	{
	
		int maxIndex = 0, temp = 0, index = 0;
	
		if(end <1)
			return array;
		
		else
			{
			for(index = maxIndex;index < end; index++)
				{
					if(array[index] > array[maxIndex])
						maxIndex = index;
				}
			
			temp = array[end-1];
			array[end-1] = array[maxIndex];
			array[maxIndex] = temp;
				
			return maxSort(array, --end);
			}
	}
		
		
	
	public static void main(String[] args)
	{
	
		int array_a[] = {1,3,5,10};
		int array_b[] = {2,4,6,8,111,200};
		
		int array_c[] = new int[array_a.length+array_b.length];
		
		array_c = sorted(array_a,array_b);
	
		for(int i = 0; i < array_c.length; i++)
				System.out.print(array_c[i] + ", ");
		System.out.println();
		
		
		int array_d[] = arrayReversal(array_c,0, (array_c.length-1));
		
		for(int i = 0; i < array_d.length;i++)
			System.out.print(array_d[i] + " ");
		
		int array_e[] = maxSort(array_d,array_d.length);
		
		System.out.println("\nAFter max sort");
		
		for(int i = 0; i < array_e.length;i++)
			System.out.print(array_e[i] + " ");
		System.out.println("\n");
			
		
		towersOfHanoi(3,"A","B","C");
	}
	
}

