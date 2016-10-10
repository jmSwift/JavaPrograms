//Queue using stacks, dequeue the first thing you put in

class oldStackMethods
{
	
	int[] stack;
	int top;
	int size;

	public oldStackMethods(int arraySize)
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
/*

class myQueue
{
	StackMethods firstStack = new StackMethods(3);
	StackMethods secondStack = new StackMethods(3);

	public int temp;
	
	public void enqueue(int a)
	{
		firstStack.push(a);
	}
	public void dequeue()
	{
		while(!firstStack.isEmpty())
		{
				temp = firstStack.pop();
				secondStack.push(temp);
		}
	}
	
	public void secondStackDequeue()
	{
		while(!secondStack.isEmpty())
		{
			temp = secondStack.pop();
			secondStack.push(temp);
			
		}
	}
	
	public void display()
	{
		firstStack.display();
	}
}	
*/

public class StackMethods
{
  public static void main(String arg[])
  {
	oldStackMethods firstStack = new oldStackMethods(4);
	oldStackMethods secondStack = new oldStackMethods(3);
	oldStackMethods thirdStack = new oldStackMethods(3);
	
	firstStack.push(9);
	firstStack.push(10);
	firstStack.push(8);
	
	firstStack.display();
	
  /*
	myQueue mainStack = new myQueue(3);
	
	mainStack.enqueue(10);
	mainStack.enqueue(9);
	mainStack.enqueue(8);
	mainStack.dequeue();
	mainStack.dequeue();
	mainStack.dequeue();
	mainStack.secondStackDequeue();
	mainStack.secondStackDequeue();
	
	mainStack.display();
	
	*/
  }
}