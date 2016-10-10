public class runDay
{
	public static void main(String[] args)
	{
		DayOfTheWeek theDay = new DayOfTheWeek("Friday",1400);
		
		
		System.out.println("today is " + theDay.printDay());
		
		System.out.println("the time is " + theDay.printTime());
		
		theDay.getDay("Saturday");
		
		theDay.getTime(1800);
		
		System.out.println("new day is " +  theDay.printDay());
		
		System.out.println("new time is " + theDay.printTime());
		
		
		longerWeekend threeDay = new longerWeekend("Saturday", 1900, "My house");
		
		threeDay.changeLocation("dorm");
		
		System.out.println("new location is " + threeDay.printLocation());
		
		veryLongWeekend weather = new veryLongWeekend("Sunday", 2100, "the movies", 80);
		
		
		
		weather.changeTemp(100);
		
		System.out.println("the weather is " + weather.printTemp());
		
		
	}
}