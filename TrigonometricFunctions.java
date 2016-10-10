	import java.util.*;

	public class TrigonometricFunctions
	{
		public static Scanner input = new Scanner(System.in);
		
		public static double tangent(double opposite, double adjacent)
		{
		
		return opposite/adjacent;

		}
		
		public static double sin(double opposite, double hypotenuse)
		{
		return opposite/hypotenuse;
		}
		
		public static double coSin(double adjacent, double hypotenuse)
		{
		return adjacent/hypotenuse;
		}
		
		public static double coTangent(double adjacent, double opposite)
		{
		return adjacent/opposite;
		}
		
		public static double secant(double hypotenuse, double adjacent)
		{
		return hypotenuse/adjacent;
		}
		
		public static double coSecant(double hypotenuse, double opposite)
		{
		return hypotenuse/opposite;
		
		}

		public static void main(String[] args)
		{
			int choice;
		
			double adjacent,hypotenuse,opposite,
					cos,sine,tan,csc,sec,cot;
					
		
		System.out.println();
					
		do {
		
		System.out.println("1.Find the Sin of an angle");
		System.out.println("2.Find the Cosine of an angle");
		System.out.println("3.Find the Tangent of an angle");
		System.out.println("4.Find the secant of an angle");
		System.out.println("5.Find the Cotangent of an angle");
		System.out.println("6.Find the Cosecant of an angle");
		System.out.println("7.Exit program");
		System.out.println();
		System.out.print("Enter an option: ");
		choice = input.nextInt();
		
			switch(choice)
			{
			case 1: 
					System.out.print("Enter the opposite of the angle: ");
					opposite = input.nextDouble();
					System.out.print("Enter the hypotenuse of the angle: ");
					hypotenuse = input.nextDouble();
					sine = sin(opposite,hypotenuse);
					System.out.println("The sin is: " + sine );
					break;
			case 2: 
					System.out.print("Enter the adjacent of the angle: ");
					adjacent = input.nextDouble();
					System.out.print("Enter the hypotenuse of the triangle: ");
					hypotenuse = input.nextDouble();
					cos = coSin(adjacent,hypotenuse);
					System.out.println("the cosin of the angle of is: " + cos);
					break;
			case 3: 
					System.out.print("Enter the opposite of the angle: ");
					opposite = input.nextDouble();
					System.out.print("Enter the ajacent of the triangle: ");
					adjacent = input.nextDouble();
					tan = tangent(opposite,adjacent);
					System.out.println("Your tangent is: " + tan);
					break;
			case 4: 
					System.out.print("Enter the hypotenuse of the angle: ");
					hypotenuse = input.nextDouble();
					System.out.print("Enter the adjacent of the angle: ");
					adjacent = input.nextDouble();
					sec = secant(hypotenuse,adjacent);
					System.out.println("Your secant is " + sec);
					break;
			case 5: 
					System.out.print("Enter the adjacent of the angle: ");
					adjacent = input.nextDouble();
					System.out.print("Enter the opposite of the angle: ");
					opposite = input.nextDouble();
					cot = coTangent(adjacent,opposite);
					System.out.println("Your cotangent is " + cot);
					break;
			case 6: 
					System.out.print("Enter the hypotenuse of the angle: ");
					hypotenuse = input.nextDouble();
					System.out.print("Enter the opposite of the angle: ");
					opposite = input.nextDouble();
					csc = coSecant(hypotenuse,opposite);
					System.out.println("The cosecant is: " + csc );
					break;
			case 7:
					System.out.print("Program is now ending ");
					break;
			
			default:
					System.out.print("Wrong selection ");
					break;
				} 
			
			System.out.println();
			} while(choice != 7);
			
			
		
		
		}
}
		
	