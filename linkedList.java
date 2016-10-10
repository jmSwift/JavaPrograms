public class LinkedList {

    // fields
    private Node head;
    private Node last;
    private int size = 0;
	
	public static LinkedList firstPlayer = new LinkedList(); 
    public static LinkedList secondPlayer = new LinkedList();

    // constructor, used when the class is first called
    public LinkedList() {
        head = last = new Node(null);
    }

    // add method
    public void add(String s) {
        last.setNext(new Node(s));
        last = last.getNext();
        size++;
    }

    public boolean remove(String data){
    Node current = head.getNext();
    Node previous = null;
    while (current != null) {
        String dataOld = current.getData();
        if ((dataOld == null && data == null) || (dataOld != null && dataOld.equals(data))) {
            Node afterRemoved = current.getNext();
            if (previous == null) {
                head.setNext(afterRemoved);
            } else {
                previous.setNext(afterRemoved);
            }
            if (afterRemoved.getNext() == null) {
                last = afterRemoved;
            }
            size--;
            return true;
        } else {
            previous = current;
            current = current.getNext();
        }
    }
    return false;
	}
    //will return the size of the list - will return -1 if list is empty
    public int size() {
        return size;
    }

    // will check if the list is empty or not
    public boolean isEmpty() {
        return true;
    }

    // @param (index) will get the data at specified index
    public String getData(int index) {

        if(index <= 0) {
            return null;
        }

        Node current = head.getNext();
        for(int i = 1;i < index;i++) {
            if(current.getNext() == null) {
                return null;
            }
            current = current.getNext();
        }

        return current.getData();
    }

    //@param will check if the arguement passed is in the list
    // will return true if the list contains arg otherwise false
    public boolean contains(String s) {
        for(int i = 1;i<=size();i++) {
            if(getData(i).equals(s)) {
                return true;
            }
        }
        return false;
    }

    //@return contents of the list - recursively 
    public String toString() {
        Node current = head.getNext();
        String output = "[";
        while(current != null) {
            output += current.getData()+",";
            current = current.getNext();
        }
        return output+"]";
    }

    //@return first node
    public Node getHead() {
        return head;
    }

    // @return (recursively) list
    public void print(Node n) {
        if(n == null) {
            return;
        }else {
            System.out.println(n.getData());
            print(n.getNext());
        }
    }
	
	public class Node {

    // Fields
    private String data;
    private Node next;

    // constructor
    public Node(String data) {
        this(data,null);
    }

    // constructor two with Node parameter
    public Node(String data, Node node) {
        this.data = data;
        next = node;
    }

    /**
     * Methods below return information about fields within class
     * */

    // @return the data
    public String getData() {
        return data;
    }

    // @param String data to this.data
    public void setData(String data) {
        this.data = data;
    }

    // @return next
    public Node getNext() {
        return next;
    }
    // @param Node next set to this.next
    public void setNext(Node next) {
        this.next = next;
    }
	
	//my methods
	public static String[] deckOfCards ={
	"Ace of Spades ", "Two of Spades ", "Three of Spades ", "Four of Spades ", "Five of Spades ", "Six of Spades ", "Seven of Spades ", "Eight of Spades ", "Nine of Spades ", "Ten of Spades ", "Jack of Spades ", "Queen of Spades ", "King of Spades ",
	"Ace of Clovers ", "Two of Clovers ", "Three of Clovers " , "Four of clovers " , "Five of Clovers ", "Six of Clovers ", "Seven of Clovers ", "Eight of Clovers ", "Nine of Clovers ", "Ten of Clovers ", "Jack of Clovers ", "Queen of Clovers ", "King of CLovers ",
	"Ace of Diamonds ", "Two of Diamonds ", "Three of Diamonds ", "Four of Diamonds ", "Five of Diamonds ", 
	"Six of Diamonds ", "Seven of Diamonds ", "Eight of Diamonds ", "Nine of Diamonds ", "Ten of Diamonds ",
	"Jack of Diamonds ", "Queen of Diamonds ", "King of Diamonds ", 
	"Ace of Hearts ", "Two of Hearts ", "Three of Hearts ", "Four of Hearts ", "Five of Hearts ", "Six of Hearts ", "Seven of Hearts ","Eight of Hearts ", "Nine of Hearts ", "Ten of Hearts ", "Jack of Hearts ",
	"Queen of Hearts ", "King of Hearts "};
	
	public static int chooseFirst()
	{
		
		Random randy = new Random();
		
		int start = randy.nextInt(2)+0;
			
		return start;
		
			
	}
	
	public static void populateLinkedLists(String[] arry)
	{
	for(int i = 0; i < arry.length/2; i++)
		firstPlayer.add(arry[i]);
		
	for(int i = arry.length/2; i < arry.length;i++)
		secondPlayer.add(arry[i]);
		
		
	
	}
	
	public static void main(String[] args)throws IOException
	{
		populateLinkedLists(deckOfCards);
		
	
	}

}
}