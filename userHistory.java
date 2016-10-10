import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class userHistory
{
	public static int choice;
	
	public static StackMethods theStack = new StackMethods(100);
	public static StackMethods theStack2 = new StackMethods(100);
	//public static StackMethods reverseStack = new StackMethods(100);
	
	public static myQueue chrono = new myQueue(100);
	
	//public static int userNumber = 0;
		
	public void registerUser()throws IOException
	{
		int wrong_trys = 0;
		Random randy = new Random();
		
		////newww
		File file = new File("newest.txt");
		
		Scanner userInput = new Scanner(System.in);
		//PrintWriter output = new PrintWriter(file); // output writes to a file
		PrintWriter output = new PrintWriter(new FileWriter(file, true));
		Scanner fileInput = new Scanner(file); // input reads from a file
	
		System.out.println("Enter a username:");
		String newUser = userInput.next();
		
		Scanner scanner = new Scanner(file);
		String temp = "";// taking names from file for comparison
		String line = new String();
		
		do //while(scanner.hasNext())
		{
			while(scanner.hasNext())
			{
				temp = "";
				line = scanner.nextLine();
				
				for(int i = 0; i < newUser.length(); i++)
					temp += line.charAt(i);
					
				
				
				if(temp.equals(newUser))
				{
					wrong_trys++;
					System.out.println("Please Re-Enter a username:");
					newUser = userInput.next();
					
					if(wrong_trys == 1)
						break;
				}
			}
		
		}while(temp.equals(newUser) && wrong_trys!= 1);
		
		String randomizeUsername = new String();
		
			if(wrong_trys == 1)
			{
				//newUser = "";
				System.out.println("Please enter your last name: " );
				randomizeUsername = userInput.next();
				for(int k = 0; k < 6; k++)
					randomizeUsername += (char)(randy.nextInt(9)+48);//casting a character for the ascii numbers 65 - 90
				
				System.out.println("Your created username is : " + randomizeUsername + " ");
				output.print(randomizeUsername);
			}
			
		
			else
				output.print(newUser + " ");
		
	
		System.out.println("Enter a password: ");
		String password = userInput.next();
		
		output.println(password + " ");// + userNumber);
		
		//userNumber++;
		output.close();
		
	}
	
	public void existingUser() throws IOException
	{
		File file = new File("newest.txt");
		
		String userLoggingIn = "",
			   password = "";
		String temp = "";
		
		
		Scanner userInput = new Scanner(System.in);
		PrintWriter output = new PrintWriter(new FileWriter(file, true));
		Scanner fileInput = new Scanner(file); // input reads from a file
	
		System.out.print("username: ");
		userLoggingIn = userInput.next();
		
		System.out.print("password: ");
		password = userInput.next();
		
		String textFileLine = new String();
		textFileLine = (userLoggingIn+ " " + password);
		
		Scanner scanner = new Scanner(file);
		String line = new String(),
			   line2 = new String();
	
		int usernameTrue = 0,
			passwordTrue = 0;
		
		//do 
		//{
			//check userName
			while(scanner.hasNext())
			{
				line = "";
				line2 = "";
				//temp = "";
				line = scanner.nextLine();
				for(int i = 0; i < line.length()-1;i++)
					line2 += line.charAt(i);
				//System.out.println(line);
				//for(int i = 0; i < userLoggingIn.length(); i++)
					//temp += line.charAt(i);
					
				
				
				if(textFileLine.equals(line2))
				{
					//System.out.println(userLoggingIn + " is now logged in.");
					usernameTrue = 1;
				}
				
				if(usernameTrue ==1)
					break;
				
			}
			
			//System.out.println(textFileLine);
			
			//////////////////////////
			
			/*
			
			//System.out.println();
			//Password checking
			Scanner scanner2 = new Scanner(file);
			
			String temp2 = "";
			
			
			System.out.print("password : ");
			password = userInput.next();
		
			while(scanner2.hasNext())
			{
				temp2 = "";
				line = scanner2.nextLine();
				
				for(int i = userLoggingIn.length()+1; i < line.length(); i++)
					temp2 += line.charAt(i);
					
				
				
				if(temp2.equals(password))
				{
					System.out.println("password was correct!");
					passwordTrue = 1;
				}
				
				if(passwordTrue ==1)
					break;
				
			}
			*/
			
			
			/*
			checking to see why it was not working
			
			System.out.println(line2.length());
			System.out.println(textFileLine.length());
			*/
			
			
			if(usernameTrue == 1 )
				System.out.println(userLoggingIn + "is now logged in.");
			else 
				System.out.println("invalid username or passsword, please select another option");
				
		
			output.close();
	
	}
	
	//public void visitingWebsites()throws IOException
	public static void visitingWebsites()throws IOException
	{
		//File file = new File("newest.txt");
		
		Scanner userInput = new Scanner(System.in);
		//PrintWriter output = new PrintWriter(new FileWriter(file, true));
		//Scanner fileInput = new Scanner(file); // input reads from a file
		
		int ROW = 50,
			COLUMN = 25;
			
		String websites[][] = new String[ROW][COLUMN];
		
		String temp = "";
		int a = 0,
			b = 0;
		System.out.println("enter a list of websites you wish to visit and type '999' when you are done");
		//do
		//{
		for(int i = 0; i < ROW; i++)
		{
			for(int j = 0; j < COLUMN; i++)
				{
				temp = userInput.next();
				if(temp.equals("999"))
				{
					////////////////a = i;
					////////////b = j;
					break;
				}
				chrono.enqueue(temp);
				theStack.push(temp);
				websites[i][j] = temp;
				}
			if(temp.equals("999"))
				break;
		}
		
		//output.close();
		/*
		String websitesVisited[][] = new String[a][b];
		for(int i = 0; i < a; i++)
			for(int j = 0; j < b; j++)
				{
				websitesVisited[i][j] = websites[i][j];
				temp = websites[i][j];///////////+++++++++++++++++++++++++++++
				theStack.push(temp);/////////////+++++++++++++++++++++++++++++++++++
				}
		*/
		//return websites;
		
	}
	
	public void chronologicalOrder()
	{			
		chrono.display();
	}
	
	public void reverseOrder()
	{
		String temp = "";
		
		while(!theStack.isEmpty())
		{
		
		temp = theStack.pop();
		theStack2.push(temp);
		}
	
		theStack2.display();
		
		
	}
	/*
	public static void timesVisited()
	{
		int i = 0;
		String websites[] = new String[50];
		int timesVisited[] = new int[50];
		
		String temp = "";
		
		while(!theStack2.isEmpty())
		{
		temp = theStack2.pop(); 
		//if(websites[i] == null)
			//break;
		websites[i] = temp;
		if(websites[i] == null)
			//break;
			
		for(int a = 0; a < websites.length; a++)
			if(websites[i] == websites[a])
				timesVisited[i] += 1;
				
		i++;
		
		}
		
		for(i = 0 ; i < websites.length-1; i++)
			System.out.println("You have visited " + websites[i] + " " + timesVisited[i] + " times");
		
	}
	/*
	
	String timesVisited[][] = new String[50][2];
	int i = 0,
		j = 1;
	int count = 0;
	while(!theStack2.isEmpty())
		{
				temp = theStack2.pop();
				timesVisited[i][j] = temp;
				count++;
				for(int a = 0; a < count; a++)
					if(timesVisited[a][j] == teamVisited[i][j])
						Integer.ToString(teamsVisited[a][j]+1);
		}
		
	for(int
		
		/*
	/*
		String timesVisited[][] = [50][2];
		String compArray[][] = [50][2];
		
		String temp = "";
		
		int i = 0,
			j = 1;
			
		
		while(!theStack2.isEmpty())
		{
				temp = theStack2.pop();
				timesVisited[i][j] = temp;
				for(int a = 0; a < timesVisited.length();a++)
					if(timesVisited[a][j].equals(teamsVisited[i][j])
						teamsVisited[i][j] == Integer.ToString
		
		}
		
		System.arraycopy( timesVisited, 0, compArray, 0, timesVisited.length );
		
		for(int i = 0; i < timesVisited.length; i++)
			for(j = 0 ; j < timesVisited[0].length; j++)
				if(
	
		
	}*/
	public void printMenu()
	{
		System.out.println("1.Register User/Create Account");
		System.out.println("2.Existing user Login");
		System.out.println("3.Visit a  Website");
		System.out.println("4.Browsing History, first visited");
		System.out.println("5.Browsing History, most recent");
		System.out.println("6.Number of times each website was visited");
		System.out.println("7.Check most visited website");
		System.out.println("8. Logout");
		System.out.println("You may exit the program by typing 999");
		System.out.println();

	}
	
	public static void main(String[] args)throws IOException
	{
		userHistory users = new userHistory();
		
		//File file = new File("newone.txt");
		//PrintWriter output = new PrintWriter(file); // output writes to a file
		Scanner input = new Scanner(System.in); // input reads from a file
		String websites[][] = new String[50][25];
		do{
		users.printMenu();
		System.out.print("Enter choice: ");
		choice = input.nextInt();
		
		switch(choice)
		{case 1: users.registerUser();
				break;
		case 2: users.existingUser();
				break;
					
		case 3:users.visitingWebsites();
		//websites =(users.visitingWebsites());
				break;
		case 4: users.chronologicalOrder();
				break;
		case 5: users.reverseOrder();
				break;
		//case 6: timesVisited();
			    //break;
			
		default: 
				break;
		}
		
		System.out.println();
		
		
		}while(choice!= 999);
		//file.close();
	
		
	}

}

 e

