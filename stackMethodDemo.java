//Queue using stacks, dequeue the first thing you put in

public class StackMethods
{
	int[] stack;
	int top;
	int size;

	public StackMethods(int arraySize)
	{
			size = arraySize;
			stack = new int[size];
			top = -1;			
	}
	public void push (int value)
	{
		if(top==size -1)
		System.out.println("Stack Overflow");
		else
		{
			stack[top] = value;
		}
	}
	public int pop()
	{
		int returnValue = -1;
		if(!isEmpty())
		{
			returnValue = stack[top];
			top--;
		}
		else
			System.out.println("Stack Underflow");
		
		return returnValue;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public void display()
	{
		for(int i = 0; i<=top; i++)
			System.out.print(stack[i]+"|");
		System.out.println("");
	}
}

public class myQueue
{
	StackMethods firstStack = new StackMethods(3);
	StackMethods secondStack = new StackMethods(3);
	
	public void enqueue(int a)
	{
		firstStack.push(a);
	}
	
	public void dequeue(int b)
	{
		while(!isEmpty())
		{
				firstStack.pop();
				secondStack.push(b);
		}
	}
	public void display()
	{
		secondStack.display();
	}
	
}	

public class StackmethodDemo
{
  public static void main(String arg[])
  {
	firstStack.enqueue(10);
	firstStack.enqueue(9);
	firstStack.enqueue(8);
	firsStack.dequeue();
	firstStack.dequeue();
	firsStack.dequeue();
	display();
	
	
  }
}