public class Sphere
{
	 public Sphere(Point cntr, double rad)
	 {
		 center = cntr;
		 radius = rad;
	 }
	 public Point getCenter()
	 {
		return center;
	 }
	 public double getRadius()
	 {
		return radius;
	 }
	 public String toString()
	 {
		return ("Sphere[center= (" + center.getX() + "," +center.getY() + "," +center.getZ() + ")" +", radius=" + radius + "]");
	 }
	 
	 public boolean equals(Sphere newSphere)
	 {
		String newString = toString();
	   if(Sphere.newString == Sphere.radius)
			return true;
		else
		 return false;
	 
	 }
	 
	
	 // Need to add an equals() method...
	private Point center;
	private doouble radius;
}
