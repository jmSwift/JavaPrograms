public class TestDoor
{
	public static void main(String[] args)
	{
		Door Enter = new Door("Enter");
		Door Treasure = new Door("Treasure");
		Door Exit = new Door("Exit");
		
		
		Enter.unlock();
		Enter.open();
		Enter.printContents();
		
		
		//for error checking purposes
		//Exit.printContents();
		//Door Exit = new Door("Exit");
		//Exit.printContents();
		Exit.close();
		Exit.lock();
		Exit.printContents();
		
		//Door Treasure = new Door("Treasure");
		Treasure.open();
		Treasure.lock();
		
		Treasure.printContents();
		//Enter.printContents();
	
	}
	
}