public class Door
{
	public String inscription;
	public static boolean locked;
	public static boolean closed;
	
	public Door(String str)
	{
		inscription = str;
		locked = true;
		closed = true;
	}
	
	public Door(String str, boolean isLocked, boolean isClosed)
	{
		inscription = str;
		locked = isLocked;
		closed = isClosed;
	}
	
	public static boolean isClosed()
	{
		return closed;
	}
	
	public static boolean isLocked()
	{
		return locked;
	}
	
	public static void open()
	{
		if(closed == false)
			System.out.println("The door is already opened!");
		else if(closed == true && locked == false)
			closed = false;
		else 
			System.out.println("The door is locked therefore it cannot be opened!");
			
			
	}
	
	public static void close()
	{
		if(closed == false)
			closed = true;
		else	
			System.out.println("The door is already closed!");
			
	}
	
	public static void lock()
	{
		if(locked == false)
			locked = true;
		else
			System.out.println("The door is already locked!");
	}
	
	public static void unlock()
	{
		if(locked == true)
			locked = false;
		else
			System.out.println("The door is already unlocked!");
			
	}
	
	public void printContents()
	{
		System.out.println(inscription);
		if(locked == true)
			System.out.println("This door is locked");
		else	
			System.out.println("This door is closed");
		if(closed == false)
			System.out.println("This door is opened");
		else
			System.out.println("This door is closed");
	}
		
	
}


	