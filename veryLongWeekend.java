public class veryLongWeekend extends longerWeekend
{
	private int temperature;
	
	veryLongWeekend(String day, int time, String location, int degrees)
	{
		super(day,time,location);
		temperature = degrees;
	}
	
	public void changeTemp(int newTemp)
	{
		temperature = newTemp;
	}
	
	public int printTemp()
	{
		return temperature;
	}
	
	
}

