public class hashFunction
{

	String[] theArray;
	int arraySize;
	int itemsInArray = 0;
	
	
	public static void main(String[] args)
	{
		hashFunction theFunc = new hashFunction(30);
		
		String[] elementsToAdd = {"1", "5", "17","21",26"};
		
		theFunc.hashFunction(elementsToAdd,theFunc.theArray);
		
		theFunc.displayTheStack();
		
	}
	
	hashFunction(int size)
	{
		arraySize = size;
		theArray = new String[size];
		Arrays.fill(theArray, "-1");
	}
	
	public void hashFunction1(String[] stringsForArray, String[] theArray)
	{
		for(int n = 0; n < stringsForArray.length; n++)
			String newElementVal = stringsForArray[n];
			
	}
	
	public hashFunction2(String[] stringsForArray, String[] theArray)
	{
		for(int n = 0; n < stringsForArray.length; n++)
			
			String newElementVal = new stringsForArray[n];
			
			int arrayIndex = Integer.parseInt(newElementVal) % 29;
			
			System.out.println
	}
	
}
	