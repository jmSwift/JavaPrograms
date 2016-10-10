import java.util.*;

/*
public interface StackInterface<E>
{
	public void push(E x);
	
	public E pop();
	
	public boolean empty();
	
	public E peek();
	
	public int size();
	
}
*/

class Stack<E>
{
	private ArrayList<E>userInfo;
	
	public Stack()
	{
		userInfo = new ArrayList<e>(25);// initial size
	}
	
	public void push(E x)
	{
		items.add(x);
	}
	
	public E pop()
	{
		if(empty())
			return null;
			
		return userInfo.remove(userInfo.size()-1);
	}
	
	public boolean empty()
	{
		return userInfo.isEmpty();
	}
	
	public int size()
	{
		return userInfo.size();
	}
	
	public E peek()
	{
		if(empty())
			return null;
			
		return userInfo.get(items.size()-1);
		
	}
	
	
}

public static void main(String[] args)
{
	Stack<User> u = new Stack<User>();
	
0	u.push(new.User("jmeza63", "costaco805");
	
	System.out.println("The last name that was pushed was" + u.peek().getName());
	System.out.println();
	
	while(!u.empty())
		System.out.println(u.pop().getName());
		
	System.out.println("The stack of the size is now " + u.size());
	
}