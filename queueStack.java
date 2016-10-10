class StackMethods
{
	
		public StackMethods(int arraySize)
		{
		sp = arraySize;
		theStack = new int[MAX_STACK_SIZE];
		//sp = 0;
		//theStack = new int[MAX_STACK_SIZE];
		}

				
		public void push(int value)
		{
		if(!full())
				theStack[sp++] = value;
		}
	 	
		public int pop()
		{
		if(!empty())
			return theStack[--sp];
		else
			return -1; 
		}

		public boolean full()
		{
		if(sp == MAX_STACK_SIZE)
			return true;
		else
			return false;
		}

		public boolean empty()
		{
		if(sp == 0)
			return true;
		else
			return false;
		}
		
		public void display()
		{
			for(int i = 0; i<=sp; i++)
				System.out.print(theStack[i]+"|");
			System.out.println("");
		}

		private int sp;
		private int[] theStack;
		public static final int MAX_STACK_SIZE = 4;
	

}

class myQueue
{
	public static final int MAX_STACK_SIZE = 4;
	
	StackMethods firstStack, secondStack;
	int temp;
	
	public myQueue()
	{
	firstStack = new StackMethods(MAX_STACK_SIZE);
	secondStack = new StackMethods(MAX_STACK_SIZE);
	}
	
	public void enqueue(int a)
	{
		firstStack.push(a);
	}
	public void dequeue()
	{
		while(!firstStack.empty())
		{
				temp = firstStack.pop();
				secondStack.push(temp);
		}
	}
	
	public void secondStackDequeue()
	{
		while(!secondStack.empty())
		{
			temp = secondStack.pop();
			secondStack.push(temp);
			
		}
		
		firstStack.push(temp);
		
	}
	
	public void display()
	{
		firstStack.display();
	}
}	

public class queueStack
{
  public static void main(String arg[])
  {
	myQueue mainStack = new myQueue();
		
	mainStack.enqueue(10);
	mainStack.enqueue(9);
	mainStack.enqueue(8);
	mainStack.dequeue();
	mainStack.dequeue();
	mainStack.dequeue();
	mainStack.secondStackDequeue();
	mainStack.secondStackDequeue();
 	
	mainStack.display();
  }
}