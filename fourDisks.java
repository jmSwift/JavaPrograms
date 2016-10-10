public class fourDisks
{
	int[] stack;
	int top; 
	int size;
	
	public fourDisks(int arraySize)
	{
		size = arraySize;
		stack = new int[size];
		top = -1;
	}
	
	public void push(int value)
	{
		if(top == size -1)
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
			System.out.println(stack[i]);
		System.out.println("");
	}	
	
	public int peek()
	{
		return stack[top];
	}
	
	public void reverse()
	{
		
		for(int i = top; i >= 0; i--)
			{
			
			System.out.println(stack[i]);
			}
		System.out.println("");
		
	
	}
	
	public static void main(String[] args)
	{
	
		fourDisks firstStack = new fourDisks(4);
		fourDisks secondStack = new fourDisks(4);
		fourDisks thirdStack = new fourDisks(4);
		
		firstStack.push(4);
		firstStack.push(2);
		firstStack.push(1);
		firstStack.push(3);
		
		
		secondStack.push(firstStack.pop());
		thirdStack.push(firstStack.pop());
		
		int topOfStack2 = secondStack.peek();
		int topOfStack3 = thirdStack.peek();
		
		
		if(topOfStack2 < topOfStack3)
		{
			thirdStack.push(secondStack.pop());
			secondStack.push(firstStack.pop());
		}
		else	
		{
			secondStack.push(thirdStack.pop());
			thirdStack.push(firstStack.pop());
		}
		
		if(!firstStack.isEmpty())
		{
			int topOfStack1 = firstStack.peek();
		}
		
		if(topOfStack1 > topOfStack2 && topOfStack1 > topOfStack3)
		{
			while(!secondStack.isEmpty())
			{
				thirdStack.push(secondStack.pop());
			}
			
			secondStack.push(firstStack.pop());
			
			firstStack.push(thirdStack.pop());
			
			topOfStack1 = firstStack.peek();
			topOfStack3 = thirdStack.peek();
			if(topOfStack1 > topOfStack3)
			{
				secondStack.push(firstStack.pop());
				firstStack.push(thirdStack.pop());
				
				topOfStack1 = firstStack.peek();
				topOfStack3 = thirdStack.peek();
				if(topOfStack1 > topOfStack3)
				{
					secondStack.push(firstStack.pop());
					secondStack.push(thirdStack.pop());
				}
				else
				{
					secondStack.push(thirdStack.pop());
					secondStack.push(firstStack.pop());
				
				}
				
			}
				
		}
		
		
		firstStack.reverse();
		secondStack.reverse();
		thirdStack.reverse();
		
	
	
	}



}