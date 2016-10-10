public class tripleStack
{
	int[] stack;
	int top; 
	int size;
	
	public tripleStack(int arraySize)
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
		tripleStack firstStack = new tripleStack(3);
		tripleStack secondStack = new tripleStack(3);
		tripleStack thirdStack = new tripleStack(3);
		
		firstStack.push(9);
		firstStack.push(8);
		firstStack.push(10);
		
		System.out.println("first stack: ");
		firstStack.reverse();
		
		int temp, temp2;
		
		temp = firstStack.pop();
		secondStack.push(temp);
		
		temp2 = firstStack.pop();
		thirdStack.push(temp2);
		
		//right
		
		if(temp < temp2)
		{
			temp = secondStack.pop();
			thirdStack.push(temp); //top of 3rd is 8 
			
			
			temp = firstStack.pop();
			secondStack.push(temp);
		
			temp = secondStack.peek();
			temp2 = thirdStack.peek();
			
			System.out.println("Temp is " + temp);
			System.out.println("Temp2 is " + temp2);
			thirdStack.reverse();/////////////////testing
			if(temp < temp2)
			{
				temp = secondStack.pop();
				thirdStack.push(temp);
			}
			else
			{
			temp = thirdStack.pop();
			firstStack.push(temp);
			temp = secondStack.peek();
			temp2 = thirdStack.peek();
			if(temp < temp2)
			{
				thirdStack.push(secondStack.pop());
				thirdStack.push(firstStack.pop());
			}
			else
			{
				secondStack.push(thirdStack.pop());
				secondStack.push(firstStack.pop());
			}
			/*
			temp = secondStack.pop();
			thirdStack.push(temp);
			temp = firstStack.pop();
			thirdStack.push(temp);
			*/
			}
			
		}
		
		else
		{
			temp2 = thirdStack.pop();
			secondStack.push(temp2);
			temp2 = firstStack.pop();
			thirdStack.push(temp2);
			temp = secondStack.peek();
			temp2 = thirdStack.peek();
			if( temp > temp2)
			{
				temp2 = thirdStack.pop();
				secondStack.push(temp2);
			}
			else
			{
				//temp2 = secondStack.pop();
				firstStack.push(secondStack.pop());
				temp = secondStack.peek();
				temp2= thirdStack.peek();
				if(temp < temp2)
				{
					thirdStack.push(secondStack.pop());
					thirdStack.push(firstStack.pop());
				}
				else
				{
					secondStack.push(thirdStack.pop());
					secondStack.push(firstStack.pop());
				}
				
			}
			
		}
		
		/*
		temp = secondStack.peek();
		temp2 = thirdStack.peek();
		
		if(temp > temp2)
		{
			temp2 = thirdStack.pop();
			firstStack.push(temp2);
			temp2 = secondStack.pop();
			thirdStack.push(temp2);
			temp2 = firstStack.pop();
			thirdStack.push(temp2);
			
		}
		else
		{
			temp2 = secondStack.pop();
			thirdStack.push(temp2);
		
		}
		*/
		
		
		System.out.println("first stack: ");
		firstStack.reverse();
		System.out.println("second stack: ");
		secondStack.reverse();
		System.out.println("third stack: ");
		thirdStack.reverse();
		
		
		
		
		
	
	
	}
}