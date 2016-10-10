// Sample linked list program using Java 2
import java.util.LinkedList;
import java.util.ListIterator;

public class lList2
{
 public static void main(String[] args)
 {
	 LinkedList <String>people = new LinkedList<String>();
	 people.addLast("Susan Davis");
	 people.addLast("Albert Einstein");
	 people.addLast("Aaron Copland");
	 people.addLast("Amanda Deleon");
	 ListIterator<String> iterator = people.listIterator();
	 iterator.next();
	 iterator.next();
	 iterator.next();
	 // add two new nodes after third node

	 iterator.add("Madam Curie");
	 iterator.add("Abe Lincoln");
	// iterator.add(new Integer(5)); // Now this won’t even compile...
	 iterator.next();
	 // remove last traversed element
	 

	 // print all elements
	 iterator = people.listIterator();
	 while (iterator.hasNext())
	 System.out.println(iterator.next());
	 }
}