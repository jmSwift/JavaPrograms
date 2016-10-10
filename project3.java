import java.util.*;
import java.io.*;
import java.text.*;

/* 
 class ListNode<T>
{	
	Object data;
	ListNode<T> nextNode;
	
	ListNode(Object object)
	{
		this(object,null);
	}

	ListNode(Object object, ListNode<T> node)
	{
		data = object;
		nextNode = node;
	}
	
	Object getData()
	{
		return data;
	}
	
	ListNode<T> getNext()
	{
		return nextNode;
	}
	
}
*/

public class project3<T>
{
	//
	Object data;
	ListNode<T> nextNode;
	
	/*
	public void ListNode(Object object)
	{
		this(object,null);
	}
	*/

	public void ListNode(Object object, ListNode<T> node)
	{
		data = object;
		nextNode = node;
	}
	
	Object getData()
	{
		return data;
	}
	
	ListNode<T> getNext()
	{
		return nextNode;
	}
	
	
	public static String[][] deckOfCards ={
    {"Ace of Spades ", "Two of Spades ", "Three of Spades ", "Four of Spades ", "Five of Spades ", "Six of Spades ", "Seven of Spades ", "Eight of Spades ", "Nine of Spades ", "Ten of Spades ", "Jack of Spades ", "Queen of Spades ", "King of Spades ",},
    {"Ace of Clovers ", "Two of Clovers ", "Three of Clovers " , "Four of clovers " , "Five of Clovers ", "Six of Clovers ", "Seven of Clovers ", "Eight of Clovers ", "Nine of Clovers ", "Ten of Clovers ", "Jack of Clovers ", "Queen of Clovers ", "King of CLovers ",},
    {"Ace of Diamonds ", "Two of Diamonds ", "Three of Diamonds ", "Four of Diamonds ", "Five of Diamonds ",
	"Six of Diamonds ", "Seven of Diamonds ", "Eight of Diamonds ", "Nine of Diamonds ", "Ten of Diamonds ",
	"Jack of Diamonds ", "Queen of Diamonds ", "King of Diamonds "},
    {"Ace of Hearts ", "Two of Hearts ", "Three of Hearts ", "Four of Hearts ", "Five of Hearts ", "Six of Hearts ", "Seven of Hearts ","Eight of Hearts ", "Nine of Hearts ", "Ten of Hearts ", "Jack of Hearts ",
    "Queen of Hearts ", "King of Hearts "}};
	
	// Create a method to deal the deck of cards so that each player gets 26 random cards
	public static void getCards(String[] deck)
	{
		Random generator = new Random();
	}
	
	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name;
	
	public project3()
	{
		this("list");
	}
	
	public project3(String listName)
	{
		name = listName;
		firstNode = lastNode = null;
	}
	
	public void insertAtFront(T insertItem)
	{
		if(isEmpty())
			firstNode = lastNode = new ListNode<T>(insertItem);
		else
			firstNode = new ListNode<T>(insertItem,firstNode);
		
	}
	
	public void insertAtBack(T insertItem)
	{
		if(isEmpty())
			firstNode = lastNode = new ListNode<T>(insertItem);
		else	
			lastNode = lastNode.getNext() = new ListNode<T>(insertItem);
	}
	
	public T removeFromFront() throws EmptyListException
	{
		if(isEmpty())
			throw new EmptyListException(name);
		
		T removedItem = firstNode.getData();
		
		if(firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.nextNode;
			
		return removedItem;
	}
	
	public T removeFromBack() throws EmptyListException
	{
		if(isEmpty())
			throw new EmptyListException(name);
		
		T removedItem = lastNode.getData();
		
		if(firstNode == lastNode)
			firstNode = lastNode = null;
		else
		{
			ListNode<T> current = firstNode;
			
			while(current.nextNode != lastNode)
				current = current.nextNode;
				
			lastNode = current;
			current.nextNode = null;
		}
		
		return removedItem;
	}
	
	public boolean isEmpty()
	{
		return firstNode == null;
	}
	
	public void print()
	{
		if (isEmpty())
		{
			System.out.println("Empty " + name);
		}
		
		System.out.println("This is " + name);
		ListNode<T> current = firstNode;
		
		while(current!= null)
		{
			System.out.println(current.data);
			current = current.nextNode;
		}
		
		System.out.println("\n");
	}
	
	public class EmptyListException extends RuntimeException
	{
		public EmptyListException()
		{
			this("list");
		}

		public EmptyListException(String name)
		{
			super(name + " is empty");
		}
		
	}
	
	public static void main(String[] args)
	{
	
	
		project3< Integer > list = new project3< Integer >(); // create
		// insert integers in list
		list.insertAtFront( -1 );
		list.print();
		list.insertAtFront( 0 );
		list.print();
		list.insertAtBack( 1 );
		list.print();
		list.insertAtBack( 5 );
		list.print();
			// remove objects from list; print after each removal
		try
		{
		int removedItem = list.removeFromFront();
		System.out.printf( "\n%d removed\n", removedItem );
		list.print();
		
		removedItem = list.removeFromFront();
		System.out.printf( "\n%d removed\n", removedItem );
		list.print();
		
		removedItem = list.removeFromBack();
		System.out.printf( "\n%d removed\n", removedItem );
		list.print();
		
		removedItem = list.removeFromBack();
		System.out.printf( "\n%d removed\n", removedItem );
		list.print();
		} // end try
		catch ( EmptyListException emptyListException )
		{
		emptyListException.printStackTrace();
		} 
	
	}

}


