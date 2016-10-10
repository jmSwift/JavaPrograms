public class queueDriver
{

    public static void main(String args[])
	{
        myQueue<Integer> numbers = new myQueue<Integer>();
		numbers.enqueue(1);
        numbers.enqueue(2); 
		numbers.enqueue(3);
		
		System.out.println("The whole (items) list:  \n" + numbers.toString() + "\n");
		
		numbers.dequeue();
		System.out.println("after first dequeue: \n" + numbers.toString() + "\n");
		numbers.dequeue();
		
		System.out.println("after 2nd deque:  \n" + numbers.toString());
		
	
    }
}
/* FIRST RUN USING STRINGS  ---------------------
C:\Users\jose\Desktop\JavaPrograms>java queueDriver
The whole (items) list:
I am 26 years old
Iam 6'1
I am 200 lbs

after first dequeue:
Iam 6'1
I am 200 lbs

after 2nd deque:
I am 200 lbs

C:\Users\jose\Desktop\JavaPrograms>

DRIVER FOR STRINGS -----------------------

myQueue<String> myStats = new myQueue<String>();
		myStats.enqueue("I am 26 years old\n");
        myStats.enqueue("Iam 6'1\n"); 
		myStats.enqueue("I am 200 lbs");
		
		System.out.println("The whole (items) list:  \n" + myStats.toString() + "\n");
		
		myStats.dequeue();
		System.out.println("after first dequeue: \n" + myStats.toString() + "\n");
		myStats.dequeue();
		
		System.out.println("after 2nd deque:  \n" + myStats.toString());
		
SECOND RUN USING INTEGERS 
		
*/

/* SECOND RUN USING INTEGER

C:\Users\jose\Desktop\JavaPrograms>java queueDriver
The whole (items) list:
123

after first dequeue:
23

after 2nd deque:
3

C:\Users\jose\Desktop\JavaPrograms>

INTEGER DRIVER-----------
  public static void main(String args[])
	{
        myQueue<Integer> numbers = new myQueue<Integer>();
		numbers.enqueue(1);
        numbers.enqueue(2); 
		numbers.enqueue(3);
		
		System.out.println("The whole (items) list:  \n" + numbers.toString() + "\n");
		
		numbers.dequeue();
		System.out.println("after first dequeue: \n" + numbers.toString() + "\n");
		numbers.dequeue();
		
		System.out.println("after 2nd deque:  \n" + numbers.toString());
		
    }
*/