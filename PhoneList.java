import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.EOFException;

public class PhoneList
{
	PhoneList()
	{
	listHead = null;
	}
	
	private static class PhoneNode
	{
		PhoneNode()
		{
		name = new String("NoName");
		phoneNumber = new String("(000) 000-0000");
		ct = 0;
		next = null;
		}
		
		PhoneNode(String fullName, String number)
		{
		name = fullName;
		phoneNumber = number;
		ct = 0;
		}
		
		PhoneNode(String fullName, String number, int count)
		{
		name = fullName;
		phoneNumber = number;
		ct = count;
		}
		
	private String name;
	private String phoneNumber;
	private int ct;
	private PhoneNode next;
	}
	
	private void initialize()
	{
	try
		{
		listHead = null;
		PhoneNode ptr = null;
		
		String name;
		String phone;
		String line;
		
		fileReader fr = new FileReader("MaBell.dat");
		BufferedReader fd = new BufferedReader(fr);// insert fr in bufferedReader
		
		while(true)
			{
			name = fd.readLine(); // get name
			
			if(name == null)
				break;
			
			phone = fd.readLine(); // get phone number
			
			if(phone == null)
				{
				System.out.println("The Mabell.dat file is corrupted.");
				System.exit(-1);
				}
			int ct = Integer.parseInt(line);
			
			if(listHead == null)
				{
				listHead = new PhoneNode(name.trim(), phoneNumber.trim(), ct);
				ptr = listHead;
				}
			else
				{
				ptr.next = new PhoneNode(name.trim(), phoneNumber.trim(), ct);
				ptr = ptr.next;
				}
			}
		}
	catch(EOFException eof)
		{
		System.out.println("End of file (EOF) has been reached");
		}
	catch (IOException ioe)
		{  
		System.out.println("IO error: " + ioe);
		}
	} public void menu() 
	{ 
	System.out.println("Enter option: \n");
	System.out.println(" A - Add a phone number");
	System.out.println(" L - Look up a phone number");
	System.out.println(" C - Change a phone number");
	System.out.println(" S - Save Phone List to a file");
	System.out.println(" Q - Quit and save list\n"); 
	}
	public void eventLoop()
	{ 
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader console = new BufferedReader(reader);
	boolean finished = false;
	initialize();
	menu();
	while (!finished)
	{ 
	System.out.print("CMD> ");
    try  
		{  
		String input = console.readLine().toUpperCase().trim(); 
		char response = input.charAt(0);   
			switch (response)   
			{   
			case 'A': addPhoneNumber();     
					break;    
			case 'L': lookUpPhoneNumber();                                     
					break;   
			case 'C': changePhoneNumber();     
					break;   
			case 'S': savePhoneNumbersToFile();          
					break;
			case 'Q':savePhoneNumbersToFile();     
					finished = true;        
					break;    
			default:  System.out.println("Unknown command.\n");         
			menu();    
			}  
		}  
	catch (IOException e)
		{   
		System.out.println(e);
		} 
	} } 
	private PhoneNode findNode(String name)
	{ 
		PhoneNode ptr = listHead; 
		boolean found = false; 
		while (ptr != null)  
		{ 
		if (ptr.name.toUpperCase().equals(name))  
		{   
		found = true; 
		break;  
		}  
		else   
		ptr = ptr.next;  
		} 
		if (!found)  
			return null; 
		else  
			return ptr; 
	} 
	private PhoneNode listHead;
				
}			
				
			
			
		
		