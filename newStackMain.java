//Queue using stacks, dequeue the first thing you put in
//jose meza

class StackMethods
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
			top++;
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

class myQueue
{
	StackMethods firstStack, secondStack;
	int temp;
	public myQueue(int stackSize)
	{
	firstStack = new StackMethods(stackSize);
	secondStack = new StackMethods((stackSize+2));
	}
	
	public void enqueue(int a)
	{
		firstStack.push(a);
	}
	public void dequeue()
	{
		int temp = 0;
		if(firstStack.isEmpty())
		{
			System.out.println("underflow occured");
		}
		else
		{
			while(!firstStack.isEmpty())
			{		temp = firstStack.pop();
					secondStack.push(temp);
					
			}
		}
		firstStack.push(temp);
		
	}
	
	public void display()
	{
		firstStack.display();
	}
}	

public class newStackMain
{
  public static void main(String arg[])
  {
	myQueue mainStack = new myQueue(3);
		
	mainStack.enqueue(10);
	mainStack.enqueue(9);
	mainStack.enqueue(8);
	mainStack.display();//after enqueues
	
	mainStack.dequeue();
	mainStack.dequeue();
	mainStack.dequeue();

	mainStack.display();
  }
}