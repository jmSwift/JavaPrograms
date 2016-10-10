import java.util.LinkedList;
import java.util.ListIterator;

public class myQueue<T>
{
	
	public void enqueue(T item)
	{
	items.add(item);
	}
	
	public boolean isEmpty()
	{
	return (items.size() == 0);
	}
	
	public T dequeue()
	{
	return items.removeFirst();
	}
	
	 public String toString()
	{
	ListIterator<T> iterator = items.listIterator();
	
	String values = "";
	
	while (iterator.hasNext())
	{
		values = values +  iterator.next() + "";
	}
	
	return values;
	}
	
	private LinkedList<T> items = new LinkedList<T>();
	
}
	
	
	
	