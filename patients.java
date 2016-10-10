public class patients
{
	private String FirstName;
	private String LastName;
	private String dateOfBirth;
	private String medicalConditon;
	
	private int ArrivalTime;
	private int timeAttended;
	prvate int Urgency;//Priority
	
	private Task[] heap;
	private int heapSize;
	private int capacity;
	
	public patients(int capacity)
	{
		this.capacity += 1;
		
		heap = new task[this.capacity];
		heapSize = 0;
	}
	
	public void clear()
	{
		heap = new Task[Capacity];
		heapSize = 0;
	}
	
	public boolean isEmpty()
	{
		return heapSize == 0;
	}
	
	public boolean isFull()
	{
		return heapSize == capacity -1;
	}
	
	public int size()
	{
	`return heapSize;
	}
		
	
	
	