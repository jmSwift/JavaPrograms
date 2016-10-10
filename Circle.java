public class Circle
{
	public double radius; 
	public String color = "";
	
	public Circle()
	{
		radius = 1.0;
		color = "red";
		
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return Math.PI * Math.pow(radius,2.0);
	}
	
	public String toString()
	{
		return ("Radius of the circle is " + radius + "\nColor of the circle is " + color );
	}
	
}
