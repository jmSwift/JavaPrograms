public class Cylinder extends Circle
{
	public double height = 1.0;
	
	public Cylinder()
	{
		super();
		//double height = 1.0;
	}
	
	public Cylinder(double radius)
	{
		//height = 1.0;
		super();
		super.radius = radius;
	}
	
	public Cylinder(double radius, double height)
	{
		//height = 1.0;
		super();
		super.radius = radius;
		this.height = height;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getVolume()
	{
		return Math.PI * super.radius * super.radius * height;
	}
	
	public String toString()
	{
		return (super.toString() + "\nThe height is " + height);
	}
}
	