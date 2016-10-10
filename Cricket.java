import java.util.*;
public class Cricket
{
    public static void main(String[] args)
    {
        int chirps;
        double temperature;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of chirps/min: ");
        chirps = input.nextInt();
        temperature = chirps/6.6+4;
        
        System.out.println("The temperature is " + temperature + "C");
        
    }
}