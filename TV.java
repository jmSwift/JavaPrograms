import java.util.*;

public class TV
{
	public static boolean isOn;
	public static int channel = 0;
	public static int volume = 0;
	
	public TV()
	{
		isOn = false;
		channel = 2;
		volume = 10;
	}
	
	public static void power()
	{
		if(isOn == true)
			isOn = false;
		else
			isOn = true;
	}
	public static void increaseVolume()
	{
		volume++;
	}
	
	public static void decreaseVolume()
	{
		volume--;
	}
	
	
	public static void changeChannel(int newChannel)
	{
		channel = newChannel;
	}
	
	public static int getVolume()
	{
		return volume;
	}
	
	public static int getChannel()
	{
		return channel;
	}
	
	public static boolean getTvState()
	{
		return isOn;
	}
	
	public static void main(String[] args)
	{
		TV television = new TV();
		
		System.out.println(television.getChannel());
		System.out.println(television.getVolume());
		System.out.println(television.getTvState());
		
	
	}
	
}