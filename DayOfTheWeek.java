public class DayOfTheWeek
{
	private String today = "Wednesday";
	private int militaryTime = 1227;
	
	public DayOfTheWeek( String day, int time)
	{
		today = day;
		militaryTime = time;
	}
	
	public DayOfTheWeek()
	{
	
	}
	
	public void getDay(String newDay)
	{
		today = newDay;
	}
	
	public void getTime(int newTime)
	{
		militaryTime = newTime;
	}
	
	public String printDay()
	{
		return today;
	}
	
	public int printTime()
	{
		return militaryTime;
	}
	
}
		