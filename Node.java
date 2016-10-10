private class Node<E>{
	private E data;
	private Node<E> next;
	
	private Node(E dataItem)
	{
		data = dataItem;
		next = null;
	}
	
	private Node(E dataItem, Node<E> nodeRef)
	{
		data = dataItem;
		next = nodeRef;
	}
	
	

}

public class SingleLinkedList<E>{
	private Node<E> head = null;
	private int size = 0;

	private void addFirst(E item)
	{
		head = new Node<E>(item,head);
		size++;
	}
	
	private void addAfter(Node<E> node, E item)
	{
		node.next = new Node<E>(item,node.next);
		size++;
	}
	
	private E removeAfter(Node<E> node)
	{
		Node<E> temp = node.next;
		if(temp != null)
		{
			node.next = temp.next;
			size--;
		}
		else
			return null;
		
	}
	
	private E removeFirst()
	{
		Node<E> temp = head;
		if(head != null)
			head = head.next;
		if(temp != null)
		{
			size--;
			return temp.data;
		}
		else	
			return null;
	}
	
	public static void main(String[] args)
	{
	Node<String> tom = new Node<String>("Tom");
	Node<String> john = new Node<String>("John");
	Node<String> harry = new Node<String>("Harry");
	Node<String> sam = new Node<String>("Sam");
	
	tom.next = John;
	john.next = Harry;
	harry.next = Sam;
	
	 
	}
	
	

}