class StackMethods
{
	String[] stack;
	int top; 
	int size;
	
	public StackMethods(int arraySize)
	{
		size = arraySize;
		stack = new String[size];
		top = -1;
	}
	
	public void push(String value)
	{
		if(top == size -1)
			System.out.println("Stack Overflow");
		else
		{
			top++;
			stack[top] = value;
		}
	}
	
	public String pop()
	{
		String returnValue = "-1";
		if(!isEmpty())
		{
			returnValue = stack[top];
			top--;
		}
		
		else
			System.out.println("Stack Underflow");
		
		return returnValue;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public void display()
	{
	for(int i = 0; i<=top; i++)
			System.out.println(stack[i]);
		System.out.println("");
	}	
	
	public void reverse()
	{
		
		for(int i = top; i >= 0; i--)
			{
			
			System.out.println(stack[i]);
			}
		System.out.println("");
		
	
	}
}

class myQueue
{
	StackMethods firstStack, secondStack;
	int temp;
	public myQueue(int stackSize)
	{
	firstStack = new StackMethods(stackSize);
	secondStack = new StackMethods((stackSize+2));
	}
	
	public void enqueue(String a)
	{
		firstStack.push(a);
	}
	public String dequeue()
	{
		String temp = "";
		if(firstStack.isEmpty())
		{
			System.out.println("underflow occured");
		}
		else
		{
			while(!firstStack.isEmpty())
			{		temp = firstStack.pop();
					secondStack.push(temp);
					
			}
		}
		firstStack.push(temp);
		
		return temp;
	}
	
	public void display()
	{
		firstStack.display();
	}
}	




