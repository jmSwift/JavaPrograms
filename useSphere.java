public class useSphere
{
	 public static void main(String []args)
	 {
		 Point c = new Point(1, -5.5, 7.1);
		 Sphere s = new Sphere(c, 15);
		 Sphere s1 = new Sphere(new Point(1, -5.5, 7.1), 15);
		 System.out.println("The two spheres: ");
		 System.out.println(s);
		 System.out.println(s1 + "\n");
	 if (s.equals(s1))
		System.out.println("The Spheres are equal.");
	 else
		System.out.println("The Spheres are not equal.");
	 if (s == s1)
		System.out.println("Both object references, s and s1, reference the same sphere.");
	 else
		System.out.println("The two object references, s and s1, do not reference the same sphere.");
	 }
}
