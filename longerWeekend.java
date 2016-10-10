public class longerWeekend extends DayOfTheWeek
{
	public String location = "CSUDH";
	
	public longerWeekend(String day,int time, String newLocation)
	{
		super(day, time);
		location = newLocation;
		
	}
	
	public void changeLocation(String newSpot)
	{
		location = newSpot;
	}
	
	public String printLocation()
	{
		return location;
	}
	
	
	
	
}